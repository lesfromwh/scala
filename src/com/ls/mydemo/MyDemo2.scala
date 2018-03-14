package com.ls.mydemo

/**
  * @author l iushuang 2018/3/14
  */
object MyDemo2 {
  def main(args: Array[String]): Unit = {
    val f1 = (x: Int) => x * 3
    val arr = Array(1, 2, 3)
    //    println(arr.map(func1())) //报错. 方法是不能传递的  func1 _ 转换成函数传递
    println(arr.map(func1 _).toBuffer)
    println(arr.map(f1).toBuffer)
  }

  def func1(x: Int) = x * 3
}


