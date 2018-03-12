package com.ls.castdemo.summarize

/**
  * @author liushuang 2018/3/7
  */
class Member(val name: String, val topic: String) extends Fan {
  //副构造函数
  def this(name: String) {
    //任何副构造函数均应调用主构造函数
    this(name, null)
  }
}
