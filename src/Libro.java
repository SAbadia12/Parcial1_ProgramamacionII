public class Libro {

    public String titulo;
    public String autor;
    public int numeroEjemplares;
    public int numeroEjemplaresPrestados;


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
