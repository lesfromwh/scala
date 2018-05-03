package com.ls.myimplicit.demo2

/**
  * @author liushuang 2018/5/2
  */
object TestBoy {
  def main(args: Array[String]): Unit = {
    val a = new Boy("a", 99)
    val b = new Boy("b", 98)
    val boys = Array(a, b)
    val sortedBoys = boys.sortBy(x => x)
    for(x <- sortedBoys) {
      println(x.name)
    }

  }
}
