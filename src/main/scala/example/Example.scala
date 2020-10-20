package example

import example.java.Window

// To run via SBT use in shell: `sbt "runMain example.Example"`
object Example {
  def main(args: Array[String]): Unit = {
    val wnd = new Window()
    val res = wnd.document.getMember("foo").toString
    println(res)
  }
}
