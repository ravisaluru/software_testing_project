package randoop;
import junit.framework.*;
import junit.textui.*;

public class RandoopTest extends TestCase {

  public static void main(String[] args) {
    TestRunner runner = new TestRunner();
    TestResult result = runner.doRun(suite(), false);
    if (! result.wasSuccessful()) {
      System.exit(1);
    }
  }

  public RandoopTest(String name) {
    super(name);
  }

  public static Test suite() {
    TestSuite result = new TestSuite();
    result.addTest(new TestSuite(RandoopTest0.class));
    result.addTest(new TestSuite(RandoopTest1.class));
    result.addTest(new TestSuite(RandoopTest2.class));
    result.addTest(new TestSuite(RandoopTest3.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_1.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_2.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_3.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_4.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_5.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_6.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_7.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_8.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_9.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_10.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_11.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_12.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_13.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_14.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_15.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_16.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_17.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_18.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_19.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_20.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_21.class));
    return result;
  }

}
