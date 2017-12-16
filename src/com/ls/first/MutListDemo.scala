package com.ls.first

import scala.collection.mutable.ListBuffer

/**
  * @author liushuang 2017/12/4
  */
object MutListDemo {
  def main(args: Array[String]): Unit = {
    //构建一个可变列表，初始有3个元素1,2,3
    val list0 = ListBuffer[Int](1,2,3)

    val list1 = new ListBuffer[Int]

    list1+=4
    list1.apply(5)

    //将list1中的元素追加到list0中,注意:没有生产新的集合
    list0++=list1
    //件list0和list1合并成一个新的ListBuffer 注意:生产了一个集合
  }
}
