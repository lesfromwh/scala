package com.ls.exercises.chapter5.test4


/**
  * 4.重新实现前一个类中的Time类，将内部呈现改成午夜起的分钟数(介于0到24*60-1之间)。
  * 不要改变公有接口。也就是说，客户端代码不应因你的修改而受影响
  *
  * @author liushuang 2017/12/25
  */
class Time(val hours: Int, val minutes: Int) {

  def before(other: Time): Boolean = {
    //    hours < other.hours || hours == other.hours && minutes < other.minutes
    hours * 60 + minutes < other.hours * 60 + other.minutes

  }

  override def toString: String = {
    (hours * 60 + minutes).toString
  }
}

object Time {
  def main(args: Array[String]): Unit = {
    val time1 = new Time(11, 40)
    val time2 = new Time(20, 19)
    val bool = time1.before(time2)
    println(bool)
    println(time1)
  }
}
