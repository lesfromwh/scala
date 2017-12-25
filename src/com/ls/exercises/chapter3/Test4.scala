package com.ls.exercises.chapter3

/**
  * 4.给定一个整数数组,产出一个新的数组,包含元数组中的所有值,以原有顺序排列;
  * 之后的元素是所有零或者负值以原有顺序排列
  * Array(1, 0, -2, 3, 0, 4, 6, 5)->Array(1, 3, 4, 6, 5, 0, -2, 0)
  *
  * @author liushuang 2017/12/20
  */
object Test4 {
  def main(args: Array[String]): Unit = {
    val arr = demo(Array(1, 0, -2, 3, 0, 4, 6, 5))
    println(arr.toBuffer)
  }

  def demo(arr: Array[Int]): Array[Int] = {
    var arr1 = for (i <- arr if i > 0) yield i
    val arr2 = for (i <- arr if i <= 0) yield i
    arr1 ++= arr2
    arr1
  }
}
