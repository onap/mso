/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 25 13:39:10 GMT 2016
 */

package org.openecomp.mso.asdc.client.exceptions;

import org.junit.Test;
import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class ASDCParametersExceptionESTest extends ASDCParametersExceptionESTestscaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ASDCParametersException aSDCParametersException0 = new ASDCParametersException("4vI_{2b<h&iIy");
      ASDCParametersException aSDCParametersException1 = new ASDCParametersException((String) null, (Throwable) aSDCParametersException0);
      assertFalse(aSDCParametersException1.equals((Object)aSDCParametersException0));
  }
}
