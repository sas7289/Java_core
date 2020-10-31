import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        enterRoom();
        Room room = new Room(10);
        room.addPlates(5);
        System.out.println(room);
        room.noisilyFillAllPlates();
//        System.out.println(room);
    }

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
                case 7: System.out.println(room);
                break;
            }
        }
    }


    private static int chooseCat(int maxCountCats) {
        int catId = 0;
        System.out.println("Выберите кота :");
        do {
            while (!scanner.hasNextInt()){
                System.out.println("Введите число");
            }
            catId = scanner.nextInt() - 1;
        }while (catId < 0 || catId > maxCountCats);
        return catId;
    }

    private static int enterAction() {
        int choose = 0;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Введите корректное число");
                scanner.next();
            }
            choose = scanner.nextInt();
        } while (choose < 1 || choose > 7);
        return choose;
    }

    private static void showActions() {
        System.out.println("1 - Покормить всех котов\n" +
                "2 - Покормить одного кота на выбор\n" +
                "3 - Добавить одного кота в комнату\n" +
                "4 - Добавить тарелку\n" +
                "5 - Наполнить все тарелки\n" +
                "6 - Шумно наполнить тарелки с едой\n" +
                "7 - Показать информацию по комнате и котам");
    }

    public static void enterRoom() {
        Room room;
        System.out.println("Вы хотите войти в пустую комнату или с котами?\n1 - в пустую\n2 - с котами");
        room = chooseRoom();
        System.out.println("Сколько поставить в комнате тарелок для котов?");
        room.addPlates(checkCountPlates());
        letsFeed(room);
    }

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

    public static Room chooseRoom() {
        Room room = null;
        int choose = 0;
        int countCats = 0;
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


    public static int enterChoose() {
        int choose;
        while (true) {
            if (!scanner.hasNext()) {
                continue;
            }
            choose = scanner.nextInt();
            if (choose != 1 && choose != 2) {
                continue;
            } else {
                break;
            }
        }
        return choose;
    }
}
