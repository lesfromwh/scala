package com.ls.actor

import scala.actors.Actor

/**
  * react方式会复用线程，比receive更高效
  * react 如果要反复执行消息处理，react外层要用loop，不能用while
  *
  * @author liushuang 2018/3/12
  */
class ActorReact extends Actor {
  override def act(): Unit = {
    loop {
      react {
        case "start" => {
          println("starting...")
          Thread.sleep(5000)
          println("started")
        }

        case "stop" => {
          println("stopping")
          Thread.sleep(5000)
          println("stopped")
        }
      }
    }
  }
}

object ActorReact {
  def main(args: Array[String]): Unit = {
    val react = new ActorReact
    react.start()
    react ! "start"
    react ! "stop"
    println("完成")
  }
}
