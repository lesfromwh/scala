package com.ls.first

/**
  * @author liushuang 2017/12/3
  */
object ForArrayDemo {
  def main(args: Array[String]): Unit = {
    //初始化一个数组
    val arr = Array(1, 2, 3, 4, 5)
    for(i<-arr)
      println(i)

    for(i<-(0 until arr.length).reverse)
      println(i)
  }
}
