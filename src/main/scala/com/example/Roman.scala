package com.example

object Roman {
 
<<<<<<< HEAD
  val mapping1 = Map[Int, String](1->"I",
                    2->"II",
                    3->"III",
                    4->"IV",
                    5->"V",
                    6->"VI",
                    7->"VII",
                    8->"VIII",
                    9->"IX")

  def convertToRoman( i : Int) : String = {
     mapping1.get(i)
=======
  
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
>>>>>>> 6351f26ac66cc1474ccb14e910446e3d1a100f5c
  }
}
 