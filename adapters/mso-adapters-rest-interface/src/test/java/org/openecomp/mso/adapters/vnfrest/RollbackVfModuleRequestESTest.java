/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:14:23 GMT 2016
 */

package org.openecomp.mso.adapters.vnfrest;

import org.junit.Test;
import static org.junit.Assert.*;

import org.openecomp.mso.entity.MsoRequest;
import org.openecomp.mso.openstack.beans.VnfRollback;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class RollbackVfModuleRequestESTest extends RollbackVfModuleRequestESTestscaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RollbackVfModuleRequest rollbackVfModuleRequest0 = new RollbackVfModuleRequest();
      MsoRequest msoRequest0 = new MsoRequest();
      VnfRollback vnfRollback0 = new VnfRollback("iL", "cG!", "", true, true, msoRequest0, "cG!", "", (String) null);
      VfModuleRollback vfModuleRollback0 = new VfModuleRollback(vnfRollback0, "", "", (String) null);
      rollbackVfModuleRequest0.setVfModuleRollback(vfModuleRollback0);
      VfModuleRollback vfModuleRollback1 = rollbackVfModuleRequest0.getVfModuleRollback();
      assertEquals("", vfModuleRollback1.getVfModuleStackId());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RollbackVfModuleRequest rollbackVfModuleRequest0 = new RollbackVfModuleRequest();
      MsoRequest msoRequest0 = new MsoRequest("MJ|D", "MJ|D");
      VnfRollback vnfRollback0 = new VnfRollback("jaxb.formatted.output", "jaxb.formatted.output", "jaxb.formatted.output", false, false, msoRequest0, "", "", "");
      VfModuleRollback vfModuleRollback0 = new VfModuleRollback(vnfRollback0, (String) null, "jaxb.formatted.output", "jaxb.formatted.output");
      rollbackVfModuleRequest0.setVfModuleRollback(vfModuleRollback0);
      VfModuleRollback vfModuleRollback1 = rollbackVfModuleRequest0.getVfModuleRollback();
      assertEquals("jaxb.formatted.output", vfModuleRollback1.getTenantId());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RollbackVfModuleRequest rollbackVfModuleRequest0 = new RollbackVfModuleRequest();
      VfModuleRollback vfModuleRollback0 = rollbackVfModuleRequest0.getVfModuleRollback();
      assertNull(vfModuleRollback0);
  }
}