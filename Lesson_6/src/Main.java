public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat2 = new Cat(17, 30);
        cat.swim(500);
        cat2.swim(0.7);
        cat2.jump(29);
        cat2.jump(31);
        cat2.run();
    }
}
