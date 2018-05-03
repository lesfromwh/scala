package com.ls.myimplicit.demo2

/**
  * @author liushuang 2018/5/2
  */
object MyPredef {
  // ordered 里面还有一个ordering[T]
  //  implicit def girl2Ordered(g: Girl) = new Ordered[Girl] {
  //    override def compare(that: Girl) = {
  //      g.faceValue - that.faceValue
  //    }
  //  }

  //    implicit def girl2Ordered = (g: Girl) => new Ordered[Girl] {
  //      override def compare(that: Girl) = {
  //        g.faceValue - that.faceValue
  //      }
  //    }

  //  todo 为什么不行.   失败.不能隐式转换. no implicit ordering defined from Girl
  //    implicit def girl2Ordering(g:Girl) = new Ordering[Girl] {
  //      override def compare(x: Girl, y: Girl) = {
  //        x.faceValue - y.faceValue
  //      }
  //    }
  // 改成这样就行了
      implicit def girl2Ordering = new Ordering[Girl] {
        override def compare(x: Girl, y: Girl) = {
          x.faceValue - y.faceValue
        }
      }

  //  implicit val girl2Ordering = () => new Ordering[Girl] {
  //    override def compare(x: Girl, y: Girl): Int = {
  //      x.faceValue - y.faceValue
  //    }
  //  }

  //  implicit val girl2Ordering =  new Ordering[Girl] {
  //    override def compare(x: Girl, y: Girl): Int = {
  //      x.faceValue - y.faceValue
  //    }
  //  }

  //    trait Girl2Ordering extends Ordering[Girl] {
  //      override def compare(x: Girl, y: Girl): Int = {
  //        x.faceValue - y.faceValue
  //      }
  //    }
  //
  //    implicit object Girl extends Girl2Ordering

}
