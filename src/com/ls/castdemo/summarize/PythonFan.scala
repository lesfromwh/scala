package com.ls.castdemo.summarize

/**
  * @author liushuang 2018/3/7
  */
trait PythonFan extends Fan {
  override def like(): String = "python," + super.like()
}
