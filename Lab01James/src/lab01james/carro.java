package lab01james;
public class carro {
    //constructores
    public carro() {
    }
    public carro(String mparam) {
        System.out.println("Bienvenidos a la Conducción de mi Carro..." + mparam);
    }

    //metodos
    public void avanzar() {
        System.out.println("Estoy avanzando");
    }
    public void encender() {
        System.out.println("Estoy Encendiendo");
    }
    public void apagar() {
        System.out.println("Estoy apagando");
    }
    public void frenar() {
        System.out.println("Estoy frenando");
    }
    public void cargarcombustibles() {
        System.out.println("Estoy cargando combustible");
    }
}
