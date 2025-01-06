
/**
 *Sous Classe pour Cockpit, (hérite de la classe Composant).
 */

//Librerie utilisée pour génerer le nombre random de la porte du cockpit. 
import java.util.Random;

public class Cockpit extends Composant {

    // Indique si le cockpit est un glass cockpit 
    private boolean glassCockpit;

    // Indique si le cockpit est analogique
    private boolean analogique;

    // Indique si le cockpit dispose d'un HUD
    private boolean hud;

    // Indique si le cockpit est équipé d'un joystick
    private boolean joystick;

    // Code d'accès pour sécuriser l'accès au cockpit
    private int codeAcces;

    // *********************** CONSTRUCTEUR **************************************
    /**
     * Constructeur de la classe Cockpit.
     * Hérite de la classe composants: 
     * @param nom          Nom du cockpit
     * @param poids        Poids du cockpit en kg
     * @param numeroSerie  Numéro de série unique du cockpit
     * @param prix         Prix du cockpit 
     * Attributs spécifiques: 
     * @param glassCockpit true si le cockpit est un glass cockpit
     * @param analogique   true si le cockpit est analogique
     * @param hud          true si le cockpit dispose d'un HUD
     * @param joystick     true si le cockpit est équipé d'un joystick
     * @param codeAcces    Code d'accès au cockpit à 5 chiffres
     */
    public Cockpit(String nom, float poids, String numeroSerie, float prix,
            boolean glassCockpit, boolean analogique,
            boolean hud, boolean joystick, int codeAcces) {
        // on passe les attributs communs au constructeur de la super classe
        super(nom, poids, numeroSerie, prix);
        // On asigne les valeurs aux attributs.
        this.glassCockpit = glassCockpit;
        this.analogique = analogique;
        this.hud = hud;
        this.joystick = joystick;
        this.codeAcces = codeAcces;
    }

    // autre constructeur en utilisant la methode codeAccesRandomise pour générer
    // le code de la porte
    public Cockpit(String nom, float poids, String numeroSerie, float prix,
            boolean glassCockpit, boolean analogique,
            boolean hud, boolean joystick) {
        super(nom, poids, numeroSerie, prix);
        this.glassCockpit = glassCockpit;
        this.analogique = analogique;
        this.hud = hud;
        this.joystick = joystick;
        codeAccesRandomise();
    }

    // *********************** GETTERS & SETTERS *****************************
    /**
     * Vérifie si le cockpit est un glass cockpit.
     *
     * @return true si le cockpit est un glass cockpit, sinon false
     */
    public boolean isGlassCockpit() {
        return glassCockpit;
    }

    /**
     * Définit si le cockpit est un glass cockpit.
     *
     * @param glassCockpit true pour un glass cockpit, false sinon
     */
    public void setGlassCockpit(boolean glassCockpit) {
        this.glassCockpit = glassCockpit;
    }

    /**
     * Vérifie si le cockpit est analogique.
     *
     * @return true si le cockpit est analogique, sinon false
     */
    public boolean isAnalogique() {
        return analogique;
    }

    /**
     * Définit si le cockpit est analogique.
     *
     * @param analogique true pour cockpit analogique, false sinon
     */
    public void setAnalogique(boolean analogique) {
        this.analogique = analogique;
    }

    /**
     * Vérifie si le cockpit dispose d'un HUD.
     *
     * @return true si le HUD est présent, sinon false
     */
    public boolean isHud() {
        return hud;
    }

    /**
     * Définit si le cockpit dispose d'un HUD.
     *
     * @param hud true pour activer le HUD, false sinon
     */
    public void setHud(boolean hud) {
        this.hud = hud;
    }

    /**
     * Vérifie si le cockpit est équipé d'un joystick.
     *
     * @return true si un joystick est présent, sinon false
     */
    public boolean isJoystick() {
        return joystick;
    }

    /**
     * Définit si le cockpit est équipé d'un joystick.
     *
     * @param joystick true pour activer le joystick, false sinon
     */
    public void setJoystick(boolean joystick) {
        this.joystick = joystick;
    }

    /**
     * Retourne le code d'accès du cockpit.
     *
     * @return Code d'accès sous forme de chaîne
     */
    public int getCodeAcces() {
        return codeAcces;
    }

    /**
     * Définit le code d'accès pour le cockpit.
     *
     * @param codeAcces Nouveau code d'accès
     */
    public void setCodeAcces(int codeAcces) {
        this.codeAcces = codeAcces;
    }


    // *********************** METHODES **************************************

    /**
     * Génère le code d'acces au Cockpit
     * 
     */
    public void codeAccesRandomise() {
        Random random = new Random();
        // Génère un nombre random entre 10000 et 90000-1
        int randomFiveDigitNumber = 10000 + random.nextInt(90000);
        this.codeAcces = randomFiveDigitNumber;
    }

    /**
     * Affiche les détails du cockpit, incluant les propriétés spécifiques.
     *
     * @return Chaîne formatée avec les détails du cockpit
     */
    @Override
    public String afficherDetails() {
        return super.afficherDetails()
                + String.format("Cockpit: Glass=%b, Analogique=%b, HUD=%b, Joystick=%b, Code porte: %d",
                        this.glassCockpit, this.analogique, this.hud, this.joystick, this.codeAcces);
    }
}
