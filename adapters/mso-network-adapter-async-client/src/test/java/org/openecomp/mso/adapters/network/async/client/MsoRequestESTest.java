/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:33:43 GMT 2016
 */

package org.openecomp.mso.adapters.network.async.client;

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
      msoRequest0.setServiceInstanceId("");
      String string0 = msoRequest0.getServiceInstanceId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MsoRequest msoRequest0 = new MsoRequest();
      msoRequest0.requestId = "";
      msoRequest0.requestId = "0[73oqjz<&DT/q@";
      String string0 = msoRequest0.getRequestId();
      assertEquals("0[73oqjz<&DT/q@", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MsoRequest msoRequest0 = new MsoRequest();
      msoRequest0.requestId = null;
      msoRequest0.requestId = "";
      String string0 = msoRequest0.getRequestId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MsoRequest msoRequest0 = new MsoRequest();
      msoRequest0.setRequestId("");
      assertEquals("", msoRequest0.getRequestId());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MsoRequest msoRequest0 = new MsoRequest();
      msoRequest0.setServiceInstanceId("0[73oqjz<&DT/q@");
      String string0 = msoRequest0.getServiceInstanceId();
      assertEquals("0[73oqjz<&DT/q@", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MsoRequest msoRequest0 = new MsoRequest();
      String string0 = msoRequest0.getServiceInstanceId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MsoRequest msoRequest0 = new MsoRequest();
      String string0 = msoRequest0.getRequestId();
      assertNull(string0);
  }
}
