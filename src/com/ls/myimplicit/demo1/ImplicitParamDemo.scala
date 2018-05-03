package com.ls.myimplicit.demo1

/**
  * @author liushuang 2018/4/22
  */
object ImplicitParamDemo {
  object Greeter{
    def greet(name:String)(implicit prompt: String) {
      println("Welcome, " + name + ". The System is ready.")
      println(prompt)
    }
  }

  def main(args: Array[String]) {

    implicit val prompt123 = ">"

    //编译器调用时,会查找一个被implicit声明的类型为String的隐式值
    Greeter.greet("admin")
  }
}
