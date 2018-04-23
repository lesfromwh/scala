package com.ls.iterabledemo

import scala.collection.SortedSet

/**
  * Set集合 去重复,immutable
  *
  * @author liushuang 2018/3/20 
  */
object SetDemo extends App {
  val set = Set(2, 1, 3, 4, 11, 9, 1) //Set(1, 9, 2, 3, 11, 4)
  val set2 = SortedSet(2, 1, 3, 4, 11, 9)
  println(set) //Set(1, 9, 2, 3, 11, 4)
  println(set2) //TreeSet(1, 2, 3, 4, 9, 11)

  //添加元素返回新的集合
  val set3 = set + 100
  println(set3) //Set(1, 9, 2, 3, 11, 4, 100)

  //删除元素
  val set4 = set3 - 11 - 9
  println(set4) //Set(1, 2, 3, 4, 100)

  //coll1-coll2
  val set5 = set -- Seq(1, 2, 3)
  println(set5)//Set(9, 11, 4)

  //交集,并集,差异
  println(set & set5) //Set(9, 11, 4)
  //| 等同于++
  println(set | set5) //Set(1, 9, 2, 3, 11, 4)
  // &~等同于 --
  println(set5 &~ set) //Set(1, 2, 3)
}
