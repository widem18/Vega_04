import java.util.Scanner;

public class Rut {
    public static String rut() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su rut con guion (-) y digito verificador");
        String rut = sc.nextLine();
        if (validarRut(rut) == true) {
            System.out.println("El rut es valido");
            String rutVal = "";
            rutVal = rut;
            return rutVal;
        } else {
            System.out.println("El rut es invalido, sera guardado como: Rut no valido ");
            return "Rut no valido";
        }
    }

    public static boolean validarRut(String rut) {
        boolean validacion = false;
        try {
            rut = rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));
            char dv = rut.charAt(rut.length() - 1);
            int m = 0;
            int s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }
        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }
}
