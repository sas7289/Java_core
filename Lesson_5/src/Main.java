public class Main {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Person1", "Profession1", "email_1@pbIsh.ru",
                "11111111", 10000, 30);
        persArray[1] = new Employee("Person2", "Profession2", "email_2@pbIsh.ru",
                "22222222", 20000, 40);
        persArray[2] = new Employee("Person3", "Profession3", "email_3@pbIsh.ru",
                "33333333", 30000, 50);
        persArray[3] = new Employee("Person4", "Profession4", "email_4@pbIsh.ru",
                "44444444", 40000, 60);
        persArray[4] = new Employee("Person5", "Profession5", "email_5@pbIsh.ru",
                "55555555", 50000, 200);
    for (Employee temp : persArray){
        if (temp.getAge() > 40){
            System.out.println(temp);
        }
    }
    }
}
