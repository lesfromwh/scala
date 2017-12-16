package com.ls.first

/**
  * @author liushuang 2017/12/3
  */
object ArrOperationDemo {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 3, 2, 4, 5)
    println(arr.sum)
    println(arr.max)
    println(arr.sorted.toBuffer) //ArrayBuffer(1, 2, 3, 4, 5)
    val sorted = arr.sorted
    println(sorted.toBuffer) //ArrayBuffer(1, 2, 3, 4, 5)
  }
}
