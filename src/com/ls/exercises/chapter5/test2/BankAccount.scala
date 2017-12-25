package com.ls.exercises.chapter5.test2

/**
  * 2.编写一个类.
  *
  * @author liushuang 2017/12/25
  */
class BankAccount(val balance: Int = 0) {
  //  val balance = 0

  def deposit() {}

  def withdraw() {}
}

object BankAccount {
  def main(args: Array[String]): Unit = {
    val account = new BankAccount
    val balance = account.balance
    println(balance)
  }
}

