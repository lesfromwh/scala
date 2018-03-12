package com.ls.castdemo.casedemo

/**
  * 类型匹配
  *
  * @author liushuang 2018/3/9
  */
object CaseDemo2 extends App {
  val arr = Array("aaa", 1, 3.0)
  val name = arr(0)
  name match {
    case x: Int => println(x)
    //还可以加入过滤条件
    case y: Double if (y < 0) => println(y)
    case z: String => printf(z)
    case _ => printf("error")
  }
}
