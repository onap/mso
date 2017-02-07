/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:16:38 GMT 2016
 */

package org.openecomp.mso.adapters.nwrest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

import org.openecomp.mso.openstack.beans.NetworkStatus;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class QueryNetworkResponseESTest extends QueryNetworkResponseESTestscaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NetworkStatus networkStatus0 = NetworkStatus.DOWN;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse("'Y=Kq<f!!gJ{1Q6v", "", "", networkStatus0, (Map<String, String>) hashMap0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      queryNetworkResponse0.setVlans(linkedList0);
      queryNetworkResponse0.getVlans();
      assertEquals("", queryNetworkResponse0.getNetworkStackId());
      assertEquals("'Y=Kq<f!!gJ{1Q6v", queryNetworkResponse0.getNetworkId());
      assertEquals("", queryNetworkResponse0.getNeutronNetworkId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(1256);
      linkedList0.add(integer0);
      queryNetworkResponse0.setVlans(linkedList0);
      List<Integer> list0 = queryNetworkResponse0.getVlans();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NetworkStatus networkStatus0 = NetworkStatus.UNKNOWN;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse(" v7FX_$8q *", "~MSM=Lj 78BbfMF4", " v7FX_$8q *", networkStatus0, (Map<String, String>) hashMap0);
      queryNetworkResponse0.setSubnetIdMap(hashMap0);
      queryNetworkResponse0.getSubnetIdMap();
      assertEquals(" v7FX_$8q *", queryNetworkResponse0.getNetworkId());
      assertEquals("~MSM=Lj 78BbfMF4", queryNetworkResponse0.getNeutronNetworkId());
      assertEquals(" v7FX_$8q *", queryNetworkResponse0.getNetworkStackId());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NetworkStatus networkStatus0 = NetworkStatus.UNKNOWN;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse("6+6JBO^tv]?e;D6`Hh", "+QU\"j=Jt>;9w<w[9~c.", "6+6JBO^tv]?e;D6`Hh", networkStatus0, (Map<String, String>) hashMap0);
      queryNetworkResponse0.setSubnetIdMap(hashMap0);
      hashMap0.put((String) null, (String) null);
      queryNetworkResponse0.getSubnetIdMap();
      assertEquals("6+6JBO^tv]?e;D6`Hh", queryNetworkResponse0.getNetworkId());
      assertEquals("6+6JBO^tv]?e;D6`Hh", queryNetworkResponse0.getNetworkStackId());
      assertEquals("+QU\"j=Jt>;9w<w[9~c.", queryNetworkResponse0.getNeutronNetworkId());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.push("s<z*H=#g");
      queryNetworkResponse0.setRouteTargets(linkedList0);
      List<String> list0 = queryNetworkResponse0.getRouteTargets();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NetworkStatus networkStatus0 = NetworkStatus.UNKNOWN;
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse("", "ACTIVE", "ACTIVE", networkStatus0, (Map<String, String>) null);
      String string0 = queryNetworkResponse0.getNeutronNetworkId();
      assertEquals("", queryNetworkResponse0.getNetworkId());
      assertEquals("ACTIVE", queryNetworkResponse0.getNetworkStackId());
      assertEquals("ACTIVE", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NetworkStatus networkStatus0 = NetworkStatus.DOWN;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse("'Y=Kq<f!!gJ{1Q6v", "", "", networkStatus0, (Map<String, String>) hashMap0);
      String string0 = queryNetworkResponse0.getNeutronNetworkId();
      assertEquals("", string0);
      assertEquals("", queryNetworkResponse0.getNetworkStackId());
      assertEquals("'Y=Kq<f!!gJ{1Q6v", queryNetworkResponse0.getNetworkId());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NetworkStatus networkStatus0 = NetworkStatus.UNKNOWN;
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse("ZLW;0Nz", "ZLW;0Nz", "ZLW;0Nz", networkStatus0, (Map<String, String>) null);
      String string0 = queryNetworkResponse0.getNetworkStackId();
      assertEquals("ZLW;0Nz", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NetworkStatus networkStatus0 = NetworkStatus.DOWN;
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse("", "", "", networkStatus0, (Map<String, String>) null);
      String string0 = queryNetworkResponse0.getNetworkStackId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NetworkStatus networkStatus0 = NetworkStatus.UNKNOWN;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse(" v7FX_$8q *", "~MSM=Lj 78BbfMF4", " v7FX_$8q *", networkStatus0, (Map<String, String>) hashMap0);
      queryNetworkResponse0.getNetworkOutputs();
      assertEquals("~MSM=Lj 78BbfMF4", queryNetworkResponse0.getNeutronNetworkId());
      assertEquals(" v7FX_$8q *", queryNetworkResponse0.getNetworkStackId());
      assertEquals(" v7FX_$8q *", queryNetworkResponse0.getNetworkId());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NetworkStatus networkStatus0 = NetworkStatus.UNKNOWN;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse("6+6JBO^tv]?e;D6`Hh", "+QU\"j=Jt>;9w<w[9~c.", "6+6JBO^tv]?e;D6`Hh", networkStatus0, (Map<String, String>) hashMap0);
      hashMap0.put((String) null, (String) null);
      queryNetworkResponse0.getNetworkOutputs();
      assertEquals("6+6JBO^tv]?e;D6`Hh", queryNetworkResponse0.getNetworkId());
      assertEquals("+QU\"j=Jt>;9w<w[9~c.", queryNetworkResponse0.getNeutronNetworkId());
      assertEquals("6+6JBO^tv]?e;D6`Hh", queryNetworkResponse0.getNetworkStackId());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse();
      queryNetworkResponse0.setNetworkId("");
      String string0 = queryNetworkResponse0.getNetworkId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse();
      Boolean boolean0 = new Boolean(false);
      queryNetworkResponse0.setNetworkExists(boolean0);
      Boolean boolean1 = queryNetworkResponse0.getNetworkExists();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse();
      queryNetworkResponse0.setNeutronNetworkId("org.openecomp.mso.openstack.beans.NetworkStatus");
      assertNull(queryNetworkResponse0.getNetworkId());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse();
      String string0 = queryNetworkResponse0.getNetworkStackId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse();
      Boolean boolean0 = queryNetworkResponse0.getNetworkExists();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse();
      Map<String, String> map0 = queryNetworkResponse0.getSubnetIdMap();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse();
      // Undeclared exception!
      try { 
        queryNetworkResponse0.toJsonString();
        fail("Expecting exception: VerifyError");
      
      } catch(VerifyError e) {
         //
         // (class: org/codehaus/jackson/map/MapperConfig, method: <clinit> signature: ()V) Bad type in putfield/putstatic
         //
         verifyException("org.codehaus.jackson.map.ObjectMapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse();
      Map<String, String> map0 = queryNetworkResponse0.getNetworkOutputs();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse();
      List<Integer> list0 = queryNetworkResponse0.getVlans();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse();
      NetworkStatus networkStatus0 = NetworkStatus.DOWN;
      queryNetworkResponse0.setNetworkStatus(networkStatus0);
      NetworkStatus networkStatus1 = queryNetworkResponse0.getNetworkStatus();
      assertEquals(NetworkStatus.DOWN, networkStatus1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse();
      List<String> list0 = queryNetworkResponse0.getRouteTargets();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse();
      String string0 = queryNetworkResponse0.getNeutronNetworkId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse();
      Boolean boolean0 = Boolean.TRUE;
      queryNetworkResponse0.setNetworkExists(boolean0);
      Boolean boolean1 = queryNetworkResponse0.getNetworkExists();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse();
      queryNetworkResponse0.setNetworkStackId((String) null);
      assertNull(queryNetworkResponse0.getNeutronNetworkId());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse();
      String string0 = queryNetworkResponse0.getNetworkId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse();
      queryNetworkResponse0.setNetworkOutputs((Map<String, String>) null);
      assertNull(queryNetworkResponse0.getNeutronNetworkId());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse();
      queryNetworkResponse0.getNetworkStatus();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      queryNetworkResponse0.setRouteTargets(linkedList0);
      List<String> list0 = queryNetworkResponse0.getRouteTargets();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NetworkStatus networkStatus0 = NetworkStatus.ERROR;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      QueryNetworkResponse queryNetworkResponse0 = new QueryNetworkResponse("Cm6LuDyY", "Cm6LuDyY", "O5]9 [Se?X,q", networkStatus0, (Map<String, String>) hashMap0);
      String string0 = queryNetworkResponse0.getNetworkId();
      assertEquals("Cm6LuDyY", string0);
      assertEquals("O5]9 [Se?X,q", queryNetworkResponse0.getNetworkStackId());
      assertEquals("Cm6LuDyY", queryNetworkResponse0.getNeutronNetworkId());
  }
}