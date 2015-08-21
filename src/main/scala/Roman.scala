object Roman {
 
  
  def convertToRoman( i : Integer ) : String ={
      
      0.to(i-1).map("I").mkString("")
  }
  
}
