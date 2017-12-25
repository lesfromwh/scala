package com.ls.exercises.chapter3

/**
  * 2.编写一个循环,将整数数组中相邻的元素替换.
  * 例如:Array(1,2,3,4,5)->Array(2,1,4,3,5)
  *
  * Range(start,end,step)  从[start,end) 每隔step取一个
  *
  * @author liushuang 2017/12/19
  */
object Test2 {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 2, 3, 4, 5)
    for (i <- Range(0, arr.length / 2 + 1, 2)) { // 0->3
      val temp = arr(i)
      arr(i) = arr(i + 1)
      arr(i + 1) = temp
    }
    println(arr.toBuffer)
  }
}
