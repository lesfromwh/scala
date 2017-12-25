package com.ls.exercises.chapter4

/**
  * 1.设置一个映射,其中包含你想哟的一些装备及其价格.然后构建另一个映射,但是价格9折
  * @author liushuang 2017/12/21
  */
object Test1 {
  def main(args: Array[String]): Unit = {
    val map = Map("香蕉"->2,"苹果"->1)
    val a = for((k,v)<-map) yield (k,v*0.9)
    println(a.toBuffer)
  }


}
