package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_10 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_10.test1");


    tinymonkeys.modele.Ile var2 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var3 = new tinymonkeys.modele.BandeDeSingesErratiques(var2);
    tinymonkeys.modele.SingeErratique var4 = new tinymonkeys.modele.SingeErratique((-1), 11, var2);
    tinymonkeys.modele.Ile var5 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var6 = new tinymonkeys.modele.BandeDeSingesErratiques(var5);
    int[][] var7 = new int[][] { };
    var5.creationCarte(var7);
    var2.creationCarte(var7);
    tinymonkeys.modele.Ile var10 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var11 = new tinymonkeys.modele.BandeDeSingesErratiques(var10);
    int[][] var12 = new int[][] { };
    var10.creationCarte(var12);
    var2.creationCarte(var12);
    tinymonkeys.controleur.Controller var16 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var17 = new tinymonkeys.vue.Fenetre("PanelUI", var16);
    tinymonkeys.vue.VueElement var23 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var29 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var30 = var23.isAncestorOf((java.awt.Component)var29);
    boolean var31 = var23.isFocusTraversalPolicyProvider();
    boolean var34 = var23.contains(10, 111);
    java.awt.Dimension var35 = var23.minimumSize();
    tinymonkeys.vue.VueElement var41 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var42 = var41.getPeer();
    var41.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var41.repaint();
    java.lang.Object var48 = var41.getTreeLock();
    tinymonkeys.vue.VueElement var54 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var55 = var54.getPeer();
    var54.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var54.repaint();
    var54.updateUI();
    int var62 = var41.getComponentZOrder((java.awt.Component)var54);
    java.awt.Insets var63 = var41.getInsets();
    java.util.Locale var64 = var41.getLocale();
    var41.hide();
    java.awt.LayoutManager var66 = var41.getLayout();
    var23.setLayout(var66);
    var17.setLayout(var66);
    java.awt.Color var69 = var17.getBackground();
    java.awt.MenuBar var70 = var17.getMenuBar();
    var2.enregistreEcIle((tinymonkeys.modele.IleEcouteur)var17);
    tinymonkeys.modele.Ile var74 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var75 = new tinymonkeys.modele.BandeDeSingesErratiques(var74);
    tinymonkeys.modele.SingeErratique var76 = new tinymonkeys.modele.SingeErratique((-1), 11, var74);
    tinymonkeys.modele.Ile var77 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var78 = new tinymonkeys.modele.BandeDeSingesErratiques(var77);
    int[][] var79 = new int[][] { };
    var77.creationCarte(var79);
    var74.creationCarte(var79);
    var2.setCarte(var79);

  }

}
