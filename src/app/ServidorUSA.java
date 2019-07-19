package app;

// ConcreteReceiver
class ServidorUSA implements IServer{
    public void encender(){
        System.out.println("El Servidor USA esta encendiendo...");
    }
 
    public void apagar(){
        System.out.println("El Servidor USA se esta apagando...");
    }
 }
 