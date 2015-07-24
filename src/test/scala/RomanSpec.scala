import org.scalatest._

class RomanSpec extends FlatSpec with Matchers {
  "1" should "I" in {
     assert( Roman.convertToRoman(1) === "I")
  }
  
  "2" should "II" in {
      assert( Roman.convertToRoman(2) === "II")
  }
  
  "3" should "III" in {
      assert (Roman.convertToRoman(3) === "III")
  }
}
