/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:09:00 GMT 2016
 */

package org.openecomp.mso.entity;

import org.junit.Test;
import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class MsoRequestESTest extends MsoRequestESTestscaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MsoRequest msoRequest0 = new MsoRequest();
      msoRequest0.setServiceInstanceId("B1!G~O TIP1Auoc}pE");
      String string0 = msoRequest0.getServiceInstanceId();
      assertEquals("B1!G~O TIP1Auoc}pE", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MsoRequest msoRequest0 = new MsoRequest();
      msoRequest0.setServiceInstanceId("");
      String string0 = msoRequest0.getServiceInstanceId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MsoRequest msoRequest0 = new MsoRequest();
      String string0 = msoRequest0.getRequestId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MsoRequest msoRequest0 = new MsoRequest("'SJ", "XUQ4Vd$ppTT4");
      assertEquals("'SJ", msoRequest0.getRequestId());
      
      msoRequest0.setRequestId("");
      msoRequest0.getRequestId();
      assertEquals("XUQ4Vd$ppTT4", msoRequest0.getServiceInstanceId());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MsoRequest msoRequest0 = new MsoRequest("'SJ", "XUQ4Vd$ppTT4");
      String string0 = msoRequest0.getRequestId();
      assertEquals("XUQ4Vd$ppTT4", msoRequest0.getServiceInstanceId());
      assertEquals("'SJ", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MsoRequest msoRequest0 = new MsoRequest();
      String string0 = msoRequest0.getServiceInstanceId();
      assertNull(string0);
  }
}
