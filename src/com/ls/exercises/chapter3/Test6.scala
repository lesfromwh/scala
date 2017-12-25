package com.ls.exercises.chapter3

import scala.collection.mutable.ArrayBuffer

/**
  * 6.如何重新组织Array[Int]的元素将它们以反序列排序?对于ArrayBuffer[Int]怎么做?
  *
  * @author liushuang 2017/12/20
  */
object Test6 {
  def main(args: Array[String]): Unit = {
    val arr = demo(Array(1, 2, 3))
    println(arr.toBuffer)
    val arr2 = demo2(ArrayBuffer(1, 2, 3))
    println(arr2)
  }

  def demo(arr: Array[Int]): Array[Int] = {
//    val newArr = for (i <- arr reverse) yield i
//    newArr
    arr.reverse
  }

  def demo2(arr: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    //    val reverse = arr.reverse
    //    reverse
    arr.reverse
  }
}
