import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author A0108165J
 * 
 */
public class TestIsIdSpec {

  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {
  }

  /**
   * @throws java.lang.Exception
   */
  @After
  public void tearDown() throws Exception {
  }

  /**
   * Test method for {@link TestIsId#isId(java.lang.String)}.
   */
  @Test
  public void testIsId() {
    assertFalse(TestIsId.isId("0hell0o_world"));
    assertTrue(TestIsId.isId("hell0o_world"));
    assertTrue(TestIsId.isId("helloWorld"));
    assertFalse(TestIsId.isId("12479184732847helloWorld"));
    assertTrue(TestIsId.isId("h12479184732847elloWorld"));
    assertFalse(TestIsId.isId("@CWE$#REFCRGERG#"));
    assertFalse(TestIsId.isId("aaaaa@CWE$#REFCRGERG#"));
  }

}
