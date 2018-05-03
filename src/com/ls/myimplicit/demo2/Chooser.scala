package com.ls.myimplicit.demo2

/**
  * @author liushuang 2018/5/2
  */
//1.视图界定.类型约束将替换它.
//class Chooser[T <% Ordered[T]] {
//
//  def choose(first: T, second: T): T = {
//    if (first > second) first else second
//  }
//}

//2.上下文界定
class Chooser[T: Ordering] {

  def choose(first: T, second: T): T = {
    //implicit 隐式参数
    val ord = implicitly[Ordering[T]]
    if (ord.gt(first, second)) first else second

  }
}


object Chooser {
  def main(args: Array[String]): Unit = {
    import MyPredef._
    val c = new Chooser[Girl]
    val a = new Girl("a", 90)
    val b = new Girl("b", 88)
    val girl = c.choose(a, b)
    println(girl.name)
  }
}
