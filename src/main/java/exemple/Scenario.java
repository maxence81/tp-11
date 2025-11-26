package exemple;

import java.util.ArrayList;
import java.util.List;

import bandeau.Bandeau;

public class Scenario {
        private static class Etape {
        Effet effet;
        int repetitions;

        public Etape(Effet effet, int repetitions) {
            this.effet = effet;
            this.repetitions = repetitions;
        }
    }

    private final List<Etape> etapes = new ArrayList<>();

    /**
     * Ajoute un effet au scénario.
     * @param e L'effet à ajouter
     * @param repetitions Le nombre de fois que l'effet doit être répété à cette étape
     */
    public void ajouterEffet(Effet e, int repetitions) {
        if (repetitions > 0) {
            etapes.add(new Etape(e, repetitions));
        }
    }

    /**
     * Exécute le scénario complet sur le bandeau donné.
     * @param b Le bandeau cible
     */
    public void derouler(Bandeau b) {
        for (Etape etape : etapes) {
            System.out.println("Lancement de l'effet : " + etape.effet.nom 
                             + " (" + etape.repetitions + " fois)");
            
            for (int i = 0; i < etape.repetitions; i++) {
                etape.effet.jouerSur(b);
            }
        }
        b.close();
    }
}