import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
public class TestTabAlgos {
/**
 * tests sur la méthode plusGrand().
 */
 @Test
 public void testPlusGrand() {
   final int[] tab = {1, 3, 5, 0, 2, 5, 7, 2};
   final int plusGrand = 7;
   assertEquals(plusGrand, TabAlgos.plusGrand(tab));
 }
 /**
  * tests sur la méthode plusGrand().
  */
  @Test
 public void testPlusGrandTabVide() {
   try {
    int[] tab = {};
    int valeur = TabAlgos.plusGrand(tab);
    fail("l'exception pour un tableau null aurait du être levée");
  } catch (IllegalArgumentException e) {
    //rien a faire
  }
 }
/**
 *tests sur la méthode plusGrand().
 */
  @Test
  public void testPlusGrandTabNull() {
    try {
      int[] tab = null;
      int valeur = TabAlgos.plusGrand(tab);
      fail("l'exception pour un tableau null aurait du être levée");
    } catch (IllegalArgumentException e) {
      //rien a faire
    }
  }
/**
 * tests sur la méthode Moyenne().
 */
  @Test
  public void testCalculeMoyenne() {
    final int[] tab = {2, 25, 3, 5, 5};
    final int moyenne = 8;
    assertEquals(moyenne, TabAlgos.moyenne(tab));
  }
/**
 * tests sur la méthode Moyenne().
 */
  @Test
  public void testMoyenneTableauNull() {
    try {
      int[] tab = null;
      double valeur = TabAlgos.moyenne(tab);
      fail("l'exception pour un tableau null aurait du être levée");
    } catch (IllegalArgumentException e) {
      // rien a faire
    }
  }
/**
 * tests sur la méthode Moyenne().
 */
  @Test
  public void testMoyenneTableauVide() {
    try {
      int[] tab = {};
      double valeur = TabAlgos.moyenne(tab);
      fail("l'exception pour un tableau null aurait du être levée");
    } catch (IllegalArgumentException e) {
      //rien a faire
    }
  }
/**
 * tests sur la méthode egaux().
 */
  @Test
  public void testEgauxIllegalArgumentException1() {
    try {
      int[] tab1 = null;
      int[] tab2 = null;
      boolean val = TabAlgos.egaux(tab1, tab2);
    } catch (IllegalArgumentException e) {
      //rien a faire
    }
  }
/**
 * tests sur la méthode  egaux().
 */
 @Test
 public void testEgauxIllegalArgumentException2() {
   try {
     final int[] tab1 = {22, 2, 5};
     int[] tab2 = null;
     boolean val = TabAlgos.egaux(tab1, tab2);
   } catch (IllegalArgumentException e) {
     //rien a faire
   }
 }
/**
 * test sur la méthode  egaux().
 * test sur tableau de taille differente
 */
 @Test
 public void testEgauxTableauDifferenteTaille() {
   final int[] tab1 = {1, 3, 2, 3, 4, 5, 7};
   final int[] tab2 = {1, 3, 2};
   assertFalse(TabAlgos.egaux(tab1, tab2));
 }
/**
 * tests sur la méthode  egaux().
 */
 @Test
 public void testEgauxTableauxDeMemeTailleAvecElementsDePositionDifferents() {
   final int[] tab1 = {1, 3, 2, 3, 4, 5, 7};
   final int[] tab2 = {1, 4, 2, 3, 4, 0, 7};
   assertFalse(TabAlgos.egaux(tab1, tab2));
 }
/**
 * tests sur la méthode  egaux().
 */
 @Test
 public void testEgaux() {
   final int[] tab1 = {1, 3, 2, 3, 4, 5, 7};
   final int[] tab2 = {1, 3, 2, 3, 4, 5, 7};
   assertEquals(true, TabAlgos.egaux(tab1, tab2));
 }
/**
 * tests sur la méthode similaires().
 */
  @Test
 public void testSimilairesIllegalArgumentException1() {
   try {
     int[] tab1 = null;
     int[] tab2 = null;
     boolean val = TabAlgos.similaires(tab1, tab2);
     fail("l'exception pour un tableau null aurait du être levée");
   } catch (IllegalArgumentException e) {
     //rien a faire
   }
 }
/**
 * tests sur la méthode similaires().
 */
 @Test
 public void testSimilairesIllegalArgumentException2() {
   try {
     final int[] tab1 = {22, 2, 5};
     int[] tab2 = null;
     boolean val = TabAlgos.similaires(tab1, tab2);
     fail("l'exception pour un tableau null aurait du être levée");
   } catch (IllegalArgumentException e) {
     //rien a faire
   }
 }
 /**
  * tests sur la méthode similaires().
  * test sur tableau de taille differente
  */
  @Test
  public void testSimilairesTableauDifferenteTaille() {
    final int[] tab1 = {1, 3, 2, 3, 4, 5, 7};
    final int[] tab2 = {1, 3, 2};
    assertFalse(TabAlgos.similaires(tab1, tab2));
  }
/**
 * tests sur la méthode similaires().
 * test sur tableau de taille differente avec element non ordonnées
 */
 @Test
 public void testEgauxTableauxDeMemeTailleAvecElementsNonOrdonnees() {
   final int[] tab1 = {1, 3, 2, 3, 4, 5, 7};
   final int[] tab2 = {7, 4, 2, 3, 3, 5, 1};
   assertEquals(true, TabAlgos.similaires(tab1, tab2));
 }
/**
 *tests sur la méthode  egaux().
 */
 @Test
 public void testsimilaires() {
   final int[] tab1 = {1, 3, 2, 3, 4, 5, 7};
   final int[] tab2 = {1, 3, 2, 3, 4, 5, 7};
   assertEquals(true, TabAlgos.similaires(tab1, tab2));
 }
}
