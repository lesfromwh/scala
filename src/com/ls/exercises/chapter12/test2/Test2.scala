package com.ls.exercises.chapter12.test2

/**
  * 12.2 如何用reduceLeft得到数组中的最大元素?
  *
  * @author liushuang 2018/3/16
  */
object Test2 extends App {
  val arr = Array(1, 2, 9, 3)
  val max = arr reduceLeft ((a, b) => {
    if (a > b) a; else b
  })

  print(max)

}
