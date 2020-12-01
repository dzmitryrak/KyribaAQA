public class AQA1 {

    public static void main(String args[]) {
        System.out.println("Hello World");
        int a = 1;
        boolean b = true;
        long c = 234354671;
        double d = 1.1354657687965;
        String g = "blabla";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(g);

        double j = 2.13;
        a = (int) j;
        System.out.println(a);
        //ПЕРЕМЕННЫЕ
        double param1 = 2;
        double param2 = 52323223;
        double sum = param1 / param2;
        System.out.println(sum);

        //++
        //--
        double increment = 0;
        increment++;
        System.out.println(increment);
        increment--;
        System.out.println(increment);

        //>
        //<
        //==
        //!=
        //<=
        //>=

        //УСЛОВНЫЕ ОПЕРАТОРЫ
        int number = 0;
        if (number < 0) {
            System.out.println("Отрицательный");
        }
        if (number > 0) {
            System.out.println("Положительный");
        }
        if (number == 0) {
            System.out.println("0");
        }

        if (number < 0) {
            System.out.println("Отрицательный");
        } else {
            System.out.println("НЕ ОТРИЦАТЕЛЬНЫЙ");
        }

        /*
        3) Дано целое число.
        Если оно является положительным, то прибавить к нему 1.
         Если отрицательным, то вычесть из него 2.
         Если нулевым, то заменить его на 10. Вывести полученное число.
         */
        int num = 0;
        if(num > 0) {
            num++;
        } else if (num < 0) {
            num = num - 2;
        } else {
            num = 10;
        }
        System.out.println(num);
    }
}
