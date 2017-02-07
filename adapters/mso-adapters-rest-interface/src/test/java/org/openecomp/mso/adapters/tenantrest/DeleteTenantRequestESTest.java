/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:11:58 GMT 2016
 */

package org.openecomp.mso.adapters.tenantrest;

import org.junit.Test;
import static org.junit.Assert.*;

import org.openecomp.mso.entity.MsoRequest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class DeleteTenantRequestESTest extends DeleteTenantRequestESTestscaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DeleteTenantRequest deleteTenantRequest0 = new DeleteTenantRequest();
      deleteTenantRequest0.setTenantId("");
      String string0 = deleteTenantRequest0.getTenantId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DeleteTenantRequest deleteTenantRequest0 = new DeleteTenantRequest();
      deleteTenantRequest0.setMsoRequest((MsoRequest) null);
      MsoRequest msoRequest0 = deleteTenantRequest0.getMsoRequest();
      assertNull(msoRequest0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DeleteTenantRequest deleteTenantRequest0 = new DeleteTenantRequest();
      deleteTenantRequest0.setCloudSiteId("");
      String string0 = deleteTenantRequest0.getCloudSiteId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DeleteTenantRequest deleteTenantRequest0 = new DeleteTenantRequest();
      String string0 = deleteTenantRequest0.getCloudSiteId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DeleteTenantRequest deleteTenantRequest0 = new DeleteTenantRequest();
      MsoRequest msoRequest0 = deleteTenantRequest0.getMsoRequest();
      assertNull(msoRequest0.getServiceInstanceId());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DeleteTenantRequest deleteTenantRequest0 = new DeleteTenantRequest();
      deleteTenantRequest0.setTenantId("jaxb.formatted.output");
      String string0 = deleteTenantRequest0.getTenantId();
      assertEquals("jaxb.formatted.output", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DeleteTenantRequest deleteTenantRequest0 = new DeleteTenantRequest();
      String string0 = deleteTenantRequest0.getTenantId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DeleteTenantRequest deleteTenantRequest0 = new DeleteTenantRequest();
      deleteTenantRequest0.setCloudSiteId("7hA.^5Lo<M_u");
      String string0 = deleteTenantRequest0.getCloudSiteId();
      assertEquals("7hA.^5Lo<M_u", string0);
  }
}