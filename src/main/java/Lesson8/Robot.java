package Lesson8;

public class Robot implements Participant{
    public boolean lost = false;
    private final int runLimit;
    private final int jumpLimit;

    public Robot(int jumpLimit,int runLimit){
        this.jumpLimit=jumpLimit;
        this.runLimit=runLimit;
    }
    @Override
    public boolean getStatus() {
        return this.lost;
    }

    @Override
    public void run (Runing runing) {
        if (runing.length<= runLimit){
            System.out.printf("Robot overcome an obstacle - %s\n", runing);
        }
        else {
            System.out.printf("Robot can't overcome an obstacle - %s\n", runing);
            lost=true;

        }
    }
    @Override
    public void jump(Wall wall){
        if (wall.height<= jumpLimit){
            System.out.printf("Robot overcome an obstacle - %s\n", wall);
        }
        else {
            System.out.printf("Robot can't overcome an obstacle - %s\n", wall);
            lost = true;
        }

    }
}
