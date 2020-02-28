package Exo2;

public class Loup extends Animal implements Entite {
    @Override
    public String espece() {
        return "Loup";
    }

    @Override
    public boolean aimeLeJour() {
        return false;
    }

    @Override
    public void mute() {

    }
}
