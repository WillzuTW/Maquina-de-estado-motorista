public interface State {
    Motorista GetMotorista();
    Void printStats();

    void enter();
    void exit();
    void execute();
}