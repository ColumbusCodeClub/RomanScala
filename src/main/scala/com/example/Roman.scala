package com.example

object Roman {

  val mapping1 = Map[Int, String](
    1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V", 6 -> "VI", 7 -> "VII", 8 -> "VIII", 9 -> "IX")

  val mapping2 = Map[Int, String](
    1 -> "X", 2 -> "XX", 3 -> "XXX", 4 -> "XL", 5 -> "L", 6 -> "LX", 7 -> "LXX", 8 -> "LXXX", 9 -> "XC")

  val mapping3 = Map[Int, String](
    1 -> "C", 2 -> "CC", 3 -> "CCC", 4 -> "CD", 5 -> "D", 6 -> "DC", 7 -> "DCC", 8 -> "DCCC", 9 -> "CM")

  val mapping4 = Map[Int, String](
    1 -> "M", 2 -> "MM", 3 -> "MMM", 4 -> "MV'", 5 -> "V'", 6 -> "V'M", 7 -> "V'MM", 8 -> "V'MMM", 9 -> "MX'")

  val mappingList = List(mapping1, mapping2, mapping3, mapping4)

  def convertToRoman(originalNumber: Int): String = {
    var number: Int = originalNumber
    var ndx: Int = 1
    var romanVal: String = ""

    while (number > 0 && ndx <= mappingList.size) {
      romanVal = mappingList.slice(ndx - 1, ndx).head.getOrElse(number % 10, "") + romanVal
      ndx += 1
      number = number / 10
    }
    println("Number=" + originalNumber + ", Roman value:" + romanVal)
    romanVal
  }

}