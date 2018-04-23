package com.ls.implicitdemo

/**
  * 隐式类2
  *
  * @author liushuang 2018/4/22
  */
object ImplicitClassDemo2 {

  implicit class StringImprovement(val s: String) { //隐式类
    def increment = s.map(x => (x + 1).toChar)
  }

}
