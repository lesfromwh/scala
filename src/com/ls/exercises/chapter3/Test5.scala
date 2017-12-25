package com.ls.exercises.chapter3

/**
  * 5.如何计算Array[Double]的平均值
  *
  * @author liushuang 2017/12/20
  */
object Test5 {
  def main(args: Array[String]): Unit = {
    val d = demo(Array[Double](1.1, 2, 3, 4))
    println(d)
  }

  def demo(array: Array[Double]): Double = {
    //    var arrs: Double = 0
    //    for (i <- array) {
    //      arrs += i
    //    }
    //    arrs / array.length
    array.sum / array.length
  }
}
