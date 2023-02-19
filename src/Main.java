import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println("Задача 1 2");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.print(number[i]);
            if (i != number.length - 1)
                System.out.print(", ");
        }
        System.out.println();
        double[] drob = new double[]{1.57, 7.654, 9.986};
        for (int j = 0; j < 3; j++) {
            System.out.print(drob[j]);
            if (j != drob.length - 1)
                System.out.print(", ");
        }
        System.out.println();
        int[] proizvol = new int[]{2, 4, 6, 8, 10};
        for (int i = 0; i < proizvol.length; i++) {
            System.out.print(proizvol[i]);
            if (i != proizvol.length - 1)
                System.out.print(", ");
        }
        System.out.println();
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 3");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
            for (int i = number.length - 1;i >= 0; i--){
                System.out.print(number[i]);
                if (i != 0)
                    System.out.print(", ");
        }
        System.out.println();
        double[] drob = new double[]{1.57, 7.654, 9.986};
        for (int i = drob.length - 1; i >= 0; i--){
            System.out.print(drob[i]);
            if (i != 0)
                System.out.print(", ");
        }
        System.out.println();
         int[] proizvol = new int[]{2, 4, 6, 8, 10};
         for ( int i = proizvol.length - 1; i >= 0; i--)
        {System.out.print(proizvol[i]);
         if (i != 0)
             System.out.print(", ");}
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 4");
        int[] number = { 1, 2, 3 };
        for (int i = 0; i < number.length; i++) {
        if (number[i] % 2 != 0){
        number[i] += 1;}
        System.out.println(Arrays.toString(number));}
    }


}