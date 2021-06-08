package lesson6;

public class Cat extends Animal {

    public Cat (String name) {
        super(name);
    }
    @Override
    public void info (){
        System.out.println("Cat name:" + name);
    }
    @Override
    public void voice() {
        System.out.println("run" + "(200)" + "can't swim");

    }
}
