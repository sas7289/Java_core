public class Dog extends Animal {
    private double maxRunDistance = 500;
    private double maxSwimDistance = 10;
    private double maxJumpHeight = 0.5;

    public Dog(){
        super(null);
    }
    public Dog(String name) {
        super(name);
    }
    public Dog(double maxRunDistance, double maxSwimDistance, double maxJumpHeight) {
        super(null);
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHeight = maxJumpHeight;
    }
    public Dog(String name, double maxRunDistance, double maxSwimDistance, double maxJumpHeight) {
        super(name);
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public void run (double distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Собакен начинает движение...");
            super.run();
        } else {
            System.out.println("Собакен на такое не подписывался");
        }
    }

    public void swim(double distance) {
        if (distance <= maxSwimDistance){
            System.out.println("Собакен начинает грести...");
            super.swim();
        }
        else {
            System.out.println("Котику такое не под силу");
        }System.out.println("Собакен на такое не подписывался");
    }

    public void jump(double height) {
        if (height <= maxJumpHeight){
            System.out.println("Собакен начинает движение вверх...");
            super.jump();
        }
        else {
            System.out.println("Собакен на такое не подписывался");
        }
    }


}
