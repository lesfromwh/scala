package com.ls.myimplicit.demo3


/**
  * @author liushuang 2018/5/3
  */
object MyPreDef2 {
  //   1
  //  implicit def girl2Ordered(g: Girl) = new Ordered[Girl] {
  //    override def compare(that: Girl) = {
  //      println("1")
  //      g.faceValue - that.faceValue
  //    }
  //  }


  //  2
  //    implicit val girl2Ordering1 = new Ordering[Girl] {
  //      override def compare(x: Girl, y: Girl) = {
  //        println("2")
  //        y.faceValue - x.faceValue
  //      }
  //    }

  //3  2和3不能同时存在，不然报错。
  implicit def girl2Ordering2 = new Ordering[Girl] {
    override def compare(x: Girl, y: Girl) = {
      println("3")
      y.faceValue - x.faceValue
    }
  }

  //4
  implicit object girlOrdering3 extends Ordering[Girl] {
    override def compare(x: Girl, y: Girl): Int = {
      println("4")
      y.faceValue - x.faceValue
    }
  }

}
