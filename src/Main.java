import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ejercicio3();
    }
    public static void ejercicio1(){
        System.out.println("Ejercicio 1");
        int i=0;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }
    public static void ejercicio2(){
        System.out.println("Ejercicio 2");
        int i=10;
        while(i>=1){
            System.out.println(i);
            i--;
        }
    }
    public static void ejercicio3(){
        System.out.println("Ejercicio 3");
        int i=1;
        int suma= 0;
        while(i<=10){
            if(i < 10){
                System.out.printf(i + " + ");
            }
            suma+=i;
            if(i>=10){
                System.out.printf(i+" = "+ suma);
            }
            i++;
        }
    }
    public static void ejercicio4(){
        System.out.println("Ejercicio 4");
        int i=0;
        while(i<=20){
            System.out.println(i);
            i+=2;
        }
    }
    public static void ejercicio5(){
        System.out.println("Ejercicio 5");
        int i = 8;
        int factor=1;
        while(i>0){
            if(i>1){
                System.out.printf(i + " x ");
            }

            if(i==1){
                System.out.printf(i+" = "+ factor);
            }
            factor*=i;
            i--;
        }
        System.out.println(factor);
    }
    public static void ejercicio6(){
        System.out.println("Ejercicio 6");
        int i = new Random().nextInt(10)+1;
        while(true){
            Scanner sc = new Scanner(System.in);
            String opcion = sc.nextLine();
            if (opcion.equals(i)){
                break;
            }
        }
    }
    public static void ejercicio7(){
        System.out.println("Ejercicio 7");
        int i=1;
        while(i<=50){
            if(i%3==0){
                System.out.println(i);
            }
            i++;
        }
    }
    public static void ejercicio8(){
        System.out.println("Ejercicio 8");
        String nombre="julian";
        String contrasenya="capi21capi";
        Scanner sc = new Scanner(System.in);
        while(true){
            String name = sc.nextLine();
            String password = sc.nextLine();

            if (name.equals(nombre.toLowerCase())&&password.equals(contrasenya)){
                break;
            }
            else {
                System.out.println("El nombre o la contrasenya son incorrectos");
            }
        }
    }
    public static void ejercicio9(){
        System.out.println("Ejercicio 9");
        String nombre="julian";
        String contrasenya="capi21capi";
        Scanner sc = new Scanner(System.in);
        int cont=3;
        while(true){
            String name = sc.nextLine();
            String password = sc.nextLine();
            if (cont==0){
                break;
            }
            else if (name.equals(nombre.toLowerCase())&&password.equals(contrasenya)){
                break;
            }
            else {
                System.out.println("El nombre o la contrasenya son incorrectos");
            }
            cont--;
            System.out.println("Te quedan "+ cont + " numero de intentos");
        }
    }
}