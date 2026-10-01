public abstract class AbstractState implements State {
    private Motorista motorista;
    public AbstractState(Motorista motorista) {
        this.motorista = motorista;
    }

    @Override 
    public Motorista GetMotorista() {
        return motorista;
    }

    @Override 
    public Void printStats() {
        System.out.println("Motorista: " + motorista.getNome());
        return null;
    }

    @Override 
    public void enter() {
    }

    @Override 
    public void exit() {
    }
}