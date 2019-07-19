package app;

// ConcreteCommand
class Apagar implements ICommand{
    private IServer servidor;
 
    public Apagar(IServer servidor){
        this.servidor = servidor;
    }
 
    public void execute(){
        servidor.apagar();
    }
 
    public void undo(){
        servidor.encender();
    }
 
    public void redo(){
        execute();
    }
 }
 