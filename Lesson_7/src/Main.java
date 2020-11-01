import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        enterRoom();
    }

    public static void enterRoom() {
        Room room;
        System.out.println("Вы хотите войти в пустую комнату или с котами?\n1 - в пустую\n2 - с котами");
        room = chooseRoom();
        System.out.println("Сколько поставить в комнате тарелок для котов?");
        room.addPlates(checkCountPlates());
        letsFeed(room);
    }

    //Метод возвращает объект Room, созданный необходимым конструктором
    public static Room chooseRoom() {
        Room room = null;
        mark: while (true) {
            switch (scanner.next()) {
                case "1":
                    room = new Room();
                    break mark;
                case "2":
                    System.out.println("Сколько котов в комнате?");
                    room = new Room(enterCatsCount());
                    break mark;
                default:
                    break;
            }
        }
        return room;
    }

    //Метод проверяет введённое количество тарелок при создании Room
    private static int checkCountPlates() {
        int countPlates = 0;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Введите корректное число");
                scanner.next();
            }
        } while ((countPlates = scanner.nextInt()) <= 0);
        return countPlates;

    }

    //Метод, отвечающий за процесс кормления, добавления котов или тарелок и вывод информации
    private static void letsFeed(Room room) {
        while (true){
            showActions();
            switch (enterAction()){
                case 1: room.feedAllCats();
                    break;
                case 2:room.feedCat(chooseCat(room.getCountCats()));
                    break;
                case 3: room.addCat();
                    break;
                case 4: room.addPlates(1);
                    break;
                case 5: room.fillAllPlates();
                    break;
                case 6: room.noisilyFillAllPlates();
                    break;
                case 7: room.feedFromTargetPlate(enterPlate(room));
                    break;
                case 8: System.out.println(room);
                    break;
            }
        }
    }

    //Вывод меню в консоль
    private static void showActions() {
        System.out.println("1 - Покормить всех котов\n" +
                "2 - Покормить одного кота на выбор\n" +
                "3 - Добавить одного кота в комнату\n" +
                "4 - Добавить тарелку\n" +
                "5 - Наполнить все тарелки\n" +
                "6 - Шумно наполнить тарелки с едой\n" +
                "7 - Покормить всех котов из одной тарелки (выбрать нужную)\n" +
                "8 - Показать информацию по комнате и котам");
    }

    //Метод запрашивает ввод пункта меню и проверяет его на корректность
    private static int enterAction() {
        int choose = 0;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Введите корректное число");
                scanner.next();
            }
            choose = scanner.nextInt();
        } while (choose < 1 || choose > 8);
        return choose;
    }

    //Метод запрашивает Id кота и проверяет его на корректность (в качестве параметра принимает максимальное
    // количество котов
    private static int chooseCat(int maxCountCats) {
        int catId = 0;
        System.out.println("Выберите кота :");
        do {
            while (!scanner.hasNextInt()){
                System.out.println("Введите число");
            }
            catId = scanner.nextInt();
        }while (catId < 1 || catId > maxCountCats);
        return catId;
    }

    //Метод запрашивает Id тарелки и проверяет его на корректность
    private static int enterPlate(Room room) {
        System.out.println("Введите номер тарелки");
        int temp;
        do {
            while (!scanner.hasNextInt()){
                System.out.println("Введите коректное число");
            }
            temp = scanner.nextInt();
        }while (temp < 1 || temp > room.getCountPlates());
        return temp;
    }


    //Метод запрашивает количество котов и проверяет его на корректность
    public static int enterCatsCount() {
        int countCats;
        do{
            while (!scanner.hasNextInt()){
                System.out.println("Введите корректное число");
                scanner.next();
            }
            countCats = scanner.nextInt();
        } while (countCats < 0);
        return countCats;
    }
}
