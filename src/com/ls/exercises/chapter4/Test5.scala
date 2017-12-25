package com.ls.exercises.chapter4

import java.io.File
import java.util
import java.util.Scanner

import scala.io.Source


/**
  * 5.使用java.util.TreeMap并使之适用于scalaAPI
  *
  * @author liushuang 2017/12/22
  */
object Test5 {
  def main(args: Array[String]): Unit = {
    val map = demo()
    println(map)
  }

  def demo(): util.TreeMap[String, Int] = {
    val in = new Scanner(new File("src/myfile.txt"));
    var map = new util.TreeMap[String, Int]() // var
    while (in.hasNext()) {
      val str = in.next()
      if (!map.containsKey(str)) map.put(str, 1) else map.put(str, map.get(str) + 1)
    }
    map
  }

}
