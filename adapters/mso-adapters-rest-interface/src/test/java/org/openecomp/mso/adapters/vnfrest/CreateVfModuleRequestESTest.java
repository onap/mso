/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:13:00 GMT 2016
 */

package org.openecomp.mso.adapters.vnfrest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

import org.openecomp.mso.entity.MsoRequest;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class CreateVfModuleRequestESTest extends CreateVfModuleRequestESTestscaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      assertNull(createVfModuleRequest0.getVnfId());
      
      createVfModuleRequest0.setVnfVersion("sJ%kzC");
      createVfModuleRequest0.getVolumeGroupId();
      createVfModuleRequest0.setTenantId((String) null);
      createVfModuleRequest0.setRequestType((String) null);
      createVfModuleRequest0.getVnfVersion();
      createVfModuleRequest0.setVnfType((String) null);
      createVfModuleRequest0.getBaseVfModuleId();
      createVfModuleRequest0.getBaseVfModuleId();
      MsoRequest msoRequest0 = new MsoRequest();
      createVfModuleRequest0.setMsoRequest(msoRequest0);
      createVfModuleRequest0.getBackout();
      createVfModuleRequest0.toXmlString();
      Boolean.logicalAnd(false, false);
      createVfModuleRequest0.setBackout((Boolean) null);
      createVfModuleRequest0.getVolumeGroupId();
      createVfModuleRequest0.getVfModuleType();
      createVfModuleRequest0.setBaseVfModuleStackId("");
      createVfModuleRequest0.setRequestType("&$7s5#");
      assertTrue(createVfModuleRequest0.isSynchronous());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      createVfModuleRequest0.setBaseVfModuleStackId("gi,pZwt!/Q");
      createVfModuleRequest0.setTenantId("<(b");
      createVfModuleRequest0.setVfModuleName("");
      createVfModuleRequest0.setVnfId("");
      createVfModuleRequest0.getVnfId();
      createVfModuleRequest0.getBackout();
      createVfModuleRequest0.setRequestType("");
      createVfModuleRequest0.getTenantId();
      createVfModuleRequest0.setVfModuleId("gi,pZwt!/Q");
      createVfModuleRequest0.getVfModuleParams();
      createVfModuleRequest0.getVolumeGroupStackId();
      String string0 = createVfModuleRequest0.getVolumeGroupId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      createVfModuleRequest0.getFailIfExists();
      createVfModuleRequest0.setFailIfExists((Boolean) null);
      assertTrue(createVfModuleRequest0.isSynchronous());
      
      createVfModuleRequest0.setVnfId("");
      createVfModuleRequest0.setTenantId("P%");
      createVfModuleRequest0.setTenantId("vqbsX2ysx.>]T ");
      createVfModuleRequest0.getBaseVfModuleStackId();
      createVfModuleRequest0.getBaseVfModuleStackId();
      createVfModuleRequest0.getCloudSiteId();
      createVfModuleRequest0.getVfModuleParams();
      String string0 = createVfModuleRequest0.getTenantId();
      assertEquals("vqbsX2ysx.>]T ", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      createVfModuleRequest0.setMessageId("");
      createVfModuleRequest0.setVfModuleName("");
      createVfModuleRequest0.setVnfType("");
      MsoRequest msoRequest0 = new MsoRequest();
      msoRequest0.setRequestId("");
      createVfModuleRequest0.setMsoRequest(msoRequest0);
      createVfModuleRequest0.getBaseVfModuleId();
      Boolean boolean0 = Boolean.TRUE;
      Boolean.getBoolean("");
      createVfModuleRequest0.setBaseVfModuleId("$I<po0F7W[gG2}iD,.");
      createVfModuleRequest0.setBackout(boolean0);
      CreateVfModuleRequest createVfModuleRequest1 = new CreateVfModuleRequest();
      createVfModuleRequest0.toXmlString();
      createVfModuleRequest1.setBaseVfModuleStackId("$I<po0F7W[gG2}iD,.");
      createVfModuleRequest0.getVfModuleName();
      Boolean boolean1 = createVfModuleRequest0.getBackout();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      MsoRequest msoRequest0 = new MsoRequest();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      createVfModuleRequest0.setVfModuleParams(hashMap0);
      createVfModuleRequest0.setMsoRequest(msoRequest0);
      createVfModuleRequest0.setTenantId("");
      Map<String, String> map0 = createVfModuleRequest0.getVfModuleParams();
      createVfModuleRequest0.setVfModuleParams(map0);
      createVfModuleRequest0.setVolumeGroupStackId("E8");
      createVfModuleRequest0.setVfModuleId("");
      createVfModuleRequest0.setVfModuleParams((Map<String, String>) null);
      createVfModuleRequest0.getVfModuleId();
      createVfModuleRequest0.setVfModuleParams((Map<String, String>) null);
      createVfModuleRequest0.setVfModuleType("@<W6qx4|DZ(CMN`JzXQ");
      assertEquals("", createVfModuleRequest0.getTenantId());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      createVfModuleRequest0.setBaseVfModuleStackId("jaxb.formatted.output");
      Boolean boolean0 = Boolean.valueOf(false);
      Boolean.compare(false, false);
      createVfModuleRequest0.setVfModuleType("");
      Boolean.logicalXor(false, true);
      Boolean.logicalOr(true, true);
      Boolean.compare(false, false);
      createVfModuleRequest0.setFailIfExists(boolean0);
      createVfModuleRequest0.setVfModuleName("bMZ`m<$@<x?!ofbD`!");
      createVfModuleRequest0.setVfModuleType("");
      createVfModuleRequest0.getFailIfExists();
      createVfModuleRequest0.setTenantId("");
      createVfModuleRequest0.setVnfId("");
      createVfModuleRequest0.getBaseVfModuleStackId();
      createVfModuleRequest0.getMsoRequest();
      createVfModuleRequest0.getTenantId();
      MsoRequest msoRequest0 = createVfModuleRequest0.getMsoRequest();
      msoRequest0.setServiceInstanceId("");
      createVfModuleRequest0.getVnfType();
      createVfModuleRequest0.getVnfType();
      createVfModuleRequest0.setVfModuleName("");
      msoRequest0.setRequestId((String) null);
      createVfModuleRequest0.setMsoRequest(msoRequest0);
      createVfModuleRequest0.setVfModuleId((String) null);
      createVfModuleRequest0.setBaseVfModuleId("");
      createVfModuleRequest0.getBackout();
      createVfModuleRequest0.setRequestType("");
      assertNull(createVfModuleRequest0.getVnfType());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      createVfModuleRequest0.setVolumeGroupId("C}GH#3Zrrwj]-VWQfx");
      createVfModuleRequest0.setVnfType("jaxb.formatted.output");
      createVfModuleRequest0.setRequestType("jaxb.formatted.output");
      createVfModuleRequest0.getBackout();
      String string0 = createVfModuleRequest0.getVolumeGroupId();
      assertEquals("C}GH#3Zrrwj]-VWQfx", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      createVfModuleRequest0.setVfModuleParams(hashMap0);
      Boolean boolean0 = Boolean.valueOf(false);
      Boolean.logicalXor(false, false);
      createVfModuleRequest0.setFailIfExists(boolean0);
      createVfModuleRequest0.setVolumeGroupId((String) null);
      createVfModuleRequest0.setRequestType("jaxb.formatted.output");
      createVfModuleRequest0.getRequestType();
      String string0 = createVfModuleRequest0.getTenantId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      createVfModuleRequest0.setVnfType("4$IXyLo,UL9");
      createVfModuleRequest0.getVfModuleName();
      MsoRequest msoRequest0 = new MsoRequest();
      msoRequest0.setServiceInstanceId("4$IXyLo,UL9");
      createVfModuleRequest0.toXmlString();
      msoRequest0.setServiceInstanceId("");
      msoRequest0.setRequestId("4$IXyLo,UL9");
      Boolean boolean0 = Boolean.valueOf("4$IXyLo,UL9");
      Boolean.getBoolean("4$IXyLo,UL9");
      createVfModuleRequest0.setBackout(boolean0);
      msoRequest0.setServiceInstanceId("t.d]=Q;m");
      msoRequest0.setRequestId("");
      createVfModuleRequest0.setMsoRequest(msoRequest0);
      createVfModuleRequest0.setVolumeGroupId("");
      createVfModuleRequest0.getVolumeGroupId();
      createVfModuleRequest0.getBaseVfModuleStackId();
      createVfModuleRequest0.getVnfId();
      createVfModuleRequest0.getCloudSiteId();
      createVfModuleRequest0.setVfModuleType("Hc<-mV");
      assertNull(createVfModuleRequest0.getMessageId());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      createVfModuleRequest0.setBaseVfModuleStackId(":N_M0a[eewxveG");
      createVfModuleRequest0.setMessageId("qajtT(\"^v~n0>3Q/F9");
      Boolean boolean0 = Boolean.valueOf(":N_M0a[eewxveG");
      Boolean.compare(true, true);
      createVfModuleRequest0.setFailIfExists(boolean0);
      createVfModuleRequest0.setVfModuleId("");
      createVfModuleRequest0.setBaseVfModuleId("");
      createVfModuleRequest0.setVnfId("&uC#o/=");
      createVfModuleRequest0.setVfModuleName("jaxb.formatted.output");
      createVfModuleRequest0.setVnfType("jaxb.formatted.output");
      createVfModuleRequest0.getVnfId();
      createVfModuleRequest0.getBaseVfModuleId();
      createVfModuleRequest0.setVfModuleId("");
      createVfModuleRequest0.setVfModuleId("'l b#");
      assertNull(createVfModuleRequest0.getVolumeGroupId());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      Map<String, String> map0 = createVfModuleRequest0.getVfModuleParams();
      createVfModuleRequest0.setVnfId("Mi!");
      createVfModuleRequest0.setVolumeGroupId((String) null);
      createVfModuleRequest0.setVfModuleParams(map0);
      createVfModuleRequest0.setBaseVfModuleStackId("Mi!");
      createVfModuleRequest0.getVnfId();
      createVfModuleRequest0.getBaseVfModuleStackId();
      createVfModuleRequest0.getVolumeGroupId();
      createVfModuleRequest0.setVfModuleId((String) null);
      assertNull(createVfModuleRequest0.getVolumeGroupStackId());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      createVfModuleRequest0.toXmlString();
      createVfModuleRequest0.setVolumeGroupId("");
      createVfModuleRequest0.getBaseVfModuleId();
      createVfModuleRequest0.toXmlString();
      createVfModuleRequest0.setVfModuleType("~o");
      createVfModuleRequest0.setRequestType("");
      createVfModuleRequest0.getVfModuleName();
      Boolean boolean0 = new Boolean(false);
      createVfModuleRequest0.setFailIfExists(boolean0);
      createVfModuleRequest0.getRequestType();
      createVfModuleRequest0.setVfModuleId("");
      createVfModuleRequest0.setVfModuleId("");
      assertEquals("", createVfModuleRequest0.getVolumeGroupId());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      Map<String, String> map0 = createVfModuleRequest0.getVfModuleParams();
      createVfModuleRequest0.setVfModuleParams(map0);
      createVfModuleRequest0.getBaseVfModuleId();
      createVfModuleRequest0.getTenantId();
      createVfModuleRequest0.getCloudSiteId();
      createVfModuleRequest0.setVolumeGroupStackId((String) null);
      createVfModuleRequest0.getBackout();
      createVfModuleRequest0.getVfModuleType();
      createVfModuleRequest0.setVnfId("3TEn*yZmhM~PV>H");
      createVfModuleRequest0.getFailIfExists();
      createVfModuleRequest0.setCloudSiteId("");
      createVfModuleRequest0.getCloudSiteId();
      String string0 = createVfModuleRequest0.getVnfVersion();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      createVfModuleRequest0.setVnfVersion("!oK");
      createVfModuleRequest0.setCloudSiteId((String) null);
      createVfModuleRequest0.setVfModuleType("");
      createVfModuleRequest0.getRequestType();
      createVfModuleRequest0.setVfModuleId((String) null);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      createVfModuleRequest0.setNotificationUrl((String) null);
      hashMap0.put("", (String) null);
      createVfModuleRequest0.setVfModuleParams(hashMap0);
      hashMap0.put("!oK", "");
      createVfModuleRequest0.setVfModuleParams(hashMap0);
      createVfModuleRequest0.getVnfType();
      createVfModuleRequest0.getVfModuleParams();
      String string0 = createVfModuleRequest0.getVnfId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      Boolean boolean0 = Boolean.TRUE;
      Boolean.getBoolean((String) null);
      Boolean.logicalOr(true, false);
      createVfModuleRequest0.setSkipAAI(boolean0);
      Boolean boolean1 = createVfModuleRequest0.getSkipAAI();
      createVfModuleRequest0.setSkipAAI(boolean1);
      createVfModuleRequest0.setBaseVfModuleId("u=(R@E]!q2rk");
      createVfModuleRequest0.setVnfId("");
      createVfModuleRequest0.setVfModuleId("u=(R@E]!q2rk");
      createVfModuleRequest0.setVolumeGroupId("u=(R@E]!q2rk");
      createVfModuleRequest0.setBaseVfModuleStackId((String) null);
      createVfModuleRequest0.setCloudSiteId("^)DR(@$VIDb");
      createVfModuleRequest0.setVnfId("^)DR(@$VIDb");
      createVfModuleRequest0.getVfModuleParams();
      createVfModuleRequest0.getVfModuleId();
      createVfModuleRequest0.getBaseVfModuleId();
      String string0 = createVfModuleRequest0.getVnfType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      createVfModuleRequest0.setRequestType("");
      createVfModuleRequest0.setRequestType("");
      createVfModuleRequest0.getMsoRequest();
      createVfModuleRequest0.setBaseVfModuleStackId("");
      createVfModuleRequest0.setVolumeGroupStackId(":S");
      createVfModuleRequest0.getBaseVfModuleStackId();
      CreateVfModuleRequest createVfModuleRequest1 = new CreateVfModuleRequest();
      createVfModuleRequest1.getFailIfExists();
      Boolean.compare(false, false);
      // Undeclared exception!
      try { 
        createVfModuleRequest1.toJsonString();
        fail("Expecting exception: VerifyError");
      
      } catch(VerifyError e) {
         //
         // (class: org/codehaus/jackson/map/MapperConfig, method: <clinit> signature: ()V) Bad type in putfield/putstatic
         //
         verifyException("org.codehaus.jackson.map.ObjectMapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      createVfModuleRequest0.setVnfType("");
      assertNull(createVfModuleRequest0.getBaseVfModuleStackId());
      
      MsoRequest msoRequest0 = new MsoRequest("", (String) null);
      msoRequest0.setServiceInstanceId("");
      msoRequest0.setRequestId("y/H`4");
      createVfModuleRequest0.setMsoRequest(msoRequest0);
      createVfModuleRequest0.setVolumeGroupStackId("1!1@Hk");
      createVfModuleRequest0.setNotificationUrl("");
      createVfModuleRequest0.getVnfType();
      createVfModuleRequest0.getRequestType();
      createVfModuleRequest0.getBackout();
      createVfModuleRequest0.getVolumeGroupStackId();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      createVfModuleRequest0.setVfModuleParams(hashMap0);
      assertNull(createVfModuleRequest0.getVnfVersion());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      createVfModuleRequest0.setVnfVersion("");
      createVfModuleRequest0.setVolumeGroupStackId("g[TSR)[o{D\"(-N");
      createVfModuleRequest0.getFailIfExists();
      MsoRequest msoRequest0 = new MsoRequest("", "");
      msoRequest0.setServiceInstanceId("{l*;T:T");
      createVfModuleRequest0.setMsoRequest(msoRequest0);
      createVfModuleRequest0.setVnfType("");
      createVfModuleRequest0.setMessageId("");
      createVfModuleRequest0.setBaseVfModuleId("6=");
      createVfModuleRequest0.setRequestType("");
      createVfModuleRequest0.getVnfVersion();
      createVfModuleRequest0.setVolumeGroupStackId("");
      createVfModuleRequest0.getVolumeGroupStackId();
      createVfModuleRequest0.setVnfType("");
      createVfModuleRequest0.setVfModuleId("7vlbM({1@v[1?Q^A;");
      assertNull(createVfModuleRequest0.getBaseVfModuleStackId());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      MsoRequest msoRequest0 = new MsoRequest();
      createVfModuleRequest0.setMsoRequest(msoRequest0);
      createVfModuleRequest0.getVfModuleName();
      Boolean boolean0 = Boolean.FALSE;
      Boolean.logicalOr(true, true);
      createVfModuleRequest0.setBackout(boolean0);
      createVfModuleRequest0.setVnfVersion("");
      createVfModuleRequest0.setVnfVersion("");
      createVfModuleRequest0.getMsoRequest();
      String string0 = createVfModuleRequest0.getVnfVersion();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      Boolean boolean0 = new Boolean("");
      Boolean.logicalOr(true, false);
      createVfModuleRequest0.setBackout(boolean0);
      createVfModuleRequest0.setTenantId("");
      createVfModuleRequest0.getBackout();
      createVfModuleRequest0.setVfModuleName("rdQqc>V^");
      assertTrue(createVfModuleRequest0.isSynchronous());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      Map<String, String> map0 = createVfModuleRequest0.getVfModuleParams();
      Boolean boolean0 = Boolean.valueOf("");
      boolean boolean1 = Boolean.logicalXor(false, false);
      createVfModuleRequest0.setSkipAAI(boolean0);
      createVfModuleRequest0.setVfModuleParams(map0);
      createVfModuleRequest0.getVfModuleType();
      createVfModuleRequest0.setVnfId("");
      createVfModuleRequest0.getBackout();
      createVfModuleRequest0.getBaseVfModuleId();
      createVfModuleRequest0.getVfModuleParams();
      Boolean boolean2 = new Boolean(true);
      createVfModuleRequest0.setFailIfExists(boolean2);
      Boolean boolean3 = createVfModuleRequest0.getFailIfExists();
      assertFalse(boolean3.equals((Object)boolean1));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      createVfModuleRequest0.setVfModuleId(",XO#k)z!8GWX&8V+O");
      createVfModuleRequest0.setCloudSiteId((String) null);
      createVfModuleRequest0.setRequestType(",XO#k)z!8GWX&8V+O");
      createVfModuleRequest0.setMsoRequest((MsoRequest) null);
      createVfModuleRequest0.setRequestType(",XO#k)z!8GWX&8V+O");
      createVfModuleRequest0.setVolumeGroupStackId("'ug-");
      createVfModuleRequest0.setVnfType("s7~':&U/'F;]h");
      createVfModuleRequest0.setBaseVfModuleId("'ug-");
      createVfModuleRequest0.toXmlString();
      createVfModuleRequest0.setVnfId("NmH3Tn>J]!Fg%4@%uY");
      createVfModuleRequest0.setVnfId("'ug-");
      createVfModuleRequest0.setVolumeGroupId("'ug-");
      createVfModuleRequest0.setVolumeGroupId("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n<createVfModuleRequest>\n    <baseVfModuleId>'ug-</baseVfModuleId>\n    <requestType>,XO#k)z!8GWX&amp;8V+O</requestType>\n    <vfModuleId>,XO#k)z!8GWX&amp;8V+O</vfModuleId>\n    <vfModuleParams/>\n    <vnfType>s7~':&amp;U/'F;]h</vnfType>\n    <volumeGroupStackId>'ug-</volumeGroupStackId>\n</createVfModuleRequest>\n");
      createVfModuleRequest0.getVfModuleType();
      createVfModuleRequest0.getMsoRequest();
      createVfModuleRequest0.getVfModuleName();
      createVfModuleRequest0.getVfModuleId();
      Boolean boolean0 = Boolean.TRUE;
      createVfModuleRequest0.setVfModuleName("p'k7");
      createVfModuleRequest0.setFailIfExists(boolean0);
      createVfModuleRequest0.getBackout();
      createVfModuleRequest0.getVfModuleType();
      createVfModuleRequest0.setBackout(boolean0);
      createVfModuleRequest0.setVfModuleId((String) null);
      createVfModuleRequest0.getVfModuleParams();
      String string0 = createVfModuleRequest0.getVfModuleName();
      assertEquals("p'k7", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      createVfModuleRequest0.setCloudSiteId("");
      assertNull(createVfModuleRequest0.getVfModuleType());
      
      createVfModuleRequest0.setVfModuleId("-)#\"]O:7");
      createVfModuleRequest0.getRequestType();
      createVfModuleRequest0.getVfModuleName();
      createVfModuleRequest0.setVfModuleName("-)#\"]O:7");
      createVfModuleRequest0.setVnfVersion("");
      createVfModuleRequest0.getVfModuleId();
      Boolean boolean0 = new Boolean("$HZL");
      Boolean.logicalXor(false, true);
      Boolean.getBoolean("-)#\"]O:7");
      Boolean.getBoolean("$HZL");
      createVfModuleRequest0.setBackout(boolean0);
      CreateVfModuleRequest createVfModuleRequest1 = new CreateVfModuleRequest();
      CreateVfModuleRequest createVfModuleRequest2 = new CreateVfModuleRequest();
      assertTrue(createVfModuleRequest2.isSynchronous());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      createVfModuleRequest0.setBaseVfModuleStackId("");
      createVfModuleRequest0.getFailIfExists();
      createVfModuleRequest0.setBackout((Boolean) null);
      createVfModuleRequest0.setVfModuleName("^z)=F7B=ZvfaN");
      createVfModuleRequest0.getBackout();
      createVfModuleRequest0.setVnfVersion("^z)=F7B=ZvfaN");
      createVfModuleRequest0.setVolumeGroupId("jaxb.formatted.output");
      createVfModuleRequest0.setVfModuleType("");
      createVfModuleRequest0.getVfModuleName();
      createVfModuleRequest0.getVnfId();
      createVfModuleRequest0.setBaseVfModuleId("");
      createVfModuleRequest0.getVfModuleType();
      createVfModuleRequest0.getCloudSiteId();
      createVfModuleRequest0.setVolumeGroupId("");
      createVfModuleRequest0.setFailIfExists((Boolean) null);
      String string0 = createVfModuleRequest0.getCloudSiteId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      createVfModuleRequest0.setVolumeGroupId("a72)-2");
      String string0 = createVfModuleRequest0.getVfModuleName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      createVfModuleRequest0.setVfModuleName("}2#uF?(<`4`}.");
      assertNull(createVfModuleRequest0.getVnfVersion());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      createVfModuleRequest0.setVfModuleParams((Map<String, String>) null);
      createVfModuleRequest0.getBaseVfModuleId();
      createVfModuleRequest0.getVnfVersion();
      createVfModuleRequest0.setVolumeGroupStackId("");
      createVfModuleRequest0.setCloudSiteId("aZB6^K~Z,$Q1");
      createVfModuleRequest0.setVolumeGroupId("");
      createVfModuleRequest0.setBaseVfModuleId((String) null);
      createVfModuleRequest0.getBackout();
      createVfModuleRequest0.getVfModuleParams();
      createVfModuleRequest0.setVolumeGroupStackId("\"tKNX~{9QfJ");
      String string0 = createVfModuleRequest0.getCloudSiteId();
      assertEquals("aZB6^K~Z,$Q1", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      createVfModuleRequest0.setVnfType("Zp..9csA_m");
      createVfModuleRequest0.setVolumeGroupStackId("Zp..9csA_m");
      createVfModuleRequest0.setVnfId("");
      CreateVfModuleRequest createVfModuleRequest1 = new CreateVfModuleRequest();
      createVfModuleRequest1.setTenantId("");
      createVfModuleRequest1.setVnfVersion("");
      createVfModuleRequest0.setBaseVfModuleId("Zp..9csA_m");
      Boolean boolean0 = Boolean.FALSE;
      createVfModuleRequest0.setBackout(boolean0);
      createVfModuleRequest0.setVfModuleType("");
      String string0 = createVfModuleRequest0.getVnfType();
      assertEquals("Zp..9csA_m", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      createVfModuleRequest0.setVolumeGroupStackId("");
      createVfModuleRequest0.setBaseVfModuleId("");
      String string0 = createVfModuleRequest0.getVnfType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      createVfModuleRequest0.getVolumeGroupStackId();
      // Undeclared exception!
      try { 
        createVfModuleRequest0.toJsonString();
        fail("Expecting exception: VerifyError");
      
      } catch(VerifyError e) {
         //
         // (class: org/codehaus/jackson/map/MapperConfig, method: <clinit> signature: ()V) Bad type in putfield/putstatic
         //
         verifyException("org.codehaus.jackson.map.ObjectMapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      createVfModuleRequest0.setRequestType("]8]Fja*=.9+U");
      createVfModuleRequest0.setVnfVersion("]8]Fja*=.9+U");
      createVfModuleRequest0.setBackout((Boolean) null);
      createVfModuleRequest0.setVnfType("");
      createVfModuleRequest0.setVfModuleType("]8]Fja*=.9+U");
      createVfModuleRequest0.setVfModuleId("2`+q>,#Bb");
      createVfModuleRequest0.setCloudSiteId("]8]Fja*=.9+U");
      createVfModuleRequest0.setVolumeGroupId("2`+q>,#Bb");
      createVfModuleRequest0.setVnfId("@=t[3*cN,^q ");
      createVfModuleRequest0.getVfModuleType();
      createVfModuleRequest0.getTenantId();
      createVfModuleRequest0.getBackout();
      createVfModuleRequest0.setBaseVfModuleStackId("1w$l-");
      assertTrue(createVfModuleRequest0.isSynchronous());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      createVfModuleRequest0.setBaseVfModuleId("");
      createVfModuleRequest0.getCloudSiteId();
      createVfModuleRequest0.setRequestType((String) null);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      createVfModuleRequest0.setVfModuleParams(hashMap0);
      assertNull(createVfModuleRequest0.getBaseVfModuleStackId());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      MsoRequest msoRequest0 = createVfModuleRequest0.getMsoRequest();
      createVfModuleRequest0.setMsoRequest(msoRequest0);
      assertNull(createVfModuleRequest0.getVfModuleName());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      createVfModuleRequest0.setVnfVersion("");
      String string0 = createVfModuleRequest0.getVfModuleId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      createVfModuleRequest0.getVolumeGroupId();
      createVfModuleRequest0.setVfModuleType((String) null);
      createVfModuleRequest0.setVnfId("");
      assertNull(createVfModuleRequest0.getVnfVersion());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      createVfModuleRequest0.toXmlString();
      createVfModuleRequest0.setVfModuleType("");
      String string0 = createVfModuleRequest0.getVnfVersion();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CreateVfModuleRequest createVfModuleRequest0 = new CreateVfModuleRequest();
      createVfModuleRequest0.getVfModuleType();
      createVfModuleRequest0.getVfModuleParams();
      createVfModuleRequest0.setTenantId((String) null);
      assertNull(createVfModuleRequest0.getBaseVfModuleId());
  }
}
