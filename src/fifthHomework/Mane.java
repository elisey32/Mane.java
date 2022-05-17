package fifthHomework;

public class Mane {
    public static void main(String[] args) {

        Employee employee = new Employee(
                "Иванов",
                "Иван",
                "Иванович",
                "Менеджер",
                "ivivan@mailbox.com",
                892312312,
                30000,
                30);

        employee.empInfo();

        Employee[] employees = {
                new Employee("Петров",
                             "Петр",
                             "Петрович",
                             "Начальник",
                             "ppp@mail.ru",
                             364578,
                             50000,
                             45),
                new Employee("Соловьев",
                             "Андрей",
                             "Олегович",
                             "Старший менеджер",
                             "sao@mail.ru",
                             364578,
                             35000,
                             32),
                new Employee("Мизин",
                             "Петр",
                             "ПАвлович",
                             "Зам.начальника",
                             "mpp@mail.ru",
                             364578,
                             40000,
                             37),
                new Employee("Власов",
                             "Денис",
                             "Александрович",
                             "Курьер",
                             "vda@mail.ru",
                             3675878,
                             30000,
                             20),
                new Employee("Пехтерев",
                             "Алексей",
                             "Владимирович",
                             "Курьер 2",
                             "pav@mail.ru",
                             874578,
                             30000,
                             26),



        };
        int minAge = 40;

        for (Employee employee1 : employees) {
            if (employee.age > minAge) {
                System.out.println(employee1);
            }
            

        }
    }
}
