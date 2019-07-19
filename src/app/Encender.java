package app;

// ConcreteCommand
class Encender implements ICommand{
    private IServer servidor;
   
    public Encender(IServer servidor){
        this.servidor = servidor;
    }
 
    public void execute(){
        servidor.encender();
    }
 
    public void undo(){
        servidor.apagar();
    }
 
    public void redo(){
        execute();
    }
 }
 