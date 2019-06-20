package proyectofiuba

class Usuario {
    String nombredeusuario
    String contrasenia
    int idUsuario
    
    Usuario(String nombre,String contrasenia,int id){
        this.nombredeusuario=nombre
        this.contrasenia=contrasenia
        this.idUsuario=id
    }

    

    static constraints = {
    nombredeusuario blank:false, nullable:false
    contrasenia blank:false, nullable:false
    }
}
