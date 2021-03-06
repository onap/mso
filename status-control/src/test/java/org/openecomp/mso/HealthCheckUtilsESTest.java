/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 08:26:24 GMT 2016
 */

package org.openecomp.mso;

import org.junit.Test;
import static org.junit.Assert.*;

import org.openecomp.mso.logger.MsoLogger;
import org.openecomp.mso.properties.MsoJavaProperties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class HealthCheckUtilsESTest extends HealthCheckUtilsESTestscaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HealthCheckUtils healthCheckUtils0 = new HealthCheckUtils();
      MsoJavaProperties msoJavaProperties0 = healthCheckUtils0.loadTopologyProperties();
      assertNull(msoJavaProperties0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HealthCheckUtils healthCheckUtils0 = new HealthCheckUtils();
      MsoLogger.Catalog msoLogger_Catalog0 = MsoLogger.Catalog.BPEL;
      MsoLogger msoLogger0 = MsoLogger.getMsoLogger(msoLogger_Catalog0);
      boolean boolean0 = healthCheckUtils0.configFileCheck(msoLogger0, 0L, "58zhaz/qbA");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HealthCheckUtils healthCheckUtils0 = new HealthCheckUtils();
      MsoLogger.Catalog msoLogger_Catalog0 = MsoLogger.Catalog.BPEL;
      MsoLogger msoLogger0 = MsoLogger.getMsoLogger(msoLogger_Catalog0);
      boolean boolean0 = healthCheckUtils0.requestDBCheck(msoLogger0, 0L);
      assertFalse(boolean0);
  }
}
