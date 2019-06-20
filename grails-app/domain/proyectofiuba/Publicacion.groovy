package proyectofiuba

class Publicacion {
    String titulo
    String descripcion
    Producto producto

    

    static constraints = {
        titulo blank:false, nullable:false
        descripcion blank:false, nullable:false
        producto blank:false, nullable:false
    }
}
