package com.ls.exercises.chapter4

/**
  * 10.当你将两个字符串拉链在一起时,比如"hello".zip("world"),会使什么结果?
  * 想出一个讲得通的用例.
  *
  * @author liushuang 2017/12/22
  */
object Test10 {
  def main(args: Array[String]): Unit = {
    val string = "hello".zip("world")
    println(string) //Vector((h,w), (e,o), (l,r), (l,l), (o,d))
  }
}
