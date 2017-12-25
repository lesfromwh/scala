package com.ls.exercises.chapter3

import scala.collection.mutable.ArrayBuffer

/**
  * 8.移除除第一个负数以外的所有负数.
  * Array(-1,-2,-3,4)->Array(-1,4)
  *
  * @author liushuang 2017/12/21
  */
object Test8 {
  def main(args: Array[String]): Unit = {
    val newArr = demo(Array(-1, -2, -3, -3, 4))
    println(newArr.toBuffer) // ArrayBuffer(-1, 4)
  }

  def demo(arr: Array[Int]): Array[Int] = {
    val index = for (i <- 0 until arr.length - 1 if (arr(i) < 0 && i != 0)) yield i
    val reverse = index.reverse
    var newArrayBuffer = arr.toBuffer
    //    val newArr = reverse.foreach(newArrayBuffer.remove(_))
    val newArr = for (i <- reverse) {
      newArrayBuffer.remove(i)
    }
    newArrayBuffer.toArray
  }
}
