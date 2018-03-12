package com.ls.castdemo.casedemo

import scala.util.Random


/**
  * 字符串匹配
  *
  * @author liushuang 2018/3/9
  */
object CaseDemo1 {
  def main(args: Array[String]): Unit = {
    val arr = Array("AAA", "BBB", "CCC")
    //    val random = arr(Random.nextInt(arr.length))
    val random = arr(1)
    random match {
      case "AAA" => println("aaa")
      case "BBB" => println("bbb")
      case _ => println("error")
    }
  }
}
