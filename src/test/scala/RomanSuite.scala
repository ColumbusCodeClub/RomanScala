import com.example.Roman
import org.scalatest.{BeforeAndAfter, FunSuite}

/**
 * Created by ma1t7i8 on 8/13/2015.
 */
class RomanSuite extends FunSuite  {

 val subject = Roman

  test("Number 0 returns  nothing"){
    assert(""==subject.convertToRoman(0))
  }

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

  test("Number 5 returns V"){
    assert("V"==subject.convertToRoman((5)))
  }

  test("Number 6 returns VI"){
    assert("VI"==subject.convertToRoman((6)))
  }
  test("Number 7 returns VII"){
    assert("VII"==subject.convertToRoman((7)))
  }

  test("Number 8 returns VIII"){
    assert("VIII"==subject.convertToRoman((8)))
  }

  test("Number 9 returns IX"){
    assert("IX"==subject.convertToRoman((9)))
  }

  test("Number 10 returns X"){
    assert("X"==subject.convertToRoman((10)))
  }

  test("Number 25 returns XXV"){
    assert("XXV"==subject.convertToRoman((25)))
  }

  test("Number 50 returns L"){
    assert("L"==subject.convertToRoman((50)))
  }

  test("Number 99 returns XCIX"){
    assert("XCIX"==subject.convertToRoman((99)))
  }

  test("Number 100 returns C"){
    assert("C"==subject.convertToRoman((100)))
  }

  test("Number 101 returns CI"){
    assert("CI"==subject.convertToRoman((101)))
  }

  test("Number 125 returns CXXV"){
    assert("CXXV"==subject.convertToRoman((125)))
  }

  test("Number 500 returns D"){
    assert("D"==subject.convertToRoman((500)))
  }

  test("Number 888 returns DCCCLXXXVIII"){
    assert("DCCCLXXXVIII"==subject.convertToRoman((888)))
  }

  test("Number 1000 returns M"){
    assert("M"==subject.convertToRoman((1000)))
  }

  test("Number 1001 returns MI"){
    assert("MI"==subject.convertToRoman((1001)))
  }

  test("Number 1888 returns MDCCCLXXXVIII"){
    assert("MDCCCLXXXVIII"==subject.convertToRoman((1888)))
  }

  test("Number 1986 returns MCMLXXXVI"){
    assert("MCMLXXXVI"==subject.convertToRoman((1986)))
  }

  test("Number 2015 returns MMXV"){
    assert("MMXV"==subject.convertToRoman((2015)))
  }

  test("Number 3888 returns MMMDCCCLXXXVIII"){
    assert("MMMDCCCLXXXVIII"==subject.convertToRoman((3888)))
  }

  test("Number 5000 returns " + "V'"){
    assert("V'"==subject.convertToRoman((5000)))
  }

  test("Number 6001 returns " + "V'MI"){
    assert("V'MI"==subject.convertToRoman((6001)))
  }

  test("Number 7010 returns V'MMX"){
    assert("V'MMX"==subject.convertToRoman((7010)))
  }

  test("Number 8888 returns V'MMMDCCCLXXXVIII"){
    assert("V'MMMDCCCLXXXVIII"==subject.convertToRoman((8888)))
  }
}
