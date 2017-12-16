package com.ls.first

/**
  * @author liushuang 2017/12/2
  */
object ConditionDemo {
  def main(args: Array[String]): Unit = {
    val x = 1

    val y = if (x > 0) 1 else -1
    println(y)

    val a = if (x > 2) 1 else "error"
    println(a)

    val b = if (x > 2) 1
    println(b) // ()

    val c = if (x > 2) 0
    else if (x <= 1) 1 else "error"
    println(c)

  }
}
