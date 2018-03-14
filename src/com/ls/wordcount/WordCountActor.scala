package com.ls.wordcount

import scala.actors.{Actor, Future}
import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.io.Source

/**
  * _代表入参,_1带表入参的第一个元素
  *
  * @author liushuang 2018/3/13
  */
class Task extends Actor {
  override def act(): Unit = {
    while (true) {
      receive {
        case Submit(f) => {
          val result = Source.fromFile(f).getLines() //读取一行
            .toList.flatMap(_.split(" ").filter(!_.equals(""))) //变成List<Map<String,Int>>结构 List[(String, Int)]
            .map((_, 1)).groupBy(_._1).mapValues(_.size)
          println(result) //Map(sprak -> 1, provider -> 1, gqp -> 1, wordcount -> 1, scala -> 3, hello -> 1)
          sender ! result
        }
        case Stop => {
          println("stop")
          exit()
        }
      }
    }
  }
}

object WordCountActor {
  def main(args: Array[String]): Unit = {
    val replySet = new ListBuffer[Future[Any]]
    val resultList = new ListBuffer[Map[String, Int]]
    val files = Array("D://word.txt", "D://word2.txt")
    for (f <- files) {
      val task = new Task
      task.start()
      val reply = task !! Submit(f)
      replySet += reply
    }


    while (replySet.size > 0) {
      val toCompute = replySet.filter(_.isSet) //isSet 是否可用
      for (f <- toCompute) {
        val result = f.apply().asInstanceOf[Map[String, Int]] //r.apply取出结果  相当于get
        resultList += result
        replySet -= f
      }
      Thread.sleep(2000)
    }

    println("resultList " + resultList)
    //ListBuffer(ResultTask(Map(sprak -> 1, provider -> 1, gqp -> 1, wordcount -> 1, scala -> 3, hello -> 1)), ResultTask(Map(lius -> 1, sss -> 1, it -> 1, coming -> 1, i -> 1, gqp -> 1, hadoop -> 1, spark -> 1, scala -> 1, hello -> 3, like -> 1, i'm -> 1)))
    val flatten = resultList.flatten
    println(flatten)
    val stringToTuples = flatten.groupBy(_._1)
    println(stringToTuples)
    val stringToInt = stringToTuples.mapValues(_.foldLeft(0)(_ + _._2)) // todo 为什么是left
    // _._2 前一个_是(scala,2)元组 ._2表示取第二个值
    println(stringToInt)
  }
}

case class Submit(file: String)

case object Stop
