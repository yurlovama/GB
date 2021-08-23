package Lesson8;

public class Runing implements Obstacle {
    public final int length;
    public Runing(int length) {this.length=length;}
    @Override
    public String toString(){
        return String.format("Running track with length: %d", length);
    }
}
