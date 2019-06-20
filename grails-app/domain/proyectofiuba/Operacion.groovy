package proyectofiuba

class Operacion {
    int codigo
    Usuario usuariocomprador
    Usuario usuariovendedor
    String calificacion

    Operacion(Usuario comprador , Usuario vendedor){
        this.usuariocomprador = comprador
        this.usuariovendedor = vendedor
    }

    //CalificarOperacion(int numeroDeCalificacion){
        //this.calificacion=numeroDeCalificacion
   // }
    


    static constraints = {
        codigo blank: false, nullable: false
        usuariocomprador blank: false, nullable: false
        usuariovendedor blank: false, nullable: false
    }
}
