package com.ls.castdemo.apply

/**
  * @author liushuang 2018/3/7
  */
class ApplyTest {
  def apply = {
    println("i am into scala so much")
  }

  def haveTry() = {
    println("hava a try on apply")
  }
}

object ApplyTest {
  def apply() = {
    println("i am also into scala so much")
    new ApplyTest
  }
}
