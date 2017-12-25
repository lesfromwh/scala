package com.ls.exercises.chapter4

/**
  * 9.编写一个函数Iteqgt(values:Array[Int],v:Int),返回数组中小于v,等于v,大于v的数量,要求三个值一起返回.
  *
  * @author liushuang 2017/12/22
  */
object Test9 {
  def main(args: Array[String]): Unit = {
    val result = demo(Array(-1, 0, 1, 2, 3), 0)
    println(result)
  }

  def demo(arr: Array[Int], v: Int): (Int, Int, Int) = {
    (arr.count(_ > v), arr.count(_ < v), arr.count(_ == v))
    //    val buffer = arr.toBuffer
    //    (buffer.count(_ > v), buffer.count(_ < v), buffer.count(_ == v))
  }
}
