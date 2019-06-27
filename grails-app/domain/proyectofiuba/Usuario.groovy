package proyectofiuba

class Usuario {
    String nombre
    String usuario
    String contrasenia
    int idUsuario
    String correo
    Operacion operacion ;

    
    Usuario(String usuario,String contrasenia,String nombre,String correo){
        this.nombre=nombre
        this.contrasenia=contrasenia
        this.usuario=usuario
        this.correo=correo
        this.idUsuario=0
    }

     Void agregarAlCarro(producto){
        this.operacion.agregarProducto(producto)
     }


    Void comprar(){
        operacion.pagar()
     }  



    static constraints = {
    nombre blank:false, nullable:false
    contrasenia blank:false, nullable:false
    }
}
