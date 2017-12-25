package com.ls.exercises.chapter4

import java.util.Calendar

import scala.collection.mutable

/**
  * 6.定义一个hash链表,将"Monday"劲射到java.util.Calendar.MONDAY中
  *
  * @author liushuang 2017/12/22
  */
object Test6 {
  def main(args: Array[String]): Unit = {
    demo()
  }

  def demo(): Unit = {
    val map = new mutable.LinkedHashMap[String, Int]
    map += ("Monday" -> Calendar.MONDAY)
    map += ("Tuesday" -> Calendar.THURSDAY)
    println(map)
  }
}
