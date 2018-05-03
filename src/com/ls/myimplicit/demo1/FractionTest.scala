package com.ls.myimplicit.demo1

/**
  * @author liushuang 2018/4/22
  */
object FractionTest {
  def main(args: Array[String]): Unit = {

    val result = 3 * Fraction(4, 2)
    println(result.n)
    print(result.m)
  }
}
