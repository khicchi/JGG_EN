package com.jgg.lessons.p2640;

import junit.framework.TestCase;
import org.junit.Assert;

public class MyCalculatorTest extends TestCase {

  public void testAdd() {
    Assert.assertEquals(7, MyCalculator.add(3, 4));
    Assert.assertEquals(6, MyCalculator.add(3, 3));
  }
}