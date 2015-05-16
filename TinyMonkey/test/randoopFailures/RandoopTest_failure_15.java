package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_15 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_15.test1");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var1 = var0.getSingesErratiques();
    int var4 = var0.valeurCarte(0, (-1));

  }

}
