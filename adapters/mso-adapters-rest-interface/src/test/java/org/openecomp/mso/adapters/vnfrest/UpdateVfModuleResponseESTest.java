/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:18:01 GMT 2016
 */

package org.openecomp.mso.adapters.vnfrest;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class UpdateVfModuleResponseESTest extends UpdateVfModuleResponseESTestscaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UpdateVfModuleResponse updateVfModuleResponse0 = new UpdateVfModuleResponse();
      String string0 = updateVfModuleResponse0.getVnfId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      UpdateVfModuleResponse updateVfModuleResponse0 = new UpdateVfModuleResponse("", "", "\"c2NA-]kge", (Map<String, String>) hashMap0, "");
      String string0 = updateVfModuleResponse0.getVnfId();
      assertEquals("\"c2NA-]kge", updateVfModuleResponse0.getVfModuleStackId());
      assertEquals("", updateVfModuleResponse0.getVfModuleId());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UpdateVfModuleResponse updateVfModuleResponse0 = new UpdateVfModuleResponse();
      String string0 = updateVfModuleResponse0.getVfModuleStackId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UpdateVfModuleResponse updateVfModuleResponse0 = new UpdateVfModuleResponse("", "", "", (Map<String, String>) null, "eBT|~3\"z");
      updateVfModuleResponse0.getVfModuleOutputs();
      assertEquals("", updateVfModuleResponse0.getVfModuleStackId());
      assertEquals("", updateVfModuleResponse0.getVnfId());
      assertEquals("", updateVfModuleResponse0.getVfModuleId());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      UpdateVfModuleResponse updateVfModuleResponse0 = new UpdateVfModuleResponse((String) null, (String) null, "", (Map<String, String>) hashMap0, (String) null);
      hashMap0.put((String) null, "");
      Map<String, String> map0 = updateVfModuleResponse0.getVfModuleOutputs();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UpdateVfModuleResponse updateVfModuleResponse0 = new UpdateVfModuleResponse();
      String string0 = updateVfModuleResponse0.getVfModuleId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      UpdateVfModuleResponse updateVfModuleResponse0 = new UpdateVfModuleResponse("}t3zhbFZl^dGLS@6+", "}t3zhbFZl^dGLS@6+", "}t3zhbFZl^dGLS@6+", (Map<String, String>) hashMap0, "");
      String string0 = updateVfModuleResponse0.getVfModuleId();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UpdateVfModuleResponse updateVfModuleResponse0 = new UpdateVfModuleResponse();
      updateVfModuleResponse0.setVfModuleStackId("p|+");
      String string0 = updateVfModuleResponse0.getVfModuleStackId();
      assertEquals("p|+", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      UpdateVfModuleResponse updateVfModuleResponse0 = new UpdateVfModuleResponse((String) null, (String) null, "", (Map<String, String>) hashMap0, (String) null);
      String string0 = updateVfModuleResponse0.getVfModuleStackId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      UpdateVfModuleResponse updateVfModuleResponse0 = new UpdateVfModuleResponse((String) null, (String) null, "", (Map<String, String>) hashMap0, (String) null);
      updateVfModuleResponse0.setVnfId("trb");
      assertEquals("", updateVfModuleResponse0.getVfModuleStackId());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      UpdateVfModuleResponse updateVfModuleResponse0 = new UpdateVfModuleResponse("'o^@:C|OvN:", "'o^@:C|OvN:", "'o^@:C|OvN:", (Map<String, String>) hashMap0, "xcX3]w^");
      String string0 = updateVfModuleResponse0.getVnfId();
      assertEquals("'o^@:C|OvN:", updateVfModuleResponse0.getVfModuleStackId());
      assertEquals("'o^@:C|OvN:", updateVfModuleResponse0.getVfModuleId());
      assertEquals("'o^@:C|OvN:", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      UpdateVfModuleResponse updateVfModuleResponse0 = new UpdateVfModuleResponse("lE0", "", "", (Map<String, String>) hashMap0, "");
      String string0 = updateVfModuleResponse0.getVfModuleId();
      assertEquals("", string0);
      assertEquals("lE0", updateVfModuleResponse0.getVnfId());
      assertEquals("", updateVfModuleResponse0.getVfModuleStackId());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UpdateVfModuleResponse updateVfModuleResponse0 = new UpdateVfModuleResponse("", "", "", (Map<String, String>) null, "eBT|~3\"z");
      assertEquals("", updateVfModuleResponse0.getVfModuleId());
      
      updateVfModuleResponse0.setVfModuleId("");
      assertEquals("", updateVfModuleResponse0.getVnfId());
      assertEquals("", updateVfModuleResponse0.getVfModuleStackId());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UpdateVfModuleResponse updateVfModuleResponse0 = new UpdateVfModuleResponse("", "", "", (Map<String, String>) null, "eBT|~3\"z");
      updateVfModuleResponse0.setVfModuleOutputs((Map<String, String>) null);
      assertEquals("", updateVfModuleResponse0.getVfModuleId());
      assertEquals("", updateVfModuleResponse0.getVnfId());
      assertEquals("", updateVfModuleResponse0.getVfModuleStackId());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      UpdateVfModuleResponse updateVfModuleResponse0 = new UpdateVfModuleResponse("'o^@:C|OvN:", "'o^@:C|OvN:", "'o^@:C|OvN:", (Map<String, String>) hashMap0, "xcX3]w^");
      updateVfModuleResponse0.getVfModuleOutputs();
      assertEquals("'o^@:C|OvN:", updateVfModuleResponse0.getVfModuleStackId());
      assertEquals("'o^@:C|OvN:", updateVfModuleResponse0.getVfModuleId());
      assertEquals("'o^@:C|OvN:", updateVfModuleResponse0.getVnfId());
  }
}
