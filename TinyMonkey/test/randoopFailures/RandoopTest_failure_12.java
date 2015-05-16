package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_12 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_12.test1");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    var2.pack();
    var2.addNotify();
    var2.mortPirate(1);

  }

}
