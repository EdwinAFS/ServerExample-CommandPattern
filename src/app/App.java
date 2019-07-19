package app;
// Client
public class App {
    public static void main(String[] args) throws Exception {
        ICommand servidorColombiaOn  = new Encender(new ServidorColombia());
        ICommand servidorColombiaOff = new Apagar(new ServidorColombia());
        ICommand servidorUSAOn       = new Encender(new ServidorUSA());
        ICommand servidorUSAOff      = new Apagar(new ServidorUSA());

        Control control = new Control();
        control.run(servidorColombiaOn);
        control.run(servidorColombiaOff);        
        control.run(servidorUSAOn);
        control.run(servidorUSAOff);
    }
}