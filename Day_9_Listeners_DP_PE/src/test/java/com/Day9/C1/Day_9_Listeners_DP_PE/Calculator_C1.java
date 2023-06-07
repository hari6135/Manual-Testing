package com.Day9.C1.Day_9_Listeners_DP_PE;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Calculator_C1 {


  @Test(dataProvider = "dp")
  public void add(Integer n, Integer s) {
	  System.out.println(n+s);
  }
  @Test(dataProvider = "dp")
  public void sub(Integer n, Integer s) {
	  System.out.println(n-s);
  }
  @Test(dataProvider = "dp")
  public void multiply(Integer n, Integer s) {
	  System.out.println(n*s);
  }
  @Test(dataProvider = "dp")
  public void divide(Integer n, Integer s) {
	  System.out.println(n/s);
  }
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 10, 3 },
      new Object[] { 20, 5 },
    };
  }
}
