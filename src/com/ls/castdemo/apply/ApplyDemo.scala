package com.ls.castdemo.apply

/**
  * 常我们会在类的伴生对象中定义apply方法，当遇到类名(参数1,...参数n)时apply方法会被调用
  *
  * @author liushuang 2018/3/7
  */
object ApplyDemo {
  //这里的Array是class
  def main(args: Array[String]): Unit = {
    //这里的Array是 def apply(x: Int, xs: Int*): Array[Int] = {***}
    val a = Array(5)
    println(a.toBuffer)

    //这里是类Array
    val b = new Array(5)
  }
}
