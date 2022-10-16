public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("_");
        System.out.println("Задание 1");
        int yearsOld = 20;
        if (yearsOld >= 18) {
            System.out.println("Поздравляем Вас с совершенолетием!");
        }
        if (yearsOld <= 18) {
            System.out.println("Возраст совершенолетия еще не наступил, нужно немного подождать!");
        }

        // Задание 2
        System.out.println("_");
        System.out.println("Задание 2");
        if (yearsOld >= 7 && yearsOld < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (yearsOld >= 18 && yearsOld < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (yearsOld > 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        // Задание 3
        System.out.println("_");
        System.out.println("Задание 3");
        int capacity = 102;                            // Вместимость вагона: 102
        int sittingPlaces = 60;                        // Всего сидячих мест: 60
        int standingPlaces = capacity - sittingPlaces; // Всего стоячих мест: 42
        int sittingPassengers = 50;
        int standingPassengers = 32;
        if (sittingPassengers < sittingPlaces) {
            System.out.println("Есть еще " + (sittingPlaces - sittingPassengers) + " сидячих мест");
        }
        if (sittingPassengers == sittingPlaces) {
            System.out.println("Сидячих мест нет");
        }
        if (standingPassengers < standingPlaces) {
            System.out.println("Есть еще " + (standingPlaces - standingPassengers) + " стоящих мест");
        }
        if (standingPassengers == standingPlaces) {
            System.out.println("Стоячих мест нет");
        }


        // Задание 4
        System.out.println("_");
        System.out.println("Задание 4");
        if (yearsOld >= 18) {
            System.out.println("Поздравляем Вас с совершенолетием!");
        } else {
            System.out.println("Возраст совершенолетия еще не наступил, нужно немного подождать!");
        }

        // Задание 5
        System.out.println("_");
        System.out.println("Задание 5");
        if (yearsOld >= 7 && yearsOld < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (yearsOld >= 18 && yearsOld < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else if (yearsOld > 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        // Задание 6
        System.out.println("_");
        System.out.println("Задание 6");
        if (sittingPassengers < sittingPlaces) {
            System.out.println("Есть еще " + (sittingPlaces - sittingPassengers) + " сидячих мест");
        } else {
            System.out.println("Сидячих мест нет");
        }
        if (standingPassengers < standingPlaces) {
            System.out.println("Есть еще " + (standingPlaces - standingPassengers) + " стоящих мест");
        } else {
            System.out.println("Стоячих мест нет");
        }

        // Задание 7
        System.out.println("_");
        System.out.println("Задание 7");
        if (yearsOld >= 2 && yearsOld <= 6) {
            System.out.println("Если человеку " + yearsOld + " лет, то ему нужно ходить в детский сад");
        } else if (yearsOld > 6 && yearsOld <= 18) {
            System.out.println("Если человеку " + yearsOld + " лет, то ему нужно ходить в школу");
        } else if (yearsOld > 18 && yearsOld <= 24) {
            System.out.println("Если человеку " + yearsOld + " лет ,то ему нужно ходить в университет");
        } else if (yearsOld > 24) {
            System.out.println("Если человеку " + yearsOld + " лет ,то ему нужно ходить на работу");
        }

        // Задание 8
        System.out.println("_");
        System.out.println("Задание 8");
        if (yearsOld < 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        } else if (yearsOld < 14) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого");
        } else {
            System.out.println("Ребенок может кататься без сопровождения взрослого");
        }

        // Задание 9
        System.out.println("_");
        System.out.println("Задание 9");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two) {
            if (one > three) {
                System.out.println("Максимальное число - " + one);
            } else {
                System.out.println("Максимальное число - " + three);
            }
        } else if (two > one) {
            if (two > three) {
                System.out.println("Максимальное число - " + two);
            } else {
                System.out.println("Максимальное число - " + three);
            }
        } else {
            if (one > three) {
                System.out.println("Максимальное число - " + one);
            } else if (three > one) {
                System.out.println("Максимальное число - " + three);
            } else {
                System.out.println("Все 3 числа равны");
            }

        }
    }
}

