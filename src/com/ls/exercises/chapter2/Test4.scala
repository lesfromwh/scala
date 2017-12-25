package com.ls.exercises.chapter2

/**
  * 4.针对java循环编写一个scala办
  * for(int i = 0;i>=0;i--) System.out.print(i)
  *
  * @author liushuang 2017/12/18
  */
object Test4 {
  def main(args: Array[String]): Unit = {
    foreach(10)
  }

  def foreach(i: Int): Unit = {
    for (i <- 0 to i reverse)
      print(i)
  }
}
