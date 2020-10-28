public class Cat extends Animal {


    public Cat(){
        super(200, 0, 2, null);
    }
    public Cat(String name){
        super(200, 0, 2, name);
    }
    public Cat(String name, double maxRunDistance, double maxJumpHeight) {
        super(maxRunDistance, 0, maxJumpHeight, name);
    }
    public Cat(double maxRunDistance, double maxJumpHeight) {
        super(maxRunDistance, 0, maxJumpHeight, null);
    }


    public void run (double distance){
        if (distance <= maxRunDistance){
            System.out.println("Котик начинает движение...");
            super.run();
        }
        else {
            System.out.println("Котику такое не под силу");
        }
    }

    @Override
    public void swim() {
        System.out.println("Пусть другой мочет лапы...");
    }
    public void swim(double distance) {
        this.swim();
    }

    public void jump(double height) {
        if (height <= maxJumpHeight){
            System.out.println("Котик начинает движение вверх...");
            super.jump();
        }
        else {
            System.out.println("Котику такое не под силу");
        }
    }
}
