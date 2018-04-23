package com.ls.implicitdemo

/**
  * 隐式类1
  *
  * @author liushuang 2018/4/22
  */
object ImplicitClassDemo1 {

  implicit class MyImplicitTypeConversion(val str: String) {
    def strToInt = str.toInt

    def strToDouble = str.toDouble
  }

  def main(args: Array[String]): Unit = {
    import ImplicitClassDemo1._
    //编译报错
    //    val max = math.max("1", 2)
    val max = math.max("1".strToDouble, 2)
    print(max)
  }
}



