public class Libro {

    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int numeroEjemplaresPrestados;


 // CONSTRUCTOR VACIO

    public Libro(){

    }

    // CONSTRUCTOR 
    public Libro(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados){

        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }
    
    // MÉTODO PRESTAMO

    public boolean prestamo(){
        if (numeroEjemplares > 0) {
            numeroEjemplaresPrestados += 1;
            numeroEjemplares -= 1;
            return true;
        }else{
            return false;
        }
    }

    // MÉTODO DEVOLUCIÓN

    public boolean devolucion(){
        if (numeroEjemplaresPrestados > 0) {
            numeroEjemplares += 1;
            numeroEjemplaresPrestados -= 1;
            return true;
        }else{
            return false;
        }
    }

    // MÉTODO IMPRIMIR

    public void imprimir(){
        System.out.println("------Datos del libro------");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ejemplares Disponibles: " + getNumeroEjemplares());
        System.out.println("Ejemplares prestados: " + getNumeroEjemplaresPrestados());
    }

    // AQUI ESTAN LOS GET Y SET

    //TITULO
    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    //AUTOR

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }


    //NUMERO DE EJEMPLARES

    public int getNumeroEjemplares(){
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares){
        this.numeroEjemplares = numeroEjemplares;
    }

    //NUMERO DE EJEMPLARES PRESTADOS

    public int getNumeroEjemplaresPrestados(){
        return numeroEjemplaresPrestados;
    }

    public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados){
        this.numeroEjemplares = numeroEjemplaresPrestados;
    }
}
