public interface PrintService {
    default void print(Person[] people) {
        System.out.println("Не положено смотреть такие отчёты");
    }

    void print(Customer[] customers);

    void print(Gamer[] gamers);
}
