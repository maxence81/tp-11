package exemple;

import java.awt.Font;

import bandeau.Bandeau;

public class Zoom extends Effet {

    public Zoom() {
        super("Zoom");
    }

    @Override
    public void jouerSur(Bandeau b) {
        String messageInitial = "Zoom..."; 
        b.setMessage(messageInitial);
        
        Font fontInitiale = b.getFont();
        
        for (int i = 10; i < 60; i += 5) {
            b.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            b.sleep(50);
        }
        
        b.sleep(500);
        b.setFont(fontInitiale); 
    }
}