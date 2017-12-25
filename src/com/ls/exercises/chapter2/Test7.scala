package com.ls.exercises.chapter2

/**
  * 7.同第六题,但是不能用循环
  *
  * @author liushuang 2017/12/18
  */
object Test7 {
  def main(args: Array[String]): Unit = {
    var i: Long = 1
    "Hello".foreach(i *= _.toLong) // ?
    println(i)
    "hi".foreach(x=>println(x))
//    "Hello".foreach(x=>println(i*=x))
  }

}
