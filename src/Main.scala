package com.plr.scaladev

import java.util.Scanner

object Main {

  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(System.in)
    println("欢迎使用 Curseforge 点数奖励价值评估系统")
    println("请输入兑换方案 A 需要的点数")
    val aCost = scanner.nextInt()
    println("请输入方案 A 可兑换的货币数目")
    val aGain = scanner.nextInt()
    println("请输入方案 A 兑换的货币对人民币的理论汇率（接受小数）")
    val aRespRmb = scanner.nextDouble()
    println("请输入兑换方案 B 需要的点数")
    val bCost = scanner.nextInt()
    println("请输入方案 B 可兑换的货币数目")
    val bGain = scanner.nextInt()
    println("请输入方案 B 兑换的货币对人民币的理论汇率（接受小数")
    val bRespRmb = scanner.nextDouble()
    println("计算中......")
    val calculated = CalculateAndCompareValue.calculate(aCost, aGain, aRespRmb, bCost, bGain, bRespRmb)
    println(calculated)
  }
}