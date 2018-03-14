package com.ls.highfunction

/**
  * curry
  * 编写一个类似while函数
  *
  * @author liushuang 2018/3/15
  */
object HighFunction4 {
  def main(args: Array[String]): Unit = {
    var x = 10
    until(x == 0) {
      x -= 1
      println(x)
    }
  }

  def until(condition: => Boolean)(block: => Unit) {
    if (!condition) {
      block
      until(condition)(block)
    }
  }
}
