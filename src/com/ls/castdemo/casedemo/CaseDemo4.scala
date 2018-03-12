package com.ls.castdemo.casedemo

/**
  * 样例类.
  * 在Scala中样例类是一中特殊的类，可用于模式匹配。case class是多例的，后面要跟构造参数，case object是单例的
  *
  * @author liushuang 2018/3/10
  */

case class SubmitTask(id: String, name: String)

case class HeartBeat(time: Long)

case object CheckTimeOutTask

object CaseDemo4 extends App {
  val arr = Array(CheckTimeOutTask, HeartBeat(123456), SubmitTask("0001", "task-0001"))

  arr(2) match {
    case SubmitTask(id, name) => println(s"$id $name")
    case HeartBeat(time) => println(s"$time")
    case CheckTimeOutTask => println("check")
  }
}
