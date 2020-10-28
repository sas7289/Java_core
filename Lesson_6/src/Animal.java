public abstract class Animal {
    //Текущее состояние животного
    currentState state = currentState.rest;

    protected double maxRunDistance = 0;
    protected double maxSwimDistance = 0;
    protected double maxJumpHeight = 0;


    String name;

    public Animal(double maxRunDistance, double maxSwimDistance, double maxJumpHeight, String name) {
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.name = name;
    }

    protected void setMaxRunDistance(double maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
    }
    protected void setMaxSwimDistance(double maxSwimDistance) {
        this.maxSwimDistance = maxSwimDistance;
    }
    protected void setMaxJumpHeight(double maxJumpHeight) {
        this.maxJumpHeight = maxJumpHeight;
    }

    public void run(){
        state = currentState.running;
    }
    public void jump(){
        state = currentState.jumping;
    }
    public void swim(){
        state = currentState.floats;
    }



    enum currentState {
        running,
        floats,
        jumping,
        rest
    }
}
