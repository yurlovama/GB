package Lesson8;

public interface Participant {
 default void overcameObtracle(Obstacle obstacle){
  if (obstacle instanceof Wall) {
   Wall wall = (Wall) obstacle;
   this.jump(wall);
     }
  else if (obstacle instanceof Runing) {
   Runing runing = (Runing) obstacle;
   this.run(runing);
  }
 }
 boolean getStatus();
 void run (Runing runing);
 void jump (Wall wall);
}
