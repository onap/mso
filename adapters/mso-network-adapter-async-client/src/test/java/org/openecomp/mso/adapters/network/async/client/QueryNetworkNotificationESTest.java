/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:33:21 GMT 2016
 */

package org.openecomp.mso.adapters.network.async.client;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class QueryNetworkNotificationESTest extends QueryNetworkNotificationESTestscaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QueryNetworkNotification queryNetworkNotification0 = new QueryNetworkNotification();
      Boolean boolean0 = new Boolean(true);
      queryNetworkNotification0.networkExists = boolean0;
      Boolean boolean1 = queryNetworkNotification0.isNetworkExists();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QueryNetworkNotification queryNetworkNotification0 = new QueryNetworkNotification();
      Boolean boolean0 = new Boolean("EY");
      queryNetworkNotification0.networkExists = boolean0;
      Boolean boolean1 = queryNetworkNotification0.isNetworkExists();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QueryNetworkNotification queryNetworkNotification0 = new QueryNetworkNotification();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      queryNetworkNotification0.vlans = (List<Integer>) linkedList0;
      Integer integer0 = new Integer((-1490));
      linkedList0.add(integer0);
      List<Integer> list0 = queryNetworkNotification0.getVlans();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QueryNetworkNotification queryNetworkNotification0 = new QueryNetworkNotification();
      QueryNetworkNotification.SubnetIdMap queryNetworkNotification_SubnetIdMap0 = new QueryNetworkNotification.SubnetIdMap();
      queryNetworkNotification0.setSubnetIdMap(queryNetworkNotification_SubnetIdMap0);
      QueryNetworkNotification.SubnetIdMap queryNetworkNotification_SubnetIdMap1 = queryNetworkNotification0.getSubnetIdMap();
      assertSame(queryNetworkNotification_SubnetIdMap1, queryNetworkNotification_SubnetIdMap0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QueryNetworkNotification queryNetworkNotification0 = new QueryNetworkNotification();
      NetworkStatus networkStatus0 = NetworkStatus.ERROR;
      queryNetworkNotification0.setStatus(networkStatus0);
      NetworkStatus networkStatus1 = queryNetworkNotification0.getStatus();
      assertEquals(NetworkStatus.ERROR, networkStatus1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QueryNetworkNotification queryNetworkNotification0 = new QueryNetworkNotification();
      queryNetworkNotification0.setNeutronNetworkId("\"9\"@lJ*tfb");
      String string0 = queryNetworkNotification0.getNeutronNetworkId();
      assertEquals("\"9\"@lJ*tfb", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QueryNetworkNotification queryNetworkNotification0 = new QueryNetworkNotification();
      queryNetworkNotification0.setNetworkId("uuPPD.~Xq(<)vCwo`");
      String string0 = queryNetworkNotification0.getNetworkId();
      assertEquals("uuPPD.~Xq(<)vCwo`", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QueryNetworkNotification queryNetworkNotification0 = new QueryNetworkNotification();
      queryNetworkNotification0.messageId = "[P/";
      String string0 = queryNetworkNotification0.getMessageId();
      assertEquals("[P/", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QueryNetworkNotification queryNetworkNotification0 = new QueryNetworkNotification();
      queryNetworkNotification0.messageId = "";
      String string0 = queryNetworkNotification0.getMessageId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QueryNetworkNotification queryNetworkNotification0 = new QueryNetworkNotification();
      queryNetworkNotification0.setErrorMessage("Q39tT8q6(`");
      String string0 = queryNetworkNotification0.getErrorMessage();
      assertEquals("Q39tT8q6(`", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QueryNetworkNotification queryNetworkNotification0 = new QueryNetworkNotification();
      queryNetworkNotification0.setErrorMessage("");
      String string0 = queryNetworkNotification0.getErrorMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QueryNetworkNotification queryNetworkNotification0 = new QueryNetworkNotification();
      List<Integer> list0 = queryNetworkNotification0.getVlans();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QueryNetworkNotification.SubnetIdMap queryNetworkNotification_SubnetIdMap0 = new QueryNetworkNotification.SubnetIdMap();
      queryNetworkNotification_SubnetIdMap0.getEntry();
      List<QueryNetworkNotification.SubnetIdMap.Entry> list0 = queryNetworkNotification_SubnetIdMap0.getEntry();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QueryNetworkNotification.SubnetIdMap.Entry queryNetworkNotification_SubnetIdMap_Entry0 = new QueryNetworkNotification.SubnetIdMap.Entry();
      String string0 = queryNetworkNotification_SubnetIdMap_Entry0.getKey();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QueryNetworkNotification.SubnetIdMap.Entry queryNetworkNotification_SubnetIdMap_Entry0 = new QueryNetworkNotification.SubnetIdMap.Entry();
      queryNetworkNotification_SubnetIdMap_Entry0.setKey("");
      assertEquals("", queryNetworkNotification_SubnetIdMap_Entry0.getKey());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QueryNetworkNotification.SubnetIdMap.Entry queryNetworkNotification_SubnetIdMap_Entry0 = new QueryNetworkNotification.SubnetIdMap.Entry();
      String string0 = queryNetworkNotification_SubnetIdMap_Entry0.getValue();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QueryNetworkNotification.SubnetIdMap.Entry queryNetworkNotification_SubnetIdMap_Entry0 = new QueryNetworkNotification.SubnetIdMap.Entry();
      queryNetworkNotification_SubnetIdMap_Entry0.setValue("");
      assertNull(queryNetworkNotification_SubnetIdMap_Entry0.getKey());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QueryNetworkNotification queryNetworkNotification0 = new QueryNetworkNotification();
      queryNetworkNotification0.setCompleted(true);
      boolean boolean0 = queryNetworkNotification0.isCompleted();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QueryNetworkNotification queryNetworkNotification0 = new QueryNetworkNotification();
      QueryNetworkNotification.SubnetIdMap queryNetworkNotification_SubnetIdMap0 = queryNetworkNotification0.getSubnetIdMap();
      assertNull(queryNetworkNotification_SubnetIdMap0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QueryNetworkNotification queryNetworkNotification0 = new QueryNetworkNotification();
      String string0 = queryNetworkNotification0.getNeutronNetworkId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QueryNetworkNotification queryNetworkNotification0 = new QueryNetworkNotification();
      queryNetworkNotification0.setMessageId("q;G$a9I6oMF_p-Zy4");
      assertNull(queryNetworkNotification0.getNetworkId());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QueryNetworkNotification queryNetworkNotification0 = new QueryNetworkNotification();
      String string0 = queryNetworkNotification0.getMessageId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QueryNetworkNotification queryNetworkNotification0 = new QueryNetworkNotification();
      String string0 = queryNetworkNotification0.getErrorMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QueryNetworkNotification queryNetworkNotification0 = new QueryNetworkNotification();
      MsoExceptionCategory msoExceptionCategory0 = MsoExceptionCategory.OPENSTACK;
      queryNetworkNotification0.setException(msoExceptionCategory0);
      MsoExceptionCategory msoExceptionCategory1 = queryNetworkNotification0.getException();
      assertSame(msoExceptionCategory1, msoExceptionCategory0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QueryNetworkNotification queryNetworkNotification0 = new QueryNetworkNotification();
      queryNetworkNotification0.getException();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QueryNetworkNotification queryNetworkNotification0 = new QueryNetworkNotification();
      Boolean boolean0 = Boolean.TRUE;
      queryNetworkNotification0.setNetworkExists(boolean0);
      assertFalse(queryNetworkNotification0.isCompleted());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QueryNetworkNotification queryNetworkNotification0 = new QueryNetworkNotification();
      String string0 = queryNetworkNotification0.getNetworkId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QueryNetworkNotification queryNetworkNotification0 = new QueryNetworkNotification();
      queryNetworkNotification0.getStatus();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QueryNetworkNotification queryNetworkNotification0 = new QueryNetworkNotification();
      boolean boolean0 = queryNetworkNotification0.isCompleted();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QueryNetworkNotification queryNetworkNotification0 = new QueryNetworkNotification();
      Boolean boolean0 = queryNetworkNotification0.isNetworkExists();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QueryNetworkNotification queryNetworkNotification0 = new QueryNetworkNotification();
      queryNetworkNotification0.setNetworkId("");
      String string0 = queryNetworkNotification0.getNetworkId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      QueryNetworkNotification queryNetworkNotification0 = new QueryNetworkNotification();
      queryNetworkNotification0.setNeutronNetworkId("");
      String string0 = queryNetworkNotification0.getNeutronNetworkId();
      assertEquals("", string0);
  }
}
