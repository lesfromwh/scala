package com.ls.myimplicit.demo1

/**
  * @author liushuang 2018/4/22
  */
class Fraction(val n: Int, val m: Int) {
  private val num = n
  private val den = m

  def *(other: Fraction) = new Fraction(num * other.num, den * other.den)
}

object Fraction {
  def apply(i: Int, i1: Int) = new Fraction(i, i1)

  implicit def int2Fraction(n: Int) = new Fraction(n, 1)

}

