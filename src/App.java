public class App {
    public static void main(String[] args) throws Exception {
        Libro libro1 = new Libro("Los tres cerditos", "Joseph Jacobs", 35, 3);
        libro1.imprimir();
        libro1.devolucion();
        libro1.imprimir();
        libro1.prestamo();
        libro1.prestamo();
        libro1.imprimir();


        Libro libro2 = new Libro("Los Pollitos Dicen", "Gerald Espinoza", 30, 17);
    
        libro2.imprimir();
        libro2.prestamo();
        libro2.prestamo();
        libro2.prestamo();
        libro2.prestamo();
        libro2.prestamo();
        libro2.prestamo();
        libro2.prestamo();
        libro2.imprimir();
        libro2.devolucion();
        libro2.devolucion();
        libro2.devolucion();
        libro2.imprimir();

    
    
    
    }


}
