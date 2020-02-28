package Exo2;

public class Main {
    public static void main(String[] args) {
        Entite[] tableauEntites = {new Humain(), new Loup(), new ChauveSouris()};
        for (int index = 0; index < tableauEntites.length; ++index)
            {
                System.out.println(tableauEntites[index]);
                tableauEntites[index].mute();
                System.out.println(tableauEntites[index]);
                System.out.println("");
            }
    }
}
