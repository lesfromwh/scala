package com.ls.exercises.chapter12.test4

/**
  * 12.4 前一个实现需要处理一个特殊情况，即n<1的情况。展示如何用foldLeft来避免这个需要
  *
  * @author liushuang 2018/3/19 
  */
object Test4 extends App {
  val f1 = (x: Int) => (1 to x).reduceLeft(_ * _)

  def factorial2(x: Int) = (1 /: (1 to x)) (_ * _)

  //  val f = (x:Int)=>(1/: (1 to x))(_*_) //不懂
//  val f = (x: Int) => (1 to x).foldLeft(1)(_ * _)
//  val f = (x: Int) => (1 to x).fold(1)(_ * _)
  val f = (x: Int) => (1 to x).foldRight(1)(_ * _)
  println(f(-3))
}
