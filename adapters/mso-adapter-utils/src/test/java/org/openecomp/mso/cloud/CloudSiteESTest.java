/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 08:42:36 GMT 2016
 */

package org.openecomp.mso.cloud;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.PrivateAccess;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class CloudSiteESTest extends CloudSiteESTestscaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      cloudSite0.setAic_version("-t");
      cloudSite0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      cloudSite0.setRegionId("CloudSite: id=");
      String string0 = cloudSite0.getRegionId();
      assertEquals("CloudSite: id=", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      cloudSite0.setRegionId("");
      String string0 = cloudSite0.getRegionId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      PrivateAccess.setVariable((Class<CloudSite>) CloudSite.class, cloudSite0, "identityServiceId", (Object) "PUBLIC");
      String string0 = cloudSite0.getIdentityServiceId();
      assertEquals("PUBLIC", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      CloudIdentity cloudIdentity0 = new CloudIdentity();
      cloudSite0.setIdentityService(cloudIdentity0);
      cloudIdentity0.setTenantMetadata(false);
      CloudIdentity cloudIdentity1 = cloudSite0.getIdentityService();
      assertNull(cloudIdentity1.getAdminTenant());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      cloudSite0.setId("");
      String string0 = cloudSite0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      cloudSite0.setClli("N;w7*-)9\"t|T/jCa");
      String string0 = cloudSite0.getClli();
      assertEquals("N;w7*-)9\"t|T/jCa", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      cloudSite0.setClli("");
      String string0 = cloudSite0.getClli();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      cloudSite0.setAic_version("v&K[by0");
      String string0 = cloudSite0.getAic_version();
      assertEquals("v&K[by0", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      cloudSite0.setAic_version("");
      String string0 = cloudSite0.getAic_version();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      CloudIdentity cloudIdentity0 = mock(CloudIdentity.class, new ViolatedAssumptionAnswer());
      doReturn((CloudIdentity) null).when(cloudIdentity0).clone();
      cloudSite0.setIdentityService(cloudIdentity0);
      CloudSite cloudSite1 = cloudSite0.clone();
      boolean boolean0 = cloudSite0.equals(cloudSite1);
      assertFalse(boolean0);
      assertFalse(cloudSite1.equals((Object)cloudSite0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      CloudSite cloudSite1 = new CloudSite();
      assertTrue(cloudSite1.equals((Object)cloudSite0));
      
      cloudSite1.setClli("CloudSite: id=null, regionId=null, identityServiceId=null, aic_version=null, clli=null");
      boolean boolean0 = cloudSite0.equals(cloudSite1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      CloudIdentity cloudIdentity0 = new CloudIdentity();
      cloudSite0.setIdentityService(cloudIdentity0);
      CloudSite cloudSite1 = cloudSite0.clone();
      assertTrue(cloudSite1.equals((Object)cloudSite0));
      
      cloudSite1.setAic_version("");
      boolean boolean0 = cloudSite0.equals(cloudSite1);
      assertFalse(cloudSite1.equals((Object)cloudSite0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      CloudIdentity cloudIdentity0 = new CloudIdentity();
      cloudSite0.setIdentityService(cloudIdentity0);
      CloudSite cloudSite1 = cloudSite0.clone();
      boolean boolean0 = cloudSite0.equals(cloudSite1);
      assertNotSame(cloudSite1, cloudSite0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      cloudSite0.setRegionId("CloudSite: id=null, regionId=null, identityServiceId=null, aic_version=null, clli=null");
      CloudSite cloudSite1 = new CloudSite();
      boolean boolean0 = cloudSite0.equals(cloudSite1);
      assertFalse(cloudSite1.equals((Object)cloudSite0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      CloudIdentity cloudIdentity0 = new CloudIdentity();
      cloudSite0.setIdentityService(cloudIdentity0);
      CloudSite cloudSite1 = cloudSite0.clone();
      assertTrue(cloudSite1.equals((Object)cloudSite0));
      
      cloudSite1.setId("Tx;$hjj");
      boolean boolean0 = cloudSite1.equals(cloudSite0);
      assertFalse(boolean0);
      assertFalse(cloudSite1.equals((Object)cloudSite0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      Object object0 = new Object();
      boolean boolean0 = cloudSite0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      boolean boolean0 = cloudSite0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      boolean boolean0 = cloudSite0.equals(cloudSite0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      PrivateAccess.setVariable((Class<CloudSite>) CloudSite.class, cloudSite0, "identityServiceId", (Object) "");
      CloudSite cloudSite1 = new CloudSite();
      boolean boolean0 = cloudSite0.equals(cloudSite1);
      assertFalse(boolean0);
      assertFalse(cloudSite1.equals((Object)cloudSite0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      PrivateAccess.setVariable((Class<CloudSite>) CloudSite.class, cloudSite0, "clli", (Object) "AgBkO0S\"V'R'");
      cloudSite0.hashCode();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      PrivateAccess.setVariable((Class<CloudSite>) CloudSite.class, cloudSite0, "regionId", (Object) "`V+.b PU'3:EbS");
      cloudSite0.hashCode();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      PrivateAccess.setVariable((Class<CloudSite>) CloudSite.class, cloudSite0, "identityServiceId", (Object) "PUBLIC");
      cloudSite0.hashCode();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      PrivateAccess.setVariable((Class<CloudSite>) CloudSite.class, cloudSite0, "id", (Object) "PUBLIC");
      cloudSite0.hashCode();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      String string0 = cloudSite0.getIdentityServiceId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      String string0 = cloudSite0.toString();
      assertEquals("CloudSite: id=null, regionId=null, identityServiceId=null, aic_version=null, clli=null", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      String string0 = cloudSite0.getAic_version();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      CloudIdentity cloudIdentity0 = new CloudIdentity();
      cloudSite0.setIdentityService(cloudIdentity0);
      cloudSite0.hashCode();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      String string0 = cloudSite0.getClli();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      String string0 = cloudSite0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      String string0 = cloudSite0.getRegionId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      cloudSite0.setId("Tx;$hjj");
      String string0 = cloudSite0.getId();
      assertEquals("Tx;$hjj", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      CloudIdentity cloudIdentity0 = cloudSite0.getIdentityService();
      assertNull(cloudIdentity0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CloudSite cloudSite0 = new CloudSite();
      // Undeclared exception!
      try { 
        cloudSite0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.openecomp.mso.cloud.CloudSite", e);
      }
  }
}
