public class App {
    public static void main(String[] args) throws Exception {
        Libro libro1 = new Libro("Los tres cerditos", "Joseph Jacobs", 35, 3);
        libro1.imprimir();
        libro1.devolucion();
        libro1.imprimir();
        libro1.prestamo();
        libro1.prestamo();
        libro1.imprimir();
    }
}
