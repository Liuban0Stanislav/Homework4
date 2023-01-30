public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    private static void task1() {
        System.out.println("Задача 1");

        int age = 35;
        System.out.println("Если возраст человека равен " + age + " лет, то ");
        if (age >= 18) {
            System.out.println("он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();
    }

    private static void task2() {
        System.out.println("Задача 2");

        int tempOutside = 5;
        System.out.println("На улице " + tempOutside + " градусов, ");
        if (tempOutside < 5) {
            System.out.println("нужно надеть шапку");
        } else {
            System.out.println("можно идти без шапки");
        }
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задача 3");

        int carSpeed = 61;
        System.out.println("Если скорость " + carSpeed + " км/ч, ");
        if (carSpeed > 60) {
            System.out.println("придется заплатить штраф");
        } else {
            System.out.println("можно ездить спокойно");
        }
        System.out.println();
    }

    private static void task4() {
        System.out.println("Задача 4");

        int age = 25;
        System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить ");
        if (age >= 2 && age <= 6) {
            System.out.println("в детский сад");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("в школу");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("в университет");
        }
        if (age > 24) {
            System.out.println("на работу");
        }
        System.out.println();
    }

    private static void task5() {
        System.out.println("Задача 5");

        int age = 10;
        boolean isAdultHere = true;
        System.out.println("Если возраст ребенка равен " + age + " лет, то ему ");
        if (age > 0 && age <= 5) {
            System.out.println("нельзя кататься на аттракционе");
        } else if (age > 5 && age <= 14 && isAdultHere) { // здесь isAdultHere, то же что и isAdultHere == true
            System.out.println("можно кататься в сопровождении");
        }
        if (age > 5 && age <= 14 && !isAdultHere) { //здесь !isAdultHere, то же что и isAdultHere != true
            System.out.println("кататься без сопровождения нельзя");
        }
        if (age > 14) {
            System.out.println("можно кататься без сопровождения");
        }
        System.out.println();
    }

    private static void task6() {
        System.out.println("Задача 6");

        int passengers = 1;
        int sittingPlaces = 60;
        int totalPlaces = 102;

        if (passengers > 0 && passengers < sittingPlaces) {
            System.out.println("В вагоне есть " + (sittingPlaces - passengers) + " сидячих мест");
        } else if (passengers >= sittingPlaces && passengers < totalPlaces) {
            System.out.println("В вагоне есть " + (totalPlaces - passengers) + " стоячих мест");
        } else {
            System.out.println("В вагоне больше нет свободных мест");
        }
        System.out.println();
    }

    private static void task7() {
        System.out.println("Задача 7");

        int one = 245;
        int two = -650;
        int three = 116;
        int rez;

        if (one > two) {
            rez = one;
        } else {
            rez = two;
        }
        if (rez < three) {
            rez = three;
        }
        System.out.println("Большее из трех чисел - " + rez);
        System.out.println();
    }
}
