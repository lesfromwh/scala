package com.ls.myimplicit.demo1

/**
  * @author liushuang 2018/4/22
  */
object ImplicitDefDemo {

  /**
    * 1. 需要 implicit申明
    * 2. 需要引入
    */

  object MyImplicitTypeConversion {
    implicit def strToInt(str: String) = str.toInt
  }

  def main(args: Array[String]): Unit = {
    //编译报错
    //    val max = math.max("1",2)

    //    import MyImplicitTypeConversion.strToInt
    //下面的写法也可以
    import MyImplicitTypeConversion._

    val max = math.max("1", 2)
    print(max)
  }
}
