package com.ls.exercises.chapter2

/**
  * 5.编写一个过程,打印从n到0的数字(同第四题)
  *
  * @author liushuang 2017/12/18
  */
object Test5 {
  def main(args: Array[String]): Unit = {
    countDown(11)
  }

  def countDown(n: Int): Unit = {
    println(0 to n reverse)
  }
}
