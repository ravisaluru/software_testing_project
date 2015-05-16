package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_17 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_17.test1");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var1 = var0.getSingesErratiques();
    javax.swing.event.EventListenerList var2 = var0.getIleEcouteurs();
    var0.demandeDeplacementPirate((-1), 111);
    var0.suppressionTresor();

  }

}
