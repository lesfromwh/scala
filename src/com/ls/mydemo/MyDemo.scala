package com.ls.mydemo


/**
  * @author liushuang 2017/12/4
  */
object MyDemo {
  def main(args: Array[String]): Unit = {
    val list = 1 :: 2 :: 3 :: Nil
    println(list)
    //    foldLeft1(0)(bbb(1,2))

    var y = 0
    val xx = f {
      y += 1; y
    }
    println(xx)
  }

  //  def fold[A1 >: A](z: A1)(op: (A1, A1) => A1): A1 = foldLeft(z)(op)
  def fold1(z: Int)(op: (Int, Int) => Int): Int = foldLeft1(z)(op)

  def foldLeft1(z: Int)(op: (Int, Int) => Int): Int = {
    val op1 = op
    val a = 1
    a
  }

  def bbb(x: Int, y: Int): Int = {
    1
  }

  def addOne(f: Int => Int, arg: Int) = f(arg) + 1

  def ccc(x: Int): Int = {
    1
  }

  def f(x: => Int) = x * 2
}
