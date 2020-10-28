public abstract class Animal {
    enum currentState {
        running,
        floats,
        jumping,
        rest
    }
    currentState state = currentState.rest;

    String name;
    Animal(String name){
        this.name = name;
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
}
