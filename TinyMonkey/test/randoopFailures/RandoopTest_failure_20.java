package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_20 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_20.test1");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.Pirate var1 = var0.getPirate();
    java.lang.String var2 = var1.getAvatar();
    javax.swing.event.EventListenerList var3 = var1.getPirateEcouteurs();
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
    java.awt.Color var58 = var6.getBackground();
    java.awt.Toolkit var59 = var6.getToolkit();
    tinymonkeys.vue.VueElement var65 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var71 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var72 = var65.isAncestorOf((java.awt.Component)var71);
    javax.swing.plaf.PanelUI var73 = var65.getUI();
    java.awt.Image var76 = var65.createImage(0, 1);
    var65.enable(true);
    java.awt.Color var79 = var65.getBackground();
    var6.setBackground(var79);
    var6.setLocation(111, 10);
    java.awt.Container var84 = var6.getFocusCycleRootAncestor();
    var6.setState(0);
    boolean var87 = var6.isResizable();
    var1.enregistreEcPirate((tinymonkeys.modele.PirateEcouteur)var6);
    var1.positionInitiale(100, 111);

  }

}
