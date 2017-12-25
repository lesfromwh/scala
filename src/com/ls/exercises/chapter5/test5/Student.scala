package com.ls.exercises.chapter5.test5

/**
  * 5.创建一个Student类，加入可读写的JavaBeans属性name(类型为String)和id(类型为Long)。
  * 有哪些方法被生产？(用javap查看。)你可以在Scala中调用JavaBeans的getter和setter方法吗？应该这样做吗？
  *
  * @author liushuang 2017/12/25
  */
class Student(var name: String, var id: Long) {
  override def toString: String = {
    name + " " + id
  }
}

object Student {
  def main(args: Array[String]): Unit = {
    val student = new Student("ls", 24)
    student.name = "lss"
    student.id = 25
    println(student)
  }
}
