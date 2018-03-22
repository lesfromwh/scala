package com.ls.study.study11

import scala.collection.mutable

/**
  * 11章 操作符
  *
  * @author liushuang 2018/3/21 
  */
object Study11 extends App {
  println(1 to 5)
  println(1.to(5))

  println(1 -> 3)
  println(1.->(3))

  val hashMap = new mutable.HashMap[String, Int]()
  //等价于 .apply()
  println(mutable.HashMap("a" -> 1))

  //如果出现在=左边 等价于.update()
  hashMap.update("a", 3)
  hashMap("a") = 2
  println(hashMap)

  val string = "liu shuang"
  val Name(first,last) = string
  println(Name(first,last))

//  val IsCompound(input) = "string "

//  println(IsCompound(input))
}

//object IsCompound {
//  def unapply(input: String) ={
//     input.contains(" ")
//  }
//}


