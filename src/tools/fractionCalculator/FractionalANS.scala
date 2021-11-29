package com.plr.scaladev
package tools.fractionCalculator

object FractionalANS {
  def input(a1:Long, a2:Long, b1:Long, b2:Long, isAdd:Boolean) :(Long, Long) ={
    val c1 = if (isAdd) (if (a2 == b2) a1 + b1 else a1 * b2 + a2 * b1) else (if (a2 == b2) a1 - b1 else a1 * b2 - a2 * b1)
    val c2 = if (a2 == b2) a2 else a2 * b2
    (c1,c2)
  }
}
