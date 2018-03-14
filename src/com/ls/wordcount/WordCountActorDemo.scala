package com.ls.wordcount

import scala.io.Source

/**
  * @author liushuang 2017/12/4
  */
object WordCountActorDemo {
  def main(args: Array[String]): Unit = {

    val lines = Source.fromFile("D://word.txt").getLines()
    println(lines)
    //non-empty iterator

    val list1 = lines.toList
    println(list1)
    //List(hello scala  i like it , hello hadoop , hello spark, i'm coming)

    val list2 = list1.flatMap(_.split(" ").filter(!_.equals("")))
    println(list2)
    //List(hello, scala, i, like, it, hello, hadoop, gqp, hello, spark, lius, i'm, coming, sss)

    val map1 = list2.map((_, 1))
    println(map1)
    //List((hello,1), (scala,1), (i,1), (like,1), (it,1), (hello,1), (hadoop,1), (gqp,1), (hello,1), (spark,1), (lius,1), (i'm,1), (coming,1), (sss,1))

    val stringToTuples = map1.groupBy(_._1)
    println(stringToTuples)
    //Map(lius -> List((lius,1)), sss -> List((sss,1)), it -> List((it,1)), coming -> List((coming,1)), i -> List((i,1)), gqp -> List((gqp,1)), hadoop -> List((hadoop,1)), spark -> List((spark,1)), scala -> List((scala,1)), hello -> List((hello,1), (hello,1), (hello,1)), like -> List((like,1)), i'm -> List((i'm,1)))

    val stringToInt = stringToTuples.mapValues(_.size)
    println(stringToInt)
    //Map(lius -> 1, sss -> 1, it -> 1, coming -> 1, i -> 1, gqp -> 1, hadoop -> 1, spark -> 1, scala -> 1, hello -> 3, like -> 1, i'm -> 1)

  }
}
