import java.util.HashSet;
import java.util.Set;

/**
 * Classe représentant un Avion.
 */
public class Avion {

    // Modèle de l'avion (A320, B737).
    private String modele;

    /**
     *
     * Chaque avion est lié à un seul Avionneur.
     */
    private Avionneur constructeur;

    // Liste des composants qui constituent l'avion.
    private Set<Composant> listeComposants;

    // *********************** CONSTRUCTEUR **************************************
    /**
     * Constructeur de la classe Avion.
     *
     * @param modele       le modèle de l'avion
     * @param constructeur l'avionneur qui a construit l'avion
     */
    public Avion(String modele, Avionneur constructeur) {
        this.modele = modele;
        this.constructeur = constructeur;
        this.listeComposants = new HashSet<>();

        // Notifie l'avionneur qu'un nouvel avion a été créé
        if (this.constructeur != null) {
            this.constructeur.incrementerNombreAvions();
        }
    }

    // *********************** GETTERS & SETTERS *****************************
    /**
     * Retourne le modèle de l'avion.
     *
     * @return le modèle de l'avion
     */
    public String getModele() {
        return modele;
    }

    /**
     * Modifie le modèle de l'avion.
     *
     * @param modele le nouveau modèle de l'avion
     */
    public void setModele(String modele) {
        this.modele = modele;
    }

    /**
     * Retourne l'avionneur qui a construit cet avion.
     *
     * @return l'avionneur de l'avion
     */
    public Avionneur getConstructeur() {
        return constructeur;
    }

    /**
     * Modifie l'avionneur qui a construit cet avion.
     *
     * @param constructeur le nouvel avionneur
     */
    public void setConstructeur(Avionneur constructeur) {
        this.constructeur = constructeur;
    }

    /**
     * Retourne la liste des composants constituant l'avion.
     *
     * @return une collection contenant les composants de l'avion
     */
    public Set<Composant> getListeComposants() {
        return listeComposants;
    }

    /**
     * Modifie manuellement la liste des composants de l'avion.
     *
     * @param listeComposants la nouvelle liste de composants
     */
    public void setListeComposants(Set<Composant> listeComposants) {
        this.listeComposants = listeComposants;
    }

    // *********************** METHODES **************************************
    /**
     * Ajoute un composant à l'avion.
     *
     * @param c le composant à ajouter
     * @return true si le composant a été ajouté, false s'il est déjà utilisé
     */
    public boolean ajoutComposant(Composant c) {
        if (c.getEstUtilise()) {
            return false;
        }

        c.setEstUtilise(true);
        return listeComposants.add(c);
    }

    /**
     * Supprime un composant de l'avion.
     *
     * @param c le composant à supprimer
     * @return true si le composant a été supprimé, false s'il n'était pas présent
     */
    public boolean suppressionComposant(Composant c) {
        c.setEstUtilise(false);
        return listeComposants.remove(c);
    }

    /**
     * Affiche les détails de l'avion et ses propriétés spécifiques.
     */
    public void afficherDetailsAvion() {
        System.out.println(String.format(
                "Avion:\nModele: %s, Constructeur: %s, Nombre de Composants: %d\nPoids: %.1f, Autonomie: %.2f heures, Prix: %.2f euros\n",
                this.modele,
                this.constructeur != null ? this.constructeur.getNomAvionneur() : "Inconnu",
                listeComposants.size(),
                totalPoids(),
                autonomie(),
                coutTotal()));

        for (Composant c : listeComposants) {
            System.out.println(c.afficherDetails());
        }
    }

    /**
     * Calcule l'autonomie de l'avion en fonction des capacités des réservoirs
     * et des consommations des moteurs.
     *
     * @return l'autonomie de l'avion en heures
     */
    public float autonomie() {
        float totalConso = 0.0f;
        float totalLitres = 0.0f;

        // Récupère la consommation totale des moteurs
        for (Composant c : listeComposants) {
            if (c instanceof Moteur) {
                totalConso += ((Moteur) c).getConsommation();
            }
        }

        // Récupère la capacité totale des réservoirs dans les ailes
        for (Composant c : listeComposants) {
            if (c instanceof Aile) {
                totalLitres += ((Aile) c).getCapaciteReservoirs();
            }
        }

        // Calcul de l'autonomie en heures
        return totalConso > 0 ? (totalLitres / totalConso) : 0.0f;
    }

    /**
     * Calcule le poids total de l'avion.
     *
     * @return le poids total en kilogrammes
     */
    public float totalPoids() {
        float total = 0.0f;
        for (Composant c : listeComposants) {
            total += c.getPoids();
        }
        return total;
    }

    /**
     * Calcule le coût total de l'avion, basé sur les prix des composants.
     *
     * @return le coût total en euros
     */
    public float coutTotal() {
        float cout = 0.0f;
        for (Composant c : listeComposants) {
            cout += c.getPrix();
        }
        return cout;
    }
}
