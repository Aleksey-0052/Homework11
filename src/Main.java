import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        task1();
        determineYear(2020);
        determineYear(2012);
        determineYear(2019);
        task2();
        defineVersionApp(0,2022);
        defineVersionApp(1, 2018);
        defineVersionApp(0, 2023);
        task3();
        printNumberDaysDelivery(95);
        printNumberDaysDelivery(120);
        printNumberDaysDelivery(8);
    }

    public static void task1() {
        System.out.println("Задача 1");
    }
    public static void determineYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
    }
    public static void defineVersionApp(int mobileOs, int mobileYear) {
        int currentYear = LocalDate.now().getYear();
        String mobileOsName = defineOsName(mobileOs);

        if (mobileYear < currentYear) {
            System.out.println("Для ОС " + mobileOsName + " необходимо установить lite-версию приложения");
        } else {
            System.out.println("Для ОС " + mobileOsName + " необходимо установить обычную версию приложения");
        }
    }
    public static String defineOsName(int mobileOs) {
        String mobileOsName;

        switch (mobileOs) {
            case 0:
                mobileOsName = "IOS";
                break;
            case 1:
                mobileOsName = "Android";
                break;
            default:
                mobileOsName = "Неизвестная ОС";
        }
        return mobileOsName;
    }

    public static void task3() {
        System.out.println("Задача 3");
    }

    public static int calcNumberDaysDelivery(int distance) {

        if (distance <= 20) {
            return 1;
        } else if (distance > 20 && distance <= 60) {
            return 2;
        } else if (distance > 60 && distance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
    public static void printNumberDaysDelivery(int distance) {
        int days = calcNumberDaysDelivery (distance);

        if (days > 0) {
            System.out.println("Потребуется дней " + days);
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
}