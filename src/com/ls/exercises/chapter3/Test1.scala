package com.ls.exercises.chapter3

import scala.util.Random


/**
  * 1.编写一段代码,将a设置为一个n个随机整数的数组,要求随机数介于0(包含)和n(不包含)之间.
  *
  * @author liushuang 2017/12/19
  */
object Test1 {
  def main(args: Array[String]): Unit = {
    val arr = aaa(10)
    for (i <- arr)
      println(i)
  }

  def aaa(n: Int): Array[Int] = {
    val random: Random = new Random()
    val randomArr: Array[Int] = new Array[Int](n)
    //这里不能用0 to n 越界异常
    for (i <- 0 until n) randomArr(i) = random.nextInt(n)
    return randomArr
  }

  // 0 to n和 0 until n的区别?
  println(0 until 2) //Range(0, 1)
  println(0 to 2) //Range(0, 1, 2)
}
