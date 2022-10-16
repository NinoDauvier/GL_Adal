package Gameplay;

public class Gameplay {

    Personnage[] persos;
    Background background;
    Object pressed; //déplacement etc pour x personnage

    public Gameplay(int nombrePersonnage){
        persos = new Personnage[nombrePersonnage];
        for (int i = 0; i < nombrePersonnage ; i++) {
            persos[i] = new Personnage(i);
            background = new Background();
        }
    }

    public void setHP(int idPersonnage, int hp){
        persos[idPersonnage].hp = hp;
    }

    public void pressed(int idPersonnage, int positionX, int positionY){
        persos[idPersonnage].positionAxeX = positionX;
        persos[idPersonnage].positionAxeY = positionY;
    }

}