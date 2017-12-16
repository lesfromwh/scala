package com.ls.first

/**
  * @author liushuang 2017/12/2
  */
object VariableDemo {
  def main(args: Array[String]): Unit = {
    //使用val定义的变量值是不可变的.相当于java中的final.
    val a = 1
    //使用var定义的变量是可变的,推荐使用val.
    var b = "hello"
    //scala可以自动推断变量的类型,必要的时候可以指定类型.
    val c:String = "liushuang"
    println(a)
    println(b)
    println(c)
  }
}
