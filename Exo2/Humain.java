package Exo2;

public class Humain extends Animal implements Entite {
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
}
