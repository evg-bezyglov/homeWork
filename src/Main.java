public class Main {
    public static void main(String[] args) {
        for (int j = 1; j < 11; j++) {
            System.out.println(j);
        }
        int start2 = 5;
        while (start2 > 0) {
            System.out.println(start2);
            start2 = start2 - 1;
        }
        int start1 = 5;
        do { System.out.println(start1);
            start1 = start1 - 1;
        }
        while (start1 > 0);

        //Task 1
        int summa = 0;
        int h = 0;
        while (summa < 2470000) {
            System.out.println("Месяц " + h +", сумма накоплений равна " + summa + " рублей.");
            h = h + 1;
            summa = summa + 15000;
        }
        //Task 2
        int k = 1;
        int l = 10;
        while (k < 11) {
            System.out.print(k + " ");
            k = k + 1;
        } System.out.println();
        for (; l > 0; l = l - 1) {
            System.out.print(l + " ");
        }
        //Task 3
        int all = 12000000;
        int jo = 0;
        int ye = 0;
        while (ye < 10) {
            ye = ye + 1;
            jo = (17 - 8) * (12000000/1000);
            all = all + jo;
            System.out.println("Год " + ye + ", численность населения состовляет " + all);
        }
        //Task 4
        int cash = 15000;
        int mo = 0;
        while (cash < 12124800) {
            mo = mo + 1;
            cash = cash + (cash/100)*7;
            System.out.println("Месяц № " + mo + ", сумма накоплений " + cash + ".");
        }
        //Task 5
        int cash1 = 15000;
        int mo1 = 0;
        while (cash1 < 12124800) {
            mo1 = mo1 + 1;
            cash1 = cash1 + (cash1 / 100) * 7;
            if (mo1 % 6 == 0) {
                System.out.println("Месяц № " + mo1 + ", сумма накоплений " + cash1 + ".");
            }
        }
        //Task 6
        int cash2 = 15000;
        int mo2 = 0;
        while (mo2 < 109) {
            mo2 = mo2 + 1;
            cash2 = cash2 + (cash2/100)*7;
            if (mo2 % 6 == 0) {
                System.out.println("Месяц№ " + mo2 + ", сумма накоплений равна " + cash2 + " рублей.");
            }
        }
        //Task 7
        int fri = 2;
        while (fri < 31) {
            System.out.println("Сегодня пятница, " + fri + "-е число. Необходимо подготовить отчет.");
            fri = fri + 7;
        }
        //Task 8
        int o = 0;
        int du = 2023 - 200;
        int po = 2023 + 100;
        while (o < po) {
            o = o + 79;
            if (o > du && o < po) {
                System.out.println(o);
            }
        }
    }
}