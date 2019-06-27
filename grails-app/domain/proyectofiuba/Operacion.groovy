package proyectofiuba

class Operacion {

    enum Estado {
      CALIFICADA,
      SIN_CALIFICAR,
      CANCELADA,
    }

    int codigo
    Usuario usuarioComprador
    Usuario usuarioVendedor
    String calificacion
    Estado estadoDeOperacion = Estado.SIN_CALIFICAR;
    Set<Producto> productos=[]


    Operacion(Usuario comprador , Usuario vendedor){
        this.usuariocomprador = comprador
        this.usuariovendedor = vendedor
    }

    boolean esUsuarioVendedor(Usuario usuario){
        this.usuarioVendedor=usuario
    }

    boolean esUsuarioComprador(Usuario usuario){
        this.usuarioComprador=usuario
    }

    boolean calificarOperacion(int numeroDeCalificacion,Usuario usuario){
        this.calificacion=numeroDeCalificacion
        this.Estado=Estado.CALIFICADA
    }

    Void agregarProducto(Producto producto){
        this.productos << producto
        println "producto agregado"
    }

    Void pagar(){

    }


    
    

    static constraints = {
        codigo blank: false, nullable: false
        usuariocomprador blank: false, nullable: false
        usuariovendedor blank: false, nullable: false
    }
}
