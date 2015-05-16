package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_5 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_5.test1");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    var0.ajoutPirate("tinymonkeys.vue.VueSingeErratique[,1,22,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]");

  }

}
