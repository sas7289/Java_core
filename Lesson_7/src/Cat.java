import java.util.Random;

public class Cat {
    static int countCats;
    int id;
    Random random = new Random();
    String name;
    boolean full;
    int hungerLevel;
    public Cat(){
        countCats++;
        id = countCats;
        name = "";
        full = random.nextInt(2) == 1;
        hungerLevel = random.nextInt(100);
    }

    public void eat(Plate plate){
        if (plate.getAmountOfFood() < hungerLevel){
            System.out.println("Коту " + name + "недостаточно еды в тарелке № " + plate.getId());
        }
        else if (full) {
            System.out.println("Котик сыт");
        }
        else {
            plate.setAmountOfFood(plate.amountOfFood - hungerLevel);
            full = true;
        }
    }

    public boolean isFull() {
        return full;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    @Override
    public String toString() {
        return "id кота " + id + "\nимя кота " + name + "\n" +
                (full ? "котик сыт" : "котик голоден") + "\nнеобходимо еды " + hungerLevel;
    }
}
