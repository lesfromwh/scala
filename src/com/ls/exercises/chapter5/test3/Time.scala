package com.ls.exercises.chapter5.test3

/**
  * 3.编写一个Time类，加入只读属性hours和minutes，和一个检查某一时刻是否早于另一时刻的方法
  * before(other:Time):Boolean。Time对象应该以new Time(hrs,min)方式构建。
  * 其中hrs以军用时间格式呈现(介于0和23之间)
  *
  * @author liushuang 2017/12/25
  */
class Time(val hours: Int, val minutes: Int) {

  def before(other: Time): Boolean = {
    hours < other.hours || hours == other.hours && minutes < other.minutes
  }

  override def toString: String = {
    hours + " " + minutes
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
