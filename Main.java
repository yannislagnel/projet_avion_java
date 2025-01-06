/**
 * Main ou nous regroupons toutes les informations pour les composants et les
 * avions.
 */
public class Main {

        /**
         * Point d'entrée du programme.
         *
         * @param args les arguments de la ligne de commande
         */
        public static void main(String[] args) {
                // Création d'avionneurs
                Avionneur boeing = new Avionneur("Boeing");
                Avionneur airbus = new Avionneur("Airbus");
                Avionneur atr = new Avionneur("ATR");

                // Création d'avions pour les avionneurs
                Avion avion1 = new Avion("737-700", boeing);
                Avion avion2 = new Avion("777x", boeing);
                Avion avion3 = new Avion("320neo", airbus);
                Avion avion4 = new Avion("ATR72", atr);

                // Création de composants
                Moteur moteur1 = new Moteur("CFM LEAP1-B", 5000.0f, "SN12345", 4_000_000f,
                                100000f, 2_500f, "JET A-1");
                Moteur moteur2 = new Moteur("GE9X", 8000.0f, "SN12346", 5_000_000f,
                                50000f, 2_500f, "JET A-1");
                Moteur moteur3 = new Moteur("CFM LEAP1-A", 5000.0f, "SN12342", 4_000_000f,
                                100000f, 2_500f, "JET A-1");
                Moteur moteur4 = new Moteur("PW100", 2000.0f, "SN12343", 2_000_000f,
                                30000f, 2_500f, "JET A-1");

                Aile aile1 = new Aile("Aile", 25000.0f, "SN54314", 2_800_000.0f,
                                35.5f, 8.0f, true, 5000.0f, "Moyenne avec dièdre positif");
                // Pour Aile2 et Aile3 nous avons mis les numeros de Series Identiques.
                Aile aile2 = new Aile("Aile", 25000.0f, "SN56789", 2_800_000.0f,
                                35.5f, 8.0f, true, 5000.0f, "Moyenne avec dièdre négatif");
                Aile aile3 = new Aile("Aile", 25000.0f, "SN56789", 2_800_000.0f,
                                35.5f, 8.0f, true, 5000.0f, "Moyenne avec dièdre positif");
                Aile aile4 = new Aile("Aile", 25000.0f, "SN54320", 2_800_000.0f,
                                35.5f, 8.0f, true, 5000.0f, "Haute");

                Cockpit cp1 = new Cockpit("glass", 500, "SN3884004", 8_000_000, true, false, true, false, 12345);
                Cockpit cp2 = new Cockpit("glass", 500, "SN3881234", 8_000_000, true, false, true, false);
                Cockpit cp3 = new Cockpit("glass", 500, "SN3884235", 8_000_000, true, false, true, false);
                Cockpit cp4 = new Cockpit("glass", 500, "SN3884665", 8_000_000, true, false, true, false);
                Cockpit cp5 = new Cockpit("glass", 500, "SN3884985", 8_000_000, true, false, true, false);

                // Association des composants aux avions
                ajoutComposantAvion(avion1, moteur1);
                ajoutComposantAvion(avion1, cp2);
                ajoutComposantAvion(avion1, aile1);

                ajoutComposantAvion(avion2, moteur2);
                ajoutComposantAvion(avion2, cp3);
                ajoutComposantAvion(avion2, aile2);

                ajoutComposantAvion(avion3, moteur3);
                ajoutComposantAvion(avion3, cp4);
                ajoutComposantAvion(avion3, aile3);

                ajoutComposantAvion(avion4, moteur4);
                ajoutComposantAvion(avion4, cp5);
                ajoutComposantAvion(avion4, aile4);

                // Affichage des détails et calculs
                System.out.println("Avion1: autonomie=" + avion1.autonomie() + " heures");

                avion1.afficherDetailsAvion();
                avion2.afficherDetailsAvion();
                avion3.afficherDetailsAvion();
                avion4.afficherDetailsAvion();

                // Affichage des informations sur les avionneurs
                System.out.println("Avionneur : " + boeing.getNomAvionneur());
                System.out.println("Nombre total d'avions construits par Boeing : " + boeing.getNombreTotalAvions());
        }

        /**
         * Ajoute un composant à un avion si le modèle de l'avion et le nom du composant
         * ne sont pas null.
         *
         * @param a l'avion auquel ajouter le composant
         * @param c le composant à ajouter
         * @return true si le composant a été ajouté, false sinon
         */
        static boolean ajoutComposantAvion(Avion a, Composant c) {
                if (a.getModele() != null && c.getNom() != null) {
                        a.ajoutComposant(c);
                        return true;
                }
                return false;
        }
}
