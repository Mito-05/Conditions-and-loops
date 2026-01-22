import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class ejForeach {

    public static void foreach1() {
        System.out.println("Ejercicio 1");
        String[] palabras = {"Hola", "Como", "Estas", "Hoy", "Tío"};
        for (String i : palabras) {
            System.out.println(i);
        }
    }

    public static void foreach2() {
        System.out.println("Ejercicio 2");
        int[] numeros = {10, 20, 30, 40, 50};
        int suma = 0;
        for (int i : numeros) {
            suma += i;
        }
        System.out.println("La suma total es: " + suma);
    }

    public static void foreach3() {
        System.out.println("Ejercicio 3");
        ArrayList<Double> decimales = new ArrayList<>();
        decimales.add(10.5);
        decimales.add(20.0);
        decimales.add(15.75);
        decimales.add(5.25);
        decimales.add(8.5);
        double suma = 0;
        for (double i : decimales) {
            suma += i;
        }
        System.out.println("La media es: " + (suma / decimales.size()));
    }

    public static void foreach4() {
        System.out.println("Ejercicio 4");
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        int pares = 0;
        int impares = 0;
        for (int i : lista) {
            if (i % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Pares: " + pares + ", Impares: " + impares);
    }

    public static void foreach5() {
        System.out.println("Ejercicio 5");
        String[] nombres = {"Ana", "Luis", "Marta", "Julián", "Elena"};
        System.out.print("Introduce un nombre: ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        for (String i : nombres) {
            if (i.equalsIgnoreCase(i)) {
                System.out.println(i + "El nombre está en el array.");
                break;
            } else {
                System.out.println("El nombre no esta en la lista");
            }
        }
    }

    public static void foreach6() {
        System.out.println("Ejercicio 6");
        HashSet<String> palabras = new HashSet<>(Arrays.asList("Vandal", "Bandit", "Judge", "Classic", "Phamtom"));
        String larga = "";
        for (String i : palabras) {
            if (i.length() > larga.length()) {
                larga = i;
            }
        }
        System.out.println("La palabra más larga es: " + larga);
    }

    public static void foreach7() {
        System.out.println("Ejercicio 7");
        HashMap<String, Double> alumnos = new HashMap<String, Double>();
        alumnos.put("Ana", 8.5);
        alumnos.put("Luis", 4.2);
        alumnos.put("Marta", 9.8);
        alumnos.put("Juan", 6.0);
        alumnos.put("Elena", 3.5);

        String mejorAlumno = "";
        String peorAlumno = "";
        double notaMax = 0;
        double notaMin = 10;
        double sumaTotal = 0;

        for (String nombre : alumnos.keySet()) {
            double notaActual = alumnos.get(nombre);
            sumaTotal += notaActual;

            if (notaActual >= notaMax) {
                notaMax = notaActual;
                mejorAlumno = nombre;
            }
            if (notaActual <= notaMin) {
                notaMin = notaActual;
                peorAlumno = nombre;
            }
        }

        System.out.println("Nota más alta: " + mejorAlumno + " (" + notaMax + ")");
        System.out.println("Nota más baja: " + peorAlumno + " (" + notaMin + ")");
        System.out.println("Nota media: " + (sumaTotal / alumnos.size()));
    }

    public static void foreach8() {
        System.out.println("Ejercicio 8");
        HashMap<String, Double> productos = new HashMap<String, Double>();
        productos.put("Monitor", 150.0);
        productos.put("Teclado", 25.0);
        productos.put("Ratón", 15.0);
        productos.put("Altavoces", 45.0);
        productos.put("Cable HDMI", 10.0);

        System.out.println("Lista de productos con IVA:");
        for (String prod : productos.keySet()) {
            double precioConIva = productos.get(prod) * 1.21;
            System.out.println("Producto: " + prod + " | Precio final: " + precioConIva);
        }
    }

    public static void foreach9() {
        System.out.println("Ejercicio 9");
        HashMap<String, Integer> personas = new HashMap<String, Integer>();
        personas.put("Carlos", 2018);
        personas.put("Terry", 2006);
        personas.put("Julián", 2000);
        personas.put("Sofía", 2015);
        personas.put("Daniel", 1988);

        int contadorMayores = 0;
        int anyoActual = 2026;

        System.out.println("Personas mayores de edad:");
        for (String nombre : personas.keySet()) {
            int edad = anyoActual - personas.get(nombre);

            if (edad >= 18) {
                System.out.println("- " + nombre + " (" + edad + " años)");
                contadorMayores++;
            }
            else {
                System.out.println("- " + nombre + " (" + edad + " años)");
            }
        }
        System.out.println("Total de personas mayores de edad: " + contadorMayores);
    }
}