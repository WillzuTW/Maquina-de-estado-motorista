public abstract class AbstractState<A> implements State<A> {
    private final A agente;

    public AbstractState(A agente) {
        this.agente = agente;
    }

    @Override
    public A getAgente() {
        return agente;
    }

    @Override
    public void enter() {
    }

    @Override
    public void leave() {
    }
}
