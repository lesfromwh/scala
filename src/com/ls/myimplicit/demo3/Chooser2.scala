package com.ls.myimplicit.demo3

/**
  * @author liushuang 2018/5/3
  */
class Chooser2[T] {

  //相当于view bound 视图界定
  //T<%V 必须存在一个从T->V的隐式转换
  //这里只T=>Ordered[T]
  def choose(first: T, second: T)(implicit ord: T => Ordered[T]): T = {
    if (first > second) first else second
  }

  def select(first: T, second: T)(implicit ord: Ordering[T]): T = {
    if (ord.gt(first, second)) first else second
  }
}

object Chooser2 {
  def main(args: Array[String]): Unit = {
    import MyPreDef2._
    val mr = new Chooser2[Girl]
    val g1 = new Girl("c", 98)
    val g2 = new Girl("d", 95)
    //    val girl = mr.choose(g1, g2)
    val girl = mr.select(g1, g2)
    println(girl.name)
  }
}
