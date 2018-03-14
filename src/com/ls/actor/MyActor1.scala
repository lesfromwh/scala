package com.ls.actor

import scala.actors.Actor

/**
  * 2.10.x版本的  2.11.x已经废弃采用akka
  * @author liushuang 2018/3/12
  */
object MyActor1 extends Actor {

  def act(): Unit = {
    for (i <- 1 to 10) {
      println("actor1 " + i)
      Thread.sleep(2000)
    }
  }
}
