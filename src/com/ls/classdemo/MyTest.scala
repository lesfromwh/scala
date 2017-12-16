package com.ls.classdemo

/**
  * @author liushuang 2017/12/5
  */
object MyTest {
  def main(args: Array[String]): Unit = {
    val person = new Person("ls",24)
//    person.id_=(10)
    //上下等价.
    println(person.age)
  }
}
