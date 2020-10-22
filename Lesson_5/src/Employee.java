import java.util.Scanner;

public class Employee {
    static Scanner scanner = new Scanner(System.in);
    private String fullName = "";
    private String position = "";
    private String e_mail = "";
    private String phone = "";
    private int salary = 0;
    private int age = 0;

    public Employee() {
        setInformation();
    }

    public Employee(String fullName, String position, String e_mail, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.e_mail = e_mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    private void setInformation() {
        setFullName();
        setPosition();
        setMail();
        setPhone();
        setAge();
        setSalary();
    }

    private void setFullName() {
        System.out.print("Введите Ваши данные\nФИО: ");
        fullName = scanner.next();
    }

    private void setPosition() {
        System.out.print("Должность: ");
        position = scanner.next();
    }

    private void setMail() {
        while (!checkCommercialAt()) {
            System.out.print(e_mail.equals("") ? "e-mail: " : "Некорректный ввод.\ne-mail: ");
            e_mail = scanner.next();
        }
    }

    private boolean checkCommercialAt() {
        boolean result = false;
        for (int i = 0; i < e_mail.length(); i++) {
            if (e_mail.charAt(i) == '@') {
                result = true;
                break;
            }
        }
        return result;
    }

    private void setPhone() {
        while (!checkPhone()) {
            System.out.print(phone.length() == 0 ? "Номер телефона: " : "Некорректный ввод, попробуйте снова: ");
            phone = scanner.next();
        }
    }

    public boolean checkPhone() {
        boolean result = false;
        for (int i = 0; i < phone.length(); i++) {
            if (!checkOneNum(Character.getNumericValue(phone.charAt(i)))) {
                result = false;
                break;
            }
            result = true;
        }
        return result;
    }

    private boolean checkOneNum(int num) {
        boolean result = true;
        if (num < 0 || num > 9) {
            result = false;
        }
        return result;
    }

    private void setAge() {
        while (!scanner.hasNextInt()) {
            System.out.print(age == 0 ? "Возраст: " : "Введите число. Возраст: ");
            scanner.next();
        }
        age = scanner.nextInt();
    }

    private void setSalary() {
        System.out.print("Зарплата: ");
        while (!scanner.hasNextInt()) {
            System.out.print(salary == 0 ? "Зарплата: " : "Введите число");
            scanner.next();
        }
        salary = scanner.nextInt();
    }


    @Override
    public String toString() {
        return fullName + " (" + position + ", " + e_mail + " ," + phone + ", " + salary + ", " + age + ")";
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getMail() {
        return e_mail;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }


    public int getSalary() {
        return salary;
    }
}
