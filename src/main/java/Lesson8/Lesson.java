package Lesson8;


public class Lesson {
    public static void main(String[] args) {

        Obstacle[] obstacles ={
                new Runing(300),
                new Wall(3),
                new Runing(400),
                new Wall(5),
                new Runing(500),
                new Wall(7),

        };
        Participant[] participants = {
                new Human(2, 100),
                new Human(3,200),
                new Cat(6,300),
                new Cat(7,400),
                new Robot(8,800),
                new Robot(9,1000),
        };
        for (Participant participant: participants){
            for (Obstacle obstacle: obstacles){
                if (!participant.getStatus()){
                    participant.overcameObtracle(obstacle);
                }
            }
            System.out.print("\n");
        }
    }
}

