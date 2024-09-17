//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя пользователя:");
            String name = scanner.nextLine();
            PersonAccount user = new PersonAccount(name);

            System.out.println("Хотите открыть счёт в RUB?");
            System.out.println("1 - Да");
            System.out.println("2 - Нет");
            int command = scanner.nextInt();
            if (command == 1) {
                user.moneyRUB = 0.0;
            }
            else {
                user.moneyRUB = -1;
            }

            System.out.println("Хотите открыть счёт в USD?");
            System.out.println("1 - Да");
            System.out.println("2 - Нет");
            command = scanner.nextInt();
            if (command == 1) {
                user.moneyUSD = 0.0;
            }
            else {
                user.moneyUSD = -1;
            }

            System.out.println("Хотите открыть счёт в EUR?");
            System.out.println("1 - Да");
            System.out.println("2 - Нет");
            command = scanner.nextInt();
            if (command == 1) {
                user.moneyEUR = 0.0;
            }
            else {
                user.moneyEUR = -1;
            }

            System.out.println("Поздравляем, аккаунт для пользователя " + user.name + " создан.");
            System.out.println("Открытые счета:");
            if (user.moneyRUB == 0.0) {
                System.out.println("- RUB");
            }
            else
            {
                  System.out.println("");
            }
            if (user.moneyUSD == 0.0) {
                System.out.println("- USD");
            }
            else
            {
                System.out.println("");
            }
            if (user.moneyEUR == 0.0) {
                System.out.println("- EUR");
            }
            else
            {
                System.out.println("");
            }

        }
    }

    class PersonAccount {
        String name;      // имя и фамилия
        double moneyRUB;  // счёт в рублях
        double moneyUSD;  // счёт в долларах
        double moneyEUR;  // счёт в евро


        PersonAccount(String userName) {
            name = userName;
        }
    }
