package com.ls.castdemo

import java.io.IOException

/**
  * 类不用声明pubic
  *
  * @author liushuang 2017/12/5
  */
class Person(var id:String,val age :Int) {
  println("执行主构造器")
  try {
    println("读取文件")
    throw new IOException("io exception")
  } catch {
    case e: NullPointerException => println("打印异常Exception : " + e)
    case e: IOException => println("打印异常Exception : " + e)
  } finally {
    println("执行finally部分")
  }
  val name = "ls" //val不可变,所有没有set方法
  private var gender = "男1"

  def this(name:String,age:Int,gender:String) {
    this(name,age)
    println("执行辅助构造器")
    this.gender = gender
  }
}

object Test{
  def main(args: Array[String]): Unit = {
    val person = new Person("ls",24,"nan")
  }
}
