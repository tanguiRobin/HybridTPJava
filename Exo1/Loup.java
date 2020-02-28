package Exo1;

public class Loup implements Entite {
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

    @Override
    public String toString() {
        return espece();
    }
}
