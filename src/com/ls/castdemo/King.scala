package com.ls.castdemo

/**
  * 构造器参数可以不带val或var，如果不带val或var的参数至少被一个方法所使用，
  * 那么它将会被提升为字段
  *
  * @author liushuang 2017/12/12
  */
class King private(val name: String, prop: Array[String], private var age: Int = 18) {
  println(prop.size)

  //prop被下面的方法使用后，prop就变成了不可变得对象私有字段，等同于private[this] val prop
  //如果没有被方法使用该参数将不被保存为字段，仅仅是一个可以被主构造器中的代码访问的普通参数
  def description = name + " is " + age + " years old with " + prop.toBuffer
}

object King {
  def main(args: Array[String]): Unit = {
    val k = new King("king", Array("权杖", "皇冠"))
    //    println(k.description)
    k.age
    k.age
    //主构造器是 val或者var prop:Array[String]的时候 k.prop不报错.
    //如果没有val 或者 var 报错
    //    k.prop
  }
}
