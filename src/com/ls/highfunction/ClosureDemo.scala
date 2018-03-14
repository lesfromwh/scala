package com.ls.highfunction

/**
  * 闭包
  * 你的函数可以在变量不再处于作用域内的时候被调用
  *
  * @author liushuang 2018/3/14
  */
object ClosureDemo {
  def main(args: Array[String]): Unit = {
    val f1 = func(3)
    val f2 = func(2)
    println(s"${f1(5)} ${f2(6)}") // 15 12
  }

  def func(z: Int) = (x: Int) => x * z
}
