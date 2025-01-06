import java.util.HashSet;
import java.util.Set;

/**
 * Super Classe pour tous les composants d'un avion.
 */
public class Composant {
    // Déclaration des attributs communs pour a tout les differents composents en
    // privées.
    // Ces attributs serons accesibles via les getters et les setters cela suis les
    // bonnes pratiques.
    private String nom;
    private float poids;
    private String numeroSerie;
    private float prix;
    // On crée HasSet comme une "liste" donc tous les éléments doivent étre uniques.
    // On déclare en privées, static qui permet d'étre lisible pour toutes
    // les instances de cette super classes et de toutes les sous classes
    // On la fait final pour eviter de la reseter.
    private static final Set<String> numeroSeries = new HashSet<>();
    // On utilise estUtilise pour eéviter qu'un composent sois réutiliser dans
    // plusieurs avions.
    private boolean estUtilise;

    // *********************** CONSTRUCTEUR **************************************
    /**
     * Constructeur de la classe composants (les '@param' et '@return' permettent
     * d'avoir la documentation)
     * Attributs communs:
     * 
     * @param nom         Nom de l'aile
     * @param poids       Poids de l'aile en kilogrammes
     * @param numeroSerie Numéro de série unique a ce composent
     * @param prix        Prix de l'aile en euros
     */
    public Composant(String nom, float poids, String numeroSerie, float prix) {
        // Pour verifier le numéreau de Serie est bien unique.
        // Si il n'est pas unique nous retournons directement.
        if (numeroSeries.contains(numeroSerie)) {
            System.out.println("WARNING: Le Numéro de Série est Déja utilisé");
            return;
        }
        // On rajoute a la liste le numero de Serie du constructeur.
        numeroSeries.add(numeroSerie);
        // On asigne les valeurs aux attributs.
        // On utilise this pour specifier les attributs de cette classe.
        this.nom = nom;
        this.poids = poids;
        this.prix = prix;
        this.estUtilise = false;
        this.numeroSerie = numeroSerie;
    }

    // *********************** GETTERS & SETTERS *****************************
    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPoids() {
        return this.poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    public String getNumeroSerie() {
        return this.numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public float getPrix() {
        return this.prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    /**
     * Est utilisée pour vérifier si ce composant a étét déja mis dans un avion
     * 
     * @return boolean estUtilise
     */
    public boolean getEstUtilise() {
        return this.estUtilise;
    }

    /**
     * pour préciser si déja utliser dans un avion ou non.
     * 
     * @param estUtilise the estUtilise to set
     * @return
     */
    public void setEstUtilise(boolean estUtilise) {
        this.estUtilise = estUtilise;
    }

    // *********************** METHODES **************************************
    /**
     * Affiche des details des composants qui seront enrichis dans chaque sous
     * classe.
     * 
     * @return String
     */
    public String afficherDetails() {
        return String.format("Composant:\nNom: %s, Poids: %.2f, numeroSerie: %s, Prix: %f\n",
                this.nom, this.poids, this.numeroSerie, this.prix);

    }

}
