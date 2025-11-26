package exemple;

import java.awt.Color;

import bandeau.Bandeau;

public class Clignotant extends Effet {

    public Clignotant() {
        super("Clignotant");
    }

    @Override
    public void jouerSur(Bandeau b) {
        b.setMessage("Clignotement !!!");
        String message = b.getMessage();
        Color backOrigine = b.getBackground();
        Color foreOrigine = b.getForeground();
        
        for(int i = 0; i < 10; i++) {
            // Changement de couleur
            if (i % 2 == 0) {
                b.setForeground(Color.RED);
                b.setBackground(Color.YELLOW);
                b.setMessage("!!! " + message + " !!!");
            } else {
                b.setForeground(Color.YELLOW);
                b.setBackground(Color.RED);
                b.setMessage(message);
            }
            b.sleep(200);
        }
        
        // Restauration de l'état initial
        b.setForeground(foreOrigine);
        b.setBackground(backOrigine);
    }
}