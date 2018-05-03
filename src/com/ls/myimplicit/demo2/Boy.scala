package com.ls.myimplicit.demo2

/**
  * @author liushuang 2018/5/2
  */
class Boy(val name: String, val faceValue: Int) extends Comparable[Boy] {
  override def compareTo(o: Boy): Int = {
    this.faceValue - o.faceValue
  }
}
