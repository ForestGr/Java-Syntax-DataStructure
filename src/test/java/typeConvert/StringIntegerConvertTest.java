package typeConvert;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringIntegerConvertTest {
  StringIntegerConvert test;

  @Before
  public void setUp() throws Exception {
    test = new StringIntegerConvert();
  }

  @Test
  //test parseInt()
  public void isPositiveInteger1() {
    assertTrue(test.isPositiveInteger1("1 "));
    assertFalse(test.isPositiveInteger1("0"));
    assertFalse(test.isPositiveInteger1("-1"));
    assertFalse(test.isPositiveInteger1("six"));
  }

  @Test
  //test valueOf()
  public void isPositiveInteger2() {
    assertTrue(test.isPositiveInteger2("1"));
    assertFalse(test.isPositiveInteger2("1 ")); //isPositiveInteger2()没用value.trim()
    assertFalse(test.isPositiveInteger1("0"));
    assertFalse(test.isPositiveInteger1("-1"));
    assertFalse(test.isPositiveInteger1("six"));
  }


}