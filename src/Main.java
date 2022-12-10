public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
    }


    private static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2012;
        if (clientDeviceYear < 2015) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
            }
        } else {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;

            }
        }
    }

    private static void task3() {
        System.out.println("Задача 3");
        int year = 1600;
        int remainDiv4 = year % 4;
        int remainDiv100 = year % 100;
        int remainDiv400 = year % 400;
        switch (remainDiv400) {
            case 0:
                System.out.println(year + " год является високосным");
                break;
            default:
                switch (remainDiv100) {
                    case 0:
                        System.out.println(year + " год не является високосным");
                        break;
                    default:
                        switch (remainDiv4) {
                            case 0:
                                System.out.println(year + " год является високосным");
                                break;
                            default:
                                System.out.println(year + " год не является високосным");
                        }
                }
        }
    }


    private static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance <60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance <100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }

    }

    private static void task5() {
        System.out.println("Задача 5");
        byte monthNumber = 7;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Время года зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Время года весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Время года лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Время года осень");
                break;
            default:
                System.out.println("Нет такого месяца");

        }
    }
}
