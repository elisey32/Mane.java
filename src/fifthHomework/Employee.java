package fifthHomework;

public class Employee {
    String lastname;
    String name;
    String patronymic;
    String position;
    String email;
    int phone;
    int salary;
    int age;

    Employee(String lastname,
             String name,
             String patronymic,
             String position,
             String email,
             int phone,
             int salary,
             int age) {
        this.lastname = lastname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        System.out.println("Новый сотрудник фирмы ->  ");

        }

    void empInfo() {
        System.out.println("ФИО: " + lastname + " " + name + " " + patronymic );
        System.out.println("Должность: " + position);
        System.out.println("Электронная почта: " +  email);
        System.out.println("Номер телефона: " + phone);
        System.out.println("Заработная плата: " +  salary);
        System.out.println("Возраст: " + age);
    }

}

