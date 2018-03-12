package com.ls.castdemo.companion

/**
  * 在Scala的类中，与类名相同的对象叫做伴生对象，类和伴生对象之间可以相互访问私有的方法和属性
  *
  * @author liushuang 2017/12/13
  */
class Dog {
  val id = 1
  private var name = "duoduo"

  def printName(): Unit = {
    //在Dog类中可以访问伴生对象Dog的私有属性
    println(Dog.constant + " " + name)
  }
}

object Dog {

  //伴生对象中的私有属性
  private val constant = "wwww"

  def main(args: Array[String]): Unit = {
    val p = new Dog
    p.name = "maomao"
    println(p.name) // maomao
    p.printName() // wwww maomao
  }
}
