public class Dog extends Animal {

    public Dog(){
        super(500, 10, 0.5,null);
    }
    public Dog(String name) {
        super(500, 10, 0.5, name);
    }
    public Dog(double maxRunDistance, double maxSwimDistance, double maxJumpHeight) {
        super(500, 10, 0.5,null);
    }

    public Dog(double maxRunDistance, double maxSwimDistance, double maxJumpHeight, String name) {
        super(maxRunDistance, maxSwimDistance, maxJumpHeight, name);
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
