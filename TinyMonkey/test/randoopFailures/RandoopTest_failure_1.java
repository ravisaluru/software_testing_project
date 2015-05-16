package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_1.test1");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var1 = new tinymonkeys.modele.BandeDeSingesErratiques(var0);
    var1.ajoutSingesErratiques(111);

  }

}
