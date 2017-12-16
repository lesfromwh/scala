package com.ls.first

import scala.collection.mutable.ArrayBuffer

/**
  * @author liushuang 2017/12/3
  */
object ArrayDemo {

  def main(args: Array[String]): Unit = {


    //初始化一个长度为8的定长数组,其所有元素均为0
    val arr1 = new Array[Int](8)
    println(arr1) //[I@c818063
    println(arr1.toBuffer) //ArrayBuffer(0, 0, 0, 0, 0, 0, 0, 0)

    var arr2 = Array[Int](10)
    println(arr2.toBuffer) //ArrayBuffer(10)

    val arr3 = Array("hadoop", "storm", "spark")
    println(arr3.toBuffer) //ArrayBuffer(hadoop, storm, spark)

    //变长数组
    val ab = ArrayBuffer[Int]()
    println(ab)
    ab += 1
    ab += (2, 3, 4, 5)
    ab ++= Array(6, 7)
    ab ++= ArrayBuffer(8, 9)
    println(ab) //ArrayBuffer(1, 2, 3, 4, 5, 6, 7, 8, 9)
    ab.insert(0, -1, 0) //从0开始插入 -1,0
    ab.remove(8, 2) //从 index-8开始,删除2个.  remove(8)删除该位置的元素
    println(ab)
  }
}
