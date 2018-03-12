package com.ls.scala99.scala01_05

/**
  * 找到倒数第二个元素
  * P02 (*) Find the last but one element of a list.
  * Example:
  * *
  * scala> penultimate(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 5
  *
  * @author liushuang 2018/3/8
  */
object Scala02 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 1, 2, 3, 5, 8)
    aaa(list)
    bbb(list)

  }

  def aaa(list: List[Int]) = {
    if (list.isEmpty || list.size <= 1) throw new NoSuchElementException
    //list.tail 选择除第一个元素以外的所有元素。
    println(list.reverse.tail.head)
  }

  def bbb(list:List[Int])={
    if (list.isEmpty || list.size <= 1) throw new NoSuchElementException
    //list.init
    println(list.init.last)
  }
}
