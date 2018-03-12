package com.ls.castdemo.curry

/**
  * curry化
  *
  * @author liushuang 2018/3/7
  */
object CurryDemo {
  def main(args: Array[String]): Unit = {
    //普通函数订单
    def mutiple1(x: Int, y: Int) = x * y

    println(mutiple1(2, 5))

    //curry化函数定义
    def mutiple2(x: Int) = (y: Int) => x * y

    println(mutiple2(3)(4))

    //常用写法 function{a}{b}{c}
    def mutiple3(x: Int)(y: Int) = x * y

    println(mutiple3(3)(5))

    //等效
    println(mutiple3(3) {
      5
    })
  }
}
