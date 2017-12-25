package com.ls.exercises.chapter4

import java.io.File
import java.util
import java.util.Scanner

import scala.collection.mutable
import scala.io.Source

/**
  * 2.从文件中读取单词.用一个可变映射来点清每一个单词出现的频率.读取这些单词的操作可以使用java.util.Scanner
  *
  * @author liushuang 2017/12/21
  */
object Test2 {
  def main(args: Array[String]): Unit = {
    val map = demo()
    println(map)
    val map1 = demo1
    println(map1)
    val map2 = demo2()
    println(map2)
  }

  //java
  def demo(): util.HashMap[String, Int] = {
    val in = new Scanner(new File("src/myfile.txt"));
    val map = new util.HashMap[String, Int]
    while (in.hasNext()) {
      val str = in.next()
      if (!map.containsKey(str)) map.put(str, 1) else map.put(str, map.get(str) + 1)
    }
    map //{python=1, java=1, scala=3, spark=2, stream=1, hadoop=1}
  }

  def demo1(): mutable.HashMap[String, Int] = {
    val in = new Scanner(new File("src/myfile.txt"));
    val map = new mutable.HashMap[String, Int]
    while (in.hasNext()) {
      val str = in.next()
      //      if (!map.contains(str)) map += (str -> 1) else map += (str-> (map.getOrElse(str,0)+1))
      //      map += (str -> (map.getOrElse(str, 0) + 1))
      map(str) = (map.getOrElse(str, 0) + 1)
    }
    map //Map(spark -> 2, hadoop -> 1, scala -> 3, java -> 1, stream -> 1, python -> 1)
  }

  def demo2(): mutable.HashMap[String, Int] = {
    val source = Source.fromFile("src/myfile.txt")
    val string = source.mkString
    val stringArr = string.split(" ")
    val map = new mutable.HashMap[String, Int]
    for (str <- stringArr) {
      //      if (!map.contains(str)) map += (str -> 1) else map += (str-> (map.getOrElse(str,0)+1))
      //      map += (str -> (map.getOrElse(str, 0) + 1))
      map(str) = (map.getOrElse(str, 0) + 1)
    }
    map //Map(spark -> 2, hadoop -> 1, scala -> 3, java -> 1, stream -> 1, python -> 1)
  }
}
