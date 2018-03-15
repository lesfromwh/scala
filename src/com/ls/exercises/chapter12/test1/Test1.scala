package com.ls.exercises.chapter12.test1

/** 12.1 编写函数values(fun:(Int)=>Int,low:Int,high:Int),该函数输出一个集合，
  * 对应给定区间内给定函数的输入和输出。比如，values(x=>x*x,-5,5)应该产出一个对偶的集合
  * (-5,25),(-4,16),(-3,9),…,(5,25)
  *
  * @author liushuang 2018/3/16
  */
object Test1 extends App {
  val f = (fun: Int => Int, low: Int, high: Int) => (low to high).map { x => (x, fun(x)) }

  def func(fun: Int => Int, low: Int, high: Int) = (low to high).map { x => (x, fun(x)) }

  println(f(x => x * x, -5, 5))
  println(func(x => x * x, -5, 5))

}
