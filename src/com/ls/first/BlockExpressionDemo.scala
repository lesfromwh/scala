package com.ls.first

/**
  * 块表达式
  *
  * @author liushuang 2017/12/2
  */
object BlockExpressionDemo {
  def main(args: Array[String]): Unit = {
    val x = 0
    val result = {
      if (x > 0) 1 else "error"
    }
    println(result)
  }
}
