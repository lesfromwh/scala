package com.ls.mydemo

/**
  * @author liushuang 2018/4/18
  */
class Pair[T](val first: T, val second: T) {
  def replaceFirst[R >: T](newFirst: R) = new Pair[R](newFirst, second)
}
