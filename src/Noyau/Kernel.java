package Noyau;

public class Kernel {

    private String log="";

    public Object Sprite; // je sais pas trop comment introduire ça

    public

    public Kernel(){
    }

    public Object giveAllSprite(){
        log=log+"Graphic asked for all sprite \n";
        return Sprite;
    }

    public Object giveAllPosition(){
        log=log+"Graphic asked for all positions \n";
        return Sprite;
    }

    public String getLog() {
        return log;
    }
}
