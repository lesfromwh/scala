package com.ls.highfunction

/**
  * @author liushuang 2018/3/15
  */
object ClosureDemo2 {
  def main(args: Array[String]): Unit = {
    println("value = " + f1(1))
    println("value = " + f1(2))
  }


  //这样定义的函数变量 f1 成为一个"闭包"，因为它引用到函数外面定义的变量，
  // 定义这个函数的过程是将这个自由变量捕获而构成一个封闭的函数。
  val z = 3
  val f1 = (x: Int) => x  * z

}
