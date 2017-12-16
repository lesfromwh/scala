package com.ls.first

/**
  * @author liushuang 2017/12/2
  */
object MethodAndFunctionDemo {
  //def 是方法
  def m1(f: (Int, Int) => Int): Int = {
    f(2, 6)
  }

  def m2(x: Int, y: Int): Int = x + y

  //函数
  val f1 = (x: Int, y: Int) => x + y

  //下划线将m2方法变成了函数
  val f2 = m2 _

  def main(args: Array[String]): Unit = {
    val i = m1(f1)
    println(i)
    println(f2(2, 3))
    println(m2(2, 3))
  }
}
