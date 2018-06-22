package com.ls.myimplicit.demo4

/**
  * @author liushuang 2018/5/4
  */
class Implicits {
  implicit val content = "java hadoop"
}

object Implicits {
//  implicit val content = "scala spark"
}

class ImplicitsChild extends Implicits{
  override implicit val content = "ImplicitsChild class"
}

object ImplicitsChild{
    implicit val content2 = "Child"
}


object ImplicitAdvanced {
  def main(args: Array[String]): Unit = {
    def printContent(implicit content: String) = print(content)

//    implicit val content = "i love scala"
    new ImplicitsChild
    printContent
  }
}
