package com.plr.scaladev
package tools.fractionCalculator

object FractionalMND {
  def input(a1:Long, a2:Long, b1:Long, b2:Long, isMultiply:Boolean) :(Long,Long)={
    val c1 = if (isMultiply) a1 * b1 else a1 * b2
    val c2 = if (isMultiply) a2 * b2 else a2 * b1
    (c1,c2)
  }
}
