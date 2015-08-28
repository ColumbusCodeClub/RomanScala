package com.example

object Roman {
 
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
  }
  
}
 