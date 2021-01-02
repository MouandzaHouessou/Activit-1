/**
 * package-info.java: toutes les infos sur le package .
 * Test d'ecriture, TabAlgos.java .
 * @author HOUESSOU(angelhoues@gmail.com)
 */
public final class TabAlgos {
/**
 * Constructeur protected avec exception .
 * pour empecher l'instantiation de la classe .
 * @throws Exception lorsue la classe est instancié .
 */
  protected TabAlgos() throws Exception {
    throw new Exception("cette classe ne peut pas être instanciée");
  }
/**
 * Détermine le plus grand entier du tableau.
 * @param tab tableau d'entier.
 * @throw IllegalArgumentException si tab et null ou vide
 * @return valeur la plus grande d'un tableau
 */
  public static int plusGrand(final int[] tab) {
    if (tab == null || tab.length == 0) {
      throw new IllegalArgumentException("Tableau nulle où vide");
    }
    int plusGrand = tab[0];
    for (int i : tab) {
      if (i > plusGrand) {
         plusGrand = i;
      }
    }
   return plusGrand;
  }
/**
 * calcule la moyenne des entiers du tableau.
 * @param tab tableau d'entier.
 * @return moyenne des valeurs du tableau.
 * @throw IllegalArgumentException si tab et null ou vide.
 **/
  public static double moyenne(final int[] tab) {
    if (tab == null || tab.length == 0) {
       throw new IllegalArgumentException("Tableau nulle où vide");
    }
    int somme = 0;
    for (int note : tab) {
      somme += note;
    }
   return somme / tab.length;
  }
/**
 * Compare le contenu de 2 tableaux en tenant compte de l'ordre.
 * @param tab1 premier tableau d'entiers comparer
 * @param tab2 deuxième tableau d'entiers comparer
 * @return true si les 2 tableaux contiennent les mêmes éléments
 * avec les mêmes nombres d'occurences
 * (avec les elements dans le meme ordre).
 **/
  public static boolean egaux(final int[] tab1, final int[] tab2) {
    if (tab1 == null || tab2 == null) {
       throw new IllegalArgumentException("Tableau nulle où vide");
    }
    if (tab1.length != tab2.length) {
      return false;
    }
    int compteur = 0;
    while (compteur < tab1.length) {
      if (tab1[compteur] != tab2[compteur]) {
        compteur++;
        return false;
      } else {
        compteur++;
      }
    }
    return true;
  }
/**
 * Compare le contenu de 2 tableaux sans tenir compte de l'ordre.
 * @param tab1 premier tableau d'entiers comparer
 * @param tab2 deuxième tableau d'entiers comparer
 * @return true si les 2 tableaux contiennent les mêmes éléments
 * avec les mêmes nombres d'occurrence (pas forcement dans le meme ordre).
 **/
 public static boolean similaires(final int[] tab1, final int[] tab2) {
    if (tab1 == null || tab2 == null) {
        throw new IllegalArgumentException("Tableau nulle où vide");
    }
   trieCroissant(tab1);
   trieCroissant(tab2);
   return egaux(tab1, tab2);
  }
/**
 * Trie dans l'ordre croissant les éléments.
 * d'un tableau d'entier passé en paramètre
 * @param tab tableau d'entiers à trier
 **/
 public static void trieCroissant(final int[] tab) {
   int i;
   int j;
   int valeur;
   for (i = 1; i < tab.length; i++) {
     valeur = tab[i];
     j = i;
     while ((j >= 1) && (tab[j - 1] > valeur)) {
     tab[j]  = tab[j - 1];
     j = j - 1;
   }
   tab[j] = valeur;
  }
 }
}
