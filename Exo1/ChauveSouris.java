package Exo1;

public class ChauveSouris implements Entite {
    @Override
    public String espece() {
        return "Chauve-Souris";
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
