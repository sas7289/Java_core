import java.util.Random;
import java.util.Scanner;

public class guessWord {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
            "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
            "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
            "pepper", "pineapple", "pumpkin", "potato"};
    public guessWord(){
        game();
    }


    //Метод генерирует псевдослучсайное число, используемое в качестве индекса массива words и принимающий выбор пользователя
    public void game (){
        int posWord = random.nextInt(25);
        while (true){
            printMenu();//Метод печатает меню
            switch (scanner.next()){
                case "1":
                    guessWord(words[posWord]);//Метод предоставляет пользователю ввод слова и сравнивает его с переданным в параметре
                    break;
                case "2":
                    System.out.println("Пока!");
                    System.exit(0);
            }
        }
    }


    public void guessWord (String compWord){
        System.out.print("Я задумал слово, отгадайте его =)\nВаш вариант: ");
        String userWord = scanner.next();
        while (!compWord.equals(userWord)){
            System.out.println("Слово Вы не отгадали, но возможно некоторые буквы - да: " +  wordMask(userWord, compWord) +
                    " попробуйте ещё раз");
            userWord = scanner.next();
        }

    }

    //Метод накладывает маску на введённое пользователем слово в соотвествии с отгаданными буквами
    public String wordMask (String user, String comp){
        String result = "";
        String userWord = user.toLowerCase();
        for (int i = 0; i < 15; i++){
            if (i < user.length() && i < comp.length()){
                if (user.charAt(i) == comp.charAt(i)){
                    result += user.charAt(i);
                    continue;
                }
                else {
                    result += '#';
                    continue;
                }
            }
            result += '#';
        }
        return  result;
    }


    public void printMenu(){
        System.out.println("Добро пожаловать в игру \"Отгадай слово\"" +
                "\nВыберите необходимый пункт" +
                "\n1. Новая игра" +
                "\n2. Выход");
    }
}
