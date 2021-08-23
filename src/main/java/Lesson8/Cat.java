package Lesson8;

public class Cat implements Participant{
    public boolean lost = false;
    private final int runLimit;
    private final int jumpLimit;

    public Cat(int jumpLimit,int runLimit){
        this.jumpLimit=jumpLimit;
        this.runLimit=runLimit;
    }
    @Override
    public boolean getStatus() {return this.lost; }

    @Override
    public void run (Runing runing) {
        if (runing.length<= runLimit){
            System.out.printf("Cat overcome an obstacle - %s\n", runing);
        }
        else {
            System.out.printf("Cat can't overcome an obstacle - %s\n", runing);
            lost = true;

        }
    }
    @Override
    public void jump (Wall wall){
        if (wall.height<= jumpLimit){
            System.out.printf("Cat overcome an obstacle - %s\n", wall);
        }
        else {
            System.out.printf("Cat can't overcome an obstacle - %s\n", wall);
            lost = true;
        }

    }
}
