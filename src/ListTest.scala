package com.plr.scaladev


object ListTest {
  def main(args: Array[String]): Unit = {
    val oneTwoThree = 1::2::3::Nil
    val FourFive = 4::5::Nil
    val oneToFive = oneTwoThree:::FourFive
    println(oneTwoThree)
    println(oneToFive)
    val minecraft = List("M","i","n","e","c","r","a","f","t")
    println(minecraft.head)
    println(minecraft.init)
    println(minecraft.last)
    println(minecraft.mkString(" "))
    minecraft.foreach(s => println(s))
    //Also minecraft.foreach(println)
    println(minecraft.map(s => s + " "))
    println(minecraft.drop(2))

  }
}
