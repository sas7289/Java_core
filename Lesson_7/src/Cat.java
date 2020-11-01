import java.util.Random;

public class Cat {
    //массив гласных букв для генерации имени
    final static char[] vowel = {'a', 'e', 'i','o','u','y'};

    //массив согласных букв для генерации имени
    final static char[] consonant = {'b','c','d','f','g','h', 'j',
            'k','l','m','n','p','r','q','r','s','t','v','w','x','z'};

    //Общее количество котов
    static int countCats;

    //Id кота (начинаются с единицы)
    int id;
    Random random = new Random();
    String name;

    //Текущий уровень голода
    int currentHungerLevel;

    //Максимальный уровень голода
    int maxHungerLevel;

    public Cat(){
        countCats++;
        id = countCats;
        name = randName();
        maxHungerLevel = random.nextInt(50) + 50;
        currentHungerLevel = random.nextInt(maxHungerLevel);
    }

    public void eat(Plate plate){
        if (plate.getAmountOfFood() == 0){
            System.out.println("Коту " + name + "недостаточно еды в тарелке № " + plate.getId());
        }
        else if (currentHungerLevel == 0) {
            System.out.println("Поиск еды увенчался успехом на тарелке № " + plate.getId());
        }
        else {
            //Сравниваем количество еды в тарелке и аппетит котика
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

    //Генерируем имя котика
    public String randName(){
        StringBuilder stringBuilder = new StringBuilder();

        int lengthName = random.nextInt(4) + 6 ;
        for (int i = random.nextInt(2); i < lengthName; i++) {
            if (i % 2 == 0){
                stringBuilder.append(consonant[random.nextInt(21)]);
            }
            else {
                stringBuilder.append(vowel[random.nextInt(6)]);
            }
        }
        stringBuilder.setCharAt(0,Character.toUpperCase(stringBuilder.charAt(0)));
        return stringBuilder.toString();


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
