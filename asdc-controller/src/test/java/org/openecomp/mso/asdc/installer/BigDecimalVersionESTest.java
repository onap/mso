/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 25 13:37:47 GMT 2016
 */

package org.openecomp.mso.asdc.installer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

import java.math.BigDecimal;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class BigDecimalVersionESTest extends BigDecimalVersionESTestscaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = BigDecimalVersion.castAndCheckNotificationVersionToString("9");
      assertEquals("9", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimalVersion.castAndCheckNotificationVersion("0");
      assertEquals(0, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimalVersion.castAndCheckNotificationVersion("9");
      assertEquals(9, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimalVersion.castAndCheckNotificationVersion("-1");
      assertEquals(-1, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        BigDecimalVersion.castAndCheckNotificationVersionToString("fgt+&6@pL9`5EE}.!.,");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        BigDecimalVersion.castAndCheckNotificationVersionToString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.openecomp.mso.asdc.installer.BigDecimalVersion", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        BigDecimalVersion.castAndCheckNotificationVersion((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.openecomp.mso.asdc.installer.BigDecimalVersion", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        BigDecimalVersion.castAndCheckNotificationVersion(".");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.openecomp.mso.asdc.installer.BigDecimalVersion", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        BigDecimalVersion.castAndCheckNotificationVersion("Mf**K`5E.~Fu.,q");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BigDecimalVersion bigDecimalVersion0 = new BigDecimalVersion();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        BigDecimalVersion.castAndCheckNotificationVersionToString(".");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.openecomp.mso.asdc.installer.BigDecimalVersion", e);
      }
  }
}
