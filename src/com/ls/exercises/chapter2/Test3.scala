package com.ls.exercises.chapter2

/**
  * 3.x=y=1在哪种情况下是合法的.(给x找一个合适的类型)
  *
  * @author liushuang 2017/12/18
  */
object Test3 {
  def main(args: Array[String]): Unit = {
    //    x=y=1 报错
    //scala中赋值语句是unit类型
    var x = {}
    var y = 3
    x = y = 22
    println(x) // ()
    println(y) // 22
  }
}
