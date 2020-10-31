import java.util.Random;

public class Cat {
    static int countCats;
    int id;
    Random random = new Random();
    String name;
    int currentHungerLevel;
    int maxHungerLevel;
    public Cat(){
        countCats++;
        id = countCats;
        name = "";
        maxHungerLevel = random.nextInt(50) + 50;
        currentHungerLevel = random.nextInt(maxHungerLevel);
    }

    public void eat(Plate plate){
        if (plate.getAmountOfFood() == 0){
            System.out.println("Коту " + name + "недостаточно еды в тарелке № " + plate.getId());
        }
        else if (currentHungerLevel == 0) {
            System.out.println("Котик сыт");
        }
        else {
            int compare = plate.amountOfFood - currentHungerLevel;
            if (compare >= 0){
                plate.setAmountOfFood(compare);
                currentHungerLevel = 0;
            }
            else {
                plate.setAmountOfFood(0);
                currentHungerLevel = Math.abs(compare);
            }
        }
    }

    public boolean isFull() {
        return currentHungerLevel == 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHungerLevel() {
        return currentHungerLevel;
    }

    @Override
    public String toString() {
        return "id кота " + id + "\nимя кота " + name + "\n" +
                (currentHungerLevel == 0 ? "котик сыт" : "котик голоден") + "\nнеобходимо еды " + currentHungerLevel;
    }
}
