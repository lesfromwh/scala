package com.ls.exercises.chapter5.test1

/**
  * @author liushuang 2017/12/25
  */
class Counter {
  private var value =0
  def increment(): Unit = {
    value+=1
  }
  def current() = value
}
