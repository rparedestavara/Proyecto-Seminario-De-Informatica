package proyectofiuba

class Categoria {
    String codigo
    String nombre
    
    static constraints = {
    codigo blank:false, nullable: false
    nombre blank:false, nullable: false
    
    }
}
