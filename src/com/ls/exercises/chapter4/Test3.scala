package com.ls.exercises.chapter4

import java.io.File
import java.util.Scanner

import scala.collection.immutable.HashMap


/**
  * 3.同第二题,这次用不可变映射
  * 不可变映射与可变映射的区别就是，每次添加元素，都会返回一个新的映射
  *
  * @author liushuang 2017/12/22
  */
object Test3 {
  def main(args: Array[String]): Unit = {
    val map1 = demo1
    println(map1)
  }

  def demo1(): HashMap[String, Int] = {
    val in = new Scanner(new File("src/myfile.txt"));
    var map = new HashMap[String, Int] //这里val换成var
    while (in.hasNext()) {
      val str = in.next()
      //            if (!map.contains(str)) map += (str -> 1) else map += (str-> (map.getOrElse(str,0)+1))
      map += (str -> (map.getOrElse(str, 0) + 1))
    }
    map //Map(spark -> 2, hadoop -> 1, scala -> 3, java -> 1, stream -> 1, python -> 1)
  }
}
