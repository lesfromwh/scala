package com.ls.mydemo.fold_foldleft_foldright

/**
  * @author liushuang 2018/3/14
  */
class FoldDemo1 {

}

object FoldDemo1 {
  def main(args: Array[String]): Unit = {
        fold()
    //    foldleft()
//    foldright()
  }

  def fold(): Unit = {
    val list = List(1, 4, 5, 6)
    /**
      * 0赋值给z,list(0)赋值给i 计算出结果然后又赋值给z,list(1)赋值给i 一次类推
      */
    val result = list.fold(0) { (z, i) => z + i }
    println(result)
  }

  def foldleft() {
    val fooList = Foo("ls", 24, 'male) :: Foo("ggg", 21, 'fmale) :: Nil
    val result = fooList.foldLeft(List[String]()) { (z, i) =>
      val title = i.sex match {
        case 'male => "Mr."
        case 'fmale => "Ms."
        case _ => "none"
      }
      z :+ s"title ${i.name} ${i.age}"
    }
    println(result)
  }

  def foldright() {
    val fooList = Foo("ls", 24, 'male) :: Foo("ggg", 21, 'fmale) :: Nil
    //    val result = fooList.foldRight(List[String]()) { (z, i) =>
    //
    //      val title = z.sex match {
    //        case 'male => "Mr."
    //        case 'fmale => "Ms."
    //        case _ => "none"
    //      }
    //    }
    //    println(result)
  }
}
