package com.ls.exercises.chapter11.test9

/**
  * 11.9 为RichFile类定义unapply操作，提取文件路径，名称和扩展名。举例来说，文件/home/cay/readme.txt的路径为/home/cay,名称为readme,扩展名为txt
  *
  * @author liushuang 2018/3/22 
  */
class RichFile(val path: String) {}

object RichFile {
  def apply(path: String): RichFile = new RichFile(path)

  def unapply(richFile: RichFile) = {
    if (richFile.path == null) None
    else {
      val reg = "([/\\w+]+)/(\\w+)\\.(\\w+)".r
      val reg(r1, r2, r3) = richFile.path
      Some((r1, r2, r3))
    }
  }

  def main(args: Array[String]) {
    val richFile = RichFile("/home/cay/readme.txt")
    val RichFile(r1, r2, r3) = richFile
    println(r1)
    println(r2)
    println(r3)
  }
}


