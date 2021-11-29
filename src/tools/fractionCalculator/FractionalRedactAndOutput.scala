package com.plr.scaladev
package tools.fractionCalculator

object FractionalRedactAndOutput {
  def input(f:(Long,Long)): String ={
    if(f._1 % f._2 == 0 || f._2 % f._1 == 0) {
      val factor = if (f._1 >= f._2 ) f._1 / f._2 else f._2 / f._1
      if (f._1 >= f._2) s"${factor}" else s"1 / ${factor}"
    }
    else{
      var actualA = if(f._1>=f._2) f._1 else f._2
      var actualB = if(f._1>=f._2) f._2 else f._1
      while (actualA % actualB != 0) {
        val tmpA = actualA
        actualA = actualB
        actualB = tmpA % actualB
      }
      s"${f._1 / actualB} / ${f._2 / actualB}"
    }
  }
}
