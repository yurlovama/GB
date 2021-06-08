package lesson6;

public class Dog extends Animal {

    public Dog (String name) {
        super(name);

    }
    @Override
    void info() {
        System.out.println("Dog name: " + name );
    }
    @Override
    void voice() {
        System.out.println("run" + "(500)" + "sail" + "(10)");
    }
}
