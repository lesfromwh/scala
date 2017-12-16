package com.ls.first

/**
  * @author liushuang 2017/12/3
  */
object MapDemo {
  def main(args: Array[String]): Unit = {
    //scala中k->v称为映射
    val map1 = Map("a" -> 1, "b" -> 2, "c" -> 3)
    println(map1.toBuffer) //ArrayBuffer((a,1), (b,2), (c,3))

    val map2 = Map(("a", 11), ("b", 22), ("c", 33))
    println(map2.toBuffer)
    //获取映射和修改映射中的值
    println(map1("a")) // 1
    // 如果映射中有值,就返回值,如果没有返回默认值.
    println(map1.getOrElse("d", 0))
    println(map1.get("d")) // None

    //***注意：在Scala中，有两种Map，一个是immutable包下的Map，该Map中的内容不可变；
    //*** 另一个是mutable包下的Map，该Map中的内容可变
    //*** 通常我们在创建一个集合是会用val这个关键字修饰一个变量（相当于java中的final），
    //*** 那么就意味着该变量的引用不可变，该引用中的内容是不是可变，取决于这个引用指向的集合的类型
  }
}
