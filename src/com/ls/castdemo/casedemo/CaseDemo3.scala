package com.ls.castdemo.casedemo

/**
  * 匹配数组,元组
  *
  * @author liushuang 2018/3/9
  */
object CaseDemo3 extends App {
  //  val arr = Array(0, 1, 3, 5) //0 ...
  //  val arr = Array(0)  //only 0
  //  val arr = array(1, 3, 5) // 3 5
  val arr = Array(2, 3) //something else
  arr match {
    case Array(1, x, y) => println(x + " " + y)
    case Array(0) => println("only 0")
    case Array(0, _*) => println("0 ...")
    case _ => println("something else")
  }

  //  val lst = List(3, -1) //x: 3 y: -1
  //  val lst = List(1, 2, 3) //something else
  //  val lst = List(0)//only 0
  //  val lst = List(0, 1, 3) //0 ...
  val lst = List(1, 0, 2, 4, 5) //1 0 List(2, 4, 5)
  /**
    * x代表任意变量,0放在第二个位子匹配元素中的第二位,tail是尾巴.
    * Nil是空 0::Nil 表示第一个位子是0,后面是空
    * 注意：:: 操作符是右结合的，如9 :: 5 :: 2 :: Nil相当于 9 :: (5 :: (2 :: Nil))
    */
  lst match {
    case 0 :: Nil => println("only 0")
    case x :: y :: Nil => println(s"x: $x y: $y")
    case 0 :: tail => println("0 ...")
    case x :: 0 :: tail => println(s"$x 0 " + tail)
    case _ => println("something else")
  }

  val tup = (2, 4, 8)
  tup match {
    //    case (2, x, y) => println(s"2,$x $y")
    case (x, z, 8) => println(s"$x $z") // case (_, z, 8) => println(s"$x $z") 等价
    case _ => println("else")
  }
}
