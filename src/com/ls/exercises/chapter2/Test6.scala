package com.ls.exercises.chapter2

/**
  * 6.编写一个for循环,计算字符串中所有字符的Unicaoe乘积."hello"-9415087488L
  *
  * @author liushuang 2017/12/18
  */
object Test6 {
  def main(args: Array[String]): Unit = {
    val unit = demo("Hello")
    println(unit) //9415087488
  }

  def demo(x: String): Long = {
    //var a = 1  不指定类型 编译报错,说long不能转成int
    var t: Long = 1
    for (i <- x)
      t = t * i.toLong
    return t
  }
}
