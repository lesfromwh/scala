package com.ls.first

/**
  * @author liushuang 2017/12/2
  */
object ForDemo {
  def main(args: Array[String]): Unit = {
    println(1 to 5) //Range(1, 2, 3, 4, 5)
    for (i <- 1 to 5)
      print(i + " ") //1 2 3 4 5

    val arr = Array("a", "b", "c")
    for (i <- arr)
      println(i)

    //高级for
    //每个生成器都可以带一个条件,注意if前面没有分号
    for (i <- 1 to 3; j <- 1 to 3 if i != j)
      println(i + " " + j)

    //for推导式:如果for循环的循环体以yield开始，则该循环会构建出一个集合
    //每次迭代生成集合中的一个值
    val a = for (i <- 1 to 3) yield i * 10
    println(a)
  }
}
