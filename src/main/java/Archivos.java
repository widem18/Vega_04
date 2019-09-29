import java.io.*;

public class Archivos {
    public static void crearArchivo(String ruta) {
        File file = new File(ruta);
        if (!file.exists())
            try {
                file.createNewFile();
                System.out.println("El archivo " + file.getName() + " ha sido creado");
            } catch (IOException e) {
                System.out.println("El archivo no pudo ser creado");
            }
    }

    public static void agregarTexto(String ruta, String texto) {
        try {
            FileWriter fw = new FileWriter(ruta, true);
            fw.append(texto);
            fw.close();
            System.out.println("Se le ha agregado texto al archivo " + ruta);
        } catch (IOException e) {
            System.out.println("Error al agregar el texto solicitado");
        }
    }

    public static String leerArchivo(String ruta) {
        String texto = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(ruta));
            String temp = "";
            String bfRead;
            while ((bfRead = bf.readLine()) != null) {
                temp = temp + bfRead;
            }
            texto = temp;
        } catch (IOException e) {
            System.err.println("El Archivo no pudo ser leido");
        }
        return texto;

    }
}
