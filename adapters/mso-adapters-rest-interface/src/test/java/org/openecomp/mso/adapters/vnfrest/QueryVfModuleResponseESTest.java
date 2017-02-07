/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:15:19 GMT 2016
 */

package org.openecomp.mso.adapters.vnfrest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

import org.openecomp.mso.openstack.beans.VnfStatus;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class QueryVfModuleResponseESTest extends QueryVfModuleResponseESTestscaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QueryVfModuleResponse queryVfModuleResponse0 = new QueryVfModuleResponse();
      queryVfModuleResponse0.setVnfId("K@Avo(l_W.<jd$");
      String string0 = queryVfModuleResponse0.getVnfId();
      assertEquals("K@Avo(l_W.<jd$", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VnfStatus vnfStatus0 = VnfStatus.UNKNOWN;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      QueryVfModuleResponse queryVfModuleResponse0 = new QueryVfModuleResponse("", "", "/iul.p>pa`w<:0tL", vnfStatus0, (Map<String, String>) hashMap0);
      String string0 = queryVfModuleResponse0.getVnfId();
      assertEquals("/iul.p>pa`w<:0tL", queryVfModuleResponse0.getVfModuleStackId());
      assertEquals("", string0);
      assertEquals("", queryVfModuleResponse0.getVfModuleId());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VnfStatus vnfStatus0 = VnfStatus.UNKNOWN;
      QueryVfModuleResponse queryVfModuleResponse0 = new QueryVfModuleResponse("", "", "", vnfStatus0, (Map<String, String>) null);
      String string0 = queryVfModuleResponse0.getVfModuleStackId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VnfStatus vnfStatus0 = VnfStatus.UNKNOWN;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      QueryVfModuleResponse queryVfModuleResponse0 = new QueryVfModuleResponse("", "", "/iul.p>pa`w<:0tL", vnfStatus0, (Map<String, String>) hashMap0);
      queryVfModuleResponse0.getVfModuleOutputs();
      assertEquals("", queryVfModuleResponse0.getVnfId());
      assertEquals("/iul.p>pa`w<:0tL", queryVfModuleResponse0.getVfModuleStackId());
      assertEquals("", queryVfModuleResponse0.getVfModuleId());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VnfStatus vnfStatus0 = VnfStatus.UNKNOWN;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      QueryVfModuleResponse queryVfModuleResponse0 = new QueryVfModuleResponse("", "", "q'&!##_pFRAIJ4uo]*=", vnfStatus0, (Map<String, String>) hashMap0);
      hashMap0.put("q'&!##_pFRAIJ4uo]*=", "");
      queryVfModuleResponse0.getVfModuleOutputs();
      assertEquals("", queryVfModuleResponse0.getVfModuleId());
      assertEquals("q'&!##_pFRAIJ4uo]*=", queryVfModuleResponse0.getVfModuleStackId());
      assertEquals("", queryVfModuleResponse0.getVnfId());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VnfStatus vnfStatus0 = VnfStatus.FAILED;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      QueryVfModuleResponse queryVfModuleResponse0 = new QueryVfModuleResponse("C5aGYYh%|7be0.E!NHp", "C5aGYYh%|7be0.E!NHp", "C5aGYYh%|7be0.E!NHp", vnfStatus0, (Map<String, String>) hashMap0);
      String string0 = queryVfModuleResponse0.getVfModuleId();
      assertEquals("C5aGYYh%|7be0.E!NHp", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QueryVfModuleResponse queryVfModuleResponse0 = new QueryVfModuleResponse();
      VnfStatus vnfStatus0 = VnfStatus.NOTFOUND;
      queryVfModuleResponse0.setVnfStatus(vnfStatus0);
      VnfStatus vnfStatus1 = queryVfModuleResponse0.getVnfStatus();
      assertSame(vnfStatus1, vnfStatus0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QueryVfModuleResponse queryVfModuleResponse0 = new QueryVfModuleResponse();
      String string0 = queryVfModuleResponse0.getVfModuleId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QueryVfModuleResponse queryVfModuleResponse0 = new QueryVfModuleResponse();
      queryVfModuleResponse0.setVfModuleId("\"Sdeh");
      assertNull(queryVfModuleResponse0.getVfModuleStackId());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QueryVfModuleResponse queryVfModuleResponse0 = new QueryVfModuleResponse();
      String string0 = queryVfModuleResponse0.getVnfId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QueryVfModuleResponse queryVfModuleResponse0 = new QueryVfModuleResponse();
      Map<String, String> map0 = queryVfModuleResponse0.getVfModuleOutputs();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QueryVfModuleResponse queryVfModuleResponse0 = new QueryVfModuleResponse();
      queryVfModuleResponse0.setVfModuleStackId("\"Sdeh");
      String string0 = queryVfModuleResponse0.getVfModuleStackId();
      assertEquals("\"Sdeh", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QueryVfModuleResponse queryVfModuleResponse0 = new QueryVfModuleResponse();
      // Undeclared exception!
      try { 
        queryVfModuleResponse0.toJsonString();
        fail("Expecting exception: VerifyError");
      
      } catch(VerifyError e) {
         //
         // (class: org/codehaus/jackson/map/MapperConfig, method: <clinit> signature: ()V) Bad type in putfield/putstatic
         //
         verifyException("org.codehaus.jackson.map.ObjectMapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QueryVfModuleResponse queryVfModuleResponse0 = new QueryVfModuleResponse();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      queryVfModuleResponse0.setVfModuleOutputs(hashMap0);
      assertNull(queryVfModuleResponse0.getVfModuleId());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QueryVfModuleResponse queryVfModuleResponse0 = new QueryVfModuleResponse();
      String string0 = queryVfModuleResponse0.getVfModuleStackId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      VnfStatus vnfStatus0 = VnfStatus.ACTIVE;
      QueryVfModuleResponse queryVfModuleResponse0 = new QueryVfModuleResponse((String) null, "", "", vnfStatus0, (Map<String, String>) null);
      String string0 = queryVfModuleResponse0.getVfModuleId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QueryVfModuleResponse queryVfModuleResponse0 = new QueryVfModuleResponse();
      queryVfModuleResponse0.getVnfStatus();
  }
}