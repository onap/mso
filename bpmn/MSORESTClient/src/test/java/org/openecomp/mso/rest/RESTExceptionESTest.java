/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 11:47:59 GMT 2016
 */

/*- 
 * ============LICENSE_START======================================================= 
 * OPENECOMP - MSO 
 * ================================================================================ 
 * Copyright (C) 2017 AT&T Intellectual Property. All rights reserved. 
 * ================================================================================ 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 * ============LICENSE_END========================================================= 
 */ 

package org.openecomp.mso.rest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class RESTExceptionESTest extends RESTExceptionESTestscaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RESTException rESTException0 = new RESTException(0, (String) null);
      int int0 = rESTException0.getStatusCode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RESTException rESTException0 = new RESTException(1619, "");
      int int0 = rESTException0.getStatusCode();
      assertEquals(1619, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RESTException rESTException0 = new RESTException("");
      String string0 = rESTException0.getErrorMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RESTException rESTException0 = null;
      try {
        rESTException0 = new RESTException((Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.openecomp.mso.rest.RESTException", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RESTException rESTException0 = new RESTException((-489), "org.evosuite.runtime.mock.java.lang.MockThrowable: org.evosuite.runtime.mock.java.lang.MockThrowable");
      String string0 = rESTException0.getErrorMessage();
      assertEquals("org.evosuite.runtime.mock.java.lang.MockThrowable: org.evosuite.runtime.mock.java.lang.MockThrowable", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      RESTException rESTException0 = new RESTException((Throwable) mockThrowable0);
      int int0 = rESTException0.getStatusCode();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      RESTException rESTException0 = new RESTException((Throwable) mockThrowable0);
      String string0 = rESTException0.getErrorMessage();
      assertNull(string0);
  }
}
