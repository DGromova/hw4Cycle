public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        //Задание 1
        int y = 0;
        while (y < 10) {
            y++;
            System.out.print(y + " ");
        }
        System.out.println();
        for (int x = 10; x <= 10 && x > 0; x--) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void task2() {
        // Задание 2
        for (int f = 7; f <= 31; f = f + 7) {
            System.out.println("Сегодня пятница, " + f + " число. Необходимо подготовить отчет.");
        }
    }

    public static void task3() {
        int nowYear = 2022;
        int lastYear = nowYear - 200;
        int nextYear = nowYear + 100;
        for (int c = 0; c < nowYear + 100; c = c + 79) {
            if (c >= lastYear && c <= nextYear) {
                System.out.println(c + " ");
            }
        }
    }
    public static void task4() {
        //Необходимо пройти циклом по числам от 1 до 30 включительно и,
        //если число делится на 3 без остатка, вывести ping,
        // а если число делится на 5 без остатка, вывести pong.
        //Если число делится без остатка и на 3, и на 5, необходимо вывести ping pong.
        //Допускается наличие пустых строк в выводе.
        for(int day =1; day <=30; day ++) {
            if (day % 3 == 0 && day % 5 == 0) {
                System.out.println(day + ": " + "ping pong");
                continue;
            }
            else if (day % 3 == 0) {
                System.out.println(day + ": " + "ping");
                continue;
            }
            else if (day % 5 == 0) {
                System.out.println(day + ": " + "pong");
                continue;
            }
            else {
                System.out.println(day + ": ");
            }
        }
    }

    public static void task5() {
        //Вывести первые 10 чисел последовательности Фибоначчи. Последовательность строится по следующему правилу:
        //Каждое следующее число равняется сумме двух предыдущих.
        //Дано: две целочисленные переменные, первая равна 0, вторая равна 1.
        //Эти два числа — первые числа последовательности. Следующие восемь нужно вычислить и вывести.
        //Должно получиться следующее:
        //0 1 1 2 3 5 8 13 21 34
       int numberFirst = 0;
       int numberSecond = 1;
       int number1;
       int number2;
       for (int x = 1; x <= 5; x++) {
           number1 = numberFirst;
           number2 = numberSecond;
           numberFirst = number1 + number2;
           numberSecond = number2 + numberFirst;
           System.out.print(number1 + " ");
           System.out.print(number2 + " ");
       }
    }
}