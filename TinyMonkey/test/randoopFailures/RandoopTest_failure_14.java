package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_14 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_14.test1");


    tinymonkeys.modele.Ile var2 = new tinymonkeys.modele.Ile();
    int[][] var3 = var2.getCarte();
    tinymonkeys.modele.SingeErratique var4 = new tinymonkeys.modele.SingeErratique(111, 10, var2);
    var4.setPosition(100, (-1));
    var4.deplacerSinge();

  }

}
