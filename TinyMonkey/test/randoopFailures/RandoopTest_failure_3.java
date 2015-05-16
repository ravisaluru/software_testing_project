package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_3 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_3.test1");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.Pirate var1 = var0.getPirate();
    java.util.ArrayList var4 = var0.deplacementsPossibles((-1), 1);

  }

}
