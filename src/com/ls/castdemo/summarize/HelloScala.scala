package com.ls.castdemo.summarize

/**
  * @author liushuang 2018/3/7
  */
object HelloScala {
  def main(args: Array[String]): Unit = {
    val techparty = Group.getGroup("techparty")
    //声明式函数编程
    techparty say "I'm the magic of DSL"

    val members = Array(
      new Member("ls", "learn scala") with JavaFan,
      new Member("zl") with PythonFan with JavaFan,
      new Member("wb")
    )

    //memberxxx 随便什么都可以
    //    techparty.play("introduct youself", members, memberxxx => "my name is :" + memberxxx.name + ",and i like scala " + memberxxx.like())

    //    def present(member: Member) = {
    //      if (member.topic != null) member.name + " is presenting " else null
    //    }
    //    techparty.play("present the topic", members, present)

    //偏应用函数的应用及使用
    val potluck = techparty.play("let's go potluck", members, _: Member => String)
    potluck(_.name + " is eating")
    //等效
    //    techparty.play("let's go potluck", members,_.name + " is eating")

    techparty.play_curry("dismiss",members){
      memberxxx=> memberxxx.name +" is leaving and going home"
    }

    //todo
  }
}
