package Exo2;

public class ChauveSouris extends Animal implements Entite {
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
}
