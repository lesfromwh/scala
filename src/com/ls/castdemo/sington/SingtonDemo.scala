package com.ls.castdemo.sington

import scala.collection.mutable.ArrayBuffer

/**
  * @author liushuang 2017/12/12
  */
object SingtonDemo {
  def main(args: Array[String]): Unit = {
    //单例对象,不需要new,用类名.方法 调用对象中的方法
    val session = SessionFatory.getSession()
    println(session)

  }
}

object SessionFatory {
  //该部分相当于java中的静态块
  var counts = 5
  val sessions = new ArrayBuffer[Session]
  while (counts > 0) {
    sessions += new Session
    counts -= 1
  }

  //在object中的方法相当于java中的静态方法
  def getSession():Session = {
    sessions.remove(0)
  }
}

class Session {

}
