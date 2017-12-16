package com.ls.first

/**
  * 不可变序列
  *
  * @author liushuang 2017/12/4
  */
object ImmutListDemo {
  def main(args: Array[String]): Unit = {
    //创建一个不可变的集合
    val list1 = List(1, 2, 3) // list1: List[Int] = List(1, 2, 3)
    //将0插入到list1的前面生成一个新的List
    val list2 = 0 :: list1 // list2: List[Int] = List(0, 1, 2, 3)
    val list3 = list1.::(0) // list3: List[Int] = List(0, 1, 2, 3)
    val list4 = 0 +: list1 // list4: List[Int] = List(0, 1, 2, 3)
    val list5 = list1.+:(0) //list5: List[Int] = List(0, 1, 2, 3)

    //将一个元素添加到list1的后面产生一个新的集合
    val list6 = list1 :+ 3 // list6: List[Int] = List(1, 2, 3, 3)

    val list0 = List(4, 5, 6) // list0: List[Int] = List(4, 5, 6)
    //将2个list合并成一个新的List
    val list7 = list1 ++ list0 // list7: List[Int] = List(1, 2, 3, 4, 5, 6)
    //将list1插入到list0前面生成一个新的集合
    val list8 = list1 ++: list0 // list8: List[Int] = List(1, 2, 3, 4, 5, 6)

    //将list0插入到list1前面生成一个新的集合
    val list9 = list1.:::(list0) // list9: List[Any] = List(List(1, 2, 3), 4, 5, 6)
  }
}
