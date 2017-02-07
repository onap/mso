/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:20:06 GMT 2016
 */

package org.openecomp.mso.adapters.vnfrest;

import org.junit.Test;
import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class RollbackVfModuleResponseESTest extends RollbackVfModuleResponseESTestscaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      RollbackVfModuleResponse rollbackVfModuleResponse0 = new RollbackVfModuleResponse(boolean0, "W$Bqj~ \u0000}YvH");
      Boolean boolean1 = rollbackVfModuleResponse0.getVfModuleRolledback();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Boolean boolean0 = new Boolean("nR:)\"X2$B@=Yf<Y~Z");
      RollbackVfModuleResponse rollbackVfModuleResponse0 = new RollbackVfModuleResponse(boolean0, "");
      Boolean boolean1 = rollbackVfModuleResponse0.getVfModuleRolledback();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Boolean boolean0 = new Boolean("nR:)\"X2$B@=Yf<Y~Z");
      RollbackVfModuleResponse rollbackVfModuleResponse0 = new RollbackVfModuleResponse(boolean0, "");
      rollbackVfModuleResponse0.setVfModuleRolledback(boolean0);
      assertEquals("", rollbackVfModuleResponse0.getMessageId());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RollbackVfModuleResponse rollbackVfModuleResponse0 = new RollbackVfModuleResponse();
      Boolean boolean0 = rollbackVfModuleResponse0.getVfModuleRolledback();
      assertNull(boolean0);
  }
}