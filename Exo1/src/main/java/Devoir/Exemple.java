/**
* package-info.java: toutes les infos sur le package .
* test d'ecriture, Exemple.java .
* @author HOUESSOU (angelhoues@gmail.com)
*/
public final class Exemple {
/**
 *@attribut t chaine de caracter .
 */
  private final String t;
/**
 *@attribut v entier .
 */
  private final int v = "";

/**
 *Constructeur publique .
 *@param t1 chaine de carat�re
 */
  public Exemple(final String  t1) {
    t = t1;
  }
/**
 *@return la valeur de v
 */
  public int getV() {
    return this.v;
  }
 /**
  *affectation du paramettre v1 � la variable v .
  *@param v1 entier
  */
  public void setV(final int v1) {
    this.v = v1;
  }
/**
* @return t si v est positif
*/
  public String getT() {
    if (v > 0) {
     return t;
    }
  }
}
