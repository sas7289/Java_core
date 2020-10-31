import java.util.Random;

public class Plate {
    static int countPlates;
    int id;
    Random random = new Random();
    int maxFood;
    int amountOfFood;
    public  Plate(){
        countPlates++;
        id = countPlates;
        maxFood = random.nextInt(100);
    }



    public int getAmountOfFood() {
        return amountOfFood;
    }

    public int getId() {
        return id;
    }

    public int getMaxFood() {
        return maxFood;
    }

    public void setAmountOfFood(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    @Override
    public String toString() {
        return "id тарелки " + id + "максимальный уровень еды в тарелке " + maxFood + "\n" +
                "еды в тарелке " + amountOfFood;
    }
}
