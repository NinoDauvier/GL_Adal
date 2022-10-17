package Physics;

public class Physics implements IPhysics{

    KeyHandler KeyH = new KeyHandler();

    String direction;
    CollisionChecker CCheck = new CollisionChecker();

    boolean ColisionOn;

    int ObjectY;
    int ObjectX;
    int Speed;

    @Override
    public void update() {

        //EXEMPLE


        if (KeyH.RightPressed) {
            direction ="RIGHT";
        }

        ColisionOn=false;
        CCheck.CheckCollision(this);

        if(!ColisionOn){
            switch (direction) {
                case "RIGHT" -> ObjectX = ObjectX + Speed;
                case "LEFT" -> ObjectX = ObjectX - Speed;
            }
        }



    }

}
