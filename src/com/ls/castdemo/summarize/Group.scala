package com.ls.castdemo.summarize

/**
  * @author liushuang 2018/3/7
  */
//类,私有主构造函数声明
class Group private(val name: String) {
  def say(msg: String) = {
    println("the group " + name + " say " + msg)
  }

  //接受函数值的类方法
  def play(game: String, members: Array[Member], perform: Member => String): Unit = {
    println("the group is playing a game :" + game)
    members.foreach {
      member =>
        val result = perform(member)
        if (result != null) println(result)
    }
  }

  //curry化函数定义,fun{a}{b}{c}
  def play_curry(game: String, members: Array[Member])(perform: Member => String) = {
    this.play(game, members, perform)
  }

  //any 节后任意多个任意类型参数
  def search(condition: Any): String = {
    Thread.sleep(2000)
    return "the result is :their are too many people named jeff"
  }
}

//伴生对象
object Group {
  private val groups = Map(
    "techparty" -> new Group("techparty"),
    "barcamp" -> new Group("barcamp")
  )

  //def getGroup(name: String) : Unit= { 不加返回值 helloScala中的dsl用不了?
  //  def getGroup(name: String): Group = {
  def getGroup(name: String) = {
    if (groups.contains(name)) groups(name) else null
  }

}

