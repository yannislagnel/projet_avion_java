/**
 * Sous Classe pour Fuselage, (hérite de la classe Composant).
 */
public class Fuselage extends Composant {

    // Nombre de séries de sièges dans le fuselage.
    private int seriesSieges;

    // Nombre total de sièges dans le fuselage.
    private int nombreSieges;

    // Indique si le fuselage dispose d'un double pont (true) ou non (false).
    private boolean doublePont;

    // Longueur du fuselage en m.
    private float longueur;

    // Diamètre du fuselage en m.
    private float diametre;

    // *********************** CONSTRUCTEUR **************************************
    /**
     * Constructeur de la classe Fuselage.
     * Hérite de la classe composants:
     *
     * @param nom          le nom du composant
     * @param poids        le poids du fuselage en kg
     * @param numeroSerie  le numéro de série du composant
     * @param prix         le prix du fuselage
     *                     Attributs spécifiques:
     * @param seriesSieges le nombre de séries de sièges
     * @param nombreSieges le nombre total de sièges
     * @param doublePont   true si le fuselage dispose d'un double pont, false sinon
     * @param longueur     la longueur du fuselage en m
     * @param diametre     le diamètre du fuselage en m
     */
    public Fuselage(String nom, float poids, String numeroSerie, float prix,
            int seriesSieges, int nombreSieges, boolean doublePont,
            float longueur, float diametre) {
        super(nom, poids, numeroSerie, prix);
        this.seriesSieges = seriesSieges;
        this.nombreSieges = nombreSieges;
        this.doublePont = doublePont;
        this.longueur = longueur;
        this.diametre = diametre;
    }

    // *********************** GETTERS & SETTERS *****************************
    /**
     * Retourne le nombre de séries de sièges dans le fuselage.
     *
     * @return le nombre de séries de sièges
     */
    public int getSeriesSieges() {
        return seriesSieges;
    }

    /**
     * Modifie le nombre de séries de sièges dans le fuselage.
     *
     * @param seriesSieges le nouveau nombre de séries de sièges
     */
    public void setSeriesSieges(int seriesSieges) {
        this.seriesSieges = seriesSieges;
    }

    /**
     * Retourne le nombre total de sièges dans le fuselage.
     *
     * @return le nombre total de sièges
     */
    public int getNombreSieges() {
        return nombreSieges;
    }

    /**
     * Modifie le nombre total de sièges dans le fuselage.
     *
     * @param nombreSieges le nouveau nombre total de sièges
     */
    public void setNombreSieges(int nombreSieges) {
        this.nombreSieges = nombreSieges;
    }

    /**
     * Indique si le fuselage dispose d'un double pont.
     *
     * @return true si le fuselage a un double pont, false sinon
     */
    public boolean isDoublePont() {
        return doublePont;
    }

    /**
     * Modifie la configuration de double pont du fuselage.
     *
     * @param doublePont true pour activer le double pont, false pour désactiver
     */
    public void setDoublePont(boolean doublePont) {
        this.doublePont = doublePont;
    }

    /**
     * Retourne la longueur du fuselage en mètres.
     *
     * @return la longueur du fuselage
     */
    public float getLongueur() {
        return longueur;
    }

    /**
     * Modifie la longueur du fuselage.
     *
     * @param longueur la nouvelle longueur en mètres
     */
    public void setLongueur(float longueur) {
        this.longueur = longueur;
    }

    /**
     * Retourne le diamètre du fuselage en mètres.
     *
     * @return le diamètre du fuselage
     */
    public float getDiametre() {
        return diametre;
    }

    /**
     * Modifie le diamètre du fuselage.
     *
     * @param diametre le nouveau diamètre en mètres
     */
    public void setDiametre(float diametre) {
        this.diametre = diametre;
    }

    // *********************** METHODES **************************************
    /**
     * Calcule le volume approximatif du fuselage.
     * Ce calcul est basé sur une approximation cylindrique du fuselage.
     *
     * @return le volume du fuselage en mètres cubes
     */
    public float volume() {
        // Volume approximatif d'un cylindre (π * r² * h)
        return (float) (Math.PI * Math.pow(diametre / 2.0, 2) * longueur);
    }

    /**
     * Affiche les détails du fuselage, y compris le nombre de sièges,
     * la configuration double pont, la longueur et le diamètre.
     *
     * @return une chaîne formatée contenant les détails du fuselage
     */
    @Override
    public String afficherDetails() {
        return String.format("Fuselage: %s, %d sièges, DoublePont=%b, Longueur=%.2f m, Diamètre=%.2f m",
                getNom(), nombreSieges, doublePont, longueur, diametre);
    }
}
