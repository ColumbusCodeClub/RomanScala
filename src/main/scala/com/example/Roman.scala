package com.example

object Roman {
 
  
  def convertToRoman( i : Int ) : String = i match {
    case 1|2|3 => map123(i)
    case 4 => convertToRoman(i-3)+"V"
    case 5 => "V"
    case 6|7|8 => "V"+convertToRoman(i-5)
    case 9 => "IX"
    case 10 => "X"
    case 11 => "XI"
    case _ => null
  }

  def map123(x: Int): String = {
    (0 to (x - 1)).map(y => "I").mkString("")
  }
}
 