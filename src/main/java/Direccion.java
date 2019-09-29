import java.util.Scanner;

public class Direccion {

    public static String calle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la calle donde vive: ");
        String calle = sc.nextLine();
        return calle;
    }

    public static String numeracion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de su residencia");
        int numero = sc.nextInt();
        String numeroString = Integer.toString(numero);
        return numeroString;
    }

    public static String ciudad() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la ciudad donde vive");
        String ciudad = sc.nextLine();
        return ciudad;
    }

    public static String region() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la region donde vive");
        String region = sc.nextLine();
        return region;
    }
}
