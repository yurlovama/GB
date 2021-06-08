package lesson6;

public abstract class Animal {
    public String name;

    public  Animal(String name) {
        this.name = name;
    }
    abstract void info();

    abstract void voice();

}
