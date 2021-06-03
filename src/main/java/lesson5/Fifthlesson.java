package lesson5;

import com.sun.tools.attach.AgentInitializationException;

public class Fifthlesson {
    public static void main ( String[] args) {
        User user1 = new User(1, "UserName1", "25", "email1", 8111, 1000, 20);
        User user2 = new User(2, "UserName2", "10", "email2", 8222, 2000, 30);
        User user3 = new User(3, "UserName3", "15", "email3", 8333, 3000, 41);
        User user4 = new User(4, "UserName4", "20", "email4", 8444, 4000, 45);
        User user5 = new User(5, "UserName5", "30", "email5", 8555, 5000, 50);

        User[] arrayUser = {user1, user2, user3, user4, user5};

       user1.info();
       user2.info();
       user3.info();
       user4.info();
       user5.info();

       for (int i = 0; i < arrayUser.length; i++) {
           int age = arrayUser[i].getAge();
           if ( age >= 40) {
               System.out.println( arrayUser[i].getName());
           }
       }
    }
}
