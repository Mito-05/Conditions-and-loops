import java.util.Random;
import java.util.Scanner;
public class ejFor {

        public static void for1() {
            System.out.println("Ejercicio 1");
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }
        public static void for2() {
            System.out.println("Ejercicio 2");
            for (int i = 10; i >= 1; i--) {
                System.out.println(i);
            }
        }
        public static void for3() {
            System.out.println("Ejercicio 3");
            int suma = 0;
            for (int i = 1; i <= 10; i++) {
                suma += i;
            }
            System.out.println(suma);
        }
        public static void for4() {
            System.out.println("Ejercicio 4");
            for (int i = 1; i <= 20; i+=2) {
                System.out.println(i);
            }
        }
        public static void for5() {
            System.out.println("Ejercicio 5");
            int factorial = 1;
            for (int i = 9; i > 1 ; i--) {
                factorial *= i;
                System.out.println(factorial);
            }
        }
        public static void for6() {
            System.out.println("Ejercicio 6");
            int factorial = 7;
            for (int i = 1; i <=10 ; i++) {
                factorial *= i;
                System.out.println("7 x "+ i + " = " +factorial);
            }
        }
        public static void for7() {
            System.out.println("Ejercicio 7");
            for (int i = 1; i <= 50; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);

                }
            }
        }
        public static void for8() {
            System.out.println("Ejercicio 8");
            for (int i = 1; i <= 6; i++) {
                int dado = (int)(Math.random() * 6) + 1;
                System.out.println(dado);
            }

        }
        public static void for9() {
            System.out.println("Ejercicio 9");
            String[] cadenas = {"Pasta", "Judias", "Lentejas", "Galletas", "Naranjas"};
        }

    }
