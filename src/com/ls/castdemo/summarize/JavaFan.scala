package com.ls.castdemo.summarize

/**
  * @author liushuang 2018/3/7
  */
trait JavaFan extends Fan {

  override def like(): String = "java," + super.like()
}
