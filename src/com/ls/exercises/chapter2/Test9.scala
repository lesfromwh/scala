package com.ls.exercises.chapter2

/**
  * @author liushuang 2017/12/18
  */
object Test9 {
  def main(args: Array[String]): Unit = {
    var a: Long = 1
    val unit = demo("Hello")
    println(unit)

    demo1()
  }

  def demo(x: String): Long = {
    var a: Long = 1
    if (x.length == 1) return x.charAt(0).toLong
    else x.take(1).charAt(0).toLong * demo(x.drop(1))
  }

  def demo1(): Unit = {
    println("hello".take(0)) // String = ""
    println("hello".take(1)) // String ="h"  从1开始
    println("hello".drop(1)) // String ="ello"
  }

  def demo2(): Unit = {
    val c = "hello".charAt(0) //char类型   从0开始
  }
}
