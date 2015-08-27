import com.example.Roman
import org.scalatest.{BeforeAndAfter, FunSuite}

/**
 * Created by ma1t7i8 on 8/13/2015.
 */
class RomanSuite extends FunSuite  {

 val subject = Roman



  test("Number 1 returns  I"){
    assert("I"==subject.convertToRoman(1))
  }

  test("Number 2 returns  II"){
    assert("II"==subject.convertToRoman(2))
  }

  test("Number 3 returns  III"){
    assert("III"==subject.convertToRoman(3))
  }

  test("Number 4 returns  IV"){
    assert("IV"==subject.convertToRoman(4))
  }

  test("Number 5 returns  V"){
    assert("V"==subject.convertToRoman(5))
  }
  
  test( "Number 6 returns VI")
  {
    assert("VI" == subject.convertToRoman(6))
  }
}
