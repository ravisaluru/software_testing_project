package randoop;

import junit.framework.*;

public class RandoopTest3 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test1");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    tinymonkeys.vue.VueElement var18 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var19 = var18.getPeer();
    javax.swing.InputMap var21 = var18.getInputMap(0);
    tinymonkeys.vue.VueElement var28 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var29 = var28.getPeer();
    javax.swing.InputMap var31 = var28.getInputMap(0);
    java.awt.Component.BaselineResizeBehavior var32 = var28.getBaselineResizeBehavior();
    boolean var33 = var28.isPreferredSizeSet();
    java.awt.Component var34 = var18.add("", (java.awt.Component)var28);
    java.awt.Cursor var35 = var28.getCursor();
    boolean var36 = var28.getVerifyInputWhenFocusTarget();
    java.lang.Object var37 = var5.getClientProperty((java.lang.Object)var36);
    boolean var38 = var5.isOpaque();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test2");


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
    tinymonkeys.vue.VueElement var61 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var67 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var68 = var61.isAncestorOf((java.awt.Component)var67);
    javax.swing.plaf.PanelUI var69 = var61.getUI();
    java.awt.Image var72 = var61.createImage(0, 1);
    var61.enable(true);
    java.awt.Color var75 = var61.getBackground();
    var2.setBackground(var75);
    var2.setLocation(111, 10);
    boolean var80 = var2.isLocationByPlatform();
    java.awt.im.InputContext var81 = var2.getInputContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test3");


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
    tinymonkeys.vue.VueElement var60 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var61 = var60.getPeer();
    java.awt.Color var62 = var60.getForeground();
    var2.setBackground(var62);
    boolean var64 = var2.isAutoRequestFocus();
    var2.setResizable(false);
    var2.invalidate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test4");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    javax.swing.InputMap var8 = var5.getInputMap(0);
    tinymonkeys.vue.VueElement var14 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var15 = var14.getPeer();
    javax.swing.InputMap var17 = var14.getInputMap(0);
    boolean var18 = var14.isShowing();
    java.awt.dnd.DropTarget var19 = var14.getDropTarget();
    java.awt.Component var20 = var5.add((java.awt.Component)var14);
    boolean var23 = var5.contains(1, 10);
    java.awt.Container var24 = var5.getFocusCycleRootAncestor();
    boolean var25 = var5.requestDefaultFocus();
    java.awt.event.KeyListener[] var26 = var5.getKeyListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test5");


    tinymonkeys.vue.VueTresor var5 = new tinymonkeys.vue.VueTresor(100, 111, 1, 11, 100);
    java.beans.VetoableChangeListener[] var6 = var5.getVetoableChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test6");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.Pirate var1 = var0.getPirate();
    int var2 = var1.getX();
    var1.demandeDeplacement(10, (-1));
    tinymonkeys.controleur.Controller var7 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var8 = new tinymonkeys.vue.Fenetre("PanelUI", var7);
    tinymonkeys.vue.VueElement var14 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var20 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var21 = var14.isAncestorOf((java.awt.Component)var20);
    boolean var22 = var14.isFocusTraversalPolicyProvider();
    boolean var25 = var14.contains(10, 111);
    java.awt.Dimension var26 = var14.minimumSize();
    tinymonkeys.vue.VueElement var32 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var33 = var32.getPeer();
    var32.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var32.repaint();
    java.lang.Object var39 = var32.getTreeLock();
    tinymonkeys.vue.VueElement var45 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var46 = var45.getPeer();
    var45.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var45.repaint();
    var45.updateUI();
    int var53 = var32.getComponentZOrder((java.awt.Component)var45);
    java.awt.Insets var54 = var32.getInsets();
    java.util.Locale var55 = var32.getLocale();
    var32.hide();
    java.awt.LayoutManager var57 = var32.getLayout();
    var14.setLayout(var57);
    var8.setLayout(var57);
    java.awt.Color var60 = var8.getBackground();
    java.awt.Toolkit var61 = var8.getToolkit();
    javax.swing.TransferHandler var62 = var8.getTransferHandler();
    var8.setVisible(false);
    var8.setVisible(false);
    var1.enregistreEcPirate((tinymonkeys.modele.PirateEcouteur)var8);
    boolean var68 = var8.isFocusOwner();
    int var69 = var8.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test7");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    javax.swing.plaf.PanelUI var13 = var5.getUI();
    java.awt.Image var16 = var5.createImage(0, 1);
    var5.enable(true);
    tinymonkeys.controleur.Controller var20 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var21 = new tinymonkeys.vue.Fenetre("PanelUI", var20);
    int var22 = var21.getExtendedState();
    java.awt.Component var23 = var21.getFocusOwner();
    tinymonkeys.vue.VueElement var29 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var30 = var29.getPeer();
    var29.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var29.repaint();
    java.lang.Object var36 = var29.getTreeLock();
    java.awt.Component var39 = var29.locate(0, (-1));
    var29.setAlignmentX(0.5f);
    java.awt.Font var42 = var29.getFont();
    tinymonkeys.vue.VueElement var49 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var50 = var49.getUIClassID();
    float var51 = var49.getAlignmentX();
    boolean var52 = var49.isOptimizedDrawingEnabled();
    var29.putClientProperty((java.lang.Object)' ', (java.lang.Object)var52);
    var29.transferFocusBackward();
    java.awt.Dimension var55 = var29.getSize();
    var21.setSize(var55);
    java.awt.Container var57 = var21.getContentPane();
    tinymonkeys.controleur.Controller var59 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var60 = new tinymonkeys.vue.Fenetre("PanelUI", var59);
    var60.pack();
    var60.addNotify();
    java.awt.Graphics var63 = var60.getGraphics();
    var21.paintAll(var63);
    var5.paintComponents(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "PanelUI"+ "'", var50.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test8");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    var2.pack();
    var2.addNotify();
    boolean var5 = var2.isValidateRoot();
    var2.pack();
    var2.setSize((-1), (-1));
    var2.setBounds(3, 1, 11, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test9");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.setAlignmentX(0.5f);
    java.awt.Font var18 = var5.getFont();
    var5.transferFocusDownCycle();
    var5.firePropertyChange("PanelUI", '#', '4');
    var5.firePropertyChange("hi!", (byte)0, (byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test10");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.enable(true);
    int var8 = var5.getY();
    var5.requestFocus();
    java.awt.Dimension var10 = var5.getMinimumSize();
    tinymonkeys.vue.VueElement var16 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var22 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var23 = var16.isAncestorOf((java.awt.Component)var22);
    java.awt.Dimension var24 = var16.size();
    java.lang.Object var25 = var5.getClientProperty((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test11");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.enable(true);
    java.awt.Toolkit var8 = var5.getToolkit();
    var5.firePropertyChange("", 100L, 1L);
    java.awt.Point var13 = var5.getLocation();
    boolean var14 = var5.isPaintingForPrint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test12");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.requestFocus();
    tinymonkeys.vue.VueElement var22 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var23 = var22.getPeer();
    var22.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var22.repaint();
    java.lang.Object var29 = var22.getTreeLock();
    java.awt.image.ColorModel var30 = var22.getColorModel();
    boolean var31 = var22.getVerifyInputWhenFocusTarget();
    var22.firePropertyChange("hi!", '4', 'a');
    java.awt.Rectangle var36 = var22.getBounds();
    var5.paintImmediately(var36);
    var5.removeAll();
    boolean var39 = var5.isFocusable();
    var5.firePropertyChange("tinymonkeys.vue.VueSingeErratique[,1,22,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]", ' ', '4');
    javax.swing.plaf.PanelUI var44 = var5.getUI();
    tinymonkeys.vue.VueElement var50 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var51 = var50.getPeer();
    var50.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var50.repaint();
    java.lang.Object var57 = var50.getTreeLock();
    java.awt.image.ColorModel var58 = var50.getColorModel();
    boolean var59 = var50.getVerifyInputWhenFocusTarget();
    tinymonkeys.vue.VueElement var65 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var71 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var71.revalidate();
    var71.setSize(0, 11);
    java.awt.Dimension var76 = var71.getMinimumSize();
    java.awt.Dimension var77 = var65.getSize(var76);
    var50.setMinimumSize(var76);
    boolean var79 = var50.isMaximumSizeSet();
    var50.setEnabled(false);
    javax.swing.ActionMap var82 = var50.getActionMap();
    var5.setActionMap(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test13");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.image.ColorModel var13 = var5.getColorModel();
    var5.repaint();
    var5.firePropertyChange("hi!", '#', 'a');
    tinymonkeys.vue.VueElement var24 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var25 = var24.getPeer();
    javax.swing.InputMap var27 = var24.getInputMap(0);
    tinymonkeys.vue.VueElement var34 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var35 = var34.getPeer();
    javax.swing.InputMap var37 = var34.getInputMap(0);
    java.awt.Component.BaselineResizeBehavior var38 = var34.getBaselineResizeBehavior();
    boolean var39 = var34.isPreferredSizeSet();
    java.awt.Component var40 = var24.add("", (java.awt.Component)var34);
    java.awt.Cursor var41 = var34.getCursor();
    boolean var42 = var34.getVerifyInputWhenFocusTarget();
    javax.swing.ActionMap var43 = var34.getActionMap();
    var5.setActionMap(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test14");


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
    javax.swing.event.EventListenerList var72 = var2.getIleEcouteurs();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.ajoutSingesErratiques(1920);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test15");


    tinymonkeys.modele.Ile var2 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var3 = new tinymonkeys.modele.BandeDeSingesErratiques(var2);
    tinymonkeys.modele.SingeErratique var4 = new tinymonkeys.modele.SingeErratique((-1), 11, var2);
    tinymonkeys.modele.Tresor var5 = var2.getTresor();
    tinymonkeys.modele.Ile var8 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var9 = new tinymonkeys.modele.BandeDeSingesErratiques(var8);
    tinymonkeys.modele.SingeErratique var10 = new tinymonkeys.modele.SingeErratique((-1), 11, var8);
    tinymonkeys.modele.Ile var11 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var12 = new tinymonkeys.modele.BandeDeSingesErratiques(var11);
    int[][] var13 = new int[][] { };
    var11.creationCarte(var13);
    var8.creationCarte(var13);
    tinymonkeys.modele.Ile var16 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var17 = new tinymonkeys.modele.BandeDeSingesErratiques(var16);
    int[][] var18 = new int[][] { };
    var16.creationCarte(var18);
    var8.creationCarte(var18);
    tinymonkeys.controleur.Controller var22 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var23 = new tinymonkeys.vue.Fenetre("PanelUI", var22);
    tinymonkeys.vue.VueElement var29 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var35 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var36 = var29.isAncestorOf((java.awt.Component)var35);
    boolean var37 = var29.isFocusTraversalPolicyProvider();
    boolean var40 = var29.contains(10, 111);
    java.awt.Dimension var41 = var29.minimumSize();
    tinymonkeys.vue.VueElement var47 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var48 = var47.getPeer();
    var47.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var47.repaint();
    java.lang.Object var54 = var47.getTreeLock();
    tinymonkeys.vue.VueElement var60 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var61 = var60.getPeer();
    var60.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var60.repaint();
    var60.updateUI();
    int var68 = var47.getComponentZOrder((java.awt.Component)var60);
    java.awt.Insets var69 = var47.getInsets();
    java.util.Locale var70 = var47.getLocale();
    var47.hide();
    java.awt.LayoutManager var72 = var47.getLayout();
    var29.setLayout(var72);
    var23.setLayout(var72);
    java.awt.Color var75 = var23.getBackground();
    java.awt.MenuBar var76 = var23.getMenuBar();
    var8.enregistreEcIle((tinymonkeys.modele.IleEcouteur)var23);
    var2.enregistreEcIle((tinymonkeys.modele.IleEcouteur)var23);
    var23.removeNotify();
    java.awt.image.BufferStrategy var80 = var23.getBufferStrategy();
    java.awt.Image var81 = var23.getIconImage();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test16");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var1 = new tinymonkeys.modele.BandeDeSingesErratiques(var0);
    tinymonkeys.controleur.Controller var3 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var4 = new tinymonkeys.vue.Fenetre("PanelUI", var3);
    tinymonkeys.vue.VueElement var10 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var16 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var17 = var10.isAncestorOf((java.awt.Component)var16);
    boolean var18 = var10.isFocusTraversalPolicyProvider();
    boolean var21 = var10.contains(10, 111);
    java.awt.Dimension var22 = var10.minimumSize();
    tinymonkeys.vue.VueElement var28 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var29 = var28.getPeer();
    var28.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var28.repaint();
    java.lang.Object var35 = var28.getTreeLock();
    tinymonkeys.vue.VueElement var41 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var42 = var41.getPeer();
    var41.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var41.repaint();
    var41.updateUI();
    int var49 = var28.getComponentZOrder((java.awt.Component)var41);
    java.awt.Insets var50 = var28.getInsets();
    java.util.Locale var51 = var28.getLocale();
    var28.hide();
    java.awt.LayoutManager var53 = var28.getLayout();
    var10.setLayout(var53);
    var4.setLayout(var53);
    java.awt.Color var56 = var4.getBackground();
    java.awt.Toolkit var57 = var4.getToolkit();
    javax.swing.TransferHandler var58 = var4.getTransferHandler();
    int var59 = var4.getDefaultCloseOperation();
    boolean var60 = var4.isCursorSet();
    var1.enregistreEcBandeSinges((tinymonkeys.modele.BandeDeSingesErratiquesEcouteur)var4);
    java.awt.Rectangle var62 = var4.getMaximizedBounds();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test17");


    tinymonkeys.controleur.Controller var2 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var3 = new tinymonkeys.vue.Fenetre("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,hidden,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777216,maximumSize=,minimumSize=,preferredSize=]", var2);
    tinymonkeys.vue.Fenetre var4 = new tinymonkeys.vue.Fenetre("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]", var2);
    java.awt.Shape var5 = var4.getShape();
    var4.setVisible(true);
    javax.swing.TransferHandler var8 = var4.getTransferHandler();
    boolean var9 = var4.isFocusableWindow();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test18");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    int var3 = var2.getExtendedState();
    java.awt.Window.Type var4 = var2.getType();
    tinymonkeys.vue.VueElement var10 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var11 = var10.getPeer();
    javax.swing.InputMap var13 = var10.getInputMap(0);
    boolean var14 = var10.isDisplayable();
    boolean var15 = var10.getFocusTraversalKeysEnabled();
    java.awt.Dimension var16 = var10.getMaximumSize();
    var2.setMinimumSize(var16);
    java.awt.Dimension var18 = var2.getSize();
    boolean var19 = var2.isOpaque();
    java.awt.event.WindowStateListener[] var20 = var2.getWindowStateListeners();
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
    boolean var48 = var39.isDoubleBuffered();
    java.awt.Dimension var49 = var39.size();
    tinymonkeys.vue.VueElement var55 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var56 = var55.getPeer();
    javax.swing.InputMap var58 = var55.getInputMap(0);
    tinymonkeys.vue.VueElement var65 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var66 = var65.getPeer();
    javax.swing.InputMap var68 = var65.getInputMap(0);
    java.awt.Component.BaselineResizeBehavior var69 = var65.getBaselineResizeBehavior();
    boolean var70 = var65.isPreferredSizeSet();
    java.awt.Component var71 = var55.add("", (java.awt.Component)var65);
    java.awt.Cursor var72 = var65.getCursor();
    var39.setCursor(var72);
    var2.setCursor(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test19");


    tinymonkeys.vue.VueSingeErratique var5 = new tinymonkeys.vue.VueSingeErratique(1, 1, 10, (-1), 11);
    boolean var6 = var5.getFocusTraversalKeysEnabled();
    var5.removeNotify();
    java.awt.Component var10 = var5.getComponentAt(0, 0);
    java.lang.Object var11 = var10.getTreeLock();
    java.lang.String var12 = var10.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test20");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    javax.swing.plaf.PanelUI var13 = var5.getUI();
    boolean var14 = var5.isLightweight();
    tinymonkeys.vue.VueElement var20 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var21 = var20.getPeer();
    var20.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var20.repaint();
    java.lang.Object var27 = var20.getTreeLock();
    java.awt.image.ColorModel var28 = var20.getColorModel();
    var20.setLocation(100, 1);
    boolean var32 = var20.isDoubleBuffered();
    java.util.Locale var33 = var20.getLocale();
    java.awt.Dimension var34 = var20.getMaximumSize();
    tinymonkeys.vue.VueElement var40 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var41 = var40.getPeer();
    var40.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var40.repaint();
    java.lang.Object var47 = var40.getTreeLock();
    java.awt.image.ColorModel var48 = var40.getColorModel();
    boolean var49 = var40.getVerifyInputWhenFocusTarget();
    int var50 = var40.getWidth();
    java.util.Locale var51 = var40.getLocale();
    var20.setLocale(var51);
    javax.swing.plaf.PanelUI var53 = var20.getUI();
    tinymonkeys.vue.VueElement var59 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var65 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var66 = var59.isAncestorOf((java.awt.Component)var65);
    java.awt.Point var67 = var65.location();
    java.awt.Point var68 = var20.getLocation(var67);
    java.awt.Point var69 = var5.getLocation(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test21");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.awt.GraphicsConfiguration var12 = var5.getGraphicsConfiguration();
    boolean var13 = var5.getInheritsPopupMenu();
    tinymonkeys.vue.VueElement var19 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var20 = var19.getPeer();
    var19.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var19.repaint();
    java.lang.Object var26 = var19.getTreeLock();
    java.awt.image.ColorModel var27 = var19.getColorModel();
    boolean var28 = var19.getVerifyInputWhenFocusTarget();
    int var29 = var19.getWidth();
    var19.removeNotify();
    boolean var31 = var5.isAncestorOf((java.awt.Component)var19);
    tinymonkeys.vue.VueElement var37 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var38 = var37.getPeer();
    var37.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var37.repaint();
    java.awt.GraphicsConfiguration var44 = var37.getGraphicsConfiguration();
    var37.setFocusCycleRoot(true);
    var5.setNextFocusableComponent((java.awt.Component)var37);
    boolean var48 = var37.isManagingFocus();
    var37.firePropertyChange("PanelUI", ' ', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test22");


    tinymonkeys.controleur.Controller var4 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var5 = new tinymonkeys.vue.Fenetre("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,hidden,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777216,maximumSize=,minimumSize=,preferredSize=]", var4);
    tinymonkeys.vue.Fenetre var6 = new tinymonkeys.vue.Fenetre("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]", var4);
    tinymonkeys.vue.Fenetre var7 = new tinymonkeys.vue.Fenetre("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,hidden,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777216,maximumSize=,minimumSize=,preferredSize=]", var4);
    tinymonkeys.vue.Fenetre var8 = new tinymonkeys.vue.Fenetre("hi!", var4);
    var4.lanceEvolutionsPersonnages();

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test23");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.image.ColorModel var13 = var5.getColorModel();
    var5.repaint();
    javax.accessibility.AccessibleContext var15 = var5.getAccessibleContext();
    var5.removeNotify();
    var5.firePropertyChange("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,hidden,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777216,maximumSize=,minimumSize=,preferredSize=]", true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test24");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    java.awt.im.InputContext var13 = var11.getInputContext();
    boolean var14 = var11.isRequestFocusEnabled();
    java.awt.event.KeyListener[] var15 = var11.getKeyListeners();
    var11.setVisible(true);
    var11.disable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test25");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.image.ColorModel var13 = var5.getColorModel();
    var5.setLocation(100, 1);
    boolean var17 = var5.isMaximumSizeSet();
    int var18 = var5.getWidth();
    java.awt.Dimension var19 = var5.getMaximumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test26");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.requestFocus();
    tinymonkeys.vue.VueElement var22 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var23 = var22.getPeer();
    var22.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var22.repaint();
    java.lang.Object var29 = var22.getTreeLock();
    java.awt.image.ColorModel var30 = var22.getColorModel();
    boolean var31 = var22.getVerifyInputWhenFocusTarget();
    var22.firePropertyChange("hi!", '4', 'a');
    java.awt.Rectangle var36 = var22.getBounds();
    var5.paintImmediately(var36);
    boolean var38 = var5.isMaximumSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test27");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.setAlignmentX(0.5f);
    java.awt.Font var18 = var5.getFont();
    tinymonkeys.vue.VueElement var24 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var24.enable(true);
    tinymonkeys.vue.VueElement var32 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var33 = var32.getUIClassID();
    javax.swing.TransferHandler var34 = var32.getTransferHandler();
    java.awt.Color var35 = var32.getForeground();
    var24.setBackground(var35);
    var5.setForeground(var35);
    java.awt.Insets var38 = var5.insets();
    boolean var39 = var5.isMaximumSizeSet();
    javax.accessibility.AccessibleContext var40 = var5.getAccessibleContext();
    var5.setAutoscrolls(false);
    java.awt.Dimension var43 = var5.getMaximumSize();
    var5.firePropertyChange("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]", 0.0f, (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "PanelUI"+ "'", var33.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test28");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.transferFocusUpCycle();
    boolean var12 = var5.getInheritsPopupMenu();
    tinymonkeys.vue.VueElement var18 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var19 = var18.getPeer();
    var18.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var18.repaint();
    java.lang.Object var25 = var18.getTreeLock();
    java.awt.Component var28 = var18.locate(0, (-1));
    var18.resize((-1), 0);
    var18.transferFocusDownCycle();
    var18.setDebugGraphicsOptions(1);
    java.awt.Dimension var35 = var18.getMaximumSize();
    java.awt.Dimension var36 = var5.getSize(var35);
    javax.swing.KeyStroke[] var37 = var5.getRegisteredKeyStrokes();
    tinymonkeys.controleur.Controller var39 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var40 = new tinymonkeys.vue.Fenetre("PanelUI", var39);
    var40.pack();
    var40.addNotify();
    java.awt.Graphics var43 = var40.getGraphics();
    var5.paint(var43);
    var5.setEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test29");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var6 = var5.getUIClassID();
    boolean var7 = var5.isVisible();
    boolean var8 = var5.isCursorSet();
    var5.show(true);
    tinymonkeys.vue.VueElement var16 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var16.enable(true);
    int var19 = var16.getY();
    tinymonkeys.vue.VueElement var25 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var26 = var25.getPeer();
    java.awt.Color var27 = var25.getForeground();
    var5.add((java.awt.Component)var16, (java.lang.Object)var27, 0);
    var5.resetKeyboardActions();
    var5.setDoubleBuffered(false);
    var5.setAlignmentY(0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "PanelUI"+ "'", var6.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test30");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.Pirate var1 = var0.getPirate();
    int var2 = var1.getX();
    int var3 = var1.getX();
    var1.positionInitiale((-1), 10);
    var1.setAvatar("PanelUI");
    var1.setAvatar("");
    var1.positionInitiale(1, (-1));
    int var14 = var1.getX();
    var1.demandeDeplacement(11, 100);
    var1.setAvatar("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,hidden,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777216,maximumSize=,minimumSize=,preferredSize=]");
    int var20 = var1.getY();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 99);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test31");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    var5.updateUI();
    var5.show(false);
    float var15 = var5.getAlignmentY();
    java.awt.Rectangle var16 = var5.bounds();
    int var17 = var5.getDebugGraphicsOptions();
    var5.setOpaque(false);
    boolean var20 = var5.isDoubleBuffered();
    boolean var21 = var5.isPreferredSizeSet();
    var5.hide();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test32");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.enable(true);
    int var8 = var5.getY();
    boolean var9 = var5.isValid();
    java.awt.Toolkit var10 = var5.getToolkit();
    var5.setVisible(false);
    java.awt.event.MouseListener[] var13 = var5.getMouseListeners();
    java.awt.Dimension var14 = var5.getMaximumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test33");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    javax.swing.plaf.PanelUI var13 = var5.getUI();
    int var14 = var5.countComponents();
    var5.enableInputMethods(false);
    java.awt.Rectangle var17 = var5.getBounds();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test34");


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
    javax.accessibility.AccessibleContext var54 = var2.getAccessibleContext();
    java.awt.Component var55 = var2.getGlassPane();
    javax.swing.JMenuBar var56 = var2.getJMenuBar();
    boolean var59 = var2.contains(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test35");


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
    tinymonkeys.vue.VueElement var61 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var67 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var68 = var61.isAncestorOf((java.awt.Component)var67);
    javax.swing.plaf.PanelUI var69 = var61.getUI();
    java.awt.Image var72 = var61.createImage(0, 1);
    var61.enable(true);
    java.awt.Color var75 = var61.getBackground();
    var2.setBackground(var75);
    var2.setLocation(111, 10);
    java.awt.Container var80 = var2.getFocusCycleRootAncestor();
    var2.setState(0);
    boolean var83 = var2.isResizable();
    boolean var84 = var2.isFocusCycleRoot();
    var2.setBounds(11, 99, 11, 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == true);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test36");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.enable(true);
    tinymonkeys.vue.VueElement var13 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var14 = var13.getUIClassID();
    tinymonkeys.vue.VueElement var20 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var21 = var20.getPeer();
    var20.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var20.transferFocusUpCycle();
    boolean var27 = var20.getInheritsPopupMenu();
    tinymonkeys.vue.VueElement var33 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var34 = var33.getPeer();
    var33.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var33.repaint();
    java.lang.Object var40 = var33.getTreeLock();
    tinymonkeys.vue.VueElement var46 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var47 = var46.getPeer();
    var46.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var46.repaint();
    var46.updateUI();
    int var54 = var33.getComponentZOrder((java.awt.Component)var46);
    var13.add((java.awt.Component)var20, (java.lang.Object)var33);
    boolean var56 = var5.isFocusCycleRoot((java.awt.Container)var20);
    int var57 = var5.getHeight();
    tinymonkeys.vue.VueElement var63 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var64 = var63.getPeer();
    var63.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var63.repaint();
    java.lang.Object var70 = var63.getTreeLock();
    java.awt.image.ColorModel var71 = var63.getColorModel();
    var63.setLocation(100, 1);
    boolean var75 = var63.isDoubleBuffered();
    java.util.Locale var76 = var63.getLocale();
    var5.setLocale(var76);
    var5.grabFocus();
    java.awt.Dimension var79 = var5.getMinimumSize();
    var5.firePropertyChange("PanelUI", '#', ' ');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var85 = var5.getComponent(111);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "PanelUI"+ "'", var14.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test37");


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
    int var57 = var2.getDefaultCloseOperation();
    var2.setResizable(false);
    var2.setBounds((-1), 1, 111, 3);
    var2.show();
    java.awt.im.InputContext var66 = var2.getInputContext();
    javax.swing.JRootPane var67 = var2.getRootPane();
    var2.pack();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test38");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.Pirate var1 = var0.getPirate();
    java.lang.String var2 = var1.getAvatar();
    var1.demandeDeplacement(10, 1);
    int var6 = var1.getX();
    java.lang.String var7 = var1.getAvatar();
    int var8 = var1.getX();
    var1.demandeDeplacement((-1), 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test39");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.Pirate var1 = var0.getPirate();
    tinymonkeys.modele.BandeDeSingesErratiques var2 = var0.getSingesErratiques();
    tinymonkeys.controleur.Controller var4 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var5 = new tinymonkeys.vue.Fenetre("PanelUI", var4);
    var5.pack();
    var5.addNotify();
    var2.enregistreEcBandeSinges((tinymonkeys.modele.BandeDeSingesErratiquesEcouteur)var5);
    var5.reshape((-1), 0, (-1), 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test40");


    tinymonkeys.vue.VuePirate var6 = new tinymonkeys.vue.VuePirate(1, 32767, 10, 1920, 3, "tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]");

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test41");


    tinymonkeys.vue.VuePirate var6 = new tinymonkeys.vue.VuePirate((-1), 3, 100, (-1), 0, "");
    java.awt.Font var7 = var6.getFont();
    tinymonkeys.vue.VueElement var13 = new tinymonkeys.vue.VueElement(0, 0, 1, 1, 11);
    java.awt.event.FocusListener[] var14 = var13.getFocusListeners();
    boolean var15 = var13.getInheritsPopupMenu();
    java.awt.LayoutManager var16 = var13.getLayout();
    var6.setLayout(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test42");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    int var3 = var2.getExtendedState();
    java.awt.Window.Type var4 = var2.getType();
    tinymonkeys.vue.VueElement var10 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var11 = var10.getPeer();
    javax.swing.InputMap var13 = var10.getInputMap(0);
    boolean var14 = var10.isDisplayable();
    boolean var15 = var10.getFocusTraversalKeysEnabled();
    java.awt.Dimension var16 = var10.getMaximumSize();
    var2.setMinimumSize(var16);
    boolean var18 = var2.isLocationByPlatform();
    var2.setState(100);
    float var21 = var2.getOpacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1.0f);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test43");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    int var3 = var2.getExtendedState();
    java.awt.Window.Type var4 = var2.getType();
    tinymonkeys.vue.VueElement var10 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var11 = var10.getPeer();
    javax.swing.InputMap var13 = var10.getInputMap(0);
    boolean var14 = var10.isDisplayable();
    boolean var15 = var10.getFocusTraversalKeysEnabled();
    java.awt.Dimension var16 = var10.getMaximumSize();
    var2.setMinimumSize(var16);
    tinymonkeys.controleur.Controller var19 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var20 = new tinymonkeys.vue.Fenetre("PanelUI", var19);
    tinymonkeys.vue.VueElement var26 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var32 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var33 = var26.isAncestorOf((java.awt.Component)var32);
    boolean var34 = var26.isFocusTraversalPolicyProvider();
    boolean var37 = var26.contains(10, 111);
    java.awt.Dimension var38 = var26.minimumSize();
    tinymonkeys.vue.VueElement var44 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var45 = var44.getPeer();
    var44.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var44.repaint();
    java.lang.Object var51 = var44.getTreeLock();
    tinymonkeys.vue.VueElement var57 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var58 = var57.getPeer();
    var57.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var57.repaint();
    var57.updateUI();
    int var65 = var44.getComponentZOrder((java.awt.Component)var57);
    java.awt.Insets var66 = var44.getInsets();
    java.util.Locale var67 = var44.getLocale();
    var44.hide();
    java.awt.LayoutManager var69 = var44.getLayout();
    var26.setLayout(var69);
    var20.setLayout(var69);
    java.awt.Color var72 = var20.getBackground();
    java.awt.Toolkit var73 = var20.getToolkit();
    javax.swing.TransferHandler var74 = var20.getTransferHandler();
    var20.setVisible(false);
    var20.setVisible(false);
    var2.addKeyListener((java.awt.event.KeyListener)var20);
    var2.setUndecorated(true);
    java.awt.event.WindowListener[] var82 = var2.getWindowListeners();
    var2.show();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test44");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.enable(true);
    var5.firePropertyChange("", '4', '4');
    tinymonkeys.vue.VueElement var18 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var19 = var18.getPeer();
    javax.swing.InputMap var21 = var18.getInputMap(0);
    tinymonkeys.vue.VueElement var27 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var28 = var27.getPeer();
    javax.swing.InputMap var30 = var27.getInputMap(0);
    boolean var31 = var27.isShowing();
    java.awt.dnd.DropTarget var32 = var27.getDropTarget();
    java.awt.Component var33 = var18.add((java.awt.Component)var27);
    java.awt.Component var34 = var5.add("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]", var33);
    tinymonkeys.vue.VueElement var40 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var46 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var47 = var40.isAncestorOf((java.awt.Component)var46);
    boolean var48 = var40.isFocusTraversalPolicyProvider();
    boolean var49 = var40.isShowing();
    boolean var50 = var40.isFocusTraversalPolicySet();
    var40.move(1, 10);
    var40.updateUI();
    tinymonkeys.vue.VueElement var60 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var61 = var60.getPeer();
    var60.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var60.repaint();
    java.lang.Object var67 = var60.getTreeLock();
    java.awt.image.ColorModel var68 = var60.getColorModel();
    var60.setLocation(100, 1);
    var60.setFocusTraversalPolicyProvider(true);
    java.awt.Point var74 = var60.getLocation();
    java.awt.Point var75 = var40.getLocation(var74);
    java.awt.Component var76 = var5.findComponentAt(var75);
    boolean var77 = var5.getIgnoreRepaint();
    var5.removeNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test45");


    tinymonkeys.vue.VueTresor var5 = new tinymonkeys.vue.VueTresor(11, (-1), (-1), 100, 100);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var17 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var18 = var11.isAncestorOf((java.awt.Component)var17);
    boolean var19 = var11.isFocusTraversalPolicyProvider();
    java.awt.event.MouseMotionListener[] var20 = var11.getMouseMotionListeners();
    javax.swing.ActionMap var21 = var11.getActionMap();
    tinymonkeys.vue.VueElement var27 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var28 = var27.getPeer();
    var27.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var27.repaint();
    java.lang.Object var34 = var27.getTreeLock();
    java.awt.Component var37 = var27.locate(0, (-1));
    var27.setAlignmentX(0.5f);
    java.awt.Font var40 = var27.getFont();
    tinymonkeys.vue.VueElement var47 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var48 = var47.getUIClassID();
    float var49 = var47.getAlignmentX();
    boolean var50 = var47.isOptimizedDrawingEnabled();
    var27.putClientProperty((java.lang.Object)' ', (java.lang.Object)var50);
    tinymonkeys.vue.VueElement var57 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var58 = var57.getPeer();
    var57.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var57.repaint();
    java.lang.Object var64 = var57.getTreeLock();
    java.awt.Component var67 = var57.locate(0, (-1));
    var57.setAlignmentX(0.5f);
    java.awt.Font var70 = var57.getFont();
    java.awt.FontMetrics var71 = var27.getFontMetrics(var70);
    java.awt.FontMetrics var72 = var11.getFontMetrics(var70);
    java.awt.FontMetrics var73 = var5.getFontMetrics(var70);
    java.awt.Font var74 = var5.getFont();
    var5.setFocusable(false);
    var5.disable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "PanelUI"+ "'", var48.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test46");


    tinymonkeys.vue.VueTresor var5 = new tinymonkeys.vue.VueTresor(111, 11, 10, 111, (-1));
    java.awt.Font var6 = var5.getFont();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test47");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]", var1);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test48");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    var2.pack();
    var2.addNotify();
    boolean var5 = var2.isValidateRoot();
    java.awt.Dialog.ModalExclusionType var6 = var2.getModalExclusionType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test49");


    int[][] var2 = new int[][] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      tinymonkeys.vue.VueCarte var3 = new tinymonkeys.vue.VueCarte((-1), 100, var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test50");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.requestFocus();
    boolean var17 = var5.isFocusTraversable();
    java.awt.event.InputMethodListener[] var18 = var5.getInputMethodListeners();
    boolean var19 = var5.isMaximumSizeSet();
    boolean var20 = var5.isPreferredSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test51");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.setAlignmentX(0.5f);
    java.awt.Font var18 = var5.getFont();
    boolean var19 = var5.isRequestFocusEnabled();
    java.awt.im.InputMethodRequests var20 = var5.getInputMethodRequests();
    var5.transferFocusBackward();
    java.awt.Font var22 = var5.getFont();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test52");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.awt.GraphicsConfiguration var12 = var5.getGraphicsConfiguration();
    boolean var13 = var5.getInheritsPopupMenu();
    tinymonkeys.vue.VueElement var19 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var20 = var19.getPeer();
    var19.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var19.repaint();
    java.lang.Object var26 = var19.getTreeLock();
    java.awt.image.ColorModel var27 = var19.getColorModel();
    boolean var28 = var19.getVerifyInputWhenFocusTarget();
    int var29 = var19.getWidth();
    var19.removeNotify();
    boolean var31 = var5.isAncestorOf((java.awt.Component)var19);
    tinymonkeys.vue.VueElement var37 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var38 = var37.getPeer();
    var37.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var37.repaint();
    java.awt.GraphicsConfiguration var44 = var37.getGraphicsConfiguration();
    var37.setFocusCycleRoot(true);
    var5.setNextFocusableComponent((java.awt.Component)var37);
    var5.doLayout();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test53");


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
    javax.accessibility.AccessibleContext var54 = var2.getAccessibleContext();
    java.awt.Component var55 = var2.getGlassPane();
    javax.swing.JMenuBar var56 = var2.getJMenuBar();
    java.awt.Point var57 = var2.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test54");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var6 = var5.getUIClassID();
    tinymonkeys.vue.VueElement var12 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var13 = var12.getPeer();
    var12.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var12.transferFocusUpCycle();
    boolean var19 = var12.getInheritsPopupMenu();
    tinymonkeys.vue.VueElement var25 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var26 = var25.getPeer();
    var25.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var25.repaint();
    java.lang.Object var32 = var25.getTreeLock();
    tinymonkeys.vue.VueElement var38 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var39 = var38.getPeer();
    var38.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var38.repaint();
    var38.updateUI();
    int var46 = var25.getComponentZOrder((java.awt.Component)var38);
    var5.add((java.awt.Component)var12, (java.lang.Object)var25);
    var25.firePropertyChange("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]", (byte)0, (byte)10);
    int var52 = var25.getHeight();
    java.awt.Point var54 = var25.getMousePosition(false);
    var25.setIgnoreRepaint(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "PanelUI"+ "'", var6.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test55");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.requestFocus();
    var5.addNotify();
    var5.repaint();
    var5.show(true);
    var5.requestFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test56");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.enable(true);
    boolean var8 = var5.isOpaque();
    java.lang.String var9 = var5.getName();
    var5.validate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test57");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var1 = new tinymonkeys.modele.BandeDeSingesErratiques(var0);
    javax.swing.event.EventListenerList var2 = var0.getIleEcouteurs();
    tinymonkeys.modele.Tresor var3 = var0.getTresor();
    tinymonkeys.controleur.Controller var5 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var6 = new tinymonkeys.vue.Fenetre("PanelUI", var5);
    int var7 = var6.getExtendedState();
    java.awt.Window.Type var8 = var6.getType();
    tinymonkeys.vue.VueElement var14 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var15 = var14.getPeer();
    javax.swing.InputMap var17 = var14.getInputMap(0);
    boolean var18 = var14.isDisplayable();
    boolean var19 = var14.getFocusTraversalKeysEnabled();
    java.awt.Dimension var20 = var14.getMaximumSize();
    var6.setMinimumSize(var20);
    java.awt.Window.Type var22 = var6.getType();
    int var23 = var6.getCursorType();
    var6.dispose();
    var0.enregistreEcIle((tinymonkeys.modele.IleEcouteur)var6);
    boolean var26 = var6.isBackgroundSet();
    javax.swing.JRootPane var27 = var6.getRootPane();
    var6.setLocation(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test58");


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
    javax.accessibility.AccessibleContext var54 = var2.getAccessibleContext();
    var2.setAlwaysOnTop(true);
    var2.setCursor(10);
    tinymonkeys.vue.VueElement var64 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var64.enable(true);
    int var67 = var64.getY();
    boolean var68 = var64.isValid();
    var64.setDebugGraphicsOptions(111);
    javax.swing.ActionMap var71 = var64.getActionMap();
    var2.setLocationRelativeTo((java.awt.Component)var64);
    java.awt.Container var73 = var2.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test59");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    javax.swing.plaf.PanelUI var13 = var5.getUI();
    var5.repaint(10L);
    tinymonkeys.vue.VueSingeErratique var21 = new tinymonkeys.vue.VueSingeErratique(11, 10, 0, 0, 100);
    var21.requestFocus();
    var21.firePropertyChange("PanelUI", (short)1, (short)1);
    tinymonkeys.vue.VueElement var32 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var32.revalidate();
    var32.setSize(0, 11);
    var32.layout();
    java.awt.ComponentOrientation var38 = var32.getComponentOrientation();
    var21.setComponentOrientation(var38);
    var5.setComponentOrientation(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test60");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var6 = var5.getUIClassID();
    boolean var7 = var5.isVisible();
    boolean var8 = var5.isCursorSet();
    var5.show(true);
    tinymonkeys.vue.VueElement var16 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var16.enable(true);
    int var19 = var16.getY();
    tinymonkeys.vue.VueElement var25 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var26 = var25.getPeer();
    java.awt.Color var27 = var25.getForeground();
    var5.add((java.awt.Component)var16, (java.lang.Object)var27, 0);
    tinymonkeys.vue.VueElement var35 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var36 = var35.getPeer();
    var35.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var35.repaint();
    java.lang.Object var42 = var35.getTreeLock();
    java.awt.image.ColorModel var43 = var35.getColorModel();
    boolean var44 = var35.getAutoscrolls();
    var35.setIgnoreRepaint(true);
    java.awt.Rectangle var47 = var35.getVisibleRect();
    var5.scrollRectToVisible(var47);
    boolean var49 = var5.isFontSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "PanelUI"+ "'", var6.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test61");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    javax.swing.InputMap var8 = var5.getInputMap(0);
    boolean var9 = var5.isShowing();
    java.awt.dnd.DropTarget var10 = var5.getDropTarget();
    java.awt.Point var12 = var5.getMousePosition(false);
    java.beans.VetoableChangeListener[] var13 = var5.getVetoableChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test62");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    tinymonkeys.vue.VueElement var18 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var19 = var18.getPeer();
    var18.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var18.repaint();
    var18.updateUI();
    int var26 = var5.getComponentZOrder((java.awt.Component)var18);
    int var27 = var5.getY();
    var5.validate();
    java.awt.event.KeyListener[] var29 = var5.getKeyListeners();
    javax.swing.event.AncestorListener[] var30 = var5.getAncestorListeners();
    java.awt.Color var31 = var5.getBackground();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test63");


    tinymonkeys.modele.Ile var2 = new tinymonkeys.modele.Ile();
    int[][] var3 = var2.getCarte();
    tinymonkeys.modele.SingeErratique var4 = new tinymonkeys.modele.SingeErratique(111, 10, var2);
    boolean var7 = var2.singeEstPresent(10, 11);
    var2.demandeDeplacementPirate(10, 1);
    tinymonkeys.modele.Pirate var11 = var2.getPirate();
    var11.positionInitiale(1920, 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test64");


    tinymonkeys.vue.VueSingeErratique var5 = new tinymonkeys.vue.VueSingeErratique(1, 1, 10, (-1), 11);
    java.awt.GraphicsConfiguration var6 = var5.getGraphicsConfiguration();
    int var7 = var5.getX();
    java.awt.Rectangle var8 = var5.bounds();
    boolean var9 = var5.isPaintingTile();
    boolean var10 = var5.isPaintingTile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test65");


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
    var2.setFocusableWindowState(true);
    java.awt.event.WindowStateListener[] var58 = var2.getWindowStateListeners();
    var2.setCursor(0);
    java.lang.String var61 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "tinymonkeys.vue.Fenetre[frame1,0,0,1920x1080,invalid,hidden,layout=java.awt.BorderLayout,title=PanelUI,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0var61,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", var61.equals("tinymonkeys.vue.Fenetre[frame1,0,0,1920x1080,invalid,hidden,layout=java.awt.BorderLayout,title=PanelUI,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0var61,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test66");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var1 = new tinymonkeys.modele.BandeDeSingesErratiques(var0);
    int[][] var2 = new int[][] { };
    var0.creationCarte(var2);
    tinymonkeys.modele.Pirate var5 = new tinymonkeys.modele.Pirate(var0, "PanelUI");
    tinymonkeys.modele.Pirate var7 = new tinymonkeys.modele.Pirate(var0, "");
    tinymonkeys.modele.Pirate var8 = var0.getPirate();
    tinymonkeys.modele.Tresor var9 = var0.getTresor();
    tinymonkeys.modele.Pirate var11 = new tinymonkeys.modele.Pirate(var0, "PanelUI");
    tinymonkeys.modele.BandeDeSingesErratiques var12 = new tinymonkeys.modele.BandeDeSingesErratiques(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.run();
      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test67");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    tinymonkeys.vue.VueElement var18 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var19 = var18.getPeer();
    var18.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var18.repaint();
    var18.updateUI();
    int var26 = var5.getComponentZOrder((java.awt.Component)var18);
    java.awt.Insets var27 = var5.getInsets();
    java.util.Locale var28 = var5.getLocale();
    var5.hide();
    java.awt.LayoutManager var30 = var5.getLayout();
    java.awt.Rectangle var31 = var5.bounds();
    boolean var32 = var5.isMaximumSizeSet();
    tinymonkeys.controleur.Controller var35 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var36 = new tinymonkeys.vue.Fenetre("PanelUI", var35);
    int var37 = var36.getExtendedState();
    java.awt.Component var38 = var36.getFocusOwner();
    var36.setBounds(0, 111, (-1), (-1));
    java.awt.ComponentOrientation var44 = var36.getComponentOrientation();
    java.util.Set var46 = var36.getFocusTraversalKeys(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.setFocusTraversalKeys(100, var46);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test68");


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
    var2.setVisible(false);
    int var59 = var2.getDefaultCloseOperation();
    java.awt.Window var60 = var2.getOwner();
    boolean var61 = var2.isAutoRequestFocus();
    boolean var62 = var2.isDoubleBuffered();
    var2.hide();
    java.util.Set var65 = var2.getFocusTraversalKeys(1);
    java.awt.Component[] var66 = var2.getComponents();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test69");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    int var3 = var2.getExtendedState();
    java.awt.Window.Type var4 = var2.getType();
    tinymonkeys.vue.VueElement var10 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var11 = var10.getPeer();
    javax.swing.InputMap var13 = var10.getInputMap(0);
    boolean var14 = var10.isDisplayable();
    boolean var15 = var10.getFocusTraversalKeysEnabled();
    java.awt.Dimension var16 = var10.getMaximumSize();
    var2.setMinimumSize(var16);
    boolean var18 = var2.isLocationByPlatform();
    var2.doLayout();
    boolean var20 = var2.isUndecorated();
    boolean var21 = var2.isAutoRequestFocus();
    tinymonkeys.vue.VueElement var27 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var28 = var27.getPeer();
    var27.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var27.repaint();
    java.lang.Object var34 = var27.getTreeLock();
    java.awt.image.ColorModel var35 = var27.getColorModel();
    boolean var36 = var27.getVerifyInputWhenFocusTarget();
    var27.firePropertyChange("hi!", '4', 'a');
    java.awt.Rectangle var41 = var27.getBounds();
    tinymonkeys.vue.VueElement var47 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var53 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var54 = var47.isAncestorOf((java.awt.Component)var53);
    java.awt.Point var55 = var53.location();
    java.awt.Point var56 = var27.getLocation(var55);
    java.awt.event.FocusListener[] var57 = var27.getFocusListeners();
    boolean var58 = var27.isVisible();
    var2.setContentPane((java.awt.Container)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test70");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    int var3 = var2.getExtendedState();
    java.awt.Window.Type var4 = var2.getType();
    tinymonkeys.vue.VueElement var10 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var11 = var10.getPeer();
    javax.swing.InputMap var13 = var10.getInputMap(0);
    boolean var14 = var10.isDisplayable();
    boolean var15 = var10.getFocusTraversalKeysEnabled();
    java.awt.Dimension var16 = var10.getMaximumSize();
    var2.setMinimumSize(var16);
    java.awt.Dimension var18 = var2.getSize();
    boolean var19 = var2.isOpaque();
    java.awt.event.WindowStateListener[] var20 = var2.getWindowStateListeners();
    boolean var21 = var2.isValidateRoot();
    var2.firePropertyChange("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,hidden,layout=java.awt.FlowLayout,alignmentX=0.5,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]", 0.0f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test71");


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
    tinymonkeys.vue.VueElement var61 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var62 = var61.getPeer();
    var61.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var61.repaint();
    java.lang.Object var68 = var61.getTreeLock();
    tinymonkeys.vue.VueElement var74 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var75 = var74.getPeer();
    var74.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var74.repaint();
    var74.updateUI();
    int var82 = var61.getComponentZOrder((java.awt.Component)var74);
    java.awt.Insets var83 = var61.getInsets();
    boolean var84 = var61.getFocusTraversalKeysEnabled();
    var61.setSize(111, 11);
    var61.firePropertyChange("", 100.0f, 0.5f);
    java.awt.GraphicsConfiguration var92 = var61.getGraphicsConfiguration();
    var2.setLocationRelativeTo((java.awt.Component)var61);
    int var94 = var2.getExtendedState();
    java.awt.im.InputMethodRequests var95 = var2.getInputMethodRequests();
    var2.removeNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var95);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test72");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var1 = var0.getSingesErratiques();
    javax.swing.event.EventListenerList var2 = var0.getIleEcouteurs();
    var0.demandeDeplacementPirate((-1), 111);
    tinymonkeys.controleur.Controller var7 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var8 = new tinymonkeys.vue.Fenetre("PanelUI", var7);
    tinymonkeys.vue.VueElement var14 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var20 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var21 = var14.isAncestorOf((java.awt.Component)var20);
    boolean var22 = var14.isFocusTraversalPolicyProvider();
    boolean var25 = var14.contains(10, 111);
    java.awt.Dimension var26 = var14.minimumSize();
    tinymonkeys.vue.VueElement var32 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var33 = var32.getPeer();
    var32.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var32.repaint();
    java.lang.Object var39 = var32.getTreeLock();
    tinymonkeys.vue.VueElement var45 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var46 = var45.getPeer();
    var45.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var45.repaint();
    var45.updateUI();
    int var53 = var32.getComponentZOrder((java.awt.Component)var45);
    java.awt.Insets var54 = var32.getInsets();
    java.util.Locale var55 = var32.getLocale();
    var32.hide();
    java.awt.LayoutManager var57 = var32.getLayout();
    var14.setLayout(var57);
    var8.setLayout(var57);
    java.awt.Color var60 = var8.getBackground();
    tinymonkeys.vue.VueElement var66 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var67 = var66.getPeer();
    java.awt.Color var68 = var66.getForeground();
    var8.setBackground(var68);
    tinymonkeys.controleur.Controller var71 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var72 = new tinymonkeys.vue.Fenetre("PanelUI", var71);
    int var73 = var72.getExtendedState();
    java.awt.Window.Type var74 = var72.getType();
    var8.setType(var74);
    boolean var76 = var8.isDoubleBuffered();
    var8.dispose();
    java.awt.Component var78 = var8.getGlassPane();
    var0.enregistreEcIle((tinymonkeys.modele.IleEcouteur)var8);
    boolean var80 = var8.isUndecorated();
    java.awt.im.InputContext var81 = var8.getInputContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test73");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.resize((-1), 0);
    var5.transferFocusDownCycle();
    var5.setDebugGraphicsOptions(1);
    java.awt.Dimension var22 = var5.getMaximumSize();
    int var23 = var5.countComponents();
    java.lang.String var24 = var5.getToolTipText();
    var5.setFocusTraversalKeysEnabled(true);
    var5.setAutoscrolls(false);
    tinymonkeys.vue.VueElement var34 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var35 = var34.getPeer();
    var34.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var34.repaint();
    var34.updateUI();
    var34.show(false);
    boolean var44 = var34.isFocusTraversalPolicyProvider();
    boolean var45 = var34.isValid();
    boolean var46 = var34.isManagingFocus();
    var34.setFocusable(true);
    tinymonkeys.vue.VueElement var54 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var55 = var54.getPeer();
    var54.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var54.repaint();
    java.lang.Object var61 = var54.getTreeLock();
    java.awt.Component var64 = var54.locate(0, (-1));
    var54.setAlignmentX(0.5f);
    java.awt.Font var67 = var54.getFont();
    tinymonkeys.vue.VueElement var74 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var75 = var74.getUIClassID();
    float var76 = var74.getAlignmentX();
    boolean var77 = var74.isOptimizedDrawingEnabled();
    var54.putClientProperty((java.lang.Object)' ', (java.lang.Object)var77);
    boolean var79 = var54.isDoubleBuffered();
    boolean var80 = var54.requestFocusInWindow();
    var54.enableInputMethods(false);
    java.awt.LayoutManager var83 = var54.getLayout();
    var34.setLayout(var83);
    java.awt.Point var85 = var34.location();
    var5.setLocation(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "PanelUI"+ "'", var75.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test74");


    tinymonkeys.vue.VueSingeErratique var5 = new tinymonkeys.vue.VueSingeErratique(10, 111, (-1), 0, 0);
    tinymonkeys.controleur.Controller var7 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var8 = new tinymonkeys.vue.Fenetre("PanelUI", var7);
    tinymonkeys.vue.VueElement var14 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var20 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var21 = var14.isAncestorOf((java.awt.Component)var20);
    boolean var22 = var14.isFocusTraversalPolicyProvider();
    boolean var25 = var14.contains(10, 111);
    java.awt.Dimension var26 = var14.minimumSize();
    tinymonkeys.vue.VueElement var32 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var33 = var32.getPeer();
    var32.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var32.repaint();
    java.lang.Object var39 = var32.getTreeLock();
    tinymonkeys.vue.VueElement var45 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var46 = var45.getPeer();
    var45.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var45.repaint();
    var45.updateUI();
    int var53 = var32.getComponentZOrder((java.awt.Component)var45);
    java.awt.Insets var54 = var32.getInsets();
    java.util.Locale var55 = var32.getLocale();
    var32.hide();
    java.awt.LayoutManager var57 = var32.getLayout();
    var14.setLayout(var57);
    var8.setLayout(var57);
    java.awt.Color var60 = var8.getBackground();
    tinymonkeys.vue.VueElement var66 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var67 = var66.getPeer();
    java.awt.Color var68 = var66.getForeground();
    var8.setBackground(var68);
    var5.setForeground(var68);
    java.beans.VetoableChangeListener[] var71 = var5.getVetoableChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test75");


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
    boolean var72 = var17.isAutoRequestFocus();
    java.awt.Component var75 = var17.locate(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test76");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    var5.updateUI();
    var5.show(false);
    float var15 = var5.getAlignmentY();
    java.awt.Rectangle var16 = var5.bounds();
    int var17 = var5.getDebugGraphicsOptions();
    var5.setOpaque(false);
    boolean var20 = var5.isDoubleBuffered();
    int var21 = var5.getY();
    tinymonkeys.vue.VueElement var27 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var28 = var27.getPeer();
    var27.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var27.repaint();
    java.lang.Object var34 = var27.getTreeLock();
    tinymonkeys.vue.VueElement var40 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var41 = var40.getPeer();
    var40.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var40.repaint();
    var40.updateUI();
    int var48 = var27.getComponentZOrder((java.awt.Component)var40);
    tinymonkeys.vue.VueElement var54 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var55 = var54.getPeer();
    var54.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var54.transferFocusUpCycle();
    boolean var61 = var54.getInheritsPopupMenu();
    java.awt.Dimension var62 = var54.minimumSize();
    java.awt.Dimension var63 = var40.getSize(var62);
    var5.setPreferredSize(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test77");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.enable(true);
    tinymonkeys.vue.VueElement var13 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var14 = var13.getUIClassID();
    tinymonkeys.vue.VueElement var20 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var21 = var20.getPeer();
    var20.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var20.transferFocusUpCycle();
    boolean var27 = var20.getInheritsPopupMenu();
    tinymonkeys.vue.VueElement var33 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var34 = var33.getPeer();
    var33.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var33.repaint();
    java.lang.Object var40 = var33.getTreeLock();
    tinymonkeys.vue.VueElement var46 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var47 = var46.getPeer();
    var46.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var46.repaint();
    var46.updateUI();
    int var54 = var33.getComponentZOrder((java.awt.Component)var46);
    var13.add((java.awt.Component)var20, (java.lang.Object)var33);
    boolean var56 = var5.isFocusCycleRoot((java.awt.Container)var20);
    int var57 = var5.getHeight();
    tinymonkeys.vue.VueElement var63 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var64 = var63.getPeer();
    var63.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var63.repaint();
    java.lang.Object var70 = var63.getTreeLock();
    java.awt.image.ColorModel var71 = var63.getColorModel();
    var63.setLocation(100, 1);
    boolean var75 = var63.isDoubleBuffered();
    java.util.Locale var76 = var63.getLocale();
    var5.setLocale(var76);
    java.awt.ComponentOrientation var78 = var5.getComponentOrientation();
    java.lang.String var79 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "PanelUI"+ "'", var14.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]"+ "'", var79.equals("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]"));

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test78");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    int var3 = var2.getExtendedState();
    java.awt.Window.Type var4 = var2.getType();
    tinymonkeys.vue.VueElement var10 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var11 = var10.getPeer();
    javax.swing.InputMap var13 = var10.getInputMap(0);
    boolean var14 = var10.isDisplayable();
    boolean var15 = var10.getFocusTraversalKeysEnabled();
    java.awt.Dimension var16 = var10.getMaximumSize();
    var2.setMinimumSize(var16);
    boolean var18 = var2.isLocationByPlatform();
    var2.setState(100);
    var2.firePropertyChange("hi!", 10.0d, 0.0d);
    boolean var25 = var2.isResizable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test79");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.requestFocus();
    boolean var17 = var5.isFocusTraversable();
    tinymonkeys.vue.VueElement var23 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var24 = var23.getPeer();
    var23.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var23.repaint();
    java.lang.Object var30 = var23.getTreeLock();
    java.awt.Component var33 = var23.locate(0, (-1));
    var23.setAlignmentX(0.5f);
    java.awt.Font var36 = var23.getFont();
    tinymonkeys.vue.VueElement var43 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var44 = var43.getUIClassID();
    float var45 = var43.getAlignmentX();
    boolean var46 = var43.isOptimizedDrawingEnabled();
    var23.putClientProperty((java.lang.Object)' ', (java.lang.Object)var46);
    var23.transferFocusBackward();
    tinymonkeys.vue.VueElement var54 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var55 = var54.getPeer();
    var54.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var54.repaint();
    java.awt.GraphicsConfiguration var61 = var54.getGraphicsConfiguration();
    var54.setFocusCycleRoot(true);
    var5.add((java.awt.Component)var23, (java.lang.Object)true);
    boolean var65 = var5.isDoubleBuffered();
    java.awt.Color var66 = var5.getForeground();
    tinymonkeys.vue.VueElement var72 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var73 = var72.getUIClassID();
    java.awt.Dimension var74 = var72.getMaximumSize();
    var5.setPreferredSize(var74);
    var5.requestFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "PanelUI"+ "'", var44.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "PanelUI"+ "'", var73.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test80");


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
    tinymonkeys.vue.VueElement var61 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var67 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var68 = var61.isAncestorOf((java.awt.Component)var67);
    javax.swing.plaf.PanelUI var69 = var61.getUI();
    java.awt.Image var72 = var61.createImage(0, 1);
    var61.enable(true);
    java.awt.Color var75 = var61.getBackground();
    var2.setBackground(var75);
    var2.setLocation(111, 10);
    java.awt.Container var80 = var2.getFocusCycleRootAncestor();
    var2.setState(0);
    var2.repaint(100L, 111, 11, 3, 111);
    java.awt.Toolkit var89 = var2.getToolkit();
    java.util.Locale var90 = var2.getLocale();
    java.util.Set var92 = var2.getFocusTraversalKeys(0);
    javax.accessibility.AccessibleContext var93 = var2.getAccessibleContext();
    var2.setLocation(1, 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test81");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    javax.swing.plaf.PanelUI var13 = var5.getUI();
    var5.transferFocusDownCycle();
    var5.doLayout();
    tinymonkeys.vue.VueSingeErratique var21 = new tinymonkeys.vue.VueSingeErratique(1, 1, 10, (-1), 11);
    boolean var22 = var21.getFocusTraversalKeysEnabled();
    var21.removeNotify();
    java.awt.Dimension var24 = var21.getPreferredSize();
    var5.resize(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test82");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    boolean var13 = var5.isFocusTraversalPolicyProvider();
    boolean var16 = var5.contains(10, 111);
    java.awt.Dimension var17 = var5.minimumSize();
    tinymonkeys.vue.VueElement var23 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var24 = var23.getPeer();
    var23.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var23.repaint();
    java.lang.Object var30 = var23.getTreeLock();
    tinymonkeys.vue.VueElement var36 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var37 = var36.getPeer();
    var36.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var36.repaint();
    var36.updateUI();
    int var44 = var23.getComponentZOrder((java.awt.Component)var36);
    java.awt.Insets var45 = var23.getInsets();
    java.util.Locale var46 = var23.getLocale();
    var23.hide();
    java.awt.LayoutManager var48 = var23.getLayout();
    var5.setLayout(var48);
    boolean var50 = var5.isFocusTraversable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test83");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    var2.pack();
    java.awt.dnd.DropTarget var4 = var2.getDropTarget();
    var2.setFocusableWindowState(false);
    var2.setState(1920);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test84");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    javax.accessibility.AccessibleContext var3 = var2.getAccessibleContext();
    javax.accessibility.AccessibleContext var4 = var2.getAccessibleContext();
    boolean var5 = var2.isFocusCycleRoot();
    java.awt.MenuBar var6 = var2.getMenuBar();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test85");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.image.ColorModel var13 = var5.getColorModel();
    boolean var14 = var5.getAutoscrolls();
    var5.setIgnoreRepaint(true);
    java.awt.Rectangle var17 = var5.getVisibleRect();
    var5.enable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test86");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    int var3 = var2.getExtendedState();
    java.awt.Window.Type var4 = var2.getType();
    tinymonkeys.vue.VueElement var10 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var11 = var10.getPeer();
    javax.swing.InputMap var13 = var10.getInputMap(0);
    boolean var14 = var10.isDisplayable();
    boolean var15 = var10.getFocusTraversalKeysEnabled();
    java.awt.Dimension var16 = var10.getMaximumSize();
    var2.setMinimumSize(var16);
    tinymonkeys.controleur.Controller var19 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var20 = new tinymonkeys.vue.Fenetre("PanelUI", var19);
    tinymonkeys.vue.VueElement var26 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var32 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var33 = var26.isAncestorOf((java.awt.Component)var32);
    boolean var34 = var26.isFocusTraversalPolicyProvider();
    boolean var37 = var26.contains(10, 111);
    java.awt.Dimension var38 = var26.minimumSize();
    tinymonkeys.vue.VueElement var44 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var45 = var44.getPeer();
    var44.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var44.repaint();
    java.lang.Object var51 = var44.getTreeLock();
    tinymonkeys.vue.VueElement var57 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var58 = var57.getPeer();
    var57.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var57.repaint();
    var57.updateUI();
    int var65 = var44.getComponentZOrder((java.awt.Component)var57);
    java.awt.Insets var66 = var44.getInsets();
    java.util.Locale var67 = var44.getLocale();
    var44.hide();
    java.awt.LayoutManager var69 = var44.getLayout();
    var26.setLayout(var69);
    var20.setLayout(var69);
    java.awt.Color var72 = var20.getBackground();
    java.awt.Toolkit var73 = var20.getToolkit();
    javax.swing.TransferHandler var74 = var20.getTransferHandler();
    var20.setVisible(false);
    var20.setVisible(false);
    var2.addKeyListener((java.awt.event.KeyListener)var20);
    java.lang.Object var80 = var20.getTreeLock();
    var20.pack();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test87");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.revalidate();
    java.lang.String var7 = var5.toString();
    java.awt.Font var8 = var5.getFont();
    tinymonkeys.vue.VuePersonnage var14 = new tinymonkeys.vue.VuePersonnage((-1), (-1), 0, 1, 0);
    java.awt.Component var15 = var5.add((java.awt.Component)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]"+ "'", var7.equals("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test88");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    int var3 = var2.getExtendedState();
    java.awt.Component var4 = var2.getFocusOwner();
    var2.setBounds(0, 111, (-1), (-1));
    java.awt.LayoutManager var10 = var2.getLayout();
    var2.toBack();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test89");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.image.ColorModel var13 = var5.getColorModel();
    var5.setLocation(100, 1);
    var5.setFocusTraversalPolicyProvider(true);
    float var19 = var5.getAlignmentY();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.5f);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test90");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var1 = var0.getSingesErratiques();
    tinymonkeys.modele.Pirate var2 = var0.getPirate();
    tinymonkeys.modele.Ile var5 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var6 = new tinymonkeys.modele.BandeDeSingesErratiques(var5);
    tinymonkeys.modele.SingeErratique var7 = new tinymonkeys.modele.SingeErratique((-1), 11, var5);
    tinymonkeys.modele.Ile var8 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var9 = new tinymonkeys.modele.BandeDeSingesErratiques(var8);
    int[][] var10 = new int[][] { };
    var8.creationCarte(var10);
    var5.creationCarte(var10);
    tinymonkeys.modele.Ile var15 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var16 = new tinymonkeys.modele.BandeDeSingesErratiques(var15);
    tinymonkeys.modele.SingeErratique var17 = new tinymonkeys.modele.SingeErratique((-1), 11, var15);
    tinymonkeys.modele.Ile var18 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var19 = new tinymonkeys.modele.BandeDeSingesErratiques(var18);
    int[][] var20 = new int[][] { };
    var18.creationCarte(var20);
    var15.creationCarte(var20);
    var5.creationCarte(var20);
    var0.creationCarte(var20);
    tinymonkeys.modele.Ile var25 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var26 = var25.getSingesErratiques();
    tinymonkeys.modele.Pirate var27 = var25.getPirate();
    tinymonkeys.modele.Ile var30 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var31 = new tinymonkeys.modele.BandeDeSingesErratiques(var30);
    tinymonkeys.modele.SingeErratique var32 = new tinymonkeys.modele.SingeErratique((-1), 11, var30);
    tinymonkeys.modele.Ile var33 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var34 = new tinymonkeys.modele.BandeDeSingesErratiques(var33);
    int[][] var35 = new int[][] { };
    var33.creationCarte(var35);
    var30.creationCarte(var35);
    tinymonkeys.modele.Ile var40 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var41 = new tinymonkeys.modele.BandeDeSingesErratiques(var40);
    tinymonkeys.modele.SingeErratique var42 = new tinymonkeys.modele.SingeErratique((-1), 11, var40);
    tinymonkeys.modele.Ile var43 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var44 = new tinymonkeys.modele.BandeDeSingesErratiques(var43);
    int[][] var45 = new int[][] { };
    var43.creationCarte(var45);
    var40.creationCarte(var45);
    var30.creationCarte(var45);
    var25.creationCarte(var45);
    var0.creationCarte(var45);
    tinymonkeys.modele.Pirate var51 = new tinymonkeys.modele.Pirate(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.creationTresor();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test91");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var1 = new tinymonkeys.modele.BandeDeSingesErratiques(var0);
    int[][] var2 = new int[][] { };
    var0.creationCarte(var2);
    tinymonkeys.modele.Pirate var5 = new tinymonkeys.modele.Pirate(var0, "PanelUI");
    tinymonkeys.modele.Pirate var7 = new tinymonkeys.modele.Pirate(var0, "");
    tinymonkeys.modele.Pirate var8 = var0.getPirate();
    tinymonkeys.modele.Tresor var9 = var0.getTresor();
    tinymonkeys.modele.Pirate var11 = new tinymonkeys.modele.Pirate(var0, "PanelUI");
    tinymonkeys.modele.BandeDeSingesErratiques var12 = new tinymonkeys.modele.BandeDeSingesErratiques(var0);
    tinymonkeys.modele.Ile var15 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var16 = new tinymonkeys.modele.BandeDeSingesErratiques(var15);
    tinymonkeys.modele.SingeErratique var17 = new tinymonkeys.modele.SingeErratique((-1), 11, var15);
    tinymonkeys.modele.Ile var18 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var19 = new tinymonkeys.modele.BandeDeSingesErratiques(var18);
    int[][] var20 = new int[][] { };
    var18.creationCarte(var20);
    var15.creationCarte(var20);
    tinymonkeys.modele.Ile var23 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var24 = new tinymonkeys.modele.BandeDeSingesErratiques(var23);
    int[][] var25 = new int[][] { };
    var23.creationCarte(var25);
    var15.creationCarte(var25);
    tinymonkeys.controleur.Controller var29 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var30 = new tinymonkeys.vue.Fenetre("PanelUI", var29);
    tinymonkeys.vue.VueElement var36 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var42 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var43 = var36.isAncestorOf((java.awt.Component)var42);
    boolean var44 = var36.isFocusTraversalPolicyProvider();
    boolean var47 = var36.contains(10, 111);
    java.awt.Dimension var48 = var36.minimumSize();
    tinymonkeys.vue.VueElement var54 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var55 = var54.getPeer();
    var54.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var54.repaint();
    java.lang.Object var61 = var54.getTreeLock();
    tinymonkeys.vue.VueElement var67 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var68 = var67.getPeer();
    var67.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var67.repaint();
    var67.updateUI();
    int var75 = var54.getComponentZOrder((java.awt.Component)var67);
    java.awt.Insets var76 = var54.getInsets();
    java.util.Locale var77 = var54.getLocale();
    var54.hide();
    java.awt.LayoutManager var79 = var54.getLayout();
    var36.setLayout(var79);
    var30.setLayout(var79);
    java.awt.Color var82 = var30.getBackground();
    java.awt.MenuBar var83 = var30.getMenuBar();
    var15.enregistreEcIle((tinymonkeys.modele.IleEcouteur)var30);
    var12.enregistreEcBandeSinges((tinymonkeys.modele.BandeDeSingesErratiquesEcouteur)var30);
    java.awt.Point var86 = var30.getMousePosition();
    var30.list();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var86);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test92");


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
    tinymonkeys.vue.VueElement var61 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var67 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var68 = var61.isAncestorOf((java.awt.Component)var67);
    javax.swing.plaf.PanelUI var69 = var61.getUI();
    java.awt.Image var72 = var61.createImage(0, 1);
    var61.enable(true);
    java.awt.Color var75 = var61.getBackground();
    var2.setBackground(var75);
    var2.setLocation(111, 10);
    boolean var80 = var2.isLocationByPlatform();
    java.awt.Shape var81 = var2.getShape();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test93");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    tinymonkeys.vue.VueElement var18 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var19 = var18.getPeer();
    var18.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var18.repaint();
    var18.updateUI();
    int var26 = var5.getComponentZOrder((java.awt.Component)var18);
    java.awt.Insets var27 = var5.getInsets();
    boolean var28 = var5.requestFocusInWindow();
    boolean var29 = var5.getVerifyInputWhenFocusTarget();
    tinymonkeys.vue.VueElement var35 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var41 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var42 = var35.isAncestorOf((java.awt.Component)var41);
    javax.swing.plaf.PanelUI var43 = var35.getUI();
    java.awt.Image var46 = var35.createImage(0, 1);
    var35.enable(true);
    java.awt.Color var49 = var35.getBackground();
    var5.setBackground(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test94");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    int var3 = var2.getExtendedState();
    java.awt.Component var4 = var2.getFocusOwner();
    tinymonkeys.vue.VueElement var10 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var11 = var10.getPeer();
    var10.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var10.repaint();
    java.lang.Object var17 = var10.getTreeLock();
    java.awt.Component var20 = var10.locate(0, (-1));
    var10.setAlignmentX(0.5f);
    java.awt.Font var23 = var10.getFont();
    tinymonkeys.vue.VueElement var30 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var31 = var30.getUIClassID();
    float var32 = var30.getAlignmentX();
    boolean var33 = var30.isOptimizedDrawingEnabled();
    var10.putClientProperty((java.lang.Object)' ', (java.lang.Object)var33);
    var10.transferFocusBackward();
    java.awt.Dimension var36 = var10.getSize();
    var2.setSize(var36);
    float var38 = var2.getAlignmentY();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var40 = var2.getFocusTraversalKeys(99);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "PanelUI"+ "'", var31.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.5f);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test95");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    int var3 = var2.getExtendedState();
    java.awt.Window.Type var4 = var2.getType();
    tinymonkeys.vue.VueElement var10 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var11 = var10.getPeer();
    javax.swing.InputMap var13 = var10.getInputMap(0);
    boolean var14 = var10.isDisplayable();
    boolean var15 = var10.getFocusTraversalKeysEnabled();
    java.awt.Dimension var16 = var10.getMaximumSize();
    var2.setMinimumSize(var16);
    javax.swing.JLayeredPane var18 = var2.getLayeredPane();
    int var19 = var2.getState();
    boolean var20 = var2.isShowing();
    java.awt.Dimension var21 = var2.getMaximumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test96");


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
    tinymonkeys.vue.VueElement var60 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var61 = var60.getPeer();
    java.awt.Color var62 = var60.getForeground();
    var2.setBackground(var62);
    tinymonkeys.controleur.Controller var65 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var66 = new tinymonkeys.vue.Fenetre("PanelUI", var65);
    int var67 = var66.getExtendedState();
    java.awt.Window.Type var68 = var66.getType();
    var2.setType(var68);
    boolean var70 = var2.getFocusableWindowState();
    java.awt.Window.Type var71 = var2.getType();
    var2.toBack();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test97");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.revalidate();
    var5.setSize(0, 11);
    java.awt.Dimension var10 = var5.getMinimumSize();
    boolean var11 = var5.getAutoscrolls();
    float var12 = var5.getAlignmentX();
    int var13 = var5.getX();
    java.awt.Rectangle var14 = var5.bounds();
    boolean var17 = var5.inside(0, 0);
    var5.transferFocusBackward();
    var5.firePropertyChange("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]", 99, 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 111);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test98");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.setAlignmentX(0.5f);
    java.awt.Font var18 = var5.getFont();
    tinymonkeys.vue.VueElement var24 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var24.enable(true);
    tinymonkeys.vue.VueElement var32 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var33 = var32.getUIClassID();
    javax.swing.TransferHandler var34 = var32.getTransferHandler();
    java.awt.Color var35 = var32.getForeground();
    var24.setBackground(var35);
    var5.setForeground(var35);
    float var38 = var5.getAlignmentX();
    boolean var39 = var5.getAutoscrolls();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "PanelUI"+ "'", var33.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test99");


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
    tinymonkeys.vue.VueElement var61 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var67 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var68 = var61.isAncestorOf((java.awt.Component)var67);
    javax.swing.plaf.PanelUI var69 = var61.getUI();
    java.awt.Image var72 = var61.createImage(0, 1);
    var61.enable(true);
    java.awt.Color var75 = var61.getBackground();
    var2.setBackground(var75);
    var2.setLocation(111, 10);
    java.awt.Container var80 = var2.getFocusCycleRootAncestor();
    var2.setState(0);
    int var83 = var2.getState();
    java.beans.PropertyChangeListener[] var84 = var2.getPropertyChangeListeners();
    java.awt.event.WindowStateListener[] var85 = var2.getWindowStateListeners();
    boolean var86 = var2.isValidateRoot();
    var2.setTitle("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,hidden,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777216,maximumSize=,minimumSize=,preferredSize=]");
    java.util.List var89 = var2.getIconImages();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test100");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.setAlignmentX(0.5f);
    java.awt.Font var18 = var5.getFont();
    boolean var19 = var5.isRequestFocusEnabled();
    var5.repaint((-1L));
    var5.enable();
    boolean var23 = var5.isFocusable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test101");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var6 = var5.getUIClassID();
    java.awt.peer.ComponentPeer var7 = var5.getPeer();
    java.beans.VetoableChangeListener[] var8 = var5.getVetoableChangeListeners();
    boolean var9 = var5.isShowing();
    tinymonkeys.vue.VueElement var15 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var16 = var15.getPeer();
    var15.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var15.repaint();
    java.lang.Object var22 = var15.getTreeLock();
    java.awt.Component var25 = var15.locate(0, (-1));
    var15.requestFocus();
    tinymonkeys.vue.VueElement var32 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var33 = var32.getPeer();
    var32.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var32.repaint();
    java.lang.Object var39 = var32.getTreeLock();
    java.awt.image.ColorModel var40 = var32.getColorModel();
    boolean var41 = var32.getVerifyInputWhenFocusTarget();
    var32.firePropertyChange("hi!", '4', 'a');
    java.awt.Rectangle var46 = var32.getBounds();
    var15.paintImmediately(var46);
    var15.removeAll();
    java.awt.Color var49 = var15.getBackground();
    java.awt.Font var50 = var15.getFont();
    var5.setFont(var50);
    java.lang.String var52 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "PanelUI"+ "'", var6.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]"+ "'", var52.equals("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]"));

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test102");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    tinymonkeys.vue.VueElement var18 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var19 = var18.getPeer();
    var18.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var18.repaint();
    var18.updateUI();
    int var26 = var5.getComponentZOrder((java.awt.Component)var18);
    java.awt.Insets var27 = var5.getInsets();
    java.util.Locale var28 = var5.getLocale();
    var5.setFocusCycleRoot(false);
    var5.removeNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test103");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    boolean var13 = var5.isFocusTraversalPolicyProvider();
    boolean var16 = var5.contains(10, 111);
    java.awt.Dimension var17 = var5.minimumSize();
    tinymonkeys.vue.VueElement var23 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var24 = var23.getPeer();
    var23.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var23.repaint();
    java.lang.Object var30 = var23.getTreeLock();
    tinymonkeys.vue.VueElement var36 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var37 = var36.getPeer();
    var36.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var36.repaint();
    var36.updateUI();
    int var44 = var23.getComponentZOrder((java.awt.Component)var36);
    java.awt.Insets var45 = var23.getInsets();
    java.util.Locale var46 = var23.getLocale();
    var23.hide();
    java.awt.LayoutManager var48 = var23.getLayout();
    var5.setLayout(var48);
    java.awt.Dimension var50 = var5.getMaximumSize();
    java.lang.String var51 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]"+ "'", var51.equals("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]"));

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test104");


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
    java.awt.Graphics var54 = var2.getGraphics();
    var2.setResizable(false);
    java.awt.MenuBar var57 = var2.getMenuBar();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test105");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(10, 0, 10, (-1), (-1));
    java.awt.Dimension var6 = var5.getPreferredSize();
    tinymonkeys.vue.VueElement var13 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var14 = var13.getPeer();
    var13.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var13.repaint();
    java.lang.Object var20 = var13.getTreeLock();
    java.awt.Component var23 = var13.locate(0, (-1));
    var13.setAlignmentX(0.5f);
    java.awt.Font var26 = var13.getFont();
    tinymonkeys.vue.VueElement var32 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var32.enable(true);
    tinymonkeys.vue.VueElement var40 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var41 = var40.getUIClassID();
    javax.swing.TransferHandler var42 = var40.getTransferHandler();
    java.awt.Color var43 = var40.getForeground();
    var32.setBackground(var43);
    var13.setForeground(var43);
    java.awt.Insets var46 = var13.insets();
    boolean var47 = var13.isMaximumSizeSet();
    javax.accessibility.AccessibleContext var48 = var13.getAccessibleContext();
    var13.setAutoscrolls(false);
    java.awt.Dimension var51 = var13.getMaximumSize();
    java.awt.Component var52 = var5.add("tinymonkeys.vue.VueSingeErratique[,1,22,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]", (java.awt.Component)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.remove(3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "PanelUI"+ "'", var41.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test106");


    tinymonkeys.modele.Ile var2 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var3 = new tinymonkeys.modele.BandeDeSingesErratiques(var2);
    tinymonkeys.modele.SingeErratique var4 = new tinymonkeys.modele.SingeErratique((-1), 11, var2);
    tinymonkeys.modele.Tresor var5 = var2.getTresor();
    tinymonkeys.modele.Ile var8 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var9 = new tinymonkeys.modele.BandeDeSingesErratiques(var8);
    tinymonkeys.modele.SingeErratique var10 = new tinymonkeys.modele.SingeErratique((-1), 11, var8);
    tinymonkeys.modele.Ile var11 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var12 = new tinymonkeys.modele.BandeDeSingesErratiques(var11);
    int[][] var13 = new int[][] { };
    var11.creationCarte(var13);
    var8.creationCarte(var13);
    tinymonkeys.modele.Ile var16 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var17 = new tinymonkeys.modele.BandeDeSingesErratiques(var16);
    int[][] var18 = new int[][] { };
    var16.creationCarte(var18);
    var8.creationCarte(var18);
    tinymonkeys.controleur.Controller var22 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var23 = new tinymonkeys.vue.Fenetre("PanelUI", var22);
    tinymonkeys.vue.VueElement var29 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var35 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var36 = var29.isAncestorOf((java.awt.Component)var35);
    boolean var37 = var29.isFocusTraversalPolicyProvider();
    boolean var40 = var29.contains(10, 111);
    java.awt.Dimension var41 = var29.minimumSize();
    tinymonkeys.vue.VueElement var47 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var48 = var47.getPeer();
    var47.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var47.repaint();
    java.lang.Object var54 = var47.getTreeLock();
    tinymonkeys.vue.VueElement var60 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var61 = var60.getPeer();
    var60.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var60.repaint();
    var60.updateUI();
    int var68 = var47.getComponentZOrder((java.awt.Component)var60);
    java.awt.Insets var69 = var47.getInsets();
    java.util.Locale var70 = var47.getLocale();
    var47.hide();
    java.awt.LayoutManager var72 = var47.getLayout();
    var29.setLayout(var72);
    var23.setLayout(var72);
    java.awt.Color var75 = var23.getBackground();
    java.awt.MenuBar var76 = var23.getMenuBar();
    var8.enregistreEcIle((tinymonkeys.modele.IleEcouteur)var23);
    var2.enregistreEcIle((tinymonkeys.modele.IleEcouteur)var23);
    java.awt.Rectangle var79 = var23.getMaximizedBounds();
    javax.swing.JLayeredPane var80 = var23.getLayeredPane();
    boolean var81 = var23.isFocusableWindow();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == true);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test107");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.Pirate var1 = var0.getPirate();
    int var2 = var1.getX();
    var1.demandeDeplacement(10, (-1));
    tinymonkeys.controleur.Controller var7 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var8 = new tinymonkeys.vue.Fenetre("PanelUI", var7);
    tinymonkeys.vue.VueElement var14 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var20 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var21 = var14.isAncestorOf((java.awt.Component)var20);
    boolean var22 = var14.isFocusTraversalPolicyProvider();
    boolean var25 = var14.contains(10, 111);
    java.awt.Dimension var26 = var14.minimumSize();
    tinymonkeys.vue.VueElement var32 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var33 = var32.getPeer();
    var32.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var32.repaint();
    java.lang.Object var39 = var32.getTreeLock();
    tinymonkeys.vue.VueElement var45 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var46 = var45.getPeer();
    var45.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var45.repaint();
    var45.updateUI();
    int var53 = var32.getComponentZOrder((java.awt.Component)var45);
    java.awt.Insets var54 = var32.getInsets();
    java.util.Locale var55 = var32.getLocale();
    var32.hide();
    java.awt.LayoutManager var57 = var32.getLayout();
    var14.setLayout(var57);
    var8.setLayout(var57);
    java.awt.Color var60 = var8.getBackground();
    java.awt.Toolkit var61 = var8.getToolkit();
    javax.swing.TransferHandler var62 = var8.getTransferHandler();
    var8.setVisible(false);
    var8.setVisible(false);
    var1.enregistreEcPirate((tinymonkeys.modele.PirateEcouteur)var8);
    var8.setAutoRequestFocus(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test108");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.resize((-1), 0);
    var5.setDoubleBuffered(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test109");


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
    var2.setVisible(false);
    boolean var59 = var2.isFocusCycleRoot();
    javax.swing.JLayeredPane var60 = var2.getLayeredPane();
    var2.transferFocusDownCycle();
    int var62 = var2.getState();
    var2.show();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test110");


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
    var2.setVisible(false);
    boolean var59 = var2.isFocusCycleRoot();
    java.awt.MenuBar var60 = var2.getMenuBar();
    boolean var61 = var2.isValidateRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test111");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    boolean var13 = var5.isFocusTraversalPolicyProvider();
    java.awt.event.MouseMotionListener[] var14 = var5.getMouseMotionListeners();
    javax.swing.ActionMap var15 = var5.getActionMap();
    boolean var16 = var5.isFontSet();
    java.lang.Object var17 = var5.getTreeLock();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test112");


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
    tinymonkeys.vue.VueElement var60 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var61 = var60.getPeer();
    java.awt.Color var62 = var60.getForeground();
    var2.setBackground(var62);
    boolean var64 = var2.isAutoRequestFocus();
    boolean var65 = var2.isAutoRequestFocus();
    var2.enable();
    var2.setLocationByPlatform(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test113");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.resize((-1), 0);
    var5.transferFocusDownCycle();
    javax.swing.KeyStroke[] var20 = var5.getRegisteredKeyStrokes();
    tinymonkeys.vue.VueElement var26 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var32 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var33 = var26.isAncestorOf((java.awt.Component)var32);
    boolean var34 = var26.isFocusTraversalPolicyProvider();
    boolean var37 = var26.contains(10, 111);
    var5.remove((java.awt.Component)var26);
    tinymonkeys.vue.VueElement var44 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var45 = var44.getPeer();
    javax.swing.InputMap var47 = var44.getInputMap(0);
    tinymonkeys.vue.VueElement var54 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var55 = var54.getPeer();
    javax.swing.InputMap var57 = var54.getInputMap(0);
    java.awt.Component.BaselineResizeBehavior var58 = var54.getBaselineResizeBehavior();
    boolean var59 = var54.isPreferredSizeSet();
    java.awt.Component var60 = var44.add("", (java.awt.Component)var54);
    java.awt.Container var61 = var60.getParent();
    tinymonkeys.vue.VueElement var67 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var68 = var67.getPeer();
    var67.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var67.repaint();
    java.lang.Object var74 = var67.getTreeLock();
    tinymonkeys.vue.VueElement var80 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var81 = var80.getPeer();
    var80.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var80.repaint();
    var80.updateUI();
    int var88 = var67.getComponentZOrder((java.awt.Component)var80);
    java.awt.Insets var89 = var67.getInsets();
    java.util.Locale var90 = var67.getLocale();
    var67.hide();
    java.awt.LayoutManager var92 = var67.getLayout();
    java.awt.Rectangle var93 = var67.bounds();
    var61.setBounds(var93);
    var5.scrollRectToVisible(var93);
    java.awt.event.MouseMotionListener[] var96 = var5.getMouseMotionListeners();
    java.lang.String var97 = var5.getToolTipText();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var97);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test114");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(0, 0, 1, 1, 11);
    java.awt.Component var8 = var5.locate(11, 10);
    java.awt.Container var9 = var5.getParent();
    var5.setAlignmentX(0.5f);
    java.awt.peer.ComponentPeer var12 = var5.getPeer();
    tinymonkeys.vue.VueElement var18 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var24 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var25 = var18.isAncestorOf((java.awt.Component)var24);
    java.awt.im.InputContext var26 = var24.getInputContext();
    boolean var27 = var24.isRequestFocusEnabled();
    java.awt.event.KeyListener[] var28 = var24.getKeyListeners();
    java.util.Locale var29 = var24.getLocale();
    var5.setLocale(var29);
    var5.firePropertyChange("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]", 100.0d, 0.0d);
    var5.setAutoscrolls(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test115");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.enable(true);
    tinymonkeys.vue.VueElement var13 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var14 = var13.getUIClassID();
    tinymonkeys.vue.VueElement var20 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var21 = var20.getPeer();
    var20.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var20.transferFocusUpCycle();
    boolean var27 = var20.getInheritsPopupMenu();
    tinymonkeys.vue.VueElement var33 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var34 = var33.getPeer();
    var33.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var33.repaint();
    java.lang.Object var40 = var33.getTreeLock();
    tinymonkeys.vue.VueElement var46 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var47 = var46.getPeer();
    var46.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var46.repaint();
    var46.updateUI();
    int var54 = var33.getComponentZOrder((java.awt.Component)var46);
    var13.add((java.awt.Component)var20, (java.lang.Object)var33);
    boolean var56 = var5.isFocusCycleRoot((java.awt.Container)var20);
    var20.setInheritsPopupMenu(false);
    java.awt.Image var61 = var20.createImage(11, 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "PanelUI"+ "'", var14.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test116");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.setAlignmentX(0.5f);
    java.awt.Font var18 = var5.getFont();
    boolean var19 = var5.isRequestFocusEnabled();
    int var20 = var5.getHeight();
    java.awt.Rectangle var21 = var5.getBounds();
    var5.doLayout();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test117");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    boolean var13 = var5.isFocusTraversalPolicyProvider();
    boolean var14 = var5.isShowing();
    boolean var15 = var5.isFocusTraversalPolicySet();
    var5.move(1, 10);
    java.awt.image.ColorModel var19 = var5.getColorModel();
    java.awt.Dimension var20 = var5.getPreferredSize();
    var5.setOpaque(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test118");


    tinymonkeys.vue.VueSingeErratique var5 = new tinymonkeys.vue.VueSingeErratique(1, 1, 10, (-1), 11);
    boolean var6 = var5.getFocusTraversalKeysEnabled();
    var5.removeNotify();
    java.awt.Component var10 = var5.getComponentAt(0, 0);
    var5.setSize((-1), 100);
    tinymonkeys.vue.VueElement var20 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var21 = var20.getPeer();
    var20.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var20.repaint();
    java.lang.Object var27 = var20.getTreeLock();
    tinymonkeys.vue.VueElement var33 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var34 = var33.getPeer();
    var33.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var33.repaint();
    var33.updateUI();
    int var41 = var20.getComponentZOrder((java.awt.Component)var33);
    tinymonkeys.vue.VueElement var47 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var48 = var47.getPeer();
    var47.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var47.transferFocusUpCycle();
    boolean var54 = var47.getInheritsPopupMenu();
    java.awt.Dimension var55 = var47.minimumSize();
    java.awt.Dimension var56 = var33.getSize(var55);
    boolean var57 = var33.isDisplayable();
    java.awt.Component var58 = var5.add("tinymonkeys.vue.VueSingeErratique[,1,22,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]", (java.awt.Component)var33);
    var33.setFocusTraversalKeysEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test119");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    javax.swing.InputMap var8 = var5.getInputMap(0);
    tinymonkeys.vue.VueElement var15 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var16 = var15.getPeer();
    javax.swing.InputMap var18 = var15.getInputMap(0);
    java.awt.Component.BaselineResizeBehavior var19 = var15.getBaselineResizeBehavior();
    boolean var20 = var15.isPreferredSizeSet();
    java.awt.Component var21 = var5.add("", (java.awt.Component)var15);
    java.awt.Cursor var22 = var15.getCursor();
    tinymonkeys.vue.VueElement var28 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var29 = var28.getPeer();
    var28.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var28.repaint();
    java.lang.Object var35 = var28.getTreeLock();
    java.awt.image.ColorModel var36 = var28.getColorModel();
    var28.setLocation(100, 1);
    boolean var40 = var28.isDoubleBuffered();
    java.util.Locale var41 = var28.getLocale();
    java.awt.Dimension var42 = var28.getMaximumSize();
    tinymonkeys.vue.VueElement var48 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var49 = var48.getPeer();
    var48.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var48.repaint();
    java.lang.Object var55 = var48.getTreeLock();
    java.awt.image.ColorModel var56 = var48.getColorModel();
    boolean var57 = var48.getVerifyInputWhenFocusTarget();
    int var58 = var48.getWidth();
    java.util.Locale var59 = var48.getLocale();
    var28.setLocale(var59);
    javax.swing.plaf.PanelUI var61 = var28.getUI();
    tinymonkeys.vue.VueElement var67 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var73 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var74 = var67.isAncestorOf((java.awt.Component)var73);
    java.awt.Point var75 = var73.location();
    java.awt.Point var76 = var28.getLocation(var75);
    java.awt.Point var77 = var15.getLocation(var75);
    var15.revalidate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test120");


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
    tinymonkeys.vue.VueElement var60 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var61 = var60.getPeer();
    java.awt.Color var62 = var60.getForeground();
    var2.setBackground(var62);
    boolean var64 = var2.isShowing();
    var2.setOpacity(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test121");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.image.ColorModel var13 = var5.getColorModel();
    var5.setLocation(100, 1);
    java.lang.String var17 = var5.getName();
    var5.setIgnoreRepaint(true);
    boolean var20 = var5.isVisible();
    java.awt.Insets var21 = var5.getInsets();
    boolean var22 = var5.isManagingFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test122");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.image.ColorModel var13 = var5.getColorModel();
    var5.setLocation(100, 1);
    tinymonkeys.vue.VueElement var22 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var23 = var22.getUIClassID();
    javax.swing.TransferHandler var24 = var22.getTransferHandler();
    java.awt.Color var25 = var22.getForeground();
    var5.setForeground(var25);
    boolean var27 = var5.getIgnoreRepaint();
    var5.repaint(0L, 11, (-1), 111, 10);
    var5.setFocusTraversalPolicyProvider(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var37 = var5.getComponent(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "PanelUI"+ "'", var23.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test123");


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
    java.awt.Container var89 = var6.getFocusCycleRootAncestor();
    var6.setUndecorated(false);
    var6.repaint(1920, 1920, 111, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test124");


    tinymonkeys.modele.Ile var2 = new tinymonkeys.modele.Ile();
    int[][] var3 = var2.getCarte();
    tinymonkeys.modele.SingeErratique var4 = new tinymonkeys.modele.SingeErratique(111, 10, var2);
    boolean var7 = var2.singeEstPresent(10, 11);
    var2.demandeDeplacementPirate(10, 1);
    tinymonkeys.modele.Pirate var11 = var2.getPirate();
    int var12 = var11.getY();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test125");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.resize((-1), 0);
    var5.transferFocusDownCycle();
    var5.setDebugGraphicsOptions(1);
    boolean var22 = var5.isShowing();
    java.beans.PropertyChangeListener[] var23 = var5.getPropertyChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test126");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    javax.swing.InputMap var8 = var5.getInputMap(0);
    tinymonkeys.vue.VueElement var14 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var15 = var14.getPeer();
    javax.swing.InputMap var17 = var14.getInputMap(0);
    boolean var18 = var14.isShowing();
    java.awt.dnd.DropTarget var19 = var14.getDropTarget();
    java.awt.Component var20 = var5.add((java.awt.Component)var14);
    boolean var23 = var14.inside(11, 0);
    var14.setIgnoreRepaint(true);
    java.awt.event.ComponentListener[] var26 = var14.getComponentListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test127");


    tinymonkeys.vue.VueSingeErratique var5 = new tinymonkeys.vue.VueSingeErratique(1, 1, 10, (-1), 11);
    java.awt.GraphicsConfiguration var6 = var5.getGraphicsConfiguration();
    tinymonkeys.vue.VueElement var12 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var18 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var18.revalidate();
    var18.setSize(0, 11);
    java.awt.Dimension var23 = var18.getMinimumSize();
    java.awt.Dimension var24 = var12.getSize(var23);
    var5.resize(var23);
    java.awt.Component var28 = var5.locate((-1), 1);
    var5.setPosition(10, 111);
    int var32 = var5.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test128");


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
    tinymonkeys.vue.VueElement var61 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var67 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var68 = var61.isAncestorOf((java.awt.Component)var67);
    javax.swing.plaf.PanelUI var69 = var61.getUI();
    java.awt.Image var72 = var61.createImage(0, 1);
    var61.enable(true);
    java.awt.Color var75 = var61.getBackground();
    var2.setBackground(var75);
    var2.setLocation(111, 10);
    java.awt.Container var80 = var2.getFocusCycleRootAncestor();
    var2.setState(0);
    var2.repaint(100L, 111, 11, 3, 111);
    java.lang.String var89 = var2.getWarningString();
    java.awt.event.KeyListener[] var90 = var2.getKeyListeners();
    boolean var91 = var2.getFocusTraversalKeysEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == true);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test129");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.image.ColorModel var13 = var5.getColorModel();
    java.awt.Dimension var14 = var5.minimumSize();
    java.awt.event.HierarchyBoundsListener[] var15 = var5.getHierarchyBoundsListeners();
    javax.swing.InputVerifier var16 = var5.getInputVerifier();
    javax.accessibility.AccessibleContext var17 = var5.getAccessibleContext();
    java.awt.image.ColorModel var18 = var5.getColorModel();
    var5.firePropertyChange("", 3, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test130");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    int var3 = var2.getCursorType();
    java.awt.Rectangle var4 = var2.getMaximizedBounds();
    boolean var5 = var2.isFocusCycleRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test131");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.setAlignmentX(0.5f);
    java.awt.Font var18 = var5.getFont();
    boolean var19 = var5.isRequestFocusEnabled();
    boolean var20 = var5.isFocusOwner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test132");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    int var3 = var2.getExtendedState();
    java.awt.Component var4 = var2.getFocusOwner();
    var2.setBounds(0, 111, (-1), (-1));
    boolean var10 = var2.isShowing();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test133");


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
    tinymonkeys.vue.VueElement var60 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var61 = var60.getPeer();
    java.awt.Color var62 = var60.getForeground();
    var2.setBackground(var62);
    boolean var64 = var2.isAutoRequestFocus();
    boolean var65 = var2.isAutoRequestFocus();
    java.awt.MenuBar var66 = var2.getMenuBar();
    boolean var67 = var2.isAlwaysOnTopSupported();
    javax.swing.TransferHandler var68 = var2.getTransferHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test134");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    int var7 = var5.getHeight();
    boolean var8 = var5.getFocusTraversalKeysEnabled();
    tinymonkeys.vue.VueElement var14 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var14.revalidate();
    java.lang.String var16 = var14.toString();
    boolean var17 = var14.isFocusTraversalPolicyProvider();
    var14.repaint((-1), 1, 100, 100);
    java.lang.Object var23 = var5.getClientProperty((java.lang.Object)100);
    javax.swing.JToolTip var24 = var5.createToolTip();
    boolean var25 = var24.isOptimizedDrawingEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]"+ "'", var16.equals("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test135");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.image.ColorModel var13 = var5.getColorModel();
    var5.setLocation(100, 1);
    tinymonkeys.vue.VueElement var22 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var23 = var22.getUIClassID();
    javax.swing.TransferHandler var24 = var22.getTransferHandler();
    java.awt.Color var25 = var22.getForeground();
    var5.setForeground(var25);
    boolean var27 = var5.getIgnoreRepaint();
    boolean var28 = var5.isVisible();
    java.awt.event.MouseWheelListener[] var29 = var5.getMouseWheelListeners();
    boolean var30 = var5.isFocusTraversable();
    tinymonkeys.vue.VueElement var36 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var37 = var36.getPeer();
    var36.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var36.repaint();
    java.lang.Object var43 = var36.getTreeLock();
    java.awt.Component var46 = var36.locate(0, (-1));
    var36.addNotify();
    tinymonkeys.controleur.Controller var49 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var50 = new tinymonkeys.vue.Fenetre("PanelUI", var49);
    var50.pack();
    var50.addNotify();
    java.awt.Graphics var53 = var50.getGraphics();
    var36.printComponents(var53);
    var5.printComponents(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "PanelUI"+ "'", var23.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test136");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.transferFocusUpCycle();
    tinymonkeys.vue.VueElement var17 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var18 = var17.getPeer();
    var17.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var17.repaint();
    java.lang.Object var24 = var17.getTreeLock();
    java.awt.event.HierarchyListener[] var25 = var17.getHierarchyListeners();
    boolean var26 = var5.isAncestorOf((java.awt.Component)var17);
    var5.setRequestFocusEnabled(true);
    var5.paintImmediately(111, 0, 3, (-1));
    var5.removeAll();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test137");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    javax.swing.plaf.PanelUI var13 = var5.getUI();
    var5.transferFocusDownCycle();
    var5.doLayout();
    tinymonkeys.vue.VueElement var21 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var22 = var21.getPeer();
    var21.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var21.repaint();
    java.lang.Object var28 = var21.getTreeLock();
    java.awt.image.ColorModel var29 = var21.getColorModel();
    var21.setLocation(100, 1);
    boolean var33 = var21.isDoubleBuffered();
    java.util.Locale var34 = var21.getLocale();
    java.awt.Dimension var35 = var21.getMaximumSize();
    tinymonkeys.vue.VueElement var41 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var42 = var41.getPeer();
    var41.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var41.repaint();
    java.lang.Object var48 = var41.getTreeLock();
    java.awt.image.ColorModel var49 = var41.getColorModel();
    boolean var50 = var41.getVerifyInputWhenFocusTarget();
    int var51 = var41.getWidth();
    java.util.Locale var52 = var41.getLocale();
    var21.setLocale(var52);
    javax.swing.JComponent.setDefaultLocale(var52);
    javax.swing.JComponent.setDefaultLocale(var52);
    var5.setLocale(var52);
    java.awt.Component.BaselineResizeBehavior var57 = var5.getBaselineResizeBehavior();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test138");


    tinymonkeys.vue.VueSingeErratique var5 = new tinymonkeys.vue.VueSingeErratique(1, 1, 10, (-1), 11);
    boolean var6 = var5.isFocusTraversalPolicySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test139");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var6 = var5.getUIClassID();
    boolean var7 = var5.isFontSet();
    float var8 = var5.getAlignmentY();
    tinymonkeys.vue.VueElement var14 = new tinymonkeys.vue.VueElement(0, 0, 1, 1, 11);
    java.awt.Component var17 = var14.locate(11, 10);
    tinymonkeys.vue.VueElement var23 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var24 = var23.getPeer();
    var23.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var23.repaint();
    var23.updateUI();
    var23.show(false);
    float var33 = var23.getAlignmentY();
    java.awt.Rectangle var34 = var23.bounds();
    java.awt.Rectangle var35 = var14.getBounds(var34);
    var5.setBounds(var34);
    boolean var37 = var5.isOptimizedDrawingEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "PanelUI"+ "'", var6.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test140");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.image.ColorModel var13 = var5.getColorModel();
    var5.setLocation(100, 1);
    boolean var17 = var5.isMaximumSizeSet();
    boolean var18 = var5.isOpaque();
    boolean var20 = var5.requestFocus(false);
    var5.setVerifyInputWhenFocusTarget(false);
    int var23 = var5.getX();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 100);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test141");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.revalidate();
    var5.setSize(0, 11);
    java.awt.Dimension var10 = var5.getMinimumSize();
    boolean var11 = var5.getAutoscrolls();
    var5.firePropertyChange("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]", 1920, 111);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test142");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.setAlignmentX(0.5f);
    java.awt.Font var18 = var5.getFont();
    boolean var19 = var5.isRequestFocusEnabled();
    var5.setVerifyInputWhenFocusTarget(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test143");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.Pirate var1 = var0.getPirate();
    tinymonkeys.modele.BandeDeSingesErratiques var2 = var0.getSingesErratiques();
    tinymonkeys.controleur.Controller var4 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var5 = new tinymonkeys.vue.Fenetre("PanelUI", var4);
    var5.pack();
    var5.addNotify();
    var2.enregistreEcBandeSinges((tinymonkeys.modele.BandeDeSingesErratiquesEcouteur)var5);
    int var9 = var5.getExtendedState();
    var5.toBack();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test144");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.repaint();
    boolean var17 = var5.requestFocusInWindow();
    var5.setVerifyInputWhenFocusTarget(true);
    javax.swing.ActionMap var20 = var5.getActionMap();
    var5.requestFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test145");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.image.ColorModel var13 = var5.getColorModel();
    var5.setLocation(100, 1);
    boolean var17 = var5.isMaximumSizeSet();
    boolean var18 = var5.isOpaque();
    tinymonkeys.vue.VueElement var24 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var30 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var31 = var24.isAncestorOf((java.awt.Component)var30);
    boolean var32 = var24.isFocusTraversalPolicyProvider();
    java.awt.event.MouseMotionListener[] var33 = var24.getMouseMotionListeners();
    javax.swing.ActionMap var34 = var24.getActionMap();
    tinymonkeys.vue.VueElement var40 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var41 = var40.getPeer();
    var40.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var40.repaint();
    java.lang.Object var47 = var40.getTreeLock();
    java.awt.Component var50 = var40.locate(0, (-1));
    var40.setAlignmentX(0.5f);
    java.awt.Font var53 = var40.getFont();
    tinymonkeys.vue.VueElement var60 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var61 = var60.getUIClassID();
    float var62 = var60.getAlignmentX();
    boolean var63 = var60.isOptimizedDrawingEnabled();
    var40.putClientProperty((java.lang.Object)' ', (java.lang.Object)var63);
    tinymonkeys.vue.VueElement var70 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var71 = var70.getPeer();
    var70.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var70.repaint();
    java.lang.Object var77 = var70.getTreeLock();
    java.awt.Component var80 = var70.locate(0, (-1));
    var70.setAlignmentX(0.5f);
    java.awt.Font var83 = var70.getFont();
    java.awt.FontMetrics var84 = var40.getFontMetrics(var83);
    java.awt.FontMetrics var85 = var24.getFontMetrics(var83);
    java.awt.FontMetrics var86 = var5.getFontMetrics(var83);
    java.awt.event.ComponentListener[] var87 = var5.getComponentListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "PanelUI"+ "'", var61.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test146");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.resize((-1), 0);
    var5.transferFocusDownCycle();
    var5.setDebugGraphicsOptions(1);
    java.awt.Dimension var22 = var5.getMaximumSize();
    int var23 = var5.countComponents();
    java.lang.String var24 = var5.getToolTipText();
    var5.setFocusTraversalKeysEnabled(true);
    var5.setAutoscrolls(false);
    var5.setDimensions(111, 1920, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test147");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    boolean var13 = var5.isFocusTraversalPolicyProvider();
    boolean var14 = var5.isShowing();
    boolean var15 = var5.isFocusTraversalPolicySet();
    var5.move(1, 10);
    java.awt.image.ColorModel var19 = var5.getColorModel();
    java.awt.Dimension var20 = var5.getPreferredSize();
    boolean var21 = var5.isDoubleBuffered();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test148");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.image.ColorModel var13 = var5.getColorModel();
    var5.setLocation(100, 1);
    boolean var17 = var5.isMaximumSizeSet();
    java.lang.String var18 = var5.getUIClassID();
    java.awt.event.ContainerListener[] var19 = var5.getContainerListeners();
    var5.show();
    java.awt.Point var22 = var5.getMousePosition(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "PanelUI"+ "'", var18.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test149");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.setAlignmentX(0.5f);
    java.awt.Font var18 = var5.getFont();
    tinymonkeys.vue.VueElement var24 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var24.enable(true);
    tinymonkeys.vue.VueElement var32 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var33 = var32.getUIClassID();
    javax.swing.TransferHandler var34 = var32.getTransferHandler();
    java.awt.Color var35 = var32.getForeground();
    var24.setBackground(var35);
    var5.setForeground(var35);
    java.awt.Insets var38 = var5.insets();
    boolean var39 = var5.isMaximumSizeSet();
    boolean var40 = var5.isFocusable();
    boolean var41 = var5.isLightweight();
    java.awt.Toolkit var42 = var5.getToolkit();
    javax.swing.InputMap var43 = var5.getInputMap();
    var5.revalidate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "PanelUI"+ "'", var33.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test150");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var1 = new tinymonkeys.modele.BandeDeSingesErratiques(var0);
    int[][] var2 = new int[][] { };
    var0.creationCarte(var2);
    tinymonkeys.modele.Pirate var5 = new tinymonkeys.modele.Pirate(var0, "PanelUI");
    tinymonkeys.modele.Pirate var7 = new tinymonkeys.modele.Pirate(var0, "");
    tinymonkeys.modele.Pirate var8 = var0.getPirate();
    tinymonkeys.modele.Tresor var9 = var0.getTresor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.creationTresor();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test151");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.Pirate var1 = var0.getPirate();
    java.lang.String var2 = var1.getAvatar();
    javax.swing.event.EventListenerList var3 = var1.getPirateEcouteurs();
    int var4 = var1.getX();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test152");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.image.ColorModel var13 = var5.getColorModel();
    var5.setLocation(100, 1);
    boolean var17 = var5.isMaximumSizeSet();
    java.lang.String var18 = var5.getUIClassID();
    java.awt.event.ContainerListener[] var19 = var5.getContainerListeners();
    var5.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "PanelUI"+ "'", var18.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test153");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    tinymonkeys.vue.VueElement var18 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var19 = var18.getPeer();
    var18.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var18.repaint();
    var18.updateUI();
    int var26 = var5.getComponentZOrder((java.awt.Component)var18);
    java.awt.Insets var27 = var5.getInsets();
    java.util.Locale var28 = var5.getLocale();
    var5.setFocusCycleRoot(false);
    tinymonkeys.vue.VueElement var36 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var36.enable(true);
    tinymonkeys.vue.VueElement var44 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var45 = var44.getUIClassID();
    tinymonkeys.vue.VueElement var51 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var52 = var51.getPeer();
    var51.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var51.transferFocusUpCycle();
    boolean var58 = var51.getInheritsPopupMenu();
    tinymonkeys.vue.VueElement var64 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var65 = var64.getPeer();
    var64.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var64.repaint();
    java.lang.Object var71 = var64.getTreeLock();
    tinymonkeys.vue.VueElement var77 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var78 = var77.getPeer();
    var77.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var77.repaint();
    var77.updateUI();
    int var85 = var64.getComponentZOrder((java.awt.Component)var77);
    var44.add((java.awt.Component)var51, (java.lang.Object)var64);
    boolean var87 = var36.isFocusCycleRoot((java.awt.Container)var51);
    boolean var88 = var5.isAncestorOf((java.awt.Component)var51);
    var5.nextFocus();
    java.awt.Insets var90 = var5.getInsets();
    float var91 = var5.getAlignmentX();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "PanelUI"+ "'", var45.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == 0.5f);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test154");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.Pirate var1 = var0.getPirate();
    tinymonkeys.modele.BandeDeSingesErratiques var2 = var0.getSingesErratiques();
    var2.ajoutSingesErratiques(0);
    tinymonkeys.controleur.Controller var6 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var7 = new tinymonkeys.vue.Fenetre("PanelUI", var6);
    tinymonkeys.vue.VueElement var13 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var19 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var20 = var13.isAncestorOf((java.awt.Component)var19);
    boolean var21 = var13.isFocusTraversalPolicyProvider();
    boolean var24 = var13.contains(10, 111);
    java.awt.Dimension var25 = var13.minimumSize();
    tinymonkeys.vue.VueElement var31 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var32 = var31.getPeer();
    var31.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var31.repaint();
    java.lang.Object var38 = var31.getTreeLock();
    tinymonkeys.vue.VueElement var44 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var45 = var44.getPeer();
    var44.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var44.repaint();
    var44.updateUI();
    int var52 = var31.getComponentZOrder((java.awt.Component)var44);
    java.awt.Insets var53 = var31.getInsets();
    java.util.Locale var54 = var31.getLocale();
    var31.hide();
    java.awt.LayoutManager var56 = var31.getLayout();
    var13.setLayout(var56);
    var7.setLayout(var56);
    java.awt.Color var59 = var7.getBackground();
    java.awt.Toolkit var60 = var7.getToolkit();
    javax.swing.TransferHandler var61 = var7.getTransferHandler();
    var7.setVisible(false);
    int var64 = var7.getDefaultCloseOperation();
    java.awt.Window var65 = var7.getOwner();
    boolean var66 = var7.isAutoRequestFocus();
    java.awt.event.WindowStateListener[] var67 = var7.getWindowStateListeners();
    java.awt.Image var68 = var7.getIconImage();
    var2.enregistreEcBandeSinges((tinymonkeys.modele.BandeDeSingesErratiquesEcouteur)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test155");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.image.ColorModel var13 = var5.getColorModel();
    var5.setLocation(100, 1);
    boolean var17 = var5.isDoubleBuffered();
    tinymonkeys.vue.VueElement var23 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var24 = var23.getPeer();
    var23.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var23.repaint();
    java.lang.Object var30 = var23.getTreeLock();
    tinymonkeys.vue.VueElement var36 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var37 = var36.getPeer();
    var36.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var36.repaint();
    var36.updateUI();
    int var44 = var23.getComponentZOrder((java.awt.Component)var36);
    tinymonkeys.vue.VueElement var50 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var51 = var50.getPeer();
    var50.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var50.transferFocusUpCycle();
    boolean var57 = var50.getInheritsPopupMenu();
    java.awt.Dimension var58 = var50.minimumSize();
    java.awt.Dimension var59 = var36.getSize(var58);
    var5.setSize(var58);
    var5.transferFocus();
    var5.disable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test156");


    tinymonkeys.vue.VueSingeErratique var5 = new tinymonkeys.vue.VueSingeErratique(1, 1, 10, (-1), 11);
    boolean var6 = var5.getFocusTraversalKeysEnabled();
    javax.accessibility.AccessibleContext var7 = var5.getAccessibleContext();
    var5.setPosition((-1), 111);
    javax.swing.border.Border var11 = var5.getBorder();
    var5.setPosition(10, 10);
    tinymonkeys.vue.VueElement var21 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var22 = var21.getPeer();
    var21.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var21.repaint();
    java.awt.GraphicsConfiguration var28 = var21.getGraphicsConfiguration();
    java.awt.Insets var29 = var21.insets();
    var21.repaint(1L);
    java.util.Set var33 = var21.getFocusTraversalKeys(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.setFocusTraversalKeys(11, var33);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test157");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    int var3 = var2.getExtendedState();
    java.awt.Window.Type var4 = var2.getType();
    tinymonkeys.vue.VueElement var10 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var11 = var10.getPeer();
    javax.swing.InputMap var13 = var10.getInputMap(0);
    boolean var14 = var10.isDisplayable();
    boolean var15 = var10.getFocusTraversalKeysEnabled();
    java.awt.Dimension var16 = var10.getMaximumSize();
    var2.setMinimumSize(var16);
    java.awt.Window[] var18 = var2.getOwnedWindows();
    var2.setLocationByPlatform(true);
    java.awt.Container var21 = var2.getContentPane();
    var2.firePropertyChange("PanelUI", 0.5f, 10.0f);
    tinymonkeys.vue.VueElement var31 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var32 = var31.getPeer();
    var31.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var31.repaint();
    java.lang.Object var38 = var31.getTreeLock();
    tinymonkeys.vue.VueElement var44 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var45 = var44.getPeer();
    var44.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var44.repaint();
    var44.updateUI();
    int var52 = var31.getComponentZOrder((java.awt.Component)var44);
    boolean var53 = var44.isDoubleBuffered();
    java.awt.Dimension var54 = var44.size();
    var2.setSize(var54);
    int var56 = var2.getY();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test158");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.setAlignmentX(0.5f);
    java.awt.Font var18 = var5.getFont();
    tinymonkeys.vue.VueElement var24 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var24.enable(true);
    tinymonkeys.vue.VueElement var32 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var33 = var32.getUIClassID();
    javax.swing.TransferHandler var34 = var32.getTransferHandler();
    java.awt.Color var35 = var32.getForeground();
    var24.setBackground(var35);
    var5.setForeground(var35);
    java.awt.Insets var38 = var5.insets();
    boolean var39 = var5.isMaximumSizeSet();
    boolean var40 = var5.isFocusable();
    java.awt.GraphicsConfiguration var41 = var5.getGraphicsConfiguration();
    boolean var42 = var5.isEnabled();
    tinymonkeys.vue.VueElement var48 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var54 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var55 = var48.isAncestorOf((java.awt.Component)var54);
    javax.swing.plaf.PanelUI var56 = var48.getUI();
    java.awt.Image var59 = var48.createImage(0, 1);
    var48.firePropertyChange("tinymonkeys.vue.VueSingeErratique[,1,22,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]", 100, 10);
    boolean var64 = var5.isFocusCycleRoot((java.awt.Container)var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "PanelUI"+ "'", var33.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test159");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    tinymonkeys.vue.VueElement var18 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var19 = var18.getPeer();
    var18.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var18.repaint();
    var18.updateUI();
    int var26 = var5.getComponentZOrder((java.awt.Component)var18);
    boolean var27 = var18.isDoubleBuffered();
    java.awt.Dimension var28 = var18.size();
    boolean var29 = var18.isOptimizedDrawingEnabled();
    java.beans.PropertyChangeListener[] var30 = var18.getPropertyChangeListeners();
    var18.list();
    java.awt.image.VolatileImage var34 = var18.createVolatileImage(1920, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test160");


    tinymonkeys.vue.VueSingeErratique var5 = new tinymonkeys.vue.VueSingeErratique(1, 1, 10, (-1), 11);
    boolean var6 = var5.getFocusTraversalKeysEnabled();
    var5.removeNotify();
    java.awt.Component var10 = var5.getComponentAt(0, 0);
    var5.resize((-1), 3);
    java.awt.Cursor var14 = var5.getCursor();
    tinymonkeys.vue.VueElement var20 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var21 = var20.getPeer();
    var20.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var20.repaint();
    java.lang.Object var27 = var20.getTreeLock();
    java.awt.Component var30 = var20.locate(0, (-1));
    var20.setAlignmentX(0.5f);
    java.awt.Font var33 = var20.getFont();
    tinymonkeys.vue.VueElement var39 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var39.enable(true);
    tinymonkeys.vue.VueElement var47 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var48 = var47.getUIClassID();
    javax.swing.TransferHandler var49 = var47.getTransferHandler();
    java.awt.Color var50 = var47.getForeground();
    var39.setBackground(var50);
    var20.setForeground(var50);
    java.awt.Insets var53 = var20.insets();
    tinymonkeys.vue.VueElement var59 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var60 = var59.getUIClassID();
    java.lang.String var61 = var59.toString();
    var59.firePropertyChange("", ' ', ' ');
    tinymonkeys.vue.VueElement var71 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var72 = var71.getPeer();
    var71.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var71.repaint();
    java.lang.Object var78 = var71.getTreeLock();
    java.awt.Component var81 = var71.locate(0, (-1));
    var71.requestFocus();
    boolean var83 = var71.isFocusTraversable();
    java.awt.Insets var84 = var71.insets();
    java.awt.Insets var85 = var59.getInsets(var84);
    java.awt.Insets var86 = var20.getInsets(var85);
    java.awt.Insets var87 = var5.getInsets(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "PanelUI"+ "'", var48.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "PanelUI"+ "'", var60.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]"+ "'", var61.equals("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test161");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    java.awt.im.InputContext var13 = var11.getInputContext();
    boolean var14 = var11.isRequestFocusEnabled();
    java.awt.event.KeyListener[] var15 = var11.getKeyListeners();
    java.util.Locale var16 = var11.getLocale();
    javax.swing.InputMap var17 = var11.getInputMap();
    boolean var18 = var11.isLightweight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test162");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.transferFocusUpCycle();
    tinymonkeys.vue.VueElement var17 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var18 = var17.getPeer();
    var17.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var17.repaint();
    java.lang.Object var24 = var17.getTreeLock();
    java.awt.event.HierarchyListener[] var25 = var17.getHierarchyListeners();
    boolean var26 = var5.isAncestorOf((java.awt.Component)var17);
    boolean var27 = var17.isFontSet();
    tinymonkeys.vue.VueElement var33 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var34 = var33.getPeer();
    var33.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var33.repaint();
    java.lang.Object var40 = var33.getTreeLock();
    java.awt.Component var43 = var33.locate(0, (-1));
    var33.setAlignmentX(0.5f);
    java.awt.Font var46 = var33.getFont();
    tinymonkeys.vue.VueElement var53 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var54 = var53.getUIClassID();
    float var55 = var53.getAlignmentX();
    boolean var56 = var53.isOptimizedDrawingEnabled();
    var33.putClientProperty((java.lang.Object)' ', (java.lang.Object)var56);
    tinymonkeys.vue.VueElement var63 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var64 = var63.getPeer();
    var63.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var63.repaint();
    java.lang.Object var70 = var63.getTreeLock();
    java.awt.Component var73 = var63.locate(0, (-1));
    var63.setAlignmentX(0.5f);
    java.awt.Font var76 = var63.getFont();
    java.awt.FontMetrics var77 = var33.getFontMetrics(var76);
    java.awt.FontMetrics var78 = var17.getFontMetrics(var76);
    boolean var79 = var17.isManagingFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "PanelUI"+ "'", var54.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test163");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    int var7 = var5.getHeight();
    boolean var8 = var5.getFocusTraversalKeysEnabled();
    tinymonkeys.vue.VueElement var14 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var14.revalidate();
    java.lang.String var16 = var14.toString();
    boolean var17 = var14.isFocusTraversalPolicyProvider();
    var14.repaint((-1), 1, 100, 100);
    java.lang.Object var23 = var5.getClientProperty((java.lang.Object)100);
    boolean var24 = var5.isFocusable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]"+ "'", var16.equals("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test164");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    boolean var13 = var5.isDoubleBuffered();
    var5.setVisible(true);
    boolean var16 = var5.requestDefaultFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test165");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.enable(true);
    tinymonkeys.vue.VueElement var13 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var14 = var13.getUIClassID();
    tinymonkeys.vue.VueElement var20 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var21 = var20.getPeer();
    var20.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var20.transferFocusUpCycle();
    boolean var27 = var20.getInheritsPopupMenu();
    tinymonkeys.vue.VueElement var33 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var34 = var33.getPeer();
    var33.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var33.repaint();
    java.lang.Object var40 = var33.getTreeLock();
    tinymonkeys.vue.VueElement var46 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var47 = var46.getPeer();
    var46.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var46.repaint();
    var46.updateUI();
    int var54 = var33.getComponentZOrder((java.awt.Component)var46);
    var13.add((java.awt.Component)var20, (java.lang.Object)var33);
    boolean var56 = var5.isFocusCycleRoot((java.awt.Container)var20);
    javax.swing.event.AncestorListener[] var57 = var5.getAncestorListeners();
    var5.setDebugGraphicsOptions(0);
    java.awt.peer.ComponentPeer var60 = var5.getPeer();
    boolean var61 = var5.isDoubleBuffered();
    java.awt.event.InputMethodListener[] var62 = var5.getInputMethodListeners();
    var5.setVerifyInputWhenFocusTarget(false);
    javax.swing.plaf.PanelUI var65 = var5.getUI();
    tinymonkeys.controleur.Controller var67 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var68 = new tinymonkeys.vue.Fenetre("PanelUI", var67);
    int var69 = var68.getExtendedState();
    java.awt.Window.Type var70 = var68.getType();
    tinymonkeys.vue.VueElement var76 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var77 = var76.getPeer();
    javax.swing.InputMap var79 = var76.getInputMap(0);
    boolean var80 = var76.isDisplayable();
    boolean var81 = var76.getFocusTraversalKeysEnabled();
    java.awt.Dimension var82 = var76.getMaximumSize();
    var68.setMinimumSize(var82);
    boolean var84 = var68.isLocationByPlatform();
    var68.setState(100);
    java.awt.im.InputContext var87 = var68.getInputContext();
    java.util.Locale var88 = var68.getLocale();
    var5.setLocale(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "PanelUI"+ "'", var14.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test166");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.enable(true);
    int var8 = var5.getY();
    boolean var9 = var5.isValid();
    java.awt.Toolkit var10 = var5.getToolkit();
    var5.setInheritsPopupMenu(false);
    var5.transferFocusDownCycle();
    var5.resize((-1), 100);
    boolean var17 = var5.getFocusTraversalKeysEnabled();
    var5.requestFocus();
    var5.revalidate();
    tinymonkeys.vue.VueSingeErratique var25 = new tinymonkeys.vue.VueSingeErratique(1, 1, 10, (-1), 11);
    boolean var26 = var25.getFocusTraversalKeysEnabled();
    var25.removeNotify();
    java.awt.Component var30 = var25.getComponentAt(0, 0);
    tinymonkeys.vue.VueElement var36 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var37 = var36.getPeer();
    var36.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var36.repaint();
    java.lang.Object var43 = var36.getTreeLock();
    java.awt.image.ColorModel var44 = var36.getColorModel();
    boolean var45 = var36.getVerifyInputWhenFocusTarget();
    var36.firePropertyChange("hi!", '4', 'a');
    java.awt.Rectangle var50 = var36.getBounds();
    tinymonkeys.vue.VueElement var56 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var62 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var63 = var56.isAncestorOf((java.awt.Component)var62);
    java.awt.Point var64 = var62.location();
    java.awt.Point var65 = var36.getLocation(var64);
    java.awt.Point var66 = var25.getLocation(var64);
    java.awt.Point var67 = var5.getLocation(var64);
    java.awt.image.ColorModel var68 = var5.getColorModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test167");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var6 = var5.getUIClassID();
    java.awt.Dimension var7 = var5.getMaximumSize();
    javax.swing.event.AncestorListener[] var8 = var5.getAncestorListeners();
    javax.swing.ActionMap var9 = var5.getActionMap();
    boolean var10 = var5.isManagingFocus();
    var5.setFocusTraversalPolicyProvider(false);
    var5.setInheritsPopupMenu(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "PanelUI"+ "'", var6.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test168");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var6 = var5.getUIClassID();
    boolean var7 = var5.isFontSet();
    float var8 = var5.getAlignmentY();
    tinymonkeys.vue.VueElement var14 = new tinymonkeys.vue.VueElement(0, 0, 1, 1, 11);
    java.awt.Component var17 = var14.locate(11, 10);
    tinymonkeys.vue.VueElement var23 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var24 = var23.getPeer();
    var23.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var23.repaint();
    var23.updateUI();
    var23.show(false);
    float var33 = var23.getAlignmentY();
    java.awt.Rectangle var34 = var23.bounds();
    java.awt.Rectangle var35 = var14.getBounds(var34);
    var5.setBounds(var34);
    int var37 = var5.getWidth();
    var5.nextFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "PanelUI"+ "'", var6.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test169");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    boolean var13 = var5.isFocusTraversalPolicyProvider();
    var5.firePropertyChange("hi!", 'a', '4');
    tinymonkeys.vue.VueElement var23 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var24 = var23.getPeer();
    var23.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var23.repaint();
    java.lang.Object var30 = var23.getTreeLock();
    java.awt.image.ColorModel var31 = var23.getColorModel();
    boolean var32 = var23.getVerifyInputWhenFocusTarget();
    var23.repaint(100L);
    java.awt.Dimension var35 = var23.preferredSize();
    var5.setPreferredSize(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test170");


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
    javax.swing.JMenuBar var72 = var17.getJMenuBar();
    java.awt.Window.Type var73 = var17.getType();
    var17.setState(111);
    int var76 = var17.getExtendedState();
    java.beans.PropertyChangeListener[] var78 = var17.getPropertyChangeListeners("hi!");
    java.awt.image.BufferStrategy var79 = var17.getBufferStrategy();
    tinymonkeys.controleur.Controller var82 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var83 = new tinymonkeys.vue.Fenetre("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,hidden,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777216,maximumSize=,minimumSize=,preferredSize=]", var82);
    tinymonkeys.vue.Fenetre var84 = new tinymonkeys.vue.Fenetre("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]", var82);
    java.awt.Window.Type var85 = var84.getType();
    var17.setType(var85);
    java.util.Locale var87 = var17.getLocale();
    boolean var88 = var17.isCursorSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == true);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test171");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var6 = var5.getUIClassID();
    tinymonkeys.vue.VueElement var12 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var13 = var12.getPeer();
    var12.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var12.transferFocusUpCycle();
    boolean var19 = var12.getInheritsPopupMenu();
    tinymonkeys.vue.VueElement var25 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var26 = var25.getPeer();
    var25.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var25.repaint();
    java.lang.Object var32 = var25.getTreeLock();
    tinymonkeys.vue.VueElement var38 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var39 = var38.getPeer();
    var38.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var38.repaint();
    var38.updateUI();
    int var46 = var25.getComponentZOrder((java.awt.Component)var38);
    var5.add((java.awt.Component)var12, (java.lang.Object)var25);
    java.awt.Point var49 = var25.getMousePosition(false);
    var25.setEnabled(true);
    int var52 = var25.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "PanelUI"+ "'", var6.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 1);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test172");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    tinymonkeys.vue.VueSingeErratique var18 = new tinymonkeys.vue.VueSingeErratique(1, 1, 10, (-1), 11);
    tinymonkeys.vue.VueElement var24 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var25 = var24.getPeer();
    var24.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var24.repaint();
    java.lang.Object var31 = var24.getTreeLock();
    java.awt.Component var34 = var24.locate(0, (-1));
    var24.requestFocus();
    tinymonkeys.vue.VueElement var41 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var42 = var41.getPeer();
    var41.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var41.repaint();
    java.lang.Object var48 = var41.getTreeLock();
    java.awt.image.ColorModel var49 = var41.getColorModel();
    boolean var50 = var41.getVerifyInputWhenFocusTarget();
    var41.firePropertyChange("hi!", '4', 'a');
    java.awt.Rectangle var55 = var41.getBounds();
    var24.paintImmediately(var55);
    var18.setBounds(var55);
    var5.paintImmediately(var55);
    var5.setRequestFocusEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test173");


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
    java.awt.Graphics var54 = var2.getGraphics();
    var2.pack();
    var2.setFocusTraversalPolicyProvider(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test174");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    tinymonkeys.vue.VueElement var17 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var18 = var17.getPeer();
    var17.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var17.repaint();
    java.lang.Object var24 = var17.getTreeLock();
    java.awt.image.ColorModel var25 = var17.getColorModel();
    var17.setLocation(100, 1);
    tinymonkeys.vue.VueElement var34 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var35 = var34.getUIClassID();
    javax.swing.TransferHandler var36 = var34.getTransferHandler();
    java.awt.Color var37 = var34.getForeground();
    var17.setForeground(var37);
    boolean var39 = var17.getIgnoreRepaint();
    java.awt.Component var40 = var5.add("PanelUI", (java.awt.Component)var17);
    float var41 = var17.getAlignmentX();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "PanelUI"+ "'", var35.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0.5f);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test175");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var1 = var0.getSingesErratiques();
    tinymonkeys.controleur.Controller var3 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var4 = new tinymonkeys.vue.Fenetre("PanelUI", var3);
    int var5 = var4.getExtendedState();
    java.awt.Window.Type var6 = var4.getType();
    tinymonkeys.vue.VueElement var12 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var13 = var12.getPeer();
    javax.swing.InputMap var15 = var12.getInputMap(0);
    boolean var16 = var12.isDisplayable();
    boolean var17 = var12.getFocusTraversalKeysEnabled();
    java.awt.Dimension var18 = var12.getMaximumSize();
    var4.setMinimumSize(var18);
    boolean var20 = var4.isLocationByPlatform();
    var4.doLayout();
    var0.enregistreEcIle((tinymonkeys.modele.IleEcouteur)var4);
    var4.setLocation(3, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test176");


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
    int var57 = var2.getDefaultCloseOperation();
    java.awt.Shape var58 = var2.getShape();
    java.awt.Graphics var59 = var2.getGraphics();
    tinymonkeys.vue.VueElement var65 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var71 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var71.revalidate();
    var71.setSize(0, 11);
    java.awt.Dimension var76 = var71.getMinimumSize();
    java.awt.Dimension var77 = var65.getSize(var76);
    var2.setMinimumSize(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test177");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.Pirate var1 = var0.getPirate();
    tinymonkeys.modele.BandeDeSingesErratiques var2 = var0.getSingesErratiques();
    tinymonkeys.controleur.Controller var4 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var5 = new tinymonkeys.vue.Fenetre("PanelUI", var4);
    var5.pack();
    var5.addNotify();
    var2.enregistreEcBandeSinges((tinymonkeys.modele.BandeDeSingesErratiquesEcouteur)var5);
    tinymonkeys.controleur.Controller var10 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var11 = new tinymonkeys.vue.Fenetre("PanelUI", var10);
    tinymonkeys.vue.VueElement var17 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var23 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var24 = var17.isAncestorOf((java.awt.Component)var23);
    boolean var25 = var17.isFocusTraversalPolicyProvider();
    boolean var28 = var17.contains(10, 111);
    java.awt.Dimension var29 = var17.minimumSize();
    tinymonkeys.vue.VueElement var35 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var36 = var35.getPeer();
    var35.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var35.repaint();
    java.lang.Object var42 = var35.getTreeLock();
    tinymonkeys.vue.VueElement var48 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var49 = var48.getPeer();
    var48.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var48.repaint();
    var48.updateUI();
    int var56 = var35.getComponentZOrder((java.awt.Component)var48);
    java.awt.Insets var57 = var35.getInsets();
    java.util.Locale var58 = var35.getLocale();
    var35.hide();
    java.awt.LayoutManager var60 = var35.getLayout();
    var17.setLayout(var60);
    var11.setLayout(var60);
    javax.accessibility.AccessibleContext var63 = var11.getAccessibleContext();
    java.lang.String var64 = var11.getTitle();
    var2.enregistreEcBandeSinges((tinymonkeys.modele.BandeDeSingesErratiquesEcouteur)var11);
    boolean var66 = var11.getFocusTraversalKeysEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "PanelUI"+ "'", var64.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test178");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.enable(true);
    int var8 = var5.getY();
    boolean var9 = var5.isValid();
    java.awt.Toolkit var10 = var5.getToolkit();
    java.awt.image.ColorModel var11 = var5.getColorModel();
    var5.removeNotify();
    javax.accessibility.AccessibleContext var13 = var5.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test179");


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
    tinymonkeys.vue.VueElement var60 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var61 = var60.getPeer();
    java.awt.Color var62 = var60.getForeground();
    var2.setBackground(var62);
    boolean var64 = var2.isAutoRequestFocus();
    var2.setResizable(false);
    java.awt.event.WindowListener[] var67 = var2.getWindowListeners();
    tinymonkeys.vue.VueElement var73 = new tinymonkeys.vue.VueElement(0, 0, 1, 1, 11);
    java.awt.Component var76 = var73.locate(11, 10);
    java.awt.Container var77 = var73.getParent();
    var73.setAlignmentX(0.5f);
    java.awt.dnd.DropTarget var80 = var73.getDropTarget();
    boolean var81 = var73.isFocusTraversalPolicySet();
    tinymonkeys.vue.VueElement var87 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var93 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var94 = var87.isAncestorOf((java.awt.Component)var93);
    java.awt.Point var95 = var93.location();
    java.awt.Point var96 = var73.getLocation(var95);
    var2.setLocation(var96);
    java.awt.Toolkit var98 = var2.getToolkit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test180");


    tinymonkeys.modele.Ile var2 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var3 = new tinymonkeys.modele.BandeDeSingesErratiques(var2);
    tinymonkeys.modele.SingeErratique var4 = new tinymonkeys.modele.SingeErratique((-1), 11, var2);
    tinymonkeys.modele.Ile var5 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var6 = new tinymonkeys.modele.BandeDeSingesErratiques(var5);
    int[][] var7 = new int[][] { };
    var5.creationCarte(var7);
    var2.creationCarte(var7);
    tinymonkeys.modele.Ile var12 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var13 = new tinymonkeys.modele.BandeDeSingesErratiques(var12);
    tinymonkeys.modele.SingeErratique var14 = new tinymonkeys.modele.SingeErratique((-1), 11, var12);
    tinymonkeys.modele.Ile var15 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var16 = new tinymonkeys.modele.BandeDeSingesErratiques(var15);
    int[][] var17 = new int[][] { };
    var15.creationCarte(var17);
    var12.creationCarte(var17);
    var2.creationCarte(var17);
    tinymonkeys.modele.Ile var21 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var22 = new tinymonkeys.modele.BandeDeSingesErratiques(var21);
    int[][] var23 = new int[][] { };
    var21.creationCarte(var23);
    var2.creationCarte(var23);
    int[][] var26 = var2.getCarte();
    tinymonkeys.modele.Tresor var27 = var2.getTresor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test181");


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
    var2.setVisible(false);
    int var59 = var2.getDefaultCloseOperation();
    java.awt.Window var60 = var2.getOwner();
    var2.dispose();
    java.lang.String var62 = var2.getWarningString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test182");


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
    java.awt.MenuBar var55 = var2.getMenuBar();
    boolean var56 = var2.isActive();
    java.awt.event.WindowStateListener[] var57 = var2.getWindowStateListeners();
    java.awt.Window var58 = var2.getOwner();
    float var59 = var2.getOpacity();
    tinymonkeys.vue.VueElement var65 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var71 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var72 = var65.isAncestorOf((java.awt.Component)var71);
    boolean var73 = var65.isFocusTraversalPolicyProvider();
    java.awt.im.InputMethodRequests var74 = var65.getInputMethodRequests();
    tinymonkeys.vue.VueElement var80 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var81 = var80.getPeer();
    java.awt.Color var82 = var80.getForeground();
    var65.setForeground(var82);
    var2.setBackground(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test183");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.awt.GraphicsConfiguration var12 = var5.getGraphicsConfiguration();
    boolean var13 = var5.getInheritsPopupMenu();
    tinymonkeys.vue.VueElement var19 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var20 = var19.getPeer();
    var19.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var19.repaint();
    java.lang.Object var26 = var19.getTreeLock();
    java.awt.image.ColorModel var27 = var19.getColorModel();
    boolean var28 = var19.getVerifyInputWhenFocusTarget();
    int var29 = var19.getWidth();
    var19.removeNotify();
    boolean var31 = var5.isAncestorOf((java.awt.Component)var19);
    boolean var32 = var19.hasFocus();
    boolean var34 = var19.requestFocus(false);
    var19.setFocusTraversalPolicyProvider(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test184");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    int var3 = var2.getExtendedState();
    var2.setResizable(false);
    java.awt.dnd.DropTarget var6 = var2.getDropTarget();
    java.awt.Dimension var7 = var2.getMinimumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test185");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    var2.pack();
    var2.addNotify();
    java.awt.Graphics var5 = var2.getGraphics();
    int var6 = var2.getDefaultCloseOperation();
    java.awt.event.WindowStateListener[] var7 = var2.getWindowStateListeners();
    boolean var8 = var2.isAlwaysOnTop();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test186");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.awt.GraphicsConfiguration var12 = var5.getGraphicsConfiguration();
    boolean var13 = var5.getInheritsPopupMenu();
    tinymonkeys.vue.VueElement var19 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var20 = var19.getPeer();
    var19.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var19.repaint();
    java.lang.Object var26 = var19.getTreeLock();
    java.awt.image.ColorModel var27 = var19.getColorModel();
    boolean var28 = var19.getVerifyInputWhenFocusTarget();
    int var29 = var19.getWidth();
    var19.removeNotify();
    boolean var31 = var5.isAncestorOf((java.awt.Component)var19);
    tinymonkeys.vue.VueElement var37 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var38 = var37.getPeer();
    var37.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var37.repaint();
    java.awt.GraphicsConfiguration var44 = var37.getGraphicsConfiguration();
    var37.setFocusCycleRoot(true);
    var5.setNextFocusableComponent((java.awt.Component)var37);
    java.awt.Container var48 = var5.getFocusCycleRootAncestor();
    tinymonkeys.vue.VueElement var54 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var55 = var54.getPeer();
    var54.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var54.repaint();
    var54.updateUI();
    var54.show(false);
    float var64 = var54.getAlignmentY();
    java.awt.Rectangle var65 = var54.bounds();
    java.awt.Rectangle var66 = var5.getBounds(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test187");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var6 = var5.getUIClassID();
    tinymonkeys.vue.VueElement var12 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var13 = var12.getPeer();
    var12.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var12.transferFocusUpCycle();
    boolean var19 = var12.getInheritsPopupMenu();
    tinymonkeys.vue.VueElement var25 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var26 = var25.getPeer();
    var25.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var25.repaint();
    java.lang.Object var32 = var25.getTreeLock();
    tinymonkeys.vue.VueElement var38 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var39 = var38.getPeer();
    var38.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var38.repaint();
    var38.updateUI();
    int var46 = var25.getComponentZOrder((java.awt.Component)var38);
    var5.add((java.awt.Component)var12, (java.lang.Object)var25);
    var25.firePropertyChange("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]", (byte)0, (byte)10);
    javax.swing.border.Border var52 = var25.getBorder();
    var25.transferFocusBackward();
    var25.paintImmediately((-1), 111, 1, 111);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "PanelUI"+ "'", var6.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test188");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var17 = var2.valeurCarte(1, 3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test189");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(111, (-1), 111, 0, 11);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test190");


    tinymonkeys.modele.Ile var2 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var3 = new tinymonkeys.modele.BandeDeSingesErratiques(var2);
    int[][] var4 = new int[][] { };
    var2.creationCarte(var4);
    tinymonkeys.modele.Pirate var7 = new tinymonkeys.modele.Pirate(var2, "PanelUI");
    tinymonkeys.modele.Pirate var9 = new tinymonkeys.modele.Pirate(var2, "");
    tinymonkeys.modele.Pirate var10 = var2.getPirate();
    tinymonkeys.modele.Tresor var11 = var2.getTresor();
    int[][] var12 = var2.getCarte();
    tinymonkeys.modele.SingeErratique var13 = new tinymonkeys.modele.SingeErratique(0, 0, var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.deplacerSinge();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test191");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    int var3 = var2.getExtendedState();
    java.awt.Window.Type var4 = var2.getType();
    tinymonkeys.vue.VueElement var10 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var11 = var10.getPeer();
    javax.swing.InputMap var13 = var10.getInputMap(0);
    boolean var14 = var10.isDisplayable();
    boolean var15 = var10.getFocusTraversalKeysEnabled();
    java.awt.Dimension var16 = var10.getMaximumSize();
    var2.setMinimumSize(var16);
    java.awt.Window[] var18 = var2.getOwnedWindows();
    var2.setLocationByPlatform(true);
    java.awt.Container var21 = var2.getContentPane();
    var2.firePropertyChange("PanelUI", 0.5f, 10.0f);
    tinymonkeys.vue.VueElement var31 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var32 = var31.getPeer();
    var31.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var31.repaint();
    java.lang.Object var38 = var31.getTreeLock();
    tinymonkeys.vue.VueElement var44 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var45 = var44.getPeer();
    var44.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var44.repaint();
    var44.updateUI();
    int var52 = var31.getComponentZOrder((java.awt.Component)var44);
    boolean var53 = var44.isDoubleBuffered();
    java.awt.Dimension var54 = var44.size();
    var2.setSize(var54);
    var2.setFocusTraversalPolicyProvider(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test192");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    int var13 = var5.getX();
    java.beans.VetoableChangeListener[] var14 = var5.getVetoableChangeListeners();
    java.lang.String var15 = var5.getToolTipText();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 111);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test193");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    java.awt.im.InputContext var13 = var11.getInputContext();
    boolean var14 = var11.isRequestFocusEnabled();
    var11.setAlignmentY(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test194");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.awt.GraphicsConfiguration var12 = var5.getGraphicsConfiguration();
    java.awt.Insets var13 = var5.insets();
    var5.repaint(1L);
    java.util.Set var17 = var5.getFocusTraversalKeys(0);
    var5.disable();
    var5.setFocusTraversalPolicyProvider(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test195");


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
    java.awt.Container var89 = var6.getFocusCycleRootAncestor();
    var6.dispose();
    java.awt.image.BufferStrategy var91 = var6.getBufferStrategy();
    var6.repaint(10L, 32767, 1920, 32767, 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var91);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test196");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var6 = var5.getUIClassID();
    javax.swing.TransferHandler var7 = var5.getTransferHandler();
    java.awt.Color var8 = var5.getForeground();
    javax.swing.KeyStroke[] var9 = var5.getRegisteredKeyStrokes();
    boolean var10 = var5.isMinimumSizeSet();
    var5.grabFocus();
    tinymonkeys.vue.VueElement var17 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var17.enable(true);
    boolean var20 = var17.isShowing();
    int var21 = var17.getX();
    var17.grabFocus();
    tinymonkeys.vue.VueElement var28 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var34 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var35 = var28.isAncestorOf((java.awt.Component)var34);
    boolean var36 = var28.isFocusTraversalPolicyProvider();
    java.awt.event.MouseMotionListener[] var37 = var28.getMouseMotionListeners();
    javax.swing.ActionMap var38 = var28.getActionMap();
    tinymonkeys.vue.VueElement var44 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var45 = var44.getPeer();
    var44.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var44.repaint();
    java.lang.Object var51 = var44.getTreeLock();
    java.awt.Component var54 = var44.locate(0, (-1));
    var44.setAlignmentX(0.5f);
    java.awt.Font var57 = var44.getFont();
    tinymonkeys.vue.VueElement var64 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var65 = var64.getUIClassID();
    float var66 = var64.getAlignmentX();
    boolean var67 = var64.isOptimizedDrawingEnabled();
    var44.putClientProperty((java.lang.Object)' ', (java.lang.Object)var67);
    tinymonkeys.vue.VueElement var74 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var75 = var74.getPeer();
    var74.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var74.repaint();
    java.lang.Object var81 = var74.getTreeLock();
    java.awt.Component var84 = var74.locate(0, (-1));
    var74.setAlignmentX(0.5f);
    java.awt.Font var87 = var74.getFont();
    java.awt.FontMetrics var88 = var44.getFontMetrics(var87);
    java.awt.FontMetrics var89 = var28.getFontMetrics(var87);
    java.awt.FontMetrics var90 = var17.getFontMetrics(var87);
    java.awt.FontMetrics var91 = var5.getFontMetrics(var87);
    var5.requestFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "PanelUI"+ "'", var6.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 111);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "PanelUI"+ "'", var65.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test197");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var1 = var0.getSingesErratiques();
    tinymonkeys.modele.Ile var4 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var5 = new tinymonkeys.modele.BandeDeSingesErratiques(var4);
    tinymonkeys.modele.SingeErratique var6 = new tinymonkeys.modele.SingeErratique((-1), 11, var4);
    tinymonkeys.modele.Ile var7 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var8 = new tinymonkeys.modele.BandeDeSingesErratiques(var7);
    int[][] var9 = new int[][] { };
    var7.creationCarte(var9);
    var4.creationCarte(var9);
    tinymonkeys.modele.Ile var12 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var13 = new tinymonkeys.modele.BandeDeSingesErratiques(var12);
    int[][] var14 = new int[][] { };
    var12.creationCarte(var14);
    var4.creationCarte(var14);
    tinymonkeys.controleur.Controller var18 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var19 = new tinymonkeys.vue.Fenetre("PanelUI", var18);
    tinymonkeys.vue.VueElement var25 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var31 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var32 = var25.isAncestorOf((java.awt.Component)var31);
    boolean var33 = var25.isFocusTraversalPolicyProvider();
    boolean var36 = var25.contains(10, 111);
    java.awt.Dimension var37 = var25.minimumSize();
    tinymonkeys.vue.VueElement var43 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var44 = var43.getPeer();
    var43.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var43.repaint();
    java.lang.Object var50 = var43.getTreeLock();
    tinymonkeys.vue.VueElement var56 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var57 = var56.getPeer();
    var56.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var56.repaint();
    var56.updateUI();
    int var64 = var43.getComponentZOrder((java.awt.Component)var56);
    java.awt.Insets var65 = var43.getInsets();
    java.util.Locale var66 = var43.getLocale();
    var43.hide();
    java.awt.LayoutManager var68 = var43.getLayout();
    var25.setLayout(var68);
    var19.setLayout(var68);
    java.awt.Color var71 = var19.getBackground();
    java.awt.MenuBar var72 = var19.getMenuBar();
    var4.enregistreEcIle((tinymonkeys.modele.IleEcouteur)var19);
    boolean var74 = var19.isAutoRequestFocus();
    var1.enregistreEcBandeSinges((tinymonkeys.modele.BandeDeSingesErratiquesEcouteur)var19);
    javax.swing.TransferHandler var76 = var19.getTransferHandler();
    var19.setFocusCycleRoot(false);
    tinymonkeys.vue.VueElement var84 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var85 = var84.getPeer();
    javax.swing.InputMap var87 = var84.getInputMap(0);
    boolean var88 = var84.isShowing();
    float var89 = var84.getAlignmentY();
    int var90 = var19.getComponentZOrder((java.awt.Component)var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == (-1));

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test198");


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
    int var57 = var2.getDefaultCloseOperation();
    boolean var58 = var2.isCursorSet();
    java.util.List var59 = var2.getIconImages();
    var2.addNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test199");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.image.ColorModel var13 = var5.getColorModel();
    boolean var14 = var5.getVerifyInputWhenFocusTarget();
    tinymonkeys.vue.VueElement var20 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var26 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var26.revalidate();
    var26.setSize(0, 11);
    java.awt.Dimension var31 = var26.getMinimumSize();
    java.awt.Dimension var32 = var20.getSize(var31);
    var5.setMinimumSize(var31);
    var5.setAlignmentY(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test200");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    boolean var13 = var5.isFocusTraversalPolicyProvider();
    boolean var14 = var5.isShowing();
    boolean var15 = var5.isFocusTraversalPolicySet();
    var5.move(1, 10);
    var5.repaint((-1L), 100, 0, 10, 100);
    tinymonkeys.vue.VueElement var30 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var31 = var30.getPeer();
    var30.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var30.repaint();
    java.lang.Object var37 = var30.getTreeLock();
    java.awt.Component var40 = var30.locate(0, (-1));
    var30.requestFocus();
    boolean var42 = var30.isFocusTraversable();
    java.lang.Object var43 = var5.getClientProperty((java.lang.Object)var42);
    var5.doLayout();
    boolean var45 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var5);
    boolean var46 = var5.isLightweight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test201");


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
    tinymonkeys.vue.VueElement var61 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var67 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var68 = var61.isAncestorOf((java.awt.Component)var67);
    javax.swing.plaf.PanelUI var69 = var61.getUI();
    java.awt.Image var72 = var61.createImage(0, 1);
    var61.enable(true);
    java.awt.Color var75 = var61.getBackground();
    var2.setBackground(var75);
    var2.setLocation(111, 10);
    java.awt.Container var80 = var2.getFocusCycleRootAncestor();
    var2.setState(0);
    int var83 = var2.getState();
    java.beans.PropertyChangeListener[] var84 = var2.getPropertyChangeListeners();
    java.awt.Container var85 = var2.getFocusCycleRootAncestor();
    javax.accessibility.AccessibleContext var86 = var2.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test202");


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
    var1.setAvatar("tinymonkeys.vue.Fenetre[frame3,0,0,140x39,hidden,layout=java.awt.BorderLayout,title=PanelUI,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,8,31,124x0,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "PanelUI"+ "'", var59.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test203");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.enable(true);
    tinymonkeys.vue.VueElement var13 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var14 = var13.getUIClassID();
    tinymonkeys.vue.VueElement var20 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var21 = var20.getPeer();
    var20.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var20.transferFocusUpCycle();
    boolean var27 = var20.getInheritsPopupMenu();
    tinymonkeys.vue.VueElement var33 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var34 = var33.getPeer();
    var33.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var33.repaint();
    java.lang.Object var40 = var33.getTreeLock();
    tinymonkeys.vue.VueElement var46 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var47 = var46.getPeer();
    var46.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var46.repaint();
    var46.updateUI();
    int var54 = var33.getComponentZOrder((java.awt.Component)var46);
    var13.add((java.awt.Component)var20, (java.lang.Object)var33);
    boolean var56 = var5.isFocusCycleRoot((java.awt.Container)var20);
    javax.swing.event.AncestorListener[] var57 = var5.getAncestorListeners();
    var5.setDimensions((-1), 10, 11);
    tinymonkeys.vue.VueElement var67 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var68 = var67.getPeer();
    var67.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var67.repaint();
    var67.updateUI();
    var67.show(false);
    float var77 = var67.getAlignmentY();
    java.awt.Rectangle var78 = var67.bounds();
    var5.paintImmediately(var78);
    java.util.Locale var80 = var5.getLocale();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "PanelUI"+ "'", var14.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test204");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var6 = var5.getUIClassID();
    java.awt.Dimension var7 = var5.getMaximumSize();
    var5.revalidate();
    boolean var9 = var5.isDisplayable();
    boolean var10 = var5.getFocusTraversalKeysEnabled();
    float var11 = var5.getAlignmentX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "PanelUI"+ "'", var6.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.5f);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test205");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    java.awt.Color var7 = var5.getForeground();
    boolean var8 = var5.isRequestFocusEnabled();
    java.awt.event.MouseWheelListener[] var9 = var5.getMouseWheelListeners();
    java.awt.Component.BaselineResizeBehavior var10 = var5.getBaselineResizeBehavior();
    tinymonkeys.controleur.Controller var12 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var13 = new tinymonkeys.vue.Fenetre("PanelUI", var12);
    int var14 = var13.getExtendedState();
    java.awt.Component var15 = var13.getFocusOwner();
    tinymonkeys.vue.VueElement var21 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var22 = var21.getPeer();
    var21.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var21.repaint();
    java.lang.Object var28 = var21.getTreeLock();
    java.awt.Component var31 = var21.locate(0, (-1));
    var21.setAlignmentX(0.5f);
    java.awt.Font var34 = var21.getFont();
    tinymonkeys.vue.VueElement var41 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var42 = var41.getUIClassID();
    float var43 = var41.getAlignmentX();
    boolean var44 = var41.isOptimizedDrawingEnabled();
    var21.putClientProperty((java.lang.Object)' ', (java.lang.Object)var44);
    var21.transferFocusBackward();
    java.awt.Dimension var47 = var21.getSize();
    var13.setSize(var47);
    java.awt.Container var49 = var13.getContentPane();
    tinymonkeys.controleur.Controller var51 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var52 = new tinymonkeys.vue.Fenetre("PanelUI", var51);
    var52.pack();
    var52.addNotify();
    java.awt.Graphics var55 = var52.getGraphics();
    var13.paintAll(var55);
    var5.printComponents(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "PanelUI"+ "'", var42.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test206");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    int var3 = var2.getExtendedState();
    java.awt.Window.Type var4 = var2.getType();
    tinymonkeys.vue.VueElement var10 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var11 = var10.getPeer();
    javax.swing.InputMap var13 = var10.getInputMap(0);
    boolean var14 = var10.isDisplayable();
    boolean var15 = var10.getFocusTraversalKeysEnabled();
    java.awt.Dimension var16 = var10.getMaximumSize();
    var2.setMinimumSize(var16);
    java.awt.Window[] var18 = var2.getOwnedWindows();
    var2.setLocationByPlatform(true);
    java.awt.Container var21 = var2.getContentPane();
    var2.firePropertyChange("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,hidden,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777216,maximumSize=,minimumSize=,preferredSize=]", (short)1, (short)10);
    boolean var26 = var2.isFocusableWindow();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test207");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    javax.swing.InputMap var8 = var5.getInputMap(0);
    boolean var9 = var5.isShowing();
    java.awt.dnd.DropTarget var10 = var5.getDropTarget();
    boolean var11 = var5.getIgnoreRepaint();
    java.awt.Point var12 = var5.getMousePosition();
    java.awt.Graphics var13 = var5.getGraphics();
    int var14 = var5.getY();
    java.awt.Dimension var15 = var5.minimumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test208");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    javax.swing.InputMap var8 = var5.getInputMap(0);
    tinymonkeys.vue.VueElement var15 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var16 = var15.getPeer();
    javax.swing.InputMap var18 = var15.getInputMap(0);
    java.awt.Component.BaselineResizeBehavior var19 = var15.getBaselineResizeBehavior();
    boolean var20 = var15.isPreferredSizeSet();
    java.awt.Component var21 = var5.add("", (java.awt.Component)var15);
    java.awt.Cursor var22 = var15.getCursor();
    boolean var23 = var15.getVerifyInputWhenFocusTarget();
    javax.swing.ActionMap var24 = var15.getActionMap();
    var15.enable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test209");


    tinymonkeys.vue.VueSingeErratique var5 = new tinymonkeys.vue.VueSingeErratique(1, 1, 10, (-1), 11);
    java.awt.GraphicsConfiguration var6 = var5.getGraphicsConfiguration();
    int var7 = var5.getX();
    java.awt.event.FocusListener[] var8 = var5.getFocusListeners();
    boolean var9 = var5.getIgnoreRepaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test210");


    tinymonkeys.modele.Ile var2 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var3 = new tinymonkeys.modele.BandeDeSingesErratiques(var2);
    tinymonkeys.modele.SingeErratique var4 = new tinymonkeys.modele.SingeErratique((-1), 11, var2);
    tinymonkeys.modele.Ile var5 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var6 = new tinymonkeys.modele.BandeDeSingesErratiques(var5);
    int[][] var7 = new int[][] { };
    var5.creationCarte(var7);
    var2.creationCarte(var7);
    tinymonkeys.modele.Pirate var10 = new tinymonkeys.modele.Pirate(var2);
    tinymonkeys.modele.Pirate var12 = new tinymonkeys.modele.Pirate(var2, "PanelUI");
    boolean var15 = var2.singeEstPresent(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test211");


    tinymonkeys.modele.Ile var2 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var3 = new tinymonkeys.modele.BandeDeSingesErratiques(var2);
    tinymonkeys.modele.SingeErratique var4 = new tinymonkeys.modele.SingeErratique((-1), 11, var2);
    tinymonkeys.modele.Tresor var5 = var2.getTresor();
    tinymonkeys.modele.Ile var8 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var9 = new tinymonkeys.modele.BandeDeSingesErratiques(var8);
    tinymonkeys.modele.SingeErratique var10 = new tinymonkeys.modele.SingeErratique((-1), 11, var8);
    tinymonkeys.modele.Ile var11 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var12 = new tinymonkeys.modele.BandeDeSingesErratiques(var11);
    int[][] var13 = new int[][] { };
    var11.creationCarte(var13);
    var8.creationCarte(var13);
    tinymonkeys.modele.Ile var16 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var17 = new tinymonkeys.modele.BandeDeSingesErratiques(var16);
    int[][] var18 = new int[][] { };
    var16.creationCarte(var18);
    var8.creationCarte(var18);
    tinymonkeys.controleur.Controller var22 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var23 = new tinymonkeys.vue.Fenetre("PanelUI", var22);
    tinymonkeys.vue.VueElement var29 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var35 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var36 = var29.isAncestorOf((java.awt.Component)var35);
    boolean var37 = var29.isFocusTraversalPolicyProvider();
    boolean var40 = var29.contains(10, 111);
    java.awt.Dimension var41 = var29.minimumSize();
    tinymonkeys.vue.VueElement var47 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var48 = var47.getPeer();
    var47.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var47.repaint();
    java.lang.Object var54 = var47.getTreeLock();
    tinymonkeys.vue.VueElement var60 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var61 = var60.getPeer();
    var60.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var60.repaint();
    var60.updateUI();
    int var68 = var47.getComponentZOrder((java.awt.Component)var60);
    java.awt.Insets var69 = var47.getInsets();
    java.util.Locale var70 = var47.getLocale();
    var47.hide();
    java.awt.LayoutManager var72 = var47.getLayout();
    var29.setLayout(var72);
    var23.setLayout(var72);
    java.awt.Color var75 = var23.getBackground();
    java.awt.MenuBar var76 = var23.getMenuBar();
    var8.enregistreEcIle((tinymonkeys.modele.IleEcouteur)var23);
    var2.enregistreEcIle((tinymonkeys.modele.IleEcouteur)var23);
    tinymonkeys.vue.VueElement var84 = new tinymonkeys.vue.VueElement(0, 0, 1, 1, 11);
    boolean var86 = var84.requestFocus(false);
    java.awt.event.ComponentListener[] var87 = var84.getComponentListeners();
    var23.setLocationRelativeTo((java.awt.Component)var84);
    java.awt.ComponentOrientation var89 = var23.getComponentOrientation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test212");


    tinymonkeys.modele.Ile var2 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var3 = new tinymonkeys.modele.BandeDeSingesErratiques(var2);
    tinymonkeys.modele.SingeErratique var4 = new tinymonkeys.modele.SingeErratique((-1), 11, var2);
    tinymonkeys.modele.Ile var5 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var6 = new tinymonkeys.modele.BandeDeSingesErratiques(var5);
    int[][] var7 = new int[][] { };
    var5.creationCarte(var7);
    var2.creationCarte(var7);
    tinymonkeys.modele.Ile var12 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var13 = new tinymonkeys.modele.BandeDeSingesErratiques(var12);
    tinymonkeys.modele.SingeErratique var14 = new tinymonkeys.modele.SingeErratique((-1), 11, var12);
    tinymonkeys.modele.Ile var15 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var16 = new tinymonkeys.modele.BandeDeSingesErratiques(var15);
    int[][] var17 = new int[][] { };
    var15.creationCarte(var17);
    var12.creationCarte(var17);
    var2.creationCarte(var17);
    tinymonkeys.modele.Pirate var21 = var2.getPirate();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.ajoutPirate("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test213");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    int var3 = var2.getExtendedState();
    java.awt.Window.Type var4 = var2.getType();
    tinymonkeys.vue.VueElement var10 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var11 = var10.getPeer();
    javax.swing.InputMap var13 = var10.getInputMap(0);
    boolean var14 = var10.isDisplayable();
    boolean var15 = var10.getFocusTraversalKeysEnabled();
    java.awt.Dimension var16 = var10.getMaximumSize();
    var2.setMinimumSize(var16);
    boolean var18 = var2.isLocationByPlatform();
    var2.setState(100);
    java.awt.im.InputContext var21 = var2.getInputContext();
    boolean var22 = var2.isFocusCycleRoot();
    boolean var23 = var2.isResizable();
    java.awt.Container var24 = var2.getFocusCycleRootAncestor();
    float var25 = var2.getOpacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1.0f);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test214");


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
    var2.move(10, (-1));
    java.awt.Component var59 = var2.getMostRecentFocusOwner();
    var2.setLocation(0, (-1));
    boolean var63 = var2.isFocusOwner();
    int var64 = var2.getDefaultCloseOperation();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 3);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test215");


    tinymonkeys.modele.Ile var2 = new tinymonkeys.modele.Ile();
    int[][] var3 = var2.getCarte();
    tinymonkeys.modele.SingeErratique var4 = new tinymonkeys.modele.SingeErratique(111, 10, var2);
    boolean var7 = var2.singeEstPresent(10, 11);
    var2.demandeDeplacementPirate(10, 1);
    tinymonkeys.modele.Pirate var11 = var2.getPirate();
    var11.demandeDeplacement(3, 3);
    java.lang.String var15 = var11.getAvatar();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test216");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.Pirate var1 = var0.getPirate();
    tinymonkeys.modele.BandeDeSingesErratiques var2 = var0.getSingesErratiques();
    tinymonkeys.controleur.Controller var4 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var5 = new tinymonkeys.vue.Fenetre("PanelUI", var4);
    var5.pack();
    var5.addNotify();
    var2.enregistreEcBandeSinges((tinymonkeys.modele.BandeDeSingesErratiquesEcouteur)var5);
    tinymonkeys.controleur.Controller var10 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var11 = new tinymonkeys.vue.Fenetre("PanelUI", var10);
    tinymonkeys.vue.VueElement var17 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var23 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var24 = var17.isAncestorOf((java.awt.Component)var23);
    boolean var25 = var17.isFocusTraversalPolicyProvider();
    boolean var28 = var17.contains(10, 111);
    java.awt.Dimension var29 = var17.minimumSize();
    tinymonkeys.vue.VueElement var35 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var36 = var35.getPeer();
    var35.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var35.repaint();
    java.lang.Object var42 = var35.getTreeLock();
    tinymonkeys.vue.VueElement var48 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var49 = var48.getPeer();
    var48.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var48.repaint();
    var48.updateUI();
    int var56 = var35.getComponentZOrder((java.awt.Component)var48);
    java.awt.Insets var57 = var35.getInsets();
    java.util.Locale var58 = var35.getLocale();
    var35.hide();
    java.awt.LayoutManager var60 = var35.getLayout();
    var17.setLayout(var60);
    var11.setLayout(var60);
    javax.accessibility.AccessibleContext var63 = var11.getAccessibleContext();
    java.lang.String var64 = var11.getTitle();
    var2.enregistreEcBandeSinges((tinymonkeys.modele.BandeDeSingesErratiquesEcouteur)var11);
    java.util.Vector var66 = var2.getSingesErratiques();
    var2.ajoutSingesErratiques((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "PanelUI"+ "'", var64.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test217");


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
    tinymonkeys.vue.VueElement var60 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var61 = var60.getPeer();
    java.awt.Color var62 = var60.getForeground();
    var2.setBackground(var62);
    java.awt.event.FocusListener[] var64 = var2.getFocusListeners();
    var2.setVisible(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test218");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    javax.swing.plaf.PanelUI var13 = var5.getUI();
    var5.transferFocusDownCycle();
    var5.doLayout();
    tinymonkeys.vue.VueElement var21 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var22 = var21.getPeer();
    var21.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var21.repaint();
    var21.updateUI();
    var21.show(false);
    float var31 = var21.getAlignmentY();
    java.awt.Rectangle var32 = var21.bounds();
    var5.repaint(var32);
    boolean var34 = var5.isCursorSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test219");


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
    var2.setVisible(false);
    int var59 = var2.getDefaultCloseOperation();
    java.awt.Window var60 = var2.getOwner();
    boolean var61 = var2.isAutoRequestFocus();
    boolean var62 = var2.isDoubleBuffered();
    var2.hide();
    tinymonkeys.vue.VueElement var69 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var70 = var69.getUIClassID();
    java.awt.peer.ComponentPeer var71 = var69.getPeer();
    java.beans.VetoableChangeListener[] var72 = var69.getVetoableChangeListeners();
    boolean var73 = var69.getVerifyInputWhenFocusTarget();
    tinymonkeys.vue.VueElement var79 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var80 = var79.getPeer();
    var79.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var79.repaint();
    java.lang.Object var86 = var79.getTreeLock();
    java.awt.image.ColorModel var87 = var79.getColorModel();
    boolean var88 = var79.getAutoscrolls();
    var79.setIgnoreRepaint(true);
    java.awt.Rectangle var91 = var79.getVisibleRect();
    var69.repaint(var91);
    var2.setBounds(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "PanelUI"+ "'", var70.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test220");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.revalidate();
    var5.setSize(0, 11);
    java.awt.Dimension var10 = var5.getMinimumSize();
    javax.swing.InputMap var11 = var5.getInputMap();
    java.awt.Insets var12 = var5.insets();
    tinymonkeys.vue.VueElement var18 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var18.enable(true);
    int var21 = var18.getY();
    boolean var22 = var18.isValid();
    var18.setDebugGraphicsOptions(111);
    javax.swing.ActionMap var25 = var18.getActionMap();
    var5.setActionMap(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test221");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var1 = new tinymonkeys.modele.BandeDeSingesErratiques(var0);
    int[][] var2 = new int[][] { };
    var0.creationCarte(var2);
    tinymonkeys.modele.Pirate var5 = new tinymonkeys.modele.Pirate(var0, "PanelUI");
    tinymonkeys.modele.BandeDeSingesErratiques var6 = var0.getSingesErratiques();
    javax.swing.event.EventListenerList var7 = var6.getBandeSingesEcouteurs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test222");


    tinymonkeys.vue.VueTresor var5 = new tinymonkeys.vue.VueTresor(10, 3, 111, 1920, 1920);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test223");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    java.awt.im.InputContext var13 = var11.getInputContext();
    boolean var14 = var11.isRequestFocusEnabled();
    java.awt.event.KeyListener[] var15 = var11.getKeyListeners();
    java.util.Locale var16 = var11.getLocale();
    javax.swing.InputMap var17 = var11.getInputMap();
    tinymonkeys.controleur.Controller var19 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var20 = new tinymonkeys.vue.Fenetre("PanelUI", var19);
    tinymonkeys.vue.VueElement var26 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var32 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var33 = var26.isAncestorOf((java.awt.Component)var32);
    boolean var34 = var26.isFocusTraversalPolicyProvider();
    boolean var37 = var26.contains(10, 111);
    java.awt.Dimension var38 = var26.minimumSize();
    tinymonkeys.vue.VueElement var44 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var45 = var44.getPeer();
    var44.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var44.repaint();
    java.lang.Object var51 = var44.getTreeLock();
    tinymonkeys.vue.VueElement var57 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var58 = var57.getPeer();
    var57.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var57.repaint();
    var57.updateUI();
    int var65 = var44.getComponentZOrder((java.awt.Component)var57);
    java.awt.Insets var66 = var44.getInsets();
    java.util.Locale var67 = var44.getLocale();
    var44.hide();
    java.awt.LayoutManager var69 = var44.getLayout();
    var26.setLayout(var69);
    var20.setLayout(var69);
    java.awt.Color var72 = var20.getBackground();
    tinymonkeys.vue.VueElement var78 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var79 = var78.getPeer();
    java.awt.Color var80 = var78.getForeground();
    var20.setBackground(var80);
    boolean var82 = var20.isShowing();
    javax.swing.TransferHandler var83 = var20.getTransferHandler();
    var11.addKeyListener((java.awt.event.KeyListener)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test224");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.setAlignmentX(0.5f);
    java.awt.Font var18 = var5.getFont();
    tinymonkeys.vue.VueElement var25 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var26 = var25.getUIClassID();
    float var27 = var25.getAlignmentX();
    boolean var28 = var25.isOptimizedDrawingEnabled();
    var5.putClientProperty((java.lang.Object)' ', (java.lang.Object)var28);
    boolean var30 = var5.isDoubleBuffered();
    boolean var31 = var5.requestFocusInWindow();
    var5.enableInputMethods(false);
    int var34 = var5.getY();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "PanelUI"+ "'", var26.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 11);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test225");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var6 = var5.getUIClassID();
    java.awt.Dimension var7 = var5.getMaximumSize();
    var5.revalidate();
    boolean var9 = var5.isDisplayable();
    tinymonkeys.controleur.Controller var11 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var12 = new tinymonkeys.vue.Fenetre("PanelUI", var11);
    tinymonkeys.vue.VueElement var18 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var24 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var25 = var18.isAncestorOf((java.awt.Component)var24);
    boolean var26 = var18.isFocusTraversalPolicyProvider();
    boolean var29 = var18.contains(10, 111);
    java.awt.Dimension var30 = var18.minimumSize();
    tinymonkeys.vue.VueElement var36 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var37 = var36.getPeer();
    var36.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var36.repaint();
    java.lang.Object var43 = var36.getTreeLock();
    tinymonkeys.vue.VueElement var49 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var50 = var49.getPeer();
    var49.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var49.repaint();
    var49.updateUI();
    int var57 = var36.getComponentZOrder((java.awt.Component)var49);
    java.awt.Insets var58 = var36.getInsets();
    java.util.Locale var59 = var36.getLocale();
    var36.hide();
    java.awt.LayoutManager var61 = var36.getLayout();
    var18.setLayout(var61);
    var12.setLayout(var61);
    java.awt.Color var64 = var12.getBackground();
    java.awt.Toolkit var65 = var12.getToolkit();
    javax.swing.TransferHandler var66 = var12.getTransferHandler();
    int var67 = var12.getDefaultCloseOperation();
    var12.setResizable(false);
    var12.setBounds((-1), 1, 111, 3);
    var12.show();
    java.awt.im.InputContext var76 = var12.getInputContext();
    java.awt.Graphics var77 = var12.getGraphics();
    var5.printAll(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "PanelUI"+ "'", var6.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test226");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    tinymonkeys.vue.VueElement var18 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var19 = var18.getPeer();
    var18.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var18.repaint();
    var18.updateUI();
    int var26 = var5.getComponentZOrder((java.awt.Component)var18);
    boolean var27 = var18.isDoubleBuffered();
    boolean var28 = var18.isBackgroundSet();
    java.lang.String var29 = var18.toString();
    var18.disable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]"+ "'", var29.equals("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]"));

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test227");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    boolean var13 = var5.isFocusTraversalPolicyProvider();
    boolean var14 = var5.isShowing();
    boolean var15 = var5.isFocusTraversalPolicySet();
    var5.move(1, 10);
    var5.repaint((-1L), 100, 0, 10, 100);
    tinymonkeys.vue.VueElement var30 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var31 = var30.getPeer();
    var30.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var30.repaint();
    java.lang.Object var37 = var30.getTreeLock();
    java.awt.Component var40 = var30.locate(0, (-1));
    var30.requestFocus();
    boolean var42 = var30.isFocusTraversable();
    java.lang.Object var43 = var5.getClientProperty((java.lang.Object)var42);
    var5.doLayout();
    boolean var45 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var5);
    float var46 = var5.getAlignmentY();
    var5.reshape(1, 11, 100, 32767);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0.5f);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test228");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.transferFocusUpCycle();
    tinymonkeys.vue.VueElement var17 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var18 = var17.getPeer();
    var17.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var17.repaint();
    java.lang.Object var24 = var17.getTreeLock();
    java.awt.event.HierarchyListener[] var25 = var17.getHierarchyListeners();
    boolean var26 = var5.isAncestorOf((java.awt.Component)var17);
    boolean var27 = var17.isFontSet();
    tinymonkeys.vue.VueElement var33 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var34 = var33.getPeer();
    var33.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var33.repaint();
    java.lang.Object var40 = var33.getTreeLock();
    java.awt.Component var43 = var33.locate(0, (-1));
    var33.setAlignmentX(0.5f);
    java.awt.Font var46 = var33.getFont();
    tinymonkeys.vue.VueElement var53 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var54 = var53.getUIClassID();
    float var55 = var53.getAlignmentX();
    boolean var56 = var53.isOptimizedDrawingEnabled();
    var33.putClientProperty((java.lang.Object)' ', (java.lang.Object)var56);
    tinymonkeys.vue.VueElement var63 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var64 = var63.getPeer();
    var63.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var63.repaint();
    java.lang.Object var70 = var63.getTreeLock();
    java.awt.Component var73 = var63.locate(0, (-1));
    var63.setAlignmentX(0.5f);
    java.awt.Font var76 = var63.getFont();
    java.awt.FontMetrics var77 = var33.getFontMetrics(var76);
    java.awt.FontMetrics var78 = var17.getFontMetrics(var76);
    java.awt.Component[] var79 = var17.getComponents();
    java.beans.PropertyChangeListener[] var80 = var17.getPropertyChangeListeners();
    boolean var81 = var17.isLightweight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "PanelUI"+ "'", var54.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test229");


    tinymonkeys.vue.VuePirate var6 = new tinymonkeys.vue.VuePirate(100, 1, 1, 10, 11, "hi!");
    boolean var7 = var6.isOpaque();
    tinymonkeys.vue.VuePirate var14 = new tinymonkeys.vue.VuePirate(100, 1, 1, 10, 11, "hi!");
    var14.mortPirate();
    java.awt.Insets var16 = var14.insets();
    tinymonkeys.vue.VueElement var22 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var28 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var29 = var22.isAncestorOf((java.awt.Component)var28);
    javax.swing.plaf.PanelUI var30 = var22.getUI();
    java.awt.Image var33 = var22.createImage(0, 1);
    tinymonkeys.vue.VueElement var39 = new tinymonkeys.vue.VueElement(0, 0, 1, 1, 11);
    java.awt.Component var42 = var39.locate(11, 10);
    tinymonkeys.vue.VueElement var48 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var49 = var48.getPeer();
    var48.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var48.repaint();
    var48.updateUI();
    var48.show(false);
    float var58 = var48.getAlignmentY();
    java.awt.Rectangle var59 = var48.bounds();
    java.awt.Rectangle var60 = var39.getBounds(var59);
    boolean var61 = var39.isFocusCycleRoot();
    java.awt.Component var64 = var39.findComponentAt(0, (-1));
    tinymonkeys.vue.VueElement var70 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var71 = var70.getPeer();
    var70.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var70.repaint();
    java.lang.Object var77 = var70.getTreeLock();
    java.awt.image.ColorModel var78 = var70.getColorModel();
    var70.setLocation(100, 1);
    boolean var82 = var70.isMaximumSizeSet();
    java.awt.Component var83 = var39.add((java.awt.Component)var70);
    tinymonkeys.controleur.Controller var85 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var86 = new tinymonkeys.vue.Fenetre("PanelUI", var85);
    var86.pack();
    var86.addNotify();
    java.awt.Graphics var89 = var86.getGraphics();
    var83.paintAll(var89);
    var22.paintAll(var89);
    var14.dessineElement(var89);
    var6.dessineElement(var89);
    var6.mortPirate();
    boolean var95 = var6.isDoubleBuffered();
    var6.setInheritsPopupMenu(true);
    java.awt.im.InputContext var98 = var6.getInputContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var98);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test230");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.transferFocusUpCycle();
    tinymonkeys.vue.VueElement var17 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var18 = var17.getPeer();
    var17.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var17.repaint();
    java.lang.Object var24 = var17.getTreeLock();
    java.awt.event.HierarchyListener[] var25 = var17.getHierarchyListeners();
    boolean var26 = var5.isAncestorOf((java.awt.Component)var17);
    boolean var27 = var17.isFontSet();
    tinymonkeys.vue.VueElement var33 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var34 = var33.getPeer();
    var33.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var33.repaint();
    java.lang.Object var40 = var33.getTreeLock();
    java.awt.Component var43 = var33.locate(0, (-1));
    var33.setAlignmentX(0.5f);
    java.awt.Font var46 = var33.getFont();
    tinymonkeys.vue.VueElement var53 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var54 = var53.getUIClassID();
    float var55 = var53.getAlignmentX();
    boolean var56 = var53.isOptimizedDrawingEnabled();
    var33.putClientProperty((java.lang.Object)' ', (java.lang.Object)var56);
    tinymonkeys.vue.VueElement var63 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var64 = var63.getPeer();
    var63.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var63.repaint();
    java.lang.Object var70 = var63.getTreeLock();
    java.awt.Component var73 = var63.locate(0, (-1));
    var63.setAlignmentX(0.5f);
    java.awt.Font var76 = var63.getFont();
    java.awt.FontMetrics var77 = var33.getFontMetrics(var76);
    java.awt.FontMetrics var78 = var17.getFontMetrics(var76);
    java.awt.Component[] var79 = var17.getComponents();
    tinymonkeys.vue.VueElement var85 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var85.revalidate();
    java.lang.String var87 = var85.toString();
    java.awt.Font var88 = var85.getFont();
    java.awt.FontMetrics var89 = var17.getFontMetrics(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "PanelUI"+ "'", var54.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + "tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]"+ "'", var87.equals("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test231");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.revalidate();
    java.beans.PropertyChangeListener[] var8 = var5.getPropertyChangeListeners("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]");
    java.awt.event.ComponentListener[] var9 = var5.getComponentListeners();
    javax.swing.event.AncestorListener[] var10 = var5.getAncestorListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test232");


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
    tinymonkeys.vue.VueElement var60 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var61 = var60.getPeer();
    java.awt.Color var62 = var60.getForeground();
    var2.setBackground(var62);
    boolean var64 = var2.isAutoRequestFocus();
    var2.setResizable(false);
    java.awt.event.WindowListener[] var67 = var2.getWindowListeners();
    boolean var68 = var2.hasFocus();
    java.awt.event.HierarchyListener[] var69 = var2.getHierarchyListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test233");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.transferFocusUpCycle();
    tinymonkeys.vue.VueElement var17 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var18 = var17.getPeer();
    var17.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var17.repaint();
    java.lang.Object var24 = var17.getTreeLock();
    java.awt.image.ColorModel var25 = var17.getColorModel();
    var17.setLocation(100, 1);
    boolean var29 = var17.isDoubleBuffered();
    java.util.Locale var30 = var17.getLocale();
    java.awt.Dimension var31 = var17.getMaximumSize();
    tinymonkeys.vue.VueElement var37 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var38 = var37.getPeer();
    var37.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var37.repaint();
    java.lang.Object var44 = var37.getTreeLock();
    java.awt.image.ColorModel var45 = var37.getColorModel();
    boolean var46 = var37.getVerifyInputWhenFocusTarget();
    int var47 = var37.getWidth();
    java.util.Locale var48 = var37.getLocale();
    var17.setLocale(var48);
    javax.swing.plaf.PanelUI var50 = var17.getUI();
    var5.setUI(var50);
    java.awt.Point var52 = var5.getMousePosition();
    java.awt.Component[] var53 = var5.getComponents();
    var5.firePropertyChange("tinymonkeys.vue.VueSingeErratique[,1,22,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]", 111, 111);
    tinymonkeys.vue.VueElement var63 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var64 = var63.getPeer();
    var63.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var63.repaint();
    java.awt.GraphicsConfiguration var70 = var63.getGraphicsConfiguration();
    java.awt.Insets var71 = var63.insets();
    java.awt.Point var72 = var63.location();
    tinymonkeys.vue.VueElement var78 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var79 = var78.getPeer();
    javax.swing.InputMap var81 = var78.getInputMap(0);
    tinymonkeys.vue.VueElement var88 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var89 = var88.getPeer();
    javax.swing.InputMap var91 = var88.getInputMap(0);
    java.awt.Component.BaselineResizeBehavior var92 = var88.getBaselineResizeBehavior();
    boolean var93 = var88.isPreferredSizeSet();
    java.awt.Component var94 = var78.add("", (java.awt.Component)var88);
    java.awt.Cursor var95 = var88.getCursor();
    boolean var96 = var88.getVerifyInputWhenFocusTarget();
    javax.swing.ActionMap var97 = var88.getActionMap();
    javax.swing.event.AncestorListener[] var98 = var88.getAncestorListeners();
    var5.putClientProperty((java.lang.Object)var72, (java.lang.Object)var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test234");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.requestFocus();
    boolean var17 = var5.isFocusTraversable();
    tinymonkeys.vue.VueElement var23 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var24 = var23.getPeer();
    var23.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var23.repaint();
    java.lang.Object var30 = var23.getTreeLock();
    java.awt.Component var33 = var23.locate(0, (-1));
    var23.setAlignmentX(0.5f);
    java.awt.Font var36 = var23.getFont();
    tinymonkeys.vue.VueElement var43 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var44 = var43.getUIClassID();
    float var45 = var43.getAlignmentX();
    boolean var46 = var43.isOptimizedDrawingEnabled();
    var23.putClientProperty((java.lang.Object)' ', (java.lang.Object)var46);
    var23.transferFocusBackward();
    tinymonkeys.vue.VueElement var54 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var55 = var54.getPeer();
    var54.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var54.repaint();
    java.awt.GraphicsConfiguration var61 = var54.getGraphicsConfiguration();
    var54.setFocusCycleRoot(true);
    var5.add((java.awt.Component)var23, (java.lang.Object)true);
    boolean var65 = var5.isDoubleBuffered();
    var5.setVisible(true);
    tinymonkeys.vue.VueElement var73 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var79 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var80 = var73.isAncestorOf((java.awt.Component)var79);
    java.awt.Dimension var81 = var73.size();
    var5.resize(var81);
    boolean var83 = var5.isValidateRoot();
    var5.setRequestFocusEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "PanelUI"+ "'", var44.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test235");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.setAlignmentX(0.5f);
    java.awt.Font var18 = var5.getFont();
    boolean var19 = var5.isRequestFocusEnabled();
    java.awt.im.InputMethodRequests var20 = var5.getInputMethodRequests();
    var5.transferFocusBackward();
    var5.setIgnoreRepaint(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test236");


    tinymonkeys.vue.VuePirate var6 = new tinymonkeys.vue.VuePirate(100, 1, 1, 10, 11, "hi!");
    java.awt.Dimension var7 = var6.getMaximumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test237");


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
    javax.accessibility.AccessibleContext var54 = var2.getAccessibleContext();
    var2.setAlwaysOnTop(true);
    var2.setCursor(10);
    tinymonkeys.vue.VueElement var64 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var64.enable(true);
    int var67 = var64.getY();
    boolean var68 = var64.isValid();
    var64.setDebugGraphicsOptions(111);
    javax.swing.ActionMap var71 = var64.getActionMap();
    var2.setLocationRelativeTo((java.awt.Component)var64);
    java.awt.Container var73 = var2.getFocusCycleRootAncestor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test238");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    boolean var13 = var5.isFocusTraversalPolicyProvider();
    java.awt.event.MouseMotionListener[] var14 = var5.getMouseMotionListeners();
    javax.swing.ActionMap var15 = var5.getActionMap();
    boolean var16 = var5.isFontSet();
    boolean var17 = var5.isDoubleBuffered();
    var5.reshape(1, 1, 99, 32767);
    javax.swing.InputMap var23 = var5.getInputMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test239");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.enable(true);
    int var8 = var5.getY();
    boolean var9 = var5.isValid();
    java.awt.Toolkit var10 = var5.getToolkit();
    java.awt.image.ColorModel var11 = var5.getColorModel();
    tinymonkeys.vue.VueElement var17 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var17.revalidate();
    tinymonkeys.vue.VueElement var24 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var25 = var24.getPeer();
    java.awt.Color var26 = var24.getForeground();
    boolean var27 = var24.isRequestFocusEnabled();
    var24.firePropertyChange("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]", '4', 'a');
    java.awt.Rectangle var32 = var24.getVisibleRect();
    java.awt.Rectangle var33 = var17.getBounds(var32);
    var5.setBounds(var32);
    boolean var35 = var5.isBackgroundSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test240");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var1 = var0.getSingesErratiques();
    tinymonkeys.modele.Pirate var2 = var0.getPirate();
    tinymonkeys.modele.Ile var5 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var6 = new tinymonkeys.modele.BandeDeSingesErratiques(var5);
    tinymonkeys.modele.SingeErratique var7 = new tinymonkeys.modele.SingeErratique((-1), 11, var5);
    tinymonkeys.modele.Ile var8 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var9 = new tinymonkeys.modele.BandeDeSingesErratiques(var8);
    int[][] var10 = new int[][] { };
    var8.creationCarte(var10);
    var5.creationCarte(var10);
    tinymonkeys.modele.Ile var15 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var16 = new tinymonkeys.modele.BandeDeSingesErratiques(var15);
    tinymonkeys.modele.SingeErratique var17 = new tinymonkeys.modele.SingeErratique((-1), 11, var15);
    tinymonkeys.modele.Ile var18 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var19 = new tinymonkeys.modele.BandeDeSingesErratiques(var18);
    int[][] var20 = new int[][] { };
    var18.creationCarte(var20);
    var15.creationCarte(var20);
    var5.creationCarte(var20);
    var0.creationCarte(var20);
    tinymonkeys.modele.Pirate var25 = var0.getPirate();
    tinymonkeys.modele.Pirate var26 = var0.getPirate();
    javax.swing.event.EventListenerList var27 = var0.getIleEcouteurs();
    tinymonkeys.modele.Tresor var28 = var0.getTresor();
    tinymonkeys.modele.BandeDeSingesErratiques var29 = new tinymonkeys.modele.BandeDeSingesErratiques(var0);
    java.util.Vector var30 = var29.getSingesErratiques();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test241");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(0, 0, 1, 1, 11);
    java.awt.Component var8 = var5.locate(11, 10);
    tinymonkeys.vue.VueElement var14 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var15 = var14.getPeer();
    var14.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var14.repaint();
    var14.updateUI();
    var14.show(false);
    float var24 = var14.getAlignmentY();
    java.awt.Rectangle var25 = var14.bounds();
    java.awt.Rectangle var26 = var5.getBounds(var25);
    boolean var27 = var5.isFocusCycleRoot();
    java.awt.Component var30 = var5.findComponentAt(0, (-1));
    tinymonkeys.vue.VueElement var36 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var37 = var36.getPeer();
    var36.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var36.repaint();
    java.lang.Object var43 = var36.getTreeLock();
    java.awt.image.ColorModel var44 = var36.getColorModel();
    var36.setLocation(100, 1);
    boolean var48 = var36.isMaximumSizeSet();
    java.awt.Component var49 = var5.add((java.awt.Component)var36);
    boolean var50 = var5.isCursorSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test242");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.requestFocus();
    tinymonkeys.vue.VueElement var22 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var23 = var22.getPeer();
    var22.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var22.repaint();
    java.lang.Object var29 = var22.getTreeLock();
    java.awt.image.ColorModel var30 = var22.getColorModel();
    boolean var31 = var22.getVerifyInputWhenFocusTarget();
    var22.firePropertyChange("hi!", '4', 'a');
    java.awt.Rectangle var36 = var22.getBounds();
    var5.paintImmediately(var36);
    tinymonkeys.vue.VueSingeErratique var43 = new tinymonkeys.vue.VueSingeErratique(1, 1, 10, (-1), 11);
    tinymonkeys.vue.VueElement var49 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var50 = var49.getPeer();
    var49.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var49.repaint();
    java.lang.Object var56 = var49.getTreeLock();
    java.awt.Component var59 = var49.locate(0, (-1));
    var49.requestFocus();
    tinymonkeys.vue.VueElement var66 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var67 = var66.getPeer();
    var66.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var66.repaint();
    java.lang.Object var73 = var66.getTreeLock();
    java.awt.image.ColorModel var74 = var66.getColorModel();
    boolean var75 = var66.getVerifyInputWhenFocusTarget();
    var66.firePropertyChange("hi!", '4', 'a');
    java.awt.Rectangle var80 = var66.getBounds();
    var49.paintImmediately(var80);
    var43.setBounds(var80);
    var5.setBounds(var80);
    java.awt.event.InputMethodListener[] var84 = var5.getInputMethodListeners();
    var5.firePropertyChange("PanelUI", (short)1, (short)(-1));
    int var89 = var5.getComponentCount();
    java.awt.Component.BaselineResizeBehavior var90 = var5.getBaselineResizeBehavior();
    boolean var91 = var5.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == true);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test243");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.requestFocus();
    tinymonkeys.vue.VueElement var22 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var23 = var22.getPeer();
    var22.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var22.repaint();
    java.lang.Object var29 = var22.getTreeLock();
    java.awt.image.ColorModel var30 = var22.getColorModel();
    boolean var31 = var22.getVerifyInputWhenFocusTarget();
    var22.firePropertyChange("hi!", '4', 'a');
    java.awt.Rectangle var36 = var22.getBounds();
    var5.paintImmediately(var36);
    var5.removeAll();
    boolean var39 = var5.isFocusable();
    var5.firePropertyChange("tinymonkeys.vue.VueSingeErratique[,1,22,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]", ' ', '4');
    var5.move(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test244");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var6 = var5.getUIClassID();
    boolean var7 = var5.isFontSet();
    boolean var8 = var5.isOptimizedDrawingEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "PanelUI"+ "'", var6.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test245");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.transferFocusUpCycle();
    tinymonkeys.vue.VueElement var17 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var18 = var17.getPeer();
    var17.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var17.repaint();
    java.lang.Object var24 = var17.getTreeLock();
    java.awt.image.ColorModel var25 = var17.getColorModel();
    var17.setLocation(100, 1);
    boolean var29 = var17.isDoubleBuffered();
    java.util.Locale var30 = var17.getLocale();
    java.awt.Dimension var31 = var17.getMaximumSize();
    tinymonkeys.vue.VueElement var37 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var38 = var37.getPeer();
    var37.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var37.repaint();
    java.lang.Object var44 = var37.getTreeLock();
    java.awt.image.ColorModel var45 = var37.getColorModel();
    boolean var46 = var37.getVerifyInputWhenFocusTarget();
    int var47 = var37.getWidth();
    java.util.Locale var48 = var37.getLocale();
    var17.setLocale(var48);
    javax.swing.plaf.PanelUI var50 = var17.getUI();
    var5.setUI(var50);
    java.awt.Point var52 = var5.getMousePosition();
    java.awt.Component[] var53 = var5.getComponents();
    var5.firePropertyChange("tinymonkeys.vue.VueSingeErratique[,1,22,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]", 111, 111);
    var5.updateUI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test246");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.requestFocus();
    tinymonkeys.vue.VueElement var22 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var23 = var22.getPeer();
    var22.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var22.repaint();
    java.lang.Object var29 = var22.getTreeLock();
    java.awt.image.ColorModel var30 = var22.getColorModel();
    boolean var31 = var22.getVerifyInputWhenFocusTarget();
    var22.firePropertyChange("hi!", '4', 'a');
    java.awt.Rectangle var36 = var22.getBounds();
    var5.paintImmediately(var36);
    boolean var38 = var5.requestFocusInWindow();
    var5.firePropertyChange("hi!", 'a', 'a');
    java.awt.Dimension var43 = var5.getMaximumSize();
    javax.swing.JRootPane var44 = var5.getRootPane();
    var5.enable(false);
    var5.firePropertyChange("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,hidden,layout=java.awt.FlowLayout,alignmentX=0.5,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]", 0.5f, (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test247");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.requestFocus();
    tinymonkeys.vue.VueElement var22 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var23 = var22.getPeer();
    var22.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var22.repaint();
    java.lang.Object var29 = var22.getTreeLock();
    java.awt.image.ColorModel var30 = var22.getColorModel();
    boolean var31 = var22.getVerifyInputWhenFocusTarget();
    var22.firePropertyChange("hi!", '4', 'a');
    java.awt.Rectangle var36 = var22.getBounds();
    var5.paintImmediately(var36);
    var5.setAlignmentY(1.0f);
    var5.setFocusable(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test248");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    int var3 = var2.getExtendedState();
    java.awt.Window.Type var4 = var2.getType();
    tinymonkeys.vue.VueElement var10 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var11 = var10.getPeer();
    javax.swing.InputMap var13 = var10.getInputMap(0);
    boolean var14 = var10.isDisplayable();
    boolean var15 = var10.getFocusTraversalKeysEnabled();
    java.awt.Dimension var16 = var10.getMaximumSize();
    var2.setMinimumSize(var16);
    boolean var18 = var2.isLocationByPlatform();
    var2.doLayout();
    var2.pack();
    tinymonkeys.vue.VueElement var26 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var27 = var26.getPeer();
    var26.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var26.repaint();
    java.lang.Object var33 = var26.getTreeLock();
    java.awt.Component var36 = var26.locate(0, (-1));
    var26.setAlignmentX(0.5f);
    java.awt.Font var39 = var26.getFont();
    tinymonkeys.vue.VueElement var45 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var45.enable(true);
    tinymonkeys.vue.VueElement var53 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var54 = var53.getUIClassID();
    javax.swing.TransferHandler var55 = var53.getTransferHandler();
    java.awt.Color var56 = var53.getForeground();
    var45.setBackground(var56);
    var26.setForeground(var56);
    java.awt.Insets var59 = var26.insets();
    boolean var60 = var26.isMaximumSizeSet();
    boolean var61 = var26.isFocusable();
    tinymonkeys.vue.VueSingeErratique var67 = new tinymonkeys.vue.VueSingeErratique(1, 1, 10, (-1), 11);
    java.awt.GraphicsConfiguration var68 = var67.getGraphicsConfiguration();
    tinymonkeys.vue.VueElement var74 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var80 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var80.revalidate();
    var80.setSize(0, 11);
    java.awt.Dimension var85 = var80.getMinimumSize();
    java.awt.Dimension var86 = var74.getSize(var85);
    var67.resize(var85);
    var26.setSize(var85);
    var2.setMinimumSize(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "PanelUI"+ "'", var54.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test249");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.enable(true);
    int var8 = var5.getY();
    boolean var9 = var5.isValid();
    var5.setDebugGraphicsOptions(111);
    var5.setInheritsPopupMenu(false);
    boolean var14 = var5.hasFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test250");


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
    java.awt.MenuBar var55 = var2.getMenuBar();
    boolean var56 = var2.isActive();
    java.awt.Color var57 = var2.getBackground();
    var2.removeNotify();
    var2.setResizable(false);
    java.lang.String var61 = var2.getWarningString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test251");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    java.awt.Color var7 = var5.getForeground();
    var5.updateUI();
    boolean var9 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var5);
    java.lang.String var10 = var5.getName();
    int var13 = var5.getBaseline(99, 1920);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test252");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.enable(true);
    java.awt.Toolkit var8 = var5.getToolkit();
    var5.disable();
    java.beans.PropertyChangeListener[] var10 = var5.getPropertyChangeListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var12 = var5.getComponent(111);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test253");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    int var3 = var2.getExtendedState();
    java.awt.Window.Type var4 = var2.getType();
    tinymonkeys.vue.VueElement var10 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var11 = var10.getPeer();
    javax.swing.InputMap var13 = var10.getInputMap(0);
    boolean var14 = var10.isDisplayable();
    boolean var15 = var10.getFocusTraversalKeysEnabled();
    java.awt.Dimension var16 = var10.getMaximumSize();
    var2.setMinimumSize(var16);
    java.awt.Dimension var18 = var2.getSize();
    java.util.List var19 = var2.getIconImages();
    boolean var20 = var2.isVisible();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setOpacity(10.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test254");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    var2.pack();
    java.awt.dnd.DropTarget var4 = var2.getDropTarget();
    var2.setFocusableWindowState(false);
    java.lang.String var7 = var2.getWarningString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test255");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    var5.updateUI();
    var5.show(false);
    tinymonkeys.vue.VueElement var20 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var21 = var20.getPeer();
    var20.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var20.repaint();
    java.lang.Object var27 = var20.getTreeLock();
    java.awt.Component var30 = var20.locate(0, (-1));
    var20.requestFocus();
    tinymonkeys.vue.VueElement var37 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var38 = var37.getPeer();
    var37.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var37.repaint();
    java.lang.Object var44 = var37.getTreeLock();
    java.awt.image.ColorModel var45 = var37.getColorModel();
    boolean var46 = var37.getVerifyInputWhenFocusTarget();
    var37.firePropertyChange("hi!", '4', 'a');
    java.awt.Rectangle var51 = var37.getBounds();
    var20.paintImmediately(var51);
    var5.computeVisibleRect(var51);
    javax.swing.InputMap var54 = var5.getInputMap();
    var5.disable();
    var5.setFocusable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test256");


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
    tinymonkeys.vue.VueElement var61 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var62 = var61.getPeer();
    var61.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var61.repaint();
    java.lang.Object var68 = var61.getTreeLock();
    tinymonkeys.vue.VueElement var74 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var75 = var74.getPeer();
    var74.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var74.repaint();
    var74.updateUI();
    int var82 = var61.getComponentZOrder((java.awt.Component)var74);
    java.awt.Insets var83 = var61.getInsets();
    boolean var84 = var61.getFocusTraversalKeysEnabled();
    var61.setSize(111, 11);
    var61.firePropertyChange("", 100.0f, 0.5f);
    java.awt.GraphicsConfiguration var92 = var61.getGraphicsConfiguration();
    var2.setLocationRelativeTo((java.awt.Component)var61);
    java.awt.Window var94 = var2.getOwner();
    int var95 = var2.getExtendedState();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == 0);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test257");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    var5.updateUI();
    var5.show(false);
    float var15 = var5.getAlignmentY();
    java.awt.Rectangle var16 = var5.bounds();
    boolean var17 = var5.isFocusTraversalPolicySet();
    var5.resetKeyboardActions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test258");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.setAlignmentX(0.5f);
    java.awt.Font var18 = var5.getFont();
    tinymonkeys.vue.VueElement var24 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var24.enable(true);
    tinymonkeys.vue.VueElement var32 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var33 = var32.getUIClassID();
    javax.swing.TransferHandler var34 = var32.getTransferHandler();
    java.awt.Color var35 = var32.getForeground();
    var24.setBackground(var35);
    var5.setForeground(var35);
    java.awt.Insets var38 = var5.insets();
    boolean var39 = var5.isMaximumSizeSet();
    boolean var40 = var5.isFocusable();
    java.awt.GraphicsConfiguration var41 = var5.getGraphicsConfiguration();
    boolean var42 = var5.isDoubleBuffered();
    var5.setInheritsPopupMenu(false);
    java.awt.Component var47 = var5.getComponentAt(100, (-1));
    tinymonkeys.vue.VueElement var53 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var54 = var53.getPeer();
    var53.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var53.repaint();
    var53.updateUI();
    tinymonkeys.vue.VueElement var66 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var67 = var66.getUIClassID();
    tinymonkeys.controleur.Controller var69 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var70 = new tinymonkeys.vue.Fenetre("PanelUI", var69);
    var70.pack();
    var70.addNotify();
    java.awt.Graphics var73 = var70.getGraphics();
    var66.printComponents(var73);
    var53.paintComponent(var73);
    var5.paintAll(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "PanelUI"+ "'", var33.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "PanelUI"+ "'", var67.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test259");


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
    java.awt.MenuBar var55 = var2.getMenuBar();
    boolean var56 = var2.isActive();
    java.awt.Color var57 = var2.getBackground();
    tinymonkeys.vue.VueElement var63 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var64 = var63.getPeer();
    java.awt.Color var65 = var63.getForeground();
    boolean var66 = var63.isRequestFocusEnabled();
    var63.firePropertyChange("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]", '4', 'a');
    java.awt.Rectangle var71 = var63.getVisibleRect();
    java.awt.Rectangle var72 = var2.getBounds(var71);
    java.util.List var73 = var2.getIconImages();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test260");


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
    javax.accessibility.AccessibleContext var54 = var2.getAccessibleContext();
    java.lang.String var55 = var2.getTitle();
    java.awt.Color var56 = var2.getBackground();
    boolean var57 = var2.isFocusOwner();
    var2.setSize(11, 111);
    tinymonkeys.vue.VueElement var66 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var67 = var66.getPeer();
    var66.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var66.repaint();
    java.lang.Object var73 = var66.getTreeLock();
    java.awt.image.ColorModel var74 = var66.getColorModel();
    boolean var75 = var66.getAutoscrolls();
    var66.setIgnoreRepaint(true);
    java.awt.Rectangle var78 = var66.getVisibleRect();
    var2.setBounds(var78);
    boolean var80 = var2.isShowing();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setCursor(1920);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "PanelUI"+ "'", var55.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test261");


    tinymonkeys.vue.VuePirate var6 = new tinymonkeys.vue.VuePirate((-1), 3, 100, (-1), 0, "");
    tinymonkeys.vue.VueElement var12 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var12.enable(true);
    java.awt.Toolkit var15 = var12.getToolkit();
    var12.firePropertyChange("", 100L, 1L);
    java.awt.Point var20 = var12.getLocation();
    tinymonkeys.vue.VueElement var26 = new tinymonkeys.vue.VueElement(0, 0, 1, 1, 11);
    java.awt.Component var29 = var26.locate(11, 10);
    tinymonkeys.vue.VueElement var35 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var36 = var35.getPeer();
    var35.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var35.repaint();
    var35.updateUI();
    var35.show(false);
    float var45 = var35.getAlignmentY();
    java.awt.Rectangle var46 = var35.bounds();
    java.awt.Rectangle var47 = var26.getBounds(var46);
    boolean var48 = var26.isFocusCycleRoot();
    java.awt.Component var51 = var26.findComponentAt(0, (-1));
    tinymonkeys.vue.VueElement var57 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var58 = var57.getPeer();
    var57.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var57.repaint();
    java.lang.Object var64 = var57.getTreeLock();
    java.awt.image.ColorModel var65 = var57.getColorModel();
    var57.setLocation(100, 1);
    boolean var69 = var57.isMaximumSizeSet();
    java.awt.Component var70 = var26.add((java.awt.Component)var57);
    tinymonkeys.controleur.Controller var72 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var73 = new tinymonkeys.vue.Fenetre("PanelUI", var72);
    var73.pack();
    var73.addNotify();
    java.awt.Graphics var76 = var73.getGraphics();
    var70.paintAll(var76);
    var12.printAll(var76);
    var6.dessineElement(var76);
    var6.mortPirate();
    var6.revalidate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test262");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    javax.swing.plaf.PanelUI var13 = var5.getUI();
    java.awt.Image var16 = var5.createImage(0, 1);
    var5.enable(true);
    var5.doLayout();
    javax.swing.ActionMap var20 = var5.getActionMap();
    boolean var21 = var5.isManagingFocus();
    int var22 = var5.getY();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 11);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test263");


    tinymonkeys.vue.VuePersonnage var5 = new tinymonkeys.vue.VuePersonnage((-1), 99, 0, (-1), 11);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test264");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    int var3 = var2.getExtendedState();
    java.awt.Window.Type var4 = var2.getType();
    tinymonkeys.vue.VueElement var10 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var11 = var10.getPeer();
    javax.swing.InputMap var13 = var10.getInputMap(0);
    boolean var14 = var10.isDisplayable();
    boolean var15 = var10.getFocusTraversalKeysEnabled();
    java.awt.Dimension var16 = var10.getMaximumSize();
    var2.setMinimumSize(var16);
    java.awt.Dimension var18 = var2.getSize();
    java.util.List var19 = var2.getIconImages();
    boolean var20 = var2.isFocusableWindow();
    java.awt.event.WindowListener[] var21 = var2.getWindowListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test265");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.requestFocus();
    boolean var17 = var5.isFocusTraversable();
    tinymonkeys.vue.VueElement var23 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var24 = var23.getPeer();
    var23.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var23.repaint();
    java.lang.Object var30 = var23.getTreeLock();
    java.awt.Component var33 = var23.locate(0, (-1));
    var23.setAlignmentX(0.5f);
    java.awt.Font var36 = var23.getFont();
    tinymonkeys.vue.VueElement var43 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var44 = var43.getUIClassID();
    float var45 = var43.getAlignmentX();
    boolean var46 = var43.isOptimizedDrawingEnabled();
    var23.putClientProperty((java.lang.Object)' ', (java.lang.Object)var46);
    var23.transferFocusBackward();
    tinymonkeys.vue.VueElement var54 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var55 = var54.getPeer();
    var54.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var54.repaint();
    java.awt.GraphicsConfiguration var61 = var54.getGraphicsConfiguration();
    var54.setFocusCycleRoot(true);
    var5.add((java.awt.Component)var23, (java.lang.Object)true);
    boolean var65 = var5.isDoubleBuffered();
    var5.setVisible(true);
    tinymonkeys.vue.VueElement var73 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var79 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var80 = var73.isAncestorOf((java.awt.Component)var79);
    java.awt.Dimension var81 = var73.size();
    var5.resize(var81);
    boolean var83 = var5.requestFocusInWindow();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "PanelUI"+ "'", var44.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test266");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    int var3 = var2.getExtendedState();
    java.awt.Window.Type var4 = var2.getType();
    tinymonkeys.vue.VueElement var10 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var11 = var10.getPeer();
    javax.swing.InputMap var13 = var10.getInputMap(0);
    boolean var14 = var10.isDisplayable();
    boolean var15 = var10.getFocusTraversalKeysEnabled();
    java.awt.Dimension var16 = var10.getMaximumSize();
    var2.setMinimumSize(var16);
    java.awt.Window.Type var18 = var2.getType();
    int var19 = var2.getCursorType();
    var2.dispose();
    boolean var21 = var2.isValidateRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test267");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.enable(true);
    tinymonkeys.vue.VueElement var13 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var14 = var13.getUIClassID();
    tinymonkeys.vue.VueElement var20 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var21 = var20.getPeer();
    var20.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var20.transferFocusUpCycle();
    boolean var27 = var20.getInheritsPopupMenu();
    tinymonkeys.vue.VueElement var33 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var34 = var33.getPeer();
    var33.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var33.repaint();
    java.lang.Object var40 = var33.getTreeLock();
    tinymonkeys.vue.VueElement var46 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var47 = var46.getPeer();
    var46.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var46.repaint();
    var46.updateUI();
    int var54 = var33.getComponentZOrder((java.awt.Component)var46);
    var13.add((java.awt.Component)var20, (java.lang.Object)var33);
    boolean var56 = var5.isFocusCycleRoot((java.awt.Container)var20);
    int var57 = var5.getHeight();
    tinymonkeys.vue.VueElement var63 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var64 = var63.getPeer();
    var63.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var63.repaint();
    java.lang.Object var70 = var63.getTreeLock();
    java.awt.image.ColorModel var71 = var63.getColorModel();
    var63.setLocation(100, 1);
    boolean var75 = var63.isDoubleBuffered();
    java.util.Locale var76 = var63.getLocale();
    var5.setLocale(var76);
    var5.grabFocus();
    java.awt.Dimension var79 = var5.getMinimumSize();
    boolean var80 = var5.isDoubleBuffered();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "PanelUI"+ "'", var14.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test268");


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
    javax.accessibility.AccessibleContext var54 = var2.getAccessibleContext();
    java.lang.String var55 = var2.getTitle();
    tinymonkeys.vue.VueElement var61 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var62 = var61.getPeer();
    var61.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var61.transferFocusUpCycle();
    boolean var68 = var61.getInheritsPopupMenu();
    java.awt.Component.BaselineResizeBehavior var69 = var61.getBaselineResizeBehavior();
    var61.show();
    var61.setEnabled(false);
    boolean var73 = var61.isMinimumSizeSet();
    var2.setContentPane((java.awt.Container)var61);
    boolean var75 = var2.isAlwaysOnTop();
    var2.setFocusableWindowState(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.applyResourceBundle("");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "PanelUI"+ "'", var55.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test269");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    int var7 = var5.getHeight();
    boolean var8 = var5.getFocusTraversalKeysEnabled();
    tinymonkeys.vue.VueElement var14 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var14.revalidate();
    java.lang.String var16 = var14.toString();
    boolean var17 = var14.isFocusTraversalPolicyProvider();
    var14.repaint((-1), 1, 100, 100);
    java.lang.Object var23 = var5.getClientProperty((java.lang.Object)100);
    javax.swing.JToolTip var24 = var5.createToolTip();
    tinymonkeys.vue.VueElement var30 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var30.revalidate();
    tinymonkeys.vue.VueElement var37 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var38 = var37.getPeer();
    java.awt.Color var39 = var37.getForeground();
    boolean var40 = var37.isRequestFocusEnabled();
    var37.firePropertyChange("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]", '4', 'a');
    java.awt.Rectangle var45 = var37.getVisibleRect();
    java.awt.Rectangle var46 = var30.getBounds(var45);
    var5.setBounds(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]"+ "'", var16.equals("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test270");


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
    tinymonkeys.vue.VueElement var61 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var67 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var68 = var61.isAncestorOf((java.awt.Component)var67);
    javax.swing.plaf.PanelUI var69 = var61.getUI();
    java.awt.Image var72 = var61.createImage(0, 1);
    var61.enable(true);
    java.awt.Color var75 = var61.getBackground();
    var2.setBackground(var75);
    var2.setLocation(111, 10);
    java.util.List var80 = var2.getIconImages();
    var2.setLocationByPlatform(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test271");


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
    tinymonkeys.vue.VueElement var61 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var67 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var68 = var61.isAncestorOf((java.awt.Component)var67);
    javax.swing.plaf.PanelUI var69 = var61.getUI();
    java.awt.Image var72 = var61.createImage(0, 1);
    var61.enable(true);
    java.awt.Color var75 = var61.getBackground();
    var2.setBackground(var75);
    var2.setLocation(111, 10);
    java.awt.Container var80 = var2.getFocusCycleRootAncestor();
    java.awt.Component var81 = var2.getFocusOwner();
    var2.setTitle("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]");
    java.awt.Component var84 = var2.getMostRecentFocusOwner();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test272");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.enable(true);
    var5.firePropertyChange("", '4', '4');
    var5.setEnabled(true);
    var5.paintImmediately(111, 1920, 99, 111);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test273");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(0, 0, 1, 1, 11);
    boolean var7 = var5.requestFocus(false);
    java.awt.event.ComponentListener[] var8 = var5.getComponentListeners();
    float var9 = var5.getAlignmentX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.5f);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test274");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var1 = var0.getSingesErratiques();
    tinymonkeys.modele.Pirate var2 = var0.getPirate();
    tinymonkeys.modele.Ile var5 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var6 = new tinymonkeys.modele.BandeDeSingesErratiques(var5);
    tinymonkeys.modele.SingeErratique var7 = new tinymonkeys.modele.SingeErratique((-1), 11, var5);
    tinymonkeys.modele.Ile var8 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var9 = new tinymonkeys.modele.BandeDeSingesErratiques(var8);
    int[][] var10 = new int[][] { };
    var8.creationCarte(var10);
    var5.creationCarte(var10);
    tinymonkeys.modele.Ile var15 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var16 = new tinymonkeys.modele.BandeDeSingesErratiques(var15);
    tinymonkeys.modele.SingeErratique var17 = new tinymonkeys.modele.SingeErratique((-1), 11, var15);
    tinymonkeys.modele.Ile var18 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var19 = new tinymonkeys.modele.BandeDeSingesErratiques(var18);
    int[][] var20 = new int[][] { };
    var18.creationCarte(var20);
    var15.creationCarte(var20);
    var5.creationCarte(var20);
    var0.creationCarte(var20);
    var0.demandeDeplacementPirate(111, 11);
    tinymonkeys.modele.Tresor var28 = var0.getTresor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.creationTresor();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test275");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.enable(true);
    tinymonkeys.vue.VueElement var13 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var14 = var13.getUIClassID();
    tinymonkeys.vue.VueElement var20 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var21 = var20.getPeer();
    var20.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var20.transferFocusUpCycle();
    boolean var27 = var20.getInheritsPopupMenu();
    tinymonkeys.vue.VueElement var33 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var34 = var33.getPeer();
    var33.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var33.repaint();
    java.lang.Object var40 = var33.getTreeLock();
    tinymonkeys.vue.VueElement var46 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var47 = var46.getPeer();
    var46.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var46.repaint();
    var46.updateUI();
    int var54 = var33.getComponentZOrder((java.awt.Component)var46);
    var13.add((java.awt.Component)var20, (java.lang.Object)var33);
    boolean var56 = var5.isFocusCycleRoot((java.awt.Container)var20);
    int var57 = var5.getHeight();
    tinymonkeys.vue.VueElement var63 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var64 = var63.getPeer();
    var63.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var63.repaint();
    java.lang.Object var70 = var63.getTreeLock();
    java.awt.image.ColorModel var71 = var63.getColorModel();
    var63.setLocation(100, 1);
    boolean var75 = var63.isDoubleBuffered();
    java.util.Locale var76 = var63.getLocale();
    var5.setLocale(var76);
    javax.swing.InputMap var78 = var5.getInputMap();
    var5.paintImmediately(1, 10, 32767, 11);
    java.awt.event.FocusListener[] var84 = var5.getFocusListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "PanelUI"+ "'", var14.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test276");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.enable(true);
    tinymonkeys.vue.VueElement var13 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var14 = var13.getUIClassID();
    tinymonkeys.vue.VueElement var20 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var21 = var20.getPeer();
    var20.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var20.transferFocusUpCycle();
    boolean var27 = var20.getInheritsPopupMenu();
    tinymonkeys.vue.VueElement var33 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var34 = var33.getPeer();
    var33.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var33.repaint();
    java.lang.Object var40 = var33.getTreeLock();
    tinymonkeys.vue.VueElement var46 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var47 = var46.getPeer();
    var46.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var46.repaint();
    var46.updateUI();
    int var54 = var33.getComponentZOrder((java.awt.Component)var46);
    var13.add((java.awt.Component)var20, (java.lang.Object)var33);
    boolean var56 = var5.isFocusCycleRoot((java.awt.Container)var20);
    java.awt.Component var59 = var5.getComponentAt(1, 1);
    java.lang.String var60 = var5.getUIClassID();
    var5.setFocusTraversalPolicyProvider(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "PanelUI"+ "'", var14.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "PanelUI"+ "'", var60.equals("PanelUI"));

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test277");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.repaint();
    boolean var17 = var5.requestFocusInWindow();
    boolean var18 = var5.isShowing();
    var5.setInheritsPopupMenu(true);
    tinymonkeys.vue.VueElement var26 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var27 = var26.getPeer();
    var26.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var26.repaint();
    java.lang.Object var33 = var26.getTreeLock();
    java.awt.image.ColorModel var34 = var26.getColorModel();
    var26.setLocation(100, 1);
    tinymonkeys.vue.VueElement var43 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var44 = var43.getUIClassID();
    javax.swing.TransferHandler var45 = var43.getTransferHandler();
    java.awt.Color var46 = var43.getForeground();
    var26.setForeground(var46);
    var5.setForeground(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "PanelUI"+ "'", var44.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test278");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.resize((-1), 0);
    var5.transferFocusDownCycle();
    boolean var22 = var5.contains(10, 1);
    var5.firePropertyChange("tinymonkeys.vue.VueSingeErratique[,1,22,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]", (-1.0f), 1.0f);
    boolean var27 = var5.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test279");


    tinymonkeys.controleur.Controller var2 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var3 = new tinymonkeys.vue.Fenetre("tinymonkeys.vue.VueElement[,111,11,1x1,invalid,hidden,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777216,maximumSize=,minimumSize=,preferredSize=]", var2);
    tinymonkeys.vue.Fenetre var4 = new tinymonkeys.vue.Fenetre("hi!", var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.demandeDeplacementPirate(1920, 99);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test280");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var11.revalidate();
    var11.setSize(0, 11);
    java.awt.Dimension var16 = var11.getMinimumSize();
    java.awt.Dimension var17 = var5.getSize(var16);
    boolean var18 = var5.isManagingFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test281");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    java.awt.Color var7 = var5.getForeground();
    var5.updateUI();
    boolean var9 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var5);
    boolean var12 = var5.contains(10, 111);
    tinymonkeys.vue.VueElement var18 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var19 = var18.getPeer();
    var18.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var18.repaint();
    java.lang.Object var25 = var18.getTreeLock();
    tinymonkeys.vue.VueElement var31 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var32 = var31.getPeer();
    var31.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var31.repaint();
    var31.updateUI();
    int var39 = var18.getComponentZOrder((java.awt.Component)var31);
    java.awt.Insets var40 = var18.getInsets();
    java.util.Locale var41 = var18.getLocale();
    var18.hide();
    java.awt.LayoutManager var43 = var18.getLayout();
    java.awt.Dimension var44 = var18.size();
    var5.setPreferredSize(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test282");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.revalidate();
    var5.setSize(0, 11);
    java.awt.Dimension var10 = var5.getMinimumSize();
    var5.setIgnoreRepaint(false);
    int var15 = var5.getBaseline(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test283");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.requestFocus();
    boolean var17 = var5.isFocusTraversable();
    java.awt.event.InputMethodListener[] var18 = var5.getInputMethodListeners();
    boolean var19 = var5.isMaximumSizeSet();
    java.awt.Component var22 = var5.getComponentAt(11, 10);
    tinymonkeys.vue.VueElement var28 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var29 = var28.getPeer();
    var28.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var28.repaint();
    java.lang.Object var35 = var28.getTreeLock();
    int var36 = var28.getY();
    java.beans.VetoableChangeListener[] var37 = var28.getVetoableChangeListeners();
    var5.remove((java.awt.Component)var28);
    tinymonkeys.vue.VueElement var44 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var50 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var51 = var44.isAncestorOf((java.awt.Component)var50);
    boolean var52 = var44.isFocusTraversalPolicyProvider();
    boolean var53 = var44.isShowing();
    boolean var54 = var44.isFocusTraversalPolicySet();
    var44.move(1, 10);
    var44.enable();
    java.awt.event.MouseListener[] var59 = var44.getMouseListeners();
    java.lang.Object var60 = var5.getClientProperty((java.lang.Object)var59);
    java.awt.Component[] var61 = var5.getComponents();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test284");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.transferFocusUpCycle();
    tinymonkeys.vue.VueElement var17 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var18 = var17.getPeer();
    var17.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var17.repaint();
    java.lang.Object var24 = var17.getTreeLock();
    java.awt.event.HierarchyListener[] var25 = var17.getHierarchyListeners();
    boolean var26 = var5.isAncestorOf((java.awt.Component)var17);
    var5.setRequestFocusEnabled(true);
    var5.paintImmediately(111, 0, 3, (-1));
    var5.transferFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test285");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    int var3 = var2.getExtendedState();
    java.awt.Window.Type var4 = var2.getType();
    tinymonkeys.vue.VueElement var10 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var11 = var10.getPeer();
    javax.swing.InputMap var13 = var10.getInputMap(0);
    boolean var14 = var10.isDisplayable();
    boolean var15 = var10.getFocusTraversalKeysEnabled();
    java.awt.Dimension var16 = var10.getMaximumSize();
    var2.setMinimumSize(var16);
    java.awt.event.WindowListener[] var18 = var2.getWindowListeners();
    tinymonkeys.vue.VueElement var24 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var25 = var24.getPeer();
    var24.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var24.repaint();
    java.lang.Object var31 = var24.getTreeLock();
    java.awt.image.ColorModel var32 = var24.getColorModel();
    var24.setLocation(100, 1);
    boolean var36 = var24.isDoubleBuffered();
    java.util.Locale var37 = var24.getLocale();
    java.awt.Dimension var38 = var24.getMaximumSize();
    tinymonkeys.vue.VueElement var44 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var45 = var44.getPeer();
    var44.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var44.repaint();
    java.lang.Object var51 = var44.getTreeLock();
    java.awt.image.ColorModel var52 = var44.getColorModel();
    boolean var53 = var44.getVerifyInputWhenFocusTarget();
    int var54 = var44.getWidth();
    java.util.Locale var55 = var44.getLocale();
    var24.setLocale(var55);
    javax.swing.plaf.PanelUI var57 = var24.getUI();
    tinymonkeys.vue.VueElement var63 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var69 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var70 = var63.isAncestorOf((java.awt.Component)var69);
    java.awt.Point var71 = var69.location();
    java.awt.Point var72 = var24.getLocation(var71);
    java.awt.Point var73 = var2.getLocation(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test286");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    java.awt.im.InputContext var13 = var11.getInputContext();
    float var14 = var11.getAlignmentX();
    java.awt.Component var15 = var11.getNextFocusableComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test287");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var1 = new tinymonkeys.modele.BandeDeSingesErratiques(var0);
    int[][] var2 = new int[][] { };
    var0.creationCarte(var2);
    tinymonkeys.modele.Pirate var5 = new tinymonkeys.modele.Pirate(var0, "PanelUI");
    tinymonkeys.modele.Pirate var7 = new tinymonkeys.modele.Pirate(var0, "");
    tinymonkeys.modele.Pirate var8 = new tinymonkeys.modele.Pirate(var0);
    var8.demandeDeplacement(100, 32767);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test288");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var6 = var5.getUIClassID();
    tinymonkeys.vue.VueElement var12 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var13 = var12.getPeer();
    var12.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var12.transferFocusUpCycle();
    boolean var19 = var12.getInheritsPopupMenu();
    tinymonkeys.vue.VueElement var25 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var26 = var25.getPeer();
    var25.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var25.repaint();
    java.lang.Object var32 = var25.getTreeLock();
    tinymonkeys.vue.VueElement var38 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var39 = var38.getPeer();
    var38.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var38.repaint();
    var38.updateUI();
    int var46 = var25.getComponentZOrder((java.awt.Component)var38);
    var5.add((java.awt.Component)var12, (java.lang.Object)var25);
    java.util.Locale var48 = var25.getLocale();
    javax.swing.JToolTip var49 = var25.createToolTip();
    boolean var50 = var25.isPreferredSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "PanelUI"+ "'", var6.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test289");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.image.ColorModel var13 = var5.getColorModel();
    java.awt.Dimension var14 = var5.minimumSize();
    java.awt.event.HierarchyBoundsListener[] var15 = var5.getHierarchyBoundsListeners();
    int var16 = var5.getY();
    tinymonkeys.vue.VueElement var22 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var23 = var22.getPeer();
    var22.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var22.repaint();
    var22.updateUI();
    tinymonkeys.vue.VueElement var35 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var36 = var35.getUIClassID();
    tinymonkeys.controleur.Controller var38 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var39 = new tinymonkeys.vue.Fenetre("PanelUI", var38);
    var39.pack();
    var39.addNotify();
    java.awt.Graphics var42 = var39.getGraphics();
    var35.printComponents(var42);
    var22.paintComponent(var42);
    var5.print(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "PanelUI"+ "'", var36.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test290");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.revalidate();
    var5.setSize(0, 11);
    var5.firePropertyChange("PanelUI", '4', '#');
    java.lang.String var14 = var5.getUIClassID();
    tinymonkeys.vue.VueElement var20 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var21 = var20.getPeer();
    var20.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var20.repaint();
    java.awt.GraphicsConfiguration var27 = var20.getGraphicsConfiguration();
    java.awt.Insets var28 = var20.insets();
    var20.repaint(1L);
    java.awt.im.InputContext var31 = var20.getInputContext();
    tinymonkeys.vue.VueElement var37 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var38 = var37.getPeer();
    var37.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var37.repaint();
    java.lang.Object var44 = var37.getTreeLock();
    tinymonkeys.vue.VueElement var50 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var51 = var50.getPeer();
    var50.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var50.repaint();
    var50.updateUI();
    int var58 = var37.getComponentZOrder((java.awt.Component)var50);
    tinymonkeys.vue.VueElement var64 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var65 = var64.getPeer();
    var64.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var64.transferFocusUpCycle();
    boolean var71 = var64.getInheritsPopupMenu();
    java.awt.Dimension var72 = var64.minimumSize();
    java.awt.Dimension var73 = var50.getSize(var72);
    var20.resize(var72);
    java.awt.Dimension var75 = var5.getSize(var72);
    var5.updateUI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "PanelUI"+ "'", var14.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test291");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.enable(true);
    tinymonkeys.vue.VueElement var13 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var14 = var13.getUIClassID();
    tinymonkeys.vue.VueElement var20 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var21 = var20.getPeer();
    var20.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var20.transferFocusUpCycle();
    boolean var27 = var20.getInheritsPopupMenu();
    tinymonkeys.vue.VueElement var33 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var34 = var33.getPeer();
    var33.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var33.repaint();
    java.lang.Object var40 = var33.getTreeLock();
    tinymonkeys.vue.VueElement var46 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var47 = var46.getPeer();
    var46.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var46.repaint();
    var46.updateUI();
    int var54 = var33.getComponentZOrder((java.awt.Component)var46);
    var13.add((java.awt.Component)var20, (java.lang.Object)var33);
    boolean var56 = var5.isFocusCycleRoot((java.awt.Container)var20);
    int var57 = var5.getHeight();
    tinymonkeys.vue.VueElement var63 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var64 = var63.getPeer();
    var63.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var63.repaint();
    java.lang.Object var70 = var63.getTreeLock();
    java.awt.image.ColorModel var71 = var63.getColorModel();
    var63.setLocation(100, 1);
    boolean var75 = var63.isDoubleBuffered();
    java.util.Locale var76 = var63.getLocale();
    var5.setLocale(var76);
    var5.hide();
    boolean var79 = var5.isOpaque();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "PanelUI"+ "'", var14.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test292");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var6 = var5.getUIClassID();
    javax.swing.TransferHandler var7 = var5.getTransferHandler();
    java.awt.Color var8 = var5.getForeground();
    javax.swing.KeyStroke[] var9 = var5.getRegisteredKeyStrokes();
    boolean var10 = var5.isMinimumSizeSet();
    var5.grabFocus();
    tinymonkeys.vue.VueElement var17 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var17.enable(true);
    boolean var20 = var17.isShowing();
    int var21 = var17.getX();
    var17.grabFocus();
    tinymonkeys.vue.VueElement var28 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var34 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var35 = var28.isAncestorOf((java.awt.Component)var34);
    boolean var36 = var28.isFocusTraversalPolicyProvider();
    java.awt.event.MouseMotionListener[] var37 = var28.getMouseMotionListeners();
    javax.swing.ActionMap var38 = var28.getActionMap();
    tinymonkeys.vue.VueElement var44 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var45 = var44.getPeer();
    var44.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var44.repaint();
    java.lang.Object var51 = var44.getTreeLock();
    java.awt.Component var54 = var44.locate(0, (-1));
    var44.setAlignmentX(0.5f);
    java.awt.Font var57 = var44.getFont();
    tinymonkeys.vue.VueElement var64 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var65 = var64.getUIClassID();
    float var66 = var64.getAlignmentX();
    boolean var67 = var64.isOptimizedDrawingEnabled();
    var44.putClientProperty((java.lang.Object)' ', (java.lang.Object)var67);
    tinymonkeys.vue.VueElement var74 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var75 = var74.getPeer();
    var74.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var74.repaint();
    java.lang.Object var81 = var74.getTreeLock();
    java.awt.Component var84 = var74.locate(0, (-1));
    var74.setAlignmentX(0.5f);
    java.awt.Font var87 = var74.getFont();
    java.awt.FontMetrics var88 = var44.getFontMetrics(var87);
    java.awt.FontMetrics var89 = var28.getFontMetrics(var87);
    java.awt.FontMetrics var90 = var17.getFontMetrics(var87);
    java.awt.FontMetrics var91 = var5.getFontMetrics(var87);
    boolean var92 = var5.isPaintingForPrint();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "PanelUI"+ "'", var6.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 111);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "PanelUI"+ "'", var65.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test293");


    tinymonkeys.vue.VuePirate var6 = new tinymonkeys.vue.VuePirate(100, 1, 1, 10, 11, "hi!");
    boolean var7 = var6.isOpaque();
    java.awt.Dimension var8 = var6.getMinimumSize();
    var6.setPosition(11, 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test294");


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
    var2.move(10, (-1));
    var2.setSize(3, 11);
    var2.setLocationByPlatform(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test295");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var1 = new tinymonkeys.modele.BandeDeSingesErratiques(var0);
    int[][] var2 = new int[][] { };
    var0.creationCarte(var2);
    tinymonkeys.modele.Pirate var5 = new tinymonkeys.modele.Pirate(var0, "PanelUI");
    tinymonkeys.modele.Pirate var7 = new tinymonkeys.modele.Pirate(var0, "");
    javax.swing.event.EventListenerList var8 = var0.getIleEcouteurs();
    tinymonkeys.modele.Pirate var10 = new tinymonkeys.modele.Pirate(var0, "tinymonkeys.vue.VueElement[,111,11,1x1,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777217,maximumSize=,minimumSize=,preferredSize=]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test296");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.enable(true);
    boolean var8 = var5.isShowing();
    int var9 = var5.getX();
    java.beans.PropertyChangeListener[] var10 = var5.getPropertyChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 111);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test297");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.image.ColorModel var13 = var5.getColorModel();
    boolean var14 = var5.getVerifyInputWhenFocusTarget();
    tinymonkeys.vue.VueElement var20 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var26 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var26.revalidate();
    var26.setSize(0, 11);
    java.awt.Dimension var31 = var26.getMinimumSize();
    java.awt.Dimension var32 = var20.getSize(var31);
    var5.setMinimumSize(var31);
    boolean var34 = var5.isMaximumSizeSet();
    var5.layout();
    var5.firePropertyChange("", 10.0f, 100.0f);
    java.awt.Container var40 = var5.getTopLevelAncestor();
    boolean var41 = var5.isManagingFocus();
    boolean var42 = var5.isPaintingForPrint();
    int var43 = var5.getWidth();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test298");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    var5.updateUI();
    var5.show(false);
    tinymonkeys.vue.VueElement var20 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var20.enable(true);
    int var23 = var20.getY();
    boolean var24 = var20.isValid();
    var20.removeAll();
    var20.disable();
    tinymonkeys.vue.VueElement var32 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var32.enable(true);
    java.awt.Toolkit var35 = var32.getToolkit();
    var32.disable();
    java.awt.Dimension var37 = var32.minimumSize();
    java.awt.FocusTraversalPolicy var38 = var32.getFocusTraversalPolicy();
    java.beans.PropertyChangeListener[] var40 = var32.getPropertyChangeListeners("hi!");
    java.awt.Component var41 = var20.add((java.awt.Component)var32);
    tinymonkeys.vue.VueElement var47 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var53 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var54 = var47.isAncestorOf((java.awt.Component)var53);
    java.awt.Point var55 = var53.location();
    var41.setLocation(var55);
    java.awt.Component var57 = var5.getComponentAt(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test299");


    tinymonkeys.modele.Ile var2 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var3 = new tinymonkeys.modele.BandeDeSingesErratiques(var2);
    tinymonkeys.modele.SingeErratique var4 = new tinymonkeys.modele.SingeErratique((-1), 11, var2);
    tinymonkeys.modele.Ile var5 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var6 = new tinymonkeys.modele.BandeDeSingesErratiques(var5);
    int[][] var7 = new int[][] { };
    var5.creationCarte(var7);
    var2.creationCarte(var7);
    tinymonkeys.modele.Ile var12 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var13 = new tinymonkeys.modele.BandeDeSingesErratiques(var12);
    tinymonkeys.modele.SingeErratique var14 = new tinymonkeys.modele.SingeErratique((-1), 11, var12);
    tinymonkeys.modele.Ile var15 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var16 = new tinymonkeys.modele.BandeDeSingesErratiques(var15);
    int[][] var17 = new int[][] { };
    var15.creationCarte(var17);
    var12.creationCarte(var17);
    var2.creationCarte(var17);
    tinymonkeys.modele.Pirate var21 = new tinymonkeys.modele.Pirate(var2);
    javax.swing.event.EventListenerList var22 = var2.getIleEcouteurs();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var25 = var2.valeurCarte(10, 111);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test300");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    javax.swing.plaf.PanelUI var13 = var5.getUI();
    var5.transferFocusDownCycle();
    var5.doLayout();
    tinymonkeys.vue.VueElement var21 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var22 = var21.getPeer();
    var21.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var21.repaint();
    var21.updateUI();
    var21.show(false);
    float var31 = var21.getAlignmentY();
    java.awt.Rectangle var32 = var21.bounds();
    var5.repaint(var32);
    var5.transferFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test301");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    javax.accessibility.AccessibleContext var3 = var2.getAccessibleContext();
    javax.accessibility.AccessibleContext var4 = var2.getAccessibleContext();
    boolean var5 = var2.isFocusCycleRoot();
    var2.enable(true);
    java.awt.event.WindowListener[] var8 = var2.getWindowListeners();
    boolean var9 = var2.isBackgroundSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test302");


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
    var2.setVisible(false);
    int var59 = var2.getDefaultCloseOperation();
    javax.accessibility.AccessibleContext var60 = var2.getAccessibleContext();
    var2.setLocation(11, 111);
    java.awt.event.WindowListener[] var64 = var2.getWindowListeners();
    javax.swing.JMenuBar var65 = var2.getJMenuBar();
    var2.repaint((-1L), 10, 111, 100, 10);
    var2.transferFocusDownCycle();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test303");


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
    tinymonkeys.vue.VueElement var61 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var67 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var68 = var61.isAncestorOf((java.awt.Component)var67);
    javax.swing.plaf.PanelUI var69 = var61.getUI();
    java.awt.Image var72 = var61.createImage(0, 1);
    var61.enable(true);
    java.awt.Color var75 = var61.getBackground();
    var2.setBackground(var75);
    var2.setLocation(111, 10);
    java.awt.Container var80 = var2.getFocusCycleRootAncestor();
    var2.setState(0);
    var2.repaint(100L, 111, 11, 3, 111);
    java.lang.String var89 = var2.getWarningString();
    java.lang.String var90 = var2.getWarningString();
    var2.reshape(111, (-1), (-1), 1);
    java.awt.Shape var96 = var2.getShape();
    boolean var97 = var2.isAlwaysOnTopSupported();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == true);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test304");


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
    boolean var57 = var2.isShowing();
    java.awt.Component var58 = var2.getMostRecentFocusOwner();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test305");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    javax.swing.InputMap var8 = var5.getInputMap(0);
    java.awt.Component.BaselineResizeBehavior var9 = var5.getBaselineResizeBehavior();
    boolean var10 = var5.isPreferredSizeSet();
    javax.swing.InputMap var11 = var5.getInputMap();
    var5.setAlignmentY(0.5f);
    tinymonkeys.vue.VueElement var19 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var20 = var19.getPeer();
    var19.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var19.transferFocusUpCycle();
    tinymonkeys.vue.VueElement var31 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var32 = var31.getPeer();
    var31.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var31.repaint();
    java.lang.Object var38 = var31.getTreeLock();
    java.awt.image.ColorModel var39 = var31.getColorModel();
    var31.setLocation(100, 1);
    boolean var43 = var31.isDoubleBuffered();
    java.util.Locale var44 = var31.getLocale();
    java.awt.Dimension var45 = var31.getMaximumSize();
    tinymonkeys.vue.VueElement var51 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var52 = var51.getPeer();
    var51.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var51.repaint();
    java.lang.Object var58 = var51.getTreeLock();
    java.awt.image.ColorModel var59 = var51.getColorModel();
    boolean var60 = var51.getVerifyInputWhenFocusTarget();
    int var61 = var51.getWidth();
    java.util.Locale var62 = var51.getLocale();
    var31.setLocale(var62);
    javax.swing.plaf.PanelUI var64 = var31.getUI();
    var19.setUI(var64);
    var5.setUI(var64);
    var5.setIgnoreRepaint(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test306");


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
    int var57 = var2.getDefaultCloseOperation();
    boolean var58 = var2.getFocusableWindowState();
    boolean var59 = var2.isShowing();
    boolean var60 = var2.isAlwaysOnTop();
    var2.addNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test307");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    tinymonkeys.vue.VueElement var18 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var19 = var18.getPeer();
    var18.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var18.repaint();
    var18.updateUI();
    int var26 = var5.getComponentZOrder((java.awt.Component)var18);
    java.awt.Insets var27 = var5.getInsets();
    boolean var28 = var5.getFocusTraversalKeysEnabled();
    java.awt.Point var30 = var5.getMousePosition(true);
    int var31 = var5.getWidth();
    java.awt.LayoutManager var32 = var5.getLayout();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test308");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(10, 0, 10, (-1), (-1));
    java.awt.Dimension var6 = var5.getPreferredSize();
    boolean var7 = var5.isForegroundSet();
    boolean var8 = var5.isOpaque();
    java.lang.String var9 = var5.getToolTipText();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test309");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    javax.swing.InputMap var8 = var5.getInputMap(0);
    boolean var9 = var5.isOptimizedDrawingEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test310");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var1 = var0.getSingesErratiques();
    tinymonkeys.modele.Pirate var2 = var0.getPirate();
    tinymonkeys.modele.Ile var5 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var6 = new tinymonkeys.modele.BandeDeSingesErratiques(var5);
    tinymonkeys.modele.SingeErratique var7 = new tinymonkeys.modele.SingeErratique((-1), 11, var5);
    tinymonkeys.modele.Ile var8 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var9 = new tinymonkeys.modele.BandeDeSingesErratiques(var8);
    int[][] var10 = new int[][] { };
    var8.creationCarte(var10);
    var5.creationCarte(var10);
    tinymonkeys.modele.Ile var15 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var16 = new tinymonkeys.modele.BandeDeSingesErratiques(var15);
    tinymonkeys.modele.SingeErratique var17 = new tinymonkeys.modele.SingeErratique((-1), 11, var15);
    tinymonkeys.modele.Ile var18 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var19 = new tinymonkeys.modele.BandeDeSingesErratiques(var18);
    int[][] var20 = new int[][] { };
    var18.creationCarte(var20);
    var15.creationCarte(var20);
    var5.creationCarte(var20);
    var0.creationCarte(var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.ajoutPirate("tinymonkeys.vue.Fenetre[frame1,0,0,1920x1080,invalid,hidden,layout=java.awt.BorderLayout,title=PanelUI,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test311");


    tinymonkeys.modele.Ile var2 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var3 = new tinymonkeys.modele.BandeDeSingesErratiques(var2);
    tinymonkeys.modele.SingeErratique var4 = new tinymonkeys.modele.SingeErratique((-1), 11, var2);
    tinymonkeys.modele.Tresor var5 = var2.getTresor();
    tinymonkeys.modele.Ile var8 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var9 = new tinymonkeys.modele.BandeDeSingesErratiques(var8);
    tinymonkeys.modele.SingeErratique var10 = new tinymonkeys.modele.SingeErratique((-1), 11, var8);
    tinymonkeys.modele.Ile var11 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var12 = new tinymonkeys.modele.BandeDeSingesErratiques(var11);
    int[][] var13 = new int[][] { };
    var11.creationCarte(var13);
    var8.creationCarte(var13);
    tinymonkeys.modele.Ile var16 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var17 = new tinymonkeys.modele.BandeDeSingesErratiques(var16);
    int[][] var18 = new int[][] { };
    var16.creationCarte(var18);
    var8.creationCarte(var18);
    tinymonkeys.controleur.Controller var22 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var23 = new tinymonkeys.vue.Fenetre("PanelUI", var22);
    tinymonkeys.vue.VueElement var29 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var35 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var36 = var29.isAncestorOf((java.awt.Component)var35);
    boolean var37 = var29.isFocusTraversalPolicyProvider();
    boolean var40 = var29.contains(10, 111);
    java.awt.Dimension var41 = var29.minimumSize();
    tinymonkeys.vue.VueElement var47 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var48 = var47.getPeer();
    var47.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var47.repaint();
    java.lang.Object var54 = var47.getTreeLock();
    tinymonkeys.vue.VueElement var60 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var61 = var60.getPeer();
    var60.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var60.repaint();
    var60.updateUI();
    int var68 = var47.getComponentZOrder((java.awt.Component)var60);
    java.awt.Insets var69 = var47.getInsets();
    java.util.Locale var70 = var47.getLocale();
    var47.hide();
    java.awt.LayoutManager var72 = var47.getLayout();
    var29.setLayout(var72);
    var23.setLayout(var72);
    java.awt.Color var75 = var23.getBackground();
    java.awt.MenuBar var76 = var23.getMenuBar();
    var8.enregistreEcIle((tinymonkeys.modele.IleEcouteur)var23);
    var2.enregistreEcIle((tinymonkeys.modele.IleEcouteur)var23);
    java.awt.Rectangle var79 = var23.getMaximizedBounds();
    var23.dispose();
    java.awt.Window var81 = var23.getOwner();
    java.util.List var82 = var23.getIconImages();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test312");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    boolean var13 = var5.isFocusTraversalPolicyProvider();
    var5.removeAll();
    java.awt.Point var15 = var5.getMousePosition();
    java.util.Locale var16 = var5.getLocale();
    tinymonkeys.vue.VueElement var22 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var23 = var22.getPeer();
    var22.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var22.repaint();
    java.lang.Object var29 = var22.getTreeLock();
    java.awt.Component var32 = var22.locate(0, (-1));
    var22.requestFocus();
    tinymonkeys.vue.VueElement var39 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var40 = var39.getPeer();
    var39.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var39.repaint();
    java.lang.Object var46 = var39.getTreeLock();
    java.awt.image.ColorModel var47 = var39.getColorModel();
    boolean var48 = var39.getVerifyInputWhenFocusTarget();
    var39.firePropertyChange("hi!", '4', 'a');
    java.awt.Rectangle var53 = var39.getBounds();
    var22.paintImmediately(var53);
    var22.removeAll();
    java.awt.Color var56 = var22.getBackground();
    var5.setForeground(var56);
    var5.updateUI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test313");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    boolean var13 = var5.isFocusTraversalPolicyProvider();
    var5.firePropertyChange("hi!", 'a', '4');
    java.awt.Dimension var18 = var5.preferredSize();
    java.awt.Component.BaselineResizeBehavior var19 = var5.getBaselineResizeBehavior();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test314");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.Component var15 = var5.locate(0, (-1));
    var5.requestFocus();
    tinymonkeys.vue.VueElement var22 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var23 = var22.getPeer();
    var22.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var22.repaint();
    java.lang.Object var29 = var22.getTreeLock();
    java.awt.image.ColorModel var30 = var22.getColorModel();
    boolean var31 = var22.getVerifyInputWhenFocusTarget();
    var22.firePropertyChange("hi!", '4', 'a');
    java.awt.Rectangle var36 = var22.getBounds();
    var5.paintImmediately(var36);
    boolean var38 = var5.requestFocusInWindow();
    java.awt.Toolkit var39 = var5.getToolkit();
    java.awt.Component.BaselineResizeBehavior var40 = var5.getBaselineResizeBehavior();
    var5.removeNotify();
    java.awt.event.InputMethodListener[] var42 = var5.getInputMethodListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test315");


    tinymonkeys.vue.VuePirate var6 = new tinymonkeys.vue.VuePirate(100, 1, 1, 10, 11, "hi!");
    var6.mortPirate();
    java.awt.Insets var8 = var6.insets();
    var6.setDoubleBuffered(true);
    var6.transferFocusUpCycle();
    var6.mortPirate();
    java.beans.VetoableChangeListener[] var13 = var6.getVetoableChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test316");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var12 = var5.isAncestorOf((java.awt.Component)var11);
    boolean var13 = var5.isFocusTraversalPolicyProvider();
    boolean var14 = var5.isShowing();
    boolean var15 = var5.isFocusTraversalPolicySet();
    var5.move(1, 10);
    var5.repaint((-1L), 100, 0, 10, 100);
    tinymonkeys.vue.VueElement var30 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var31 = var30.getPeer();
    var30.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var30.repaint();
    java.lang.Object var37 = var30.getTreeLock();
    java.awt.Component var40 = var30.locate(0, (-1));
    var30.requestFocus();
    boolean var42 = var30.isFocusTraversable();
    java.lang.Object var43 = var5.getClientProperty((java.lang.Object)var42);
    boolean var44 = var5.isFontSet();
    java.awt.event.HierarchyListener[] var45 = var5.getHierarchyListeners();
    boolean var46 = var5.isBackgroundSet();
    java.awt.Color var47 = var5.getForeground();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test317");


    tinymonkeys.modele.Ile var0 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.Pirate var1 = var0.getPirate();
    int var2 = var1.getX();
    int var3 = var1.getX();
    var1.positionInitiale((-1), 10);
    var1.setAvatar("PanelUI");
    var1.setAvatar("");
    var1.positionInitiale(1, (-1));
    int var14 = var1.getX();
    var1.demandeDeplacement(11, 100);
    tinymonkeys.modele.Ile var20 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var21 = new tinymonkeys.modele.BandeDeSingesErratiques(var20);
    tinymonkeys.modele.SingeErratique var22 = new tinymonkeys.modele.SingeErratique((-1), 11, var20);
    tinymonkeys.modele.Ile var23 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var24 = new tinymonkeys.modele.BandeDeSingesErratiques(var23);
    int[][] var25 = new int[][] { };
    var23.creationCarte(var25);
    var20.creationCarte(var25);
    tinymonkeys.modele.Ile var28 = new tinymonkeys.modele.Ile();
    tinymonkeys.modele.BandeDeSingesErratiques var29 = new tinymonkeys.modele.BandeDeSingesErratiques(var28);
    int[][] var30 = new int[][] { };
    var28.creationCarte(var30);
    var20.creationCarte(var30);
    tinymonkeys.controleur.Controller var34 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var35 = new tinymonkeys.vue.Fenetre("PanelUI", var34);
    tinymonkeys.vue.VueElement var41 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var47 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var48 = var41.isAncestorOf((java.awt.Component)var47);
    boolean var49 = var41.isFocusTraversalPolicyProvider();
    boolean var52 = var41.contains(10, 111);
    java.awt.Dimension var53 = var41.minimumSize();
    tinymonkeys.vue.VueElement var59 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var60 = var59.getPeer();
    var59.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var59.repaint();
    java.lang.Object var66 = var59.getTreeLock();
    tinymonkeys.vue.VueElement var72 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var73 = var72.getPeer();
    var72.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var72.repaint();
    var72.updateUI();
    int var80 = var59.getComponentZOrder((java.awt.Component)var72);
    java.awt.Insets var81 = var59.getInsets();
    java.util.Locale var82 = var59.getLocale();
    var59.hide();
    java.awt.LayoutManager var84 = var59.getLayout();
    var41.setLayout(var84);
    var35.setLayout(var84);
    java.awt.Color var87 = var35.getBackground();
    java.awt.MenuBar var88 = var35.getMenuBar();
    var20.enregistreEcIle((tinymonkeys.modele.IleEcouteur)var35);
    boolean var90 = var35.isAutoRequestFocus();
    var1.enregistreEcPirate((tinymonkeys.modele.PirateEcouteur)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == true);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test318");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    javax.swing.InputMap var8 = var5.getInputMap(0);
    tinymonkeys.vue.VueElement var15 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var16 = var15.getPeer();
    javax.swing.InputMap var18 = var15.getInputMap(0);
    java.awt.Component.BaselineResizeBehavior var19 = var15.getBaselineResizeBehavior();
    boolean var20 = var15.isPreferredSizeSet();
    java.awt.Component var21 = var5.add("", (java.awt.Component)var15);
    java.awt.Cursor var22 = var15.getCursor();
    boolean var23 = var15.getVerifyInputWhenFocusTarget();
    javax.swing.ActionMap var24 = var15.getActionMap();
    javax.swing.event.AncestorListener[] var25 = var15.getAncestorListeners();
    tinymonkeys.vue.VueElement var31 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var32 = var31.getPeer();
    javax.swing.InputMap var34 = var31.getInputMap(0);
    java.awt.Component.BaselineResizeBehavior var35 = var31.getBaselineResizeBehavior();
    boolean var36 = var31.isPreferredSizeSet();
    javax.swing.InputMap var37 = var31.getInputMap();
    tinymonkeys.vue.VueElement var43 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var44 = var43.getPeer();
    var43.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var43.repaint();
    java.lang.Object var50 = var43.getTreeLock();
    java.awt.Component var53 = var43.locate(0, (-1));
    var43.setAlignmentX(0.5f);
    java.awt.Font var56 = var43.getFont();
    tinymonkeys.vue.VueElement var63 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var64 = var63.getUIClassID();
    float var65 = var63.getAlignmentX();
    boolean var66 = var63.isOptimizedDrawingEnabled();
    var43.putClientProperty((java.lang.Object)' ', (java.lang.Object)var66);
    tinymonkeys.vue.VueElement var73 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var74 = var73.getPeer();
    var73.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var73.repaint();
    java.lang.Object var80 = var73.getTreeLock();
    java.awt.Component var83 = var73.locate(0, (-1));
    var73.setAlignmentX(0.5f);
    java.awt.Font var86 = var73.getFont();
    java.awt.FontMetrics var87 = var43.getFontMetrics(var86);
    java.awt.FontMetrics var88 = var31.getFontMetrics(var86);
    var15.setFont(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "PanelUI"+ "'", var64.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test319");


    tinymonkeys.vue.VueTresor var5 = new tinymonkeys.vue.VueTresor(11, (-1), (-1), 100, 100);
    boolean var8 = var5.inside(111, 10);
    tinymonkeys.vue.VueElement var14 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var14.enable(true);
    int var17 = var14.getY();
    boolean var18 = var14.isValid();
    java.awt.Toolkit var19 = var14.getToolkit();
    java.awt.image.ColorModel var20 = var14.getColorModel();
    java.awt.Font var21 = var14.getFont();
    java.awt.FontMetrics var22 = var5.getFontMetrics(var21);
    java.awt.Container var23 = var5.getFocusCycleRootAncestor();
    java.awt.Container var24 = var5.getTopLevelAncestor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test320");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(10, 0, 10, (-1), (-1));
    tinymonkeys.vue.VueElement var11 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var12 = var11.getPeer();
    var11.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var11.repaint();
    java.lang.Object var18 = var11.getTreeLock();
    tinymonkeys.vue.VueElement var24 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var25 = var24.getPeer();
    var24.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var24.repaint();
    var24.updateUI();
    int var32 = var11.getComponentZOrder((java.awt.Component)var24);
    tinymonkeys.vue.VueElement var38 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var39 = var38.getPeer();
    var38.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var38.transferFocusUpCycle();
    boolean var45 = var38.getInheritsPopupMenu();
    java.awt.Dimension var46 = var38.minimumSize();
    java.awt.Dimension var47 = var24.getSize(var46);
    boolean var48 = var5.isAncestorOf((java.awt.Component)var24);
    var5.hide();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test321");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    var5.enable(true);
    int var8 = var5.getY();
    boolean var9 = var5.isValid();
    java.awt.Toolkit var10 = var5.getToolkit();
    var5.setInheritsPopupMenu(false);
    var5.transferFocusDownCycle();
    boolean var14 = var5.isFocusTraversable();
    tinymonkeys.vue.VueElement var20 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var21 = var20.getPeer();
    var20.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var20.repaint();
    java.awt.GraphicsConfiguration var27 = var20.getGraphicsConfiguration();
    boolean var28 = var20.getInheritsPopupMenu();
    tinymonkeys.vue.VueElement var34 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var35 = var34.getPeer();
    var34.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var34.repaint();
    java.lang.Object var41 = var34.getTreeLock();
    java.awt.Component var44 = var34.locate(0, (-1));
    var34.resize((-1), 0);
    var34.transferFocusDownCycle();
    javax.swing.KeyStroke[] var49 = var34.getRegisteredKeyStrokes();
    tinymonkeys.vue.VueElement var55 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    tinymonkeys.vue.VueElement var61 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    boolean var62 = var55.isAncestorOf((java.awt.Component)var61);
    boolean var63 = var55.isFocusTraversalPolicyProvider();
    boolean var66 = var55.contains(10, 111);
    var34.remove((java.awt.Component)var55);
    javax.swing.JRootPane var68 = var34.getRootPane();
    java.lang.String var69 = var34.getToolTipText();
    boolean var70 = var20.isAncestorOf((java.awt.Component)var34);
    java.awt.Rectangle var71 = var20.getVisibleRect();
    var5.computeVisibleRect(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test322");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var6 = var5.getPeer();
    var5.firePropertyChange("hi!", (-1.0f), (-1.0f));
    var5.repaint();
    java.lang.Object var12 = var5.getTreeLock();
    java.awt.image.ColorModel var13 = var5.getColorModel();
    var5.repaint();
    java.awt.Graphics var15 = var5.getGraphics();
    boolean var16 = var5.isOptimizedDrawingEnabled();
    var5.repaint(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test323");


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
    var27.setVisible(false);
    var27.enable(true);
    var5.removeKeyListener((java.awt.event.KeyListener)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test324");


    tinymonkeys.vue.VueElement var5 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.lang.String var6 = var5.getUIClassID();
    javax.swing.TransferHandler var7 = var5.getTransferHandler();
    java.awt.Color var8 = var5.getForeground();
    var5.show();
    var5.setIgnoreRepaint(true);
    var5.addNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "PanelUI"+ "'", var6.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test325");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    int var3 = var2.getExtendedState();
    java.awt.Window.Type var4 = var2.getType();
    tinymonkeys.vue.VueElement var10 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var11 = var10.getPeer();
    javax.swing.InputMap var13 = var10.getInputMap(0);
    boolean var14 = var10.isDisplayable();
    boolean var15 = var10.getFocusTraversalKeysEnabled();
    java.awt.Dimension var16 = var10.getMaximumSize();
    var2.setMinimumSize(var16);
    java.util.List var18 = var2.getIconImages();
    tinymonkeys.vue.VueElement var24 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var25 = var24.getPeer();
    javax.swing.InputMap var27 = var24.getInputMap(0);
    java.awt.Component.BaselineResizeBehavior var28 = var24.getBaselineResizeBehavior();
    var24.layout();
    int var30 = var24.getWidth();
    java.awt.LayoutManager var31 = var24.getLayout();
    var2.setLayout(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test326");


    tinymonkeys.modele.Tresor var2 = new tinymonkeys.modele.Tresor((-1), (-1));
    var2.setPosition((-1), 3);
    var2.setPosition(10, 10);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test327");


    tinymonkeys.controleur.Controller var1 = new tinymonkeys.controleur.Controller();
    tinymonkeys.vue.Fenetre var2 = new tinymonkeys.vue.Fenetre("PanelUI", var1);
    int var3 = var2.getExtendedState();
    java.awt.Window.Type var4 = var2.getType();
    tinymonkeys.vue.VueElement var10 = new tinymonkeys.vue.VueElement(1, 100, 0, 10, 10);
    java.awt.peer.ComponentPeer var11 = var10.getPeer();
    javax.swing.InputMap var13 = var10.getInputMap(0);
    boolean var14 = var10.isDisplayable();
    boolean var15 = var10.getFocusTraversalKeysEnabled();
    java.awt.Dimension var16 = var10.getMaximumSize();
    var2.setMinimumSize(var16);
    java.awt.Dimension var18 = var2.getSize();
    var2.setLocationByPlatform(true);
    javax.swing.TransferHandler var21 = var2.getTransferHandler();
    var2.enable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

}
