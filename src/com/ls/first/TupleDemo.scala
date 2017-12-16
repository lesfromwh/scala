package com.ls.first

/**
  * @author liushuang 2017/12/4
  */
object TupleDemo {
  def main(args: Array[String]): Unit = {
    val a = ("hadoop", 3.14, 123456)
    println(a) //(String, Double, Int) = ("hadoop",3.14,123456)
    //获取元组中的元素,角标是从1开始的.
    println(a._1) //hadoop
    println(a._2) //3.14
    println(a._3) //123456

    //将对偶的集合转换成映射
    //在scala编译器中查看
    var arr = Array(("a", 1), ("b", 2)) // arr: Array[(String, Int)] = Array((a,1), (b,2))
    val map = arr.toMap // scala.collection.immutable.Map[String,Int] = Map(a -> 1, b -> 2)

    //zip命令可以将多个值绑定在一起
    val b = Array(100,88,99)
    val names = Array("a","b","c")
    val c = names.zip(b) //c: Array[(String, Int)] = Array((a,100), (b,88), (c,99))
    c.toMap // res0: scala.collection.immutable.Map[String,Int] = Map(a -> 100, b -> 88, c -> 99)

    //如果长度不一致,拉链操作后生产的数组的长度以最小的那个为准
  }
}
