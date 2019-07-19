package app;

// Invoker
class Control{
    public void run(ICommand command){
        command.execute();
    }
 }
 