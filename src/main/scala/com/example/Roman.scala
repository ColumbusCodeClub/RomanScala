package com.example

object Roman {

  val mapping1 = Map[Int, String](
    1 -> "I",
    2 -> "II",
    3 -> "III",
    4 -> "IV",
    5 -> "V",
    6 -> "VI",
    7 -> "VII",
    8 -> "VIII",
    9 -> "IX"
  )

  val mapping2 = Map[Int, String](
    1 -> "X",
    2 -> "XX",
    3 -> "XXX",
    4 -> "XL",
    5 -> "L",
    6 -> "LX",
    7 -> "LXX",
    8 -> "LXXX",
    9 -> "XC"
  )

  val mapping3 = Map[Int, String](
    1 -> "C",
    2 -> "CC",
    3 -> "CCC",
    4 -> "CD",
    5 -> "D",
    6 -> "DC",
    7 -> "DCC",
    8 -> "DCCC",
    9 -> "CM"
  )

  val mapping4 = Map[Int, String](
    1 -> "M",
    2 -> "MM",
    3 -> "MMM",
    4 -> "MV'",
    5 -> "V'",
    6 -> "V'M",
    7 -> "V'MM",
    8 -> "V'MMM",
    9 -> "MX'"
  )

  val mappingList = List(mapping1, mapping2, mapping3, mapping4)

  def getRomanValueForPosition(position : Int, digit : Int): String = {
    var s1 : String = "";

//    if ((iList.take(position).takeRight(1).head get digit).isEmpty == false) s1 = (iList.take(position).takeRight(1).head get digit).getOrElse("")
    if ((mappingList.slice(position-1, position).head get digit).isEmpty == false) s1 = (mappingList.slice(position-1, position).head get digit).getOrElse("")

//    2 lines above replaces the match.. case block below
//    position match {
//      case 1 =>
//        if ((iList.take(position).head get digit).isEmpty == false) s1 = (iList.take(position).head get digit).getOrElse("")
////        if ((mapping1 get digit).isEmpty == false) s1 = (mapping1 get digit).getOrElse("")
//      case 2 =>
//        if ((mapping2 get digit).isEmpty == false) s1 = (mapping2 get digit).getOrElse("")
//      case 3 =>
//        if ((mapping3 get digit).isEmpty == false) s1 = (mapping3 get digit).getOrElse("")
//      case 4 =>
//        if ((mapping4 get digit).isEmpty == false) s1 = (mapping4 get digit).getOrElse("")
//    }
    s1 //returns the value
  }

  def convertToRoman(originalNumber: Int): String = {
    var currentPosition: Int = 1
    var finalRomanVal: String = ""
    var number : Int = originalNumber

    while (number > 0) {
      var currentDigit: Int = number % 10
      var newDeci : Int = number / 10

      if (currentDigit != 0) {
        var romanStr: String = getRomanValueForPosition(currentPosition, currentDigit)

        if (romanStr.isEmpty == false) {
          romanStr += finalRomanVal
          finalRomanVal = romanStr
        }
      }
      currentPosition += 1
      number = newDeci
    }
    println("Number=" + originalNumber + ", Roman value:" + finalRomanVal)
    finalRomanVal
  }

}