package app;

//Command
interface ICommand{
    void execute();
    void undo();
    void redo();
 }
 