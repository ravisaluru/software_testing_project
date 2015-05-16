package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_16 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_16.test1");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    tinymonkeys.vue.VueElement var8 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var14 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var15 = var8.isAncestorOf((java.awt.Component)var14);
    boolean var16 = var8.isFocusTraversalPolicyProvider();
    boolean var19 = var8.contains(10, 111);
    java.awt.Dimension var20 = var8.minimumSize();
    tinymonkeys.vue.VueElement var26 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var27 = var26.getPeer();
    var26.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var26.repaint();
    java.lang.Object var33 = var26.getTreeLock();
    tinymonkeys.vue.VueElement var39 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var40 = var39.getPeer();
    var39.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var39.repaint();
    var39.updateUI();
    int var47 = var26.getComponentZOrder((java.awt.Component)var39);
    java.awt.Insets var48 = var26.getInsets();
    java.util.Locale var49 = var26.getLocale();
    var26.hide();
    java.awt.LayoutManager var51 = var26.getLayout();
    var8.setLayout(var51);
    var2.setLayout(var51);
    java.awt.Color var54 = var2.getBackground();
    java.awt.Toolkit var55 = var2.getToolkit();
    javax.swing.TransferHandler var56 = var2.getTransferHandler();
    java.awt.event.WindowFocusListener[] var57 = var2.getWindowFocusListeners();
    tinymonkeys.modele.Ile var60 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var61 = new tinymonkeys.modele.BandeDeSingesErratiques(var60);
    tinymonkeys.modele.SingeErratique var62 = new tinymonkeys.modele.SingeErratique((-1), 11, var60);
    tinymonkeys.modele.Ile var63 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var64 = new tinymonkeys.modele.BandeDeSingesErratiques(var63);
    int[][] var65 = new int[][] { };
    var63.creationCarte(var65);
    var60.creationCarte(var65);
    tinymonkeys.modele.Ile var70 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var71 = new tinymonkeys.modele.BandeDeSingesErratiques(var70);
    tinymonkeys.modele.SingeErratique var72 = new tinymonkeys.modele.SingeErratique((-1), 11, var70);
    tinymonkeys.modele.Ile var73 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var74 = new tinymonkeys.modele.BandeDeSingesErratiques(var73);
    int[][] var75 = new int[][] { };
    var73.creationCarte(var75);
    var70.creationCarte(var75);
    var60.creationCarte(var75);
    var2.changementCarte(var75);

  }

}
