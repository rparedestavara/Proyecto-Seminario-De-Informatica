package proyectofiuba

class Suspension {
    Date fechaInicio
    Date fechaFinal
    String motivo
    
    static constraints = {
        fechaInicio blank: false, nullable: false
        fechaFinal blank: false, nullable: false
    }
}
