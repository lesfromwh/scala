package com.ls.classdemo.companion

/**
  * @author liushuang 2017/12/13
  */
class Dog {
  val id = 1
  private var name = "duoduo"

  def printName(): Unit = {
    println(Dog.constant + " " + name)
  }
}

object Dog {

  private val constant = "wwww"

  def main(args: Array[String]): Unit = {
    val p = new Dog
    p.name = "maomao"
    println(p.name) // maomao
    p.printName() // wwww maomao
  }
}
