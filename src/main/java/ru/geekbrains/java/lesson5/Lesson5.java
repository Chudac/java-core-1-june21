package ru.geekbrains.java.lesson5;
import java.util.Scanner;

class Employee {
  public static void main(String args[]) {


    String Name;
    String Profession;
    String email;
    long Telephone;
    long Salary;
    int Age;

    void GetData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\tУкажите ФИО сотрудника : ");
        Name = sc.nextLine();

        System.out.print("\n\tУкажите должность сотрудника : ");
        Profession = sc.nextLine();

        System.out.print("\n\tУкажите email сотрудника : ");
        email = sc.nextLine();

        System.out.print("\n\tУкажите телефон сотрудника : ");
        Telephone = Long.parseLong(sc.nextLine());

        System.out.print("\n\tУкажите размер зарплаты сотрудника : ");
        Salary = Long.parseLong(sc.nextLine());

        System.out.print("\n\tУкажите возраст сотрудника : ");
        Age = Integer.parseInt(sc.nextLine());
    }

    void PutData()

    {
        System.out.print("\n\tEmployee Name : " + Name);
        System.out.print("\n\tEmployee Profession : " + Profession);
        System.out.print("\n\tEmployee email : " + email);
        System.out.print("\n\tEmployee Telephone : " + Telephone);
        System.out.print("\n\tEmployee Salary : " + Salary);
        System.out.print("\n\tEmployee Age : " + Age);
    }


    public Employee(String Name, String Profession, String email, String Telephone, long Salary, int Age)
    {}
}


        Employee[] E = new Employee[5];

        E[0] = new Employee("Иван Петров", "Водитель", "petrov@mail.ru", "456231785", 30000, 36);
        E[1] = new Employee("Петр Иванов", "Бухгалтер", "papa@mail.ru", "89613257", 80000, 50);
        E[2] = new Employee("Андрей Васильев", "Директор", "Coriku@mail.ru", "123654789", 200000, 55);
        E[3] = new Employee("Василий Андреев", "Охранник", "Forever@mail.ru", "987456321", 20000, 29);
        E[4] = new Employee("Сидор Сидоров", "Продавец", "mentor@mail.ru", "147852369", 35000, 33);

     Employee A = new Employee();
        A.GetData();
        A.PutData();


    }
}