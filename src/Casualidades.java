public class Casualidades implements Agente {

    private State<Casualidades> state = new Observando(this);
    private final Motorista motoristas;

    public Motorista getMotoristas() {
        return motoristas;
    }

    public Casualidades(Motorista motoristas) {
        this.motoristas = motoristas;
    }

    public void printStats(String state) {
        System.out.println("+-- " + this + " ----------------------");
        System.out.println("| Estado atual: " + state);
    }

    @Override
    public String toString() {
        return "Casualidades #" + String.format("%04X", System.identityHashCode(this) & 0xFFFF);
    }

    public void update() {
        state.execute();
    }

    public void setState(State state) {
        System.out.println("|  >> Transição: " + this.state.getClass().getSimpleName() + " -> " + state.getClass().getSimpleName());
        this.state.exit();
        this.state = state;
        this.state.enter();
    }
}
