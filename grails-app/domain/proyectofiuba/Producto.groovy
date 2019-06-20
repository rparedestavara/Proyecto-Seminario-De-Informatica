package proyectofiuba

class Producto {
    int codigo
    String nombre
    int precio
    String calificacion
    
    
    
    static constraints = {
    codigo blank: false, nullable: false
    nombre blank: false, nullable: false
    precio blank: false, nullable: false
    }
}
