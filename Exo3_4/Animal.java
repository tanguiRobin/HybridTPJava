package Exo3_4;

public abstract class Animal implements Entite {
    private String mEspece;
    private boolean mAimeLeJour;

    public Animal(String pEspece, boolean pAimeLeJour) {
        mEspece = pEspece;
        mAimeLeJour = pAimeLeJour;
    }

    @Override
    public String espece() {
        return mEspece;
    }

    @Override
    public boolean aimeLeJour() {
        return mAimeLeJour;
    }

    @Override
    public String toString() {
        return "Je suis un(e) " + espece() + " et " + (this.aimeLeJour() ? "j'aime" : "je n'aime pas") + " le jour";
    }
}
