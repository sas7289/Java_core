import java.util.Random;
import java.util.Scanner;

public class Lesson_3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        game();
    }

    public static void game(){
        while (true) {
            printMenu();
            switch (scanner.next()) {
                case "1":
                    triplePlay();
                    break;
                case "2":
                    System.out.println("Пока!");
                    System.exit(0);
                default:
                    System.out.println("Чавой?");
            }
        }
    }

    public static void printMenu (){
        System.out.println("Добро пожаловать в игру \"Отгадай число\"" +
                "\nВыберите нужный пункт:" +
                "\n1. Новая игра" +
                "\n2. Выход");
    }

    public static void triplePlay(){
        Random random = new Random();
        int randNum = random.nextInt(10);
        for (int i = 0; i < 3; i++) {
            if (guessNumber(randNum)){
                System.out.println("Верно!");
                break;
            }
            else {
                System.out.printf("Неверно! Осталось %d попыток\n", 2-i);
            }
        }
    }

    public static boolean guessNumber(int compNum){
        System.out.println("Я загадал чилсо от 0 до 10, попробуйте отгадать");
        return compNum == scanner.nextInt();
    }
}
