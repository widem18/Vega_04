import java.util.Scanner;

public class Nombre {

    public static String nombre() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su primer nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su primer apellido");
        String apellido = sc.nextLine();
        String nombreComp = (nombre + " " + apellido);
        if (nombreComp.length() < 20) {
            System.out.println("Su nombre es: " + nombreComp);
            return nombreComp;
        } else {
            String nulo = Integer.toString(nombreComp.length() - 20);
            System.out.println("Su nombre excede los 20 caracteres, sera guardado como: " + nulo);
            return nulo;
        }
    }

    public static void validarNombre() {
        Scanner sc = new Scanner(System.in);
        String letra = sc.nextLine();
    }
}
