package com.ls.exercises.chapter4

import java.io.File
import java.util.Scanner

import scala.collection.SortedMap


/**
  * 4.用已排序的映射完成
  *
  * @author liushuang 2017/12/22
  */
object Test4 {
  def main(args: Array[String]): Unit = {
    val map = demo1()
    println(map)
  }

  def demo1(): SortedMap[String, Int] = {
    val in = new Scanner(new File("src/myfile.txt"));
    var map = SortedMap[String, Int]() // var
    while (in.hasNext()) {
      val str = in.next()
      //      if (!map.contains(str)) map += (str -> 1) else map += (str-> (map.getOrElse(str,0)+1))
      map += (str -> (map.getOrElse(str, 0) + 1))
      //            map(str) = (map.getOrElse(str, 0) + 1) //报错
    }
    map
    //Map(spark -> 2, hadoop -> 1, scala -> 3, java -> 1, stream -> 1, python -> 1)
    //排序后Map(hadoop -> 1, java -> 1, python -> 1, scala -> 3, spark -> 2, stream -> 1)
  }
}
