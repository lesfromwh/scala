package com.ls.scala99.scala01_05

/**
  * 找到最后一个元素
  * P01 (*) Find the last element of a list.
  * Example:
  * *
  * scala> last(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 8
  *
  * @author liushuang 2018/3/8
  */
object Scala01 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 1, 2, 3, 5, 8)
    aaa(list)
    bbb(list)
    ccc(list)
  }

  /**
    * 自带last
    *
    * @param list
    */
  def aaa(list: List[Int]): Unit = {
    println(list.last)
  }

  /**
    * 反转取head
    *
    * @param list
    */
  def bbb(list: List[Int]): Unit = println(list.reverse.head)

  /**
    * 递归
    *
    * @param list
    */
  //TODO 递归不懂
  def ccc(list: List[Int]) = list match {
    case n :: Nil => n
    case _ :: tail => bbb(tail)
    case _ => throw new NoSuchElementException
  }
}
