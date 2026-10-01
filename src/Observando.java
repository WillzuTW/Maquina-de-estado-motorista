public class Observando extends AbstractState<Casualidades> {
    public Observando(Casualidades agente) {
        super(agente);
    }

    public void execute() {
        getAgente().printStats("Observando");
        System.out.println("| Observando: " + getAgente().getMotoristas());
        System.out.println("+--------------------------------------------");
    }
}
