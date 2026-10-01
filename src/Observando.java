public class Observando extends AbstractState<Casualidades> {
    public Observando(Casualidades agente) {
        super(agente);
    }

    public void execute() {
        System.out.println("_______");
        getAgente().printStats("Observando");
        for (Motorista motorista : getAgente().getMotoristas()) {
            System.out.println(motorista);
        }
        System.out.println("_______");
    }
}
