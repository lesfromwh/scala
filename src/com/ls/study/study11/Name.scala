package com.ls.study.study11

import scala.None

/**
  *
  * @author liushuang 2018/3/21 
  */
class Name(first: String, last: String) {

  override def toString = first + " " + last
}

object Name {
  def apply(first: String, last: String): Name = new Name(first, last)

  def unapply(input: String) = {
    val index = input indexOf (" ")
    if (index == -1) None
    else Some(input.substring(0, index), input.substring(index + 1))
  }
}
