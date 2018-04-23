package com.ls.exercises.chapter12.test3

/**
  * 12.3 使用to和reduceLeft实现阶乘，不得使用循环和递归
  *
  * @author liushuang 2018/3/19 
  */
object Test3 extends App {
  val f = (x: Int) => (1 to x).reduceLeft(_ * _)
  println(f(4))
}
