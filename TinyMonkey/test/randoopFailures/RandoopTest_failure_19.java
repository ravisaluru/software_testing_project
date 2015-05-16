package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_19 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_19.test1");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    boolean var13 = var5.isFocusTraversalPolicyProvider();
    boolean var14 = var5.isShowing();
    boolean var15 = var5.isFocusTraversalPolicySet();
    var5.move(1, 10);
    var5.repaint((-1L), 100, 0, 10, 100);
    tinymonkeys.controleur.Controller var26 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var27 = new tinymonkeys.vue.Fenetre("PanelUI", var26);
    tinymonkeys.vue.VueElement var33 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var39 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var40 = var33.isAncestorOf((java.awt.Component)var39);
    boolean var41 = var33.isFocusTraversalPolicyProvider();
    boolean var44 = var33.contains(10, 111);
    java.awt.Dimension var45 = var33.minimumSize();
    tinymonkeys.vue.VueElement var51 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var52 = var51.getPeer();
    var51.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var51.repaint();
    java.lang.Object var58 = var51.getTreeLock();
    tinymonkeys.vue.VueElement var64 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var65 = var64.getPeer();
    var64.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var64.repaint();
    var64.updateUI();
    int var72 = var51.getComponentZOrder((java.awt.Component)var64);
    java.awt.Insets var73 = var51.getInsets();
    java.util.Locale var74 = var51.getLocale();
    var51.hide();
    java.awt.LayoutManager var76 = var51.getLayout();
    var33.setLayout(var76);
    var27.setLayout(var76);
    java.awt.Color var79 = var27.getBackground();
    java.awt.Toolkit var80 = var27.getToolkit();
    javax.swing.TransferHandler var81 = var27.getTransferHandler();
    int var82 = var27.getDefaultCloseOperation();
    var27.setResizable(false);
    var27.setBounds((-1), 1, 111, 3);
    var27.show();
    java.awt.im.InputContext var91 = var27.getInputContext();
    java.awt.Graphics var92 = var27.getGraphics();
    var5.paint(var92);

  }

}
