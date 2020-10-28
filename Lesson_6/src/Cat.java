public class Cat extends Animal {
    private double maxRunDistance = 200;
    private double maxJumpHeight = 2;
    public Cat(){
        super(null);
    }
    public Cat(String name){
        super(name);
    }

    public Cat(String name, double maxRunDistance, double maxJumpHeight) {
        super(name);
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }
    public Cat(double maxRunDistance, double maxJumpHeight) {
        super(null);
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
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

    public void swim(double distance) {
        System.out.println("Пусть другой мочет лапы...");
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
