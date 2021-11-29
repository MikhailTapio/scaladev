package com.plr.scaladev
package tools

import java.util.Scanner

//元组简单应用，但我真的很想恋爱呜呜呜呜呜
object LovedOne {
  def input(scanner: Scanner): Unit = {
    println("准备录入虚拟恋人")
    println("她的名字是？")
    val name = scanner.next()
    println("身高如何？（单位为厘米）")
    val height = scanner.nextInt()
    println("体重呢？（单位为千克）")
    val weight = scanner.nextInt()
    println("她喜欢穿什么样的衣饰？")
    val clothes = scanner.next()

    val lovedOne = (name, height, weight, clothes)

    println("录入中......")
    println("恋人名为 %s，身高 %d 厘米，体重 %d 千克。她面露甜甜的微笑，正穿着 %s 朝你款步走来..."
      .format(lovedOne._1, lovedOne._2, lovedOne._3, lovedOne._4))
  }
}
