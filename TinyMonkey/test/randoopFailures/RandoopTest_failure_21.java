package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_21 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_21.test1");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.Pirate var1 = var0.getPirate();
    int var2 = var1.getX();
    int var3 = var1.getX();
    tinymonkeys.controleur.Controller var5 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var6 = new tinymonkeys.vue.Fenetre("PanelUI", var5);
    tinymonkeys.vue.VueElement var12 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var18 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var19 = var12.isAncestorOf((java.awt.Component)var18);
    boolean var20 = var12.isFocusTraversalPolicyProvider();
    boolean var23 = var12.contains(10, 111);
    java.awt.Dimension var24 = var12.minimumSize();
    tinymonkeys.vue.VueElement var30 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var31 = var30.getPeer();
    var30.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var30.repaint();
    java.lang.Object var37 = var30.getTreeLock();
    tinymonkeys.vue.VueElement var43 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var44 = var43.getPeer();
    var43.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var43.repaint();
    var43.updateUI();
    int var51 = var30.getComponentZOrder((java.awt.Component)var43);
    java.awt.Insets var52 = var30.getInsets();
    java.util.Locale var53 = var30.getLocale();
    var30.hide();
    java.awt.LayoutManager var55 = var30.getLayout();
    var12.setLayout(var55);
    var6.setLayout(var55);
    javax.accessibility.AccessibleContext var58 = var6.getAccessibleContext();
    java.lang.String var59 = var6.getTitle();
    tinymonkeys.vue.VueElement var65 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var66 = var65.getPeer();
    var65.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var65.transferFocusUpCycle();
    boolean var72 = var65.getInheritsPopupMenu();
    java.awt.Component.BaselineResizeBehavior var73 = var65.getBaselineResizeBehavior();
    var65.show();
    var65.setEnabled(false);
    boolean var77 = var65.isMinimumSizeSet();
    var6.setContentPane((java.awt.Container)var65);
    boolean var79 = var6.isAlwaysOnTop();
    java.awt.Graphics var80 = var6.getGraphics();
    var1.enregistreEcPirate((tinymonkeys.modele.PirateEcouteur)var6);
    var1.demandeDeplacement(111, 0);

  }

}
