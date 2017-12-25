package com.ls.exercises.chapter2

/**
  * 1.一个数字如果为正数，则它的signum为1;如果是负数,则signum为-1;如果为0,则signum为0.编写一个函数来计算这个值
  *
  * @author liushuang 2017/12/18
  */
object Test1 {
  def main(args: Array[String]): Unit = {
    signum(10)
  }

  def signum(x: Int): Unit = {
    if (x > 0) println(1)
    else if (x > 0) println(-1)
    else println(0)
  }
}
