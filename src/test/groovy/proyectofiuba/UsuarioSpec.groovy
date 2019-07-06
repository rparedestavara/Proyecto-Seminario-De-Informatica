package proyectofiuba

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class UsuarioSpec extends Specification implements DomainUnitTest<Usuario> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
    	given:
    		Usuario  usu= new Usuario("pepe","123","pepe","123");
            usu.addToOperaciones(new Operacion())
    	when:
        	usu.validate()
            //usu.save()
        then:
        	!usu.hasErrors()
    }
   
}
