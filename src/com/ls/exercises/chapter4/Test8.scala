package com.ls.exercises.chapter4

/**
  * 8.编写一个函数minmax(values:Array[Int]),返回数组中最小值和最大值的对偶.
  *
  * @author liushuang 2017/12/22
  */
object Test8 {
  def main(args: Array[String]): Unit = {
    val tuple = demo(Array(1, 2, 3, 4, 5))
    println(tuple)
  }

  def demo(arr: Array[Int]): (Int, Int) = {
    val tuple = (arr.min, arr.max)
    tuple
  }
}
