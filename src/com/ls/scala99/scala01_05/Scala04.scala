package com.ls.scala99.scala01_05

/**
  * 计算list的长度
  * P04 (*) Find the number of elements of a list.
  * Example:
  * *
  * scala> length(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 6
  *
  * @author liushuang 2018/3/8
  */
object Scala04 {

  def main(args: Array[String]): Unit = {
    val list = List(1, 1, 2, 3, 5, 8)
    aaa(list)
  }

  def aaa(list:List[Int]) = {
    println(list.size)
    println(list.length)
  }
}
