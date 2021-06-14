package Lesson7;

public class SevenLesson {
    public static void main(String[] args) {
        Plate plate = new Plate(10);
        Cat[] cats = new Cat[]{
                new Cat("Barsik",10),
                new Cat("Murzik",12),
                new Cat("Vaska",14),
                new Cat("Tuzik",5),
                new Cat("Sharik",8),
        };

        feedCats(cats, plate);
        plate.refill(10);
        feedCats(cats, plate);
    }
    public static void feedCats(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
        System.out.println();
    }
}
