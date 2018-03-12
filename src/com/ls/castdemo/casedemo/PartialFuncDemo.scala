package com.ls.castdemo.casedemo

/**
  * 被包在花括号内没有match的一组case语句是一个偏函数，它是PartialFunction[A, B]的一个实例，
  * A代表参数类型，B代表返回类型，常用作输入模式匹配
  *
  * @author liushuang 2018/3/12
  */
object PartialFuncDemo {
  def main(args: Array[String]): Unit = {
    println(func1("one"))
    println(func2("one"))
  }

  def func1: PartialFunction[String, Int] = {
    case "one" => 1
    case "two" => 2
    case _ => -1
  }

  def func2(num: String): Int = num match {
    case "one" => 1
    case "two" => 2
    case _ => -1
  }

  def func3(): Unit = {
    List(1,2,3) map {case i:Int=>i+1}
  }
}
