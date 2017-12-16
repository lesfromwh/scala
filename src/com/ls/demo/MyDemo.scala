package com.ls.demo

/**
  * @author liushuang 2017/12/4
  */
object MyDemo {
  def main(args: Array[String]): Unit = {
    val x = 1
    val y = if (x > 0) 1
    else if (x == 0) 0 else 1
    println(y)
  }
}
