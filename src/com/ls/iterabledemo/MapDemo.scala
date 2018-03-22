package com.ls.iterabledemo

/**
  * map
  *
  * @author liushuang 2018/3/20 
  */
object MapDemo extends App {
  val map = Map("a" -> 1, "b" -> 2)
  // + 添加.
  val map2 = map + ("c" -> 3)
  println(map2) //Map(a -> 1, b -> 2, c -> 3)
  // - 删除
  val map3 = map2 - ("c")
  println(map3)
  //-- 移除
//  val map4 = map2 -- ("c"->3) //todo 报错
}
