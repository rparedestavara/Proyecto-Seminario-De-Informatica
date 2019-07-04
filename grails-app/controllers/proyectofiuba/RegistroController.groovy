package proyectofiuba

class RegistroController {

    def index() { 

    }

    def registrar(Usuario user){
    	println "este es el usu" 
    	
    	//println params.usuario
    	//def user = new Usuario(params.usuario,params.pass,params.nombreYapellido,params.correo)
        if(user.hasErrors()){
            render(view: "index", model: [us: user])
        }
    	println user.nombre

        if(!user.puedeComprar()){
            flash.error = "El usuario no puede comprar"
            redirect(action: "/home")
        }

    	redirect(action: "login",params: [us: user])
    }

    def registrar_producto(){
        
    }
    def registroExitoso(){
    	
    }

    def login(){
    	
    }

}
