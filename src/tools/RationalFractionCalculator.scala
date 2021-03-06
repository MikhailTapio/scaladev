package com.plr.scaladev
package tools

import tools.fractionCalculator.{FractionalANS, FractionalMND, FractionalRedactAndOutput}

import java.util.Scanner
import scala.annotation.tailrec

object RationalFractionCalculator {

  def input(scanner:Scanner): Unit ={
    val text = "得出分数："
    println("请输入第一个分数的分子（接受整数）")
    val numerator_a = scanner.nextLong()
    println("请输入第一个分数的分母（接受整数）")
    val denominator_a = scanner.nextLong()
    println("请输入第二个分数的分子（接受整数）")
    val numerator_b = scanner.nextLong()
    println("请输入第二个分数的分母（接受整数）")
    val denominator_b = scanner.nextLong()
    println("请输入两个分数之间的运算符（接受“+”、“-”、“*”、“/”），输入abort则取消运算并回到主页面")
    calculate(scanner)
    @tailrec
    def calculate(scanner:Scanner) :Unit ={
      val n = scanner.next()
      n match {
        case "+" =>
          val r = FractionalANS.input(numerator_a,denominator_a,numerator_b,denominator_b,isAdd = true)
          println(text)
          println(FractionalRedactAndOutput.input(r))
        case "-" =>
          val r = FractionalANS.input(numerator_a,denominator_a,numerator_b,denominator_b,isAdd = false)
          println(text)
          println(FractionalRedactAndOutput.input(r))
        case "/" =>
          val r = FractionalMND.input(numerator_a,denominator_a,numerator_b,denominator_b,isMultiply = false)
          println(text)
          println(FractionalRedactAndOutput.input(r))
        case "*" =>
          val r = FractionalMND.input(numerator_a,denominator_a,numerator_b,denominator_b,isMultiply = true)
          println(text)
          println(FractionalRedactAndOutput.input(r))
        case "abort" =>
          println("运算已取消...")
        case _ =>
          calculate(scanner)
      }
    }
  }
}
