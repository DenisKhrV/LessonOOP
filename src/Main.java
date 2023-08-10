public class Main {

    public static void main(String[] args) {

        Customer[] customers = {
                new Customer("Сара", 30, 112, 111321),
                new Customer("Иван", 25, 114, 111523),
                new Customer("Том", 35, 115, 111223),
                new Customer("Денис", 22, 117, 1112),
        };

        Gamer[] gamers = {
                new Gamer("Джо", 23, 116, "PS"),
                new Gamer("Джон", 12, 113, "PC"),
                new Gamer("Денис", 22, 117, "PC"),
        };

        PrintService printServiceForInvestors = new PrintServiceForInvestors();
        PrintService printServiceForEmployees = new PrintServiceForEmployees();

        Person[] people = new Person[gamers.length + customers.length];
        for (int i = 0; i < customers.length; i++) {
            people[i] = customers[i];
        }
        for (int i = 0; i < gamers.length; i++) {
            people[i + customers.length] = gamers[i];
        }

        printReport(printServiceForInvestors, customers, gamers, people);
        printReport(printServiceForEmployees, customers, gamers, people);
    }

    private static void printReport(PrintService printService, Customer[] customers, Gamer[] gamers, Person[] people) {
        printService.print(customers);
        printService.print(gamers);
        printService.print(people);
    }
}