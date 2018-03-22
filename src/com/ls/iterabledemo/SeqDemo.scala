package com.ls.iterabledemo

/**
  * seq集合
  *
  * @author liushuang 2018/3/20 
  */
object SeqDemo extends App {
  var seq = Seq(1, 2, 3)
  val seq1: Seq[Int] = seq :+ 1
  println(seq) //List(1, 2, 3)
  println(seq1)//List(1, 2, 3, 1)

  val seq2 = 9 +: seq
  println(seq2) //List(9, 1, 2, 3)

}
