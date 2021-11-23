package com.plr.scaladev

import java.util.Scanner
import scala.util.control.Breaks

object Main {

  def main(args: Array[String]): Unit = {
    println("欢迎使用 Tapio 的工具集！")
    val scanner = new Scanner(System.in)
    showCategories()
    var selection = 0
    while (selection >= 0) {
      selection = if (scanner.hasNextInt()) scanner.nextInt() else 0
      selection match {
        case 1 =>
          CurseforgeRewardCalculation.input(scanner)
        case 0 => selection = -1
        case _ =>
          showCategories()
          selection = 0
      }
    }
    scanner.close()
  }

  def showCategories(): Unit ={
    println("输入序号以使用功能")
    println("1. Curseforge 点数奖励价值评估系统")
    println("0. 退出程序")
  }
}