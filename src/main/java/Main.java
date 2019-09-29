public class Main {
    public static void main(String[] args) {
        Archivos.crearArchivo("Usuarios.csv");
        Archivos.agregarTexto("Usuarios.csv", Nombre.nombre() + "," + Rut.rut() + "," + Direccion.calle() + "," + Direccion.numeracion() + "," + Direccion.ciudad() + "," + Direccion.region() + "\n");
        Archivos.leerArchivo("Usuarios.csv");
    }
}
