package com.plr.scaladev
package tools.fractionCalculator

import scala.annotation.tailrec

object FractionalRedactAndOutput {
  def input(f:(Long,Long)): String ={
    val p = if (f._1 * f._2 >= 0) "" else "- "
    val a = f._1.abs
    val b = f._2.abs
    if(a % b == 0 || b % a == 0) {
      val factor = math.max(a,b) / math.min(a,b)
      p + (if (a >= b) s"$factor" else s"1 / $factor")
    }
    else{
      val factor = gcd(math.max(a,b),math.min(a,b))
      p + s"${a / factor} / ${b / factor}"
    }
  }
  @tailrec
  def gcd(a:Long, b:Long): Long ={
    if (b == 0) a else gcd(b, a % b)
  }
}
