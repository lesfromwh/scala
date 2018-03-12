package com.ls.scala99.scala01_05

/**
  * 获取list中第n(从零开始)个元素
  * P03 (*) Find the Kth element of a list.
  * By convention, the first element in the list is element 0.
  * *
  * Example:
  * *
  * scala> nth(2, List(1, 1, 2, 3, 5, 8))
  * res0: Int = 2
  *
  * @author liushuang 2018/3/8
  */
object Scala03 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 1, 2, 3, 5, 8)
    aaa(list, 2)
  }

  /**
    * 自带索引
    *
    * @param list
    */
  def aaa(list: List[Int], n: Int) = {
    println(list(n))
  }

}
