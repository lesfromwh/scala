package com.ls.actor

import scala.actors.Actor

/**
  * @author liushuang 2018/3/12
  */
class ActorCaseClass extends Actor {
  override def act(): Unit = {
    while (true) {
      receive {
        case "start" => println("starting...")
        case SyncMsg(id, msg) => {
          println(id + ",sync " + msg)
          Thread.sleep(5000)
          sender ! ReplyMsg(3, "finished")
        }
        case AsyncMsg(id, msg) => {
          println(id + ",async " + msg)
          Thread.sleep(5000)
        }
      }
    }
  }
}

object ActorCaseClass {
  def main(args: Array[String]): Unit = {
    val actor = new ActorCaseClass
    actor.start()
    //异步消息
    actor ! AsyncMsg(1, "hello actor1")
    println("异步消息发送完成")
    //同步消息
    //    val unit = actor !? SyncMsg(1000,"hello actor")
    //    println(unit)
    val reply = actor !! ReplyMsg(2, "hello actor2")
    println(reply)
    println(reply.isSet)
    val value = reply.apply()
    println(reply.isSet)
    println(value)
  }
}

case class SyncMsg(id: Int, msg: String)

case class AsyncMsg(id: Int, msg: String)

case class ReplyMsg(id: Int, msg: String)

