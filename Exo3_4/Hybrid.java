package Exo3_4;

public abstract class Hybrid implements Entite {
    private Animal mEspece;
    private Animal mEspeceCache;

    protected Hybrid(Animal pEspece, Animal pEspeceMute) {
        mEspece = pEspece;
        mEspeceCache = pEspeceMute;
    }

    @Override
    public String espece() {
        return mEspece.espece();
    }

    @Override
    public boolean aimeLeJour() {
        return mEspece.aimeLeJour();
    }

    @Override
    public void mute() {
        final Animal tmp = mEspece;
        mEspece = mEspeceCache;
        mEspeceCache = tmp;
    }

    @Override
    public String toString() {
        return mEspece.toString();
    }
}
