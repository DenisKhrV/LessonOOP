public class PrintServiceForEmployees implements PrintService {
    @Override
    public void print(Person[] people) {
        System.out.println("Размер списка учтённых людей для сотрудников " + people.length);
        System.out.print("Имя ");
        printPeople(people);
        System.out.println();
    }

    @Override
    public void print(Customer[] customers) {
        System.out.println("Размер списка покупателей для сотрудников" + customers.length);
        System.out.print("Покупатель ");
        printPeople(customers);
        System.out.println();
    }

    @Override
    public void print(Gamer[] gamers) {
        System.out.println("Размер списка игроков для сотрудников " + gamers.length);
        System.out.print("Игрок ");
        printPeople(gamers);
        System.out.println();
    }

    private void printPeople(Person[] people) {
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            System.out.println(person.getName() + "; Возраст " + person.getAge() + "; Телефон " + person.getPhoneNumber());
        }
        }
    }

