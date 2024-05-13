package school.lesson3;

import java.util.Arrays;
/*1.Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

2.Создать массив из 5 сотрудников.
Пример:
вначале объявляем массив объектов
Person[] persArray = new Person[5];
потом для каждой ячейки массива задаем объект
persArray[0] = new Person("Ivanov Ivan", "Engineer",
               "ivivan@mailbox.com", "892312312", 30000, 30);
persArray[1] = new Person(...);
persArray[4] = new Person(...);
 */
public class Employee {
    public String nameSurname;
    public String jobTitle;
    public String email;
    public long phoneNumber;
    public int salary;
    public int age;
    public Employee(String nameSurname, String jobTitle, String email, long phoneNumber, int salary, int age) {
        this.nameSurname = nameSurname;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public void printInfo() {
        System.out.println(nameSurname + ", " + jobTitle + ", " + email + ", " + phoneNumber + ", " + salary + ", " + age);
    } //Метод, выводящий информацию об объекте в консоль
    public static void main(String[] args) {
        //Employee employee1 = new Employee("John Doe", "CEO", "john.doe@blabla.com", 35678989888L, 100500, 56);
        //employee1.printInfo();
        // добавление отдельного объекта
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("John Doe", "CEO", "john.doe@blabla.com", 35678989888L, 100500, 56);
        emplArray[1] = new Employee("Viktor Ivanov", "Developer", "viktor.ivanov@blabla.com", 11134567888L, 74000, 34);
        emplArray[2] = new Employee("Jane Foster", "Accountant", "jane.foster@blabla.com", 4567890088L, 75000, 43);
        emplArray[3] = new Employee("Yuriy Smith", "Devops", "yuriy.smith@blabla.com", 709988767888L, 80600, 24);
        emplArray[4] = new Employee("Megan Fox", "QA", "megan.fox@blabla.com", 98866544455L, 67000, 27);
        emplArray[0].printInfo();
        emplArray[1].printInfo();
        emplArray[2].printInfo();
        emplArray[3].printInfo();
        emplArray[4].printInfo();
    }
}