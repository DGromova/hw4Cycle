public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
}