package com.ls.myimplicit.demo1

/**
  *
  * @author liushuang 2018/4/22
  */
object ImplicitClassDemo2Test {

  def main(args: Array[String]): Unit = {
    import ImplicitClassDemo2._
    println("abc".increment)

    import ImplicitClassDemo1._
    //编译报错
    //    val max = math.max("1", 2)
    val max = math.max("1".strToDouble, 2)
    print(max)
  }


}
