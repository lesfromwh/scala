package com.ls.exercises.chapter3

/**
  * 3.同第三题,这一次生成一个新的值交换过的数组.使用for/yield
  *
  * @author liushuang 2017/12/19
  */
object Test3 {
  def main(args: Array[String]): Unit = {
    val array = demo(Array(1, 2, 3, 4, 5))
    println(array.toBuffer)
  }

  def demo(arr: Array[Int]): Array[Int] = {
    val newArr = for (i <- Range(0, arr.length)) yield {
      if (arr.length == 0 || i == arr.length - 1) arr(i)
      else if (i % 2 == 0) arr(i + 1)
      else arr(i - 1)
    }
    println(newArr) //Vector(2, 1, 4, 3, 5)
    newArr.toArray //ArrayBuffer(2, 1, 4, 3, 5)
  }

}
