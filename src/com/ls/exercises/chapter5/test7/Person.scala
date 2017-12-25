package com.ls.exercises.chapter5.test7

/** 7.编写一个Person类，其主构造器接受一个字符串，该字符串包含名字，空格和姓，如new Person("Fred Smith")。
  * 提供只读属性firstName和lastName。主构造器参数应该是var,val还是普通参数？为什么？
  * val因为firstName和lastName是只读.用var修改name以后 val还是不会变
  * @author liushuang 2017/12/25
  */
class Person(val name: String) {
   val firstName = name.split(" ").apply(0)
   val lastName = name.split(" ").apply(1)

  override def toString: String = {
    "name:"+name+ "--firstName:" + firstName + "--" + "lastName:" + lastName
  }
}

object Person{
  def main(args: Array[String]): Unit = {
    var person = new Person("Fred Smith")
    println(person)
  }

}
