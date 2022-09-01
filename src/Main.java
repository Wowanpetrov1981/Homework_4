public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();

        task1_1();
        task1_2();
        task1_3();
        task2_1();
        task2_2();
        task2_3();
        task3_1();
        task3_2();
        task3_3();
    }

    public static void task1_1() {
        int age = 25;
        if (age >= 18) {
            System.out.println("Поздравляем Вас с совершенолетием!");
            System.out.println();
        }
        if (age < 18) {
            System.out.println("Вам еще нет 18 лет, нужно немного подождать");
            System.out.println();
        }
    }

    public static void task1_2() {
        int age1 = 7;
        if (age1 >= 7) {
            System.out.println("Ребёнок ходит в школу");
            System.out.println();
        }
        if (age1 < 7) {
            System.out.println("Ребенок не ходит в школу");
            System.out.println();
        }
        int age2 = 19;
        if (age2 >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
            System.out.println();
        }
        if (age2 < 18) {
            System.out.println("Человек ещё не закончил школу и не может отправляться в университет");
            System.out.println();
        }
        int age3 = 25;
        if (age3 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
            System.out.println();
        }
        if (age3 < 24) {
            System.out.println("Человек еще не окончил университет и ему пока рано искать первую работу");
            System.out.println();
        }
    }

    public static void task1_3() {
        int totalNumberOfPassengers = 100;
        int sittinPassengers = 60;
        int standingPassengers = 40;

        if (totalNumberOfPassengers == 102) {
            System.out.println("Вагон уже полностью забит");
        }
        if (totalNumberOfPassengers < 102) {
            System.out.println("Места в вагоне еще есть");

        }
        if (sittinPassengers < 60) {
            System.out.println("Сидячие места в вагоне еще есть");
        }
        if (sittinPassengers == 60) {
            System.out.println("Сидячих мест в вагоне нет");
        }
        if (standingPassengers < 42) {
            System.out.println("Стоячие места в вагоне есть");
            System.out.println();
        }
        if (standingPassengers == 42) {
            System.out.println("Стоячих мест в вагоне нет");
            System.out.println();
        }
    }

    public static void task2_1() {
        int age = 12;
        if (age >= 18) {
            System.out.println("Поздравляем Вас с совершенолетием!");
            System.out.println();
        } else {
            System.out.println("Вам еще нет 18 лет, нужно немного подождать");
            System.out.println();
        }
    }

    public static void task2_2() {
        int age1 = 5;
        if (age1 >= 7) {
            System.out.println("Ребёнок ходит в школу");
            System.out.println();
        } else {
            System.out.println("Ребенок не ходит в школу");
            System.out.println();
        }

        int age2 = 17;
        if (age2 >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
            System.out.println();
        } else {
            System.out.println("Человек ещё не закончил школу и не может отправляться в университет");
            System.out.println();
        }
        int age3 = 23;
        if (age3 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
            System.out.println();
        } else {
            System.out.println("Человек еще не окончил университет и ему пока рано искать первую работу");
            System.out.println();
        }
    }

    public static void task2_3() {
        int totalNumberOfPassengers = 60;
        int sittinPassengers = 60;
        int standingPassengers = 0;

        if (totalNumberOfPassengers == 102) {
            System.out.println("Вагон уже полностью забит");
        } else {
            System.out.println("Места в вагоне еще есть");
            if (sittinPassengers < 60) {
                System.out.println("Сидячие места в вагоне еще есть");
            } else {
                System.out.println("Сидячих мест в вагоне нет");
            }
        }
        if (standingPassengers < 42) {
            System.out.println("Стоячие места в вагоне есть");
            System.out.println();
        } else {
            System.out.println("Стоячих мест в вагоне нет");
            System.out.println();
        }
    }

    public static void task3_1() {
        int age = 15;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
        System.out.println();
    }

    public static void task3_2() {
        int age = 10;
        boolean accompanyingAnAdult = age >= 5 && age < 14;
        if (age < 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        } else {
            if (accompanyingAnAdult) {
                System.out.println("Ребенок может кататься на аттракционе в сопровождении взрослого");
            } else{
                System.out.println("Ребенок может кататься на аттракционе без сопровождения взрослого");
            }
        }
        System.out.println();
    }

    public static void task3_3() {
        int one = 8;
        int two = 8;
        int three = 8;
        if (one >= two && one > three) {
            System.out.println("Большее число " + one);
        } else
            if (two >= one && two > three) {
                System.out.println("Большее число " + two);
            } else
                if (three >= one && three > two) {
                    System.out.println("Большее число " + three);
                } else
                    if (two == three && two > one) {
                        System.out.println("Большее число " + two);
                    } else
                    if (one == two && one == three) {
                        System.out.println("Все числа равны");
        }






    }

}