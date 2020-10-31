import java.util.ArrayList;

public class Room {
    ArrayList<Cat> cats = new ArrayList<Cat>();
    ArrayList<Plate> plates = new ArrayList<Plate>();

    public Room (){
        System.out.println("Вы зашли в пустую комнату");
    }

    public Room (int countCats){
        for (int i = 0; i < countCats; i++) {
            cats.add(new Cat());
        }
        System.out.println("Вы зашли в комнату, в которой " + this.cats.size() + " котов");
    }

    public void addPlates(int countPlate){
        for (int i = 0; i < countPlate; i++) {
            plates.add(new Plate());
        }
        System.out.println("Вы поставили в комнате " + plates.size() + " тарелок");
    }

    public void fillAllPlates(){
        for (Plate plate : plates) {
            plate.setAmountOfFood(plate.getMaxFood());
        }
    }

    public int getCountPlates(){
        return plates.size();
    }
    public void feedCat (int catId){
        Cat tempCat = cats.get(catId - 1);
        int tempPlateId = 0;
        while (!tempCat.isFull() && tempPlateId != (plates.size() - 1)){
            tempCat.eat(plates.get(tempPlateId));
            tempPlateId++;
        }
        if (tempCat.isFull()){
            System.out.println("Котик под номером " + tempCat.getId() + " сыт и доволен");
        }
    }
    public void feedCat (Cat cat){
        int tempPlateId = 0;
        while (!cat.isFull() && tempPlateId != (plates.size() - 1)){
//            System.out.println(plates.get(tempPlateId));
            cat.eat(plates.get(tempPlateId));
//            System.out.println(plates.get(tempPlateId));
//            System.out.println(cat);
            tempPlateId++;
        }
        if (cat.isFull()){
            System.out.println("Котик под номером " + cat.getId() + " сыт и доволен");
        }
    }

    public void noisilyFillAllPlates(){
        for (Plate plate : plates) {
            plate.setAmountOfFood(plate.getMaxFood());
        }
        for (Cat cat : cats) {
//            System.out.println(cat);
            feedCat(cat);
        }
    }
    public void addCat(){
        cats.add(new Cat());
    }
    public int getCountCats(){
        return cats.size();
    }

    public void feedAllCats(){
        for (Cat cat : cats) {
//            System.out.println(cat);
            feedCat(cat);
        }
    }

    public int getCountHungryCats (){
        int count = 0;
        for (int i = 0; i < cats.size(); i++) {
            if (!cats.get(i).isFull()){
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        String result = "В комнате:\n " + getCountCats() + " котов, " + getCountHungryCats() + " " +
                "из которых голодные\n" +
                + getCountPlates() + " тарелок" +
                "\nИнформация по тарелкам: \n";
        for (Plate plate : plates) {
            result += "Тарелка " + plate.getId() + " " + plate.getAmountOfFood() + "/" + plate.getMaxFood() + "\n";
        }
        result += "Информация по котам:\n";
        for (Cat cat : cats) {
            result += "Кот " + cat.getId() + (cat.isFull() ? " сыт " : " голоден ") + " необходимое количество еды " +
                    cat.getHungerLevel() + "\n";
        }
        return result;
    }
}
