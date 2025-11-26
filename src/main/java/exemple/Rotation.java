package exemple;

import bandeau.Bandeau;

public class Rotation extends Effet {

    public Rotation() {
        super("Rotation");
    }

    @Override
    public void jouerSur(Bandeau b) {
        b.setMessage("Je tourne !");
        for (int i = 0; i <= 100; i++) {
            b.setRotation(2 * Math.PI * i / 100);
            b.sleep(20);
        }
        b.setRotation(0.0f);
    }
}