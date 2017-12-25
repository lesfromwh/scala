package com.ls.exercises.chapter3

/**
  * 7.去掉数组中的重复元素
  *
  * @author liushuang 2017/12/21
  */
object Test7 {
  def main(args: Array[String]): Unit = {
    val arr = demo(Array(1, 1, 2, 2, 3, 4))
    println(arr.toBuffer)
  }

  def demo(arr: Array[Int]): Array[Int] = {
    arr.distinct
  }
}
