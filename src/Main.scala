package com.plr.scaladev

import tools.{CurseforgeRewardCalculation, LovedOne, RationalFractionCalculator}

import java.util.Scanner
import scala.annotation.tailrec

object Main {

  def main(args: Array[String]): Unit = {
    println("欢迎使用 Tapio 的工具集！")
    val scanner = new Scanner(System.in)
    select(scanner)
    scanner.close()
  }

  @tailrec
  def select(scanner:Scanner): Unit ={
    showCategories()
    val selection = if (scanner.hasNextInt()) scanner.nextInt() else 0
    selection match {
      case 1 =>
        CurseforgeRewardCalculation.input(scanner)
        select(scanner)
      case 2 =>
        LovedOne.input(scanner)
        select(scanner)
      case 3 =>
        RationalFractionCalculator.input(scanner)
        select(scanner)
      case 0 =>
      case _ =>
        select(scanner)
    }
  }

  def showCategories(): Unit ={
    println("输入序号以使用功能")
    println("1. Curseforge 点数奖励价值评估系统")
    println("2. 录入一个虚拟恋人")
    println("3. 进行简单分数运算")
    println("0. 退出程序")
  }
}