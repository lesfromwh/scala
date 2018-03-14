package com.ls.highfunction

/**
  * @author liushuang 2018/3/15
  */
object HighFunction3 {
  def main(args: Array[String]): Unit = {
    println(func(1))
    func(func(1))
    func2(func(1))
    //有什么不一样吗?  todo 不懂
    val f3 = func3(func _)(2)
    println(f3)
  }

  def func(x: Int) = 2 * x

  def func2(x: => Int) = x

  def func3(x: Int => Int) = x
}
