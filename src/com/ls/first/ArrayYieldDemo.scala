package com.ls.first

/**
  * @author liushuang 2017/12/3
  */
object ArrayYieldDemo {
  def main(args: Array[String]): Unit = {
    val arr1 = Array(1, 2, 3, 4)
    println(arr1.toBuffer)

    val res = for (e <- arr1 if e % 2 == 0) yield e * 10
    println(res.toBuffer)

    //map相当于将数组中的每一个元素取出来，应用传进去的函数
    //跟java8差不多.
    val r = arr1.filter(_ % 2 == 0).map(_ * 10)
    println(r.toBuffer)
  }
}
