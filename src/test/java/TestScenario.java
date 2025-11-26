import java.awt.Color;
import java.awt.Font;

import bandeau.Bandeau;
import exemple.Clignotant;
import exemple.Rotation;
import exemple.Scenario;
import exemple.Zoom;

/**
 * Programme principal de démonstration.
 * Il configure un scénario complet et le fait jouer sur un Bandeau.
 */
public class TestScenario {

    public static void main(String[] args) {
        // 1. Instanciation du Bandeau
        System.out.println("Lancement du Bandeau...");
        Bandeau monBandeau = new Bandeau();

        // 2. Configuration initiale (Mise en place du décor)
        // On prépare le bandeau pour qu'il soit lisible dès le début
        Font fontBase = new Font("SansSerif", Font.BOLD, 20);
        monBandeau.setFont(fontBase);
        monBandeau.setForeground(Color.BLACK);
        monBandeau.setBackground(Color.WHITE);
        monBandeau.setMessage("Bienvenue dans le Scénario !");
        monBandeau.sleep(2000);

        // 3. Création et configuration du Scénario
        // C'est ici qu'on définit la "partition" à jouer
        Scenario scenario = new Scenario();

        System.out.println("Construction du scénario...");

        // Etape 1 : Attirer l'attention (Zoom)
        // On joue l'effet 1 fois
        scenario.ajouterEffet(new Zoom(), 1);

        // Etape 2 : Créer une alerte (Clignotant)
        // On répète l'effet 3 fois pour bien marquer l'esprit
        scenario.ajouterEffet(new Clignotant(), 3);

        // Etape 3 : Une action dynamique (Rotation)
        // On fait tourner le texte 2 fois
        scenario.ajouterEffet(new Rotation(), 2);
        
        // On peut réutiliser un effet déjà ajouté (le Zoom pour finir)
        scenario.ajouterEffet(new Zoom(), 1);

        // 4. Déroulement du Scénario
        System.out.println("Début du déroulement du scénario...");
        
        // Le scénario prend le contrôle du bandeau
        scenario.derouler(monBandeau);
        
        System.out.println("Scénario terminé.");

        // 5. Conclusion et Nettoyage
        monBandeau.setFont(new Font("Dialog", Font.ITALIC, 20));
        monBandeau.setForeground(Color.BLUE);
        monBandeau.setMessage("Fin de la démonstration.");
        monBandeau.sleep(3000);
        
        // Fermeture propre
        monBandeau.close();
    }
}