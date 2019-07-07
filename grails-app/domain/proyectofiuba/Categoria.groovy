package proyectofiuba

class Categoria {
    String codigo
    String nombre
    String tipo
    
    static constraints = {
    codigo blank:false, nullable: false
    nombre blank:false, nullable: false
    tipo blank:false, nullable: false
    }
}
