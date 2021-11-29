package com.plr.scaladev
package tools.fractionCalculator

object FractionalRedactAndOutput {
  def input(f:(Long,Long)): String ={
    val isPositive = f._1 * f._2 >= 0
    val a = f._1.abs
    val b = f._2.abs
    if(a % b == 0 || b % a == 0) {
      val factor = if (a >= b ) a / b else b / a
      (if (isPositive) "" else "- ") + (if (a >= b) s"$factor" else s"1 / $factor")
    }
    else{
      var actualA = if(a>=b) a else b
      var actualB = if(a>=b) b else a
      while (actualA % actualB != 0) {
        val tmpA = actualA
        actualA = actualB
        actualB = tmpA % actualB
      }
      (if (isPositive) "" else "- ") + s"${a / actualB} / ${b / actualB}"
    }
  }
}
