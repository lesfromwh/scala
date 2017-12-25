package com.ls.exercises.chapter5.test6

/**
  * 6.在5.1节的person类中提供一个主构造器,将负年龄转换为0
  *
  * @author liushuang 2017/12/25
  */
class Person(var age: Int) {
  age = if (age < 0) 0 else age
}

