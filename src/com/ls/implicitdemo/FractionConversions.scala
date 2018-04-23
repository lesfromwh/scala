package com.ls.implicitdemo

/**
  * @author liushuang 2018/4/22
  */
object FractionConversions {

  implicit def int2Fraction(n: Int) = new Fraction(n, 1)
}
