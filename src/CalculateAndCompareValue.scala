package com.plr.scaladev

import scala.language.postfixOps

object CalculateAndCompareValue {


  def calculate(aNeededPts: Int,
                aGainsCurrency: Int,
                aRespectiveCurrencyToRMB: Double,
                bNeededPts: Int,
                bGainsCurrency: Int,
                bRespectiveCurrencyToRMB: Double
               ): String ={
    if (aGainsCurrency * aRespectiveCurrencyToRMB / aNeededPts >= bGainsCurrency * bRespectiveCurrencyToRMB / bNeededPts)
      "A方案更划算，平均每pt兑换%f人民币".format(aGainsCurrency * aRespectiveCurrencyToRMB / aNeededPts)
    else
      "B方案更划算，平均每pt兑换%f人民币".format(bGainsCurrency * bRespectiveCurrencyToRMB / bNeededPts)
  }

}
