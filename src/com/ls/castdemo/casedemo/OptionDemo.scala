package com.ls.castdemo.casedemo

/**
  * 在Scala中Option类型样例类用来表示可能存在或也可能不存在的值(Option的子类有Some和None)。
  * Some包装了某个值，None表示没有值
  *
  * @author liushuang 2018/3/10
  */
object OptionDemo extends App {

  val map = Map("A" -> "a", "B" -> "b")
  map.get("c") match {
    case Some(i) => println(i)
    case None => println("none")
  }
}
