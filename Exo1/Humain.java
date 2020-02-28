package Exo1;

public class Humain implements Entite {
    @Override
    public String espece() {
        return "Humain";
    }

    @Override
    public boolean aimeLeJour() {
        return true;
    }

    @Override
    public void mute() {

    }

    @Override
    public String toString() {
        return espece();
    }
}
