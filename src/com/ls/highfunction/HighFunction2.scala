package com.ls.highfunction

/**
  * 参数类型推断
  *
  * @author liushuang 2018/3/14
  */
object HighFunction2 {
  def main(args: Array[String]): Unit = {
    //    val f1 = 3* _ 报错 不知道参数类型
    val f2 = 3 * (_: Int) // 将参数乘以3的函数
    //各种写法
    func((x: Int) => 3 * x)
    func((x) => 3 * x)
    func(x => 3 * x)
    func(3 * (_: Int))
    func(3 * _)
    func(_ * 3)

    func2()
  }

  def func(x: Int => Int): Unit = {
    println(x)
  }

  /**
    * 打印三角形
    */
  def func2(): Unit = {
    (1 to 9).map("*" * _).foreach(println _)
  }
}
