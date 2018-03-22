package com.ls.mydemo

/**
  * @author l iushuang 2018/3/14
  */
object MyDemo2 extends App {
  val list = List("a","b")
  val string =  list.map(_.toUpperCase())
  println(string) //
  val string2 = list foreach(_.toUpperCase())
  println(string2) //()
  val string3 = for(n<-list) yield n.toUpperCase()
  println(string3) //


  List(1,2,3) foreach(print(_))


  print( List("a","b","c","d").zipWithIndex)
}


