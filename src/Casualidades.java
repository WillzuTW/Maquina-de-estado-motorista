public class Casualidades implements Agente {


    private State<Casualidades> state = new Observando(this);

    public void printStats(String state) {
        System.out.println("Estado atual: " + state);
    }

    public void update() {
        state.execute();
    }

    public void setState(State state) {
        this.state.exit();
        this.state = state;
        this.state.enter();
    }
}
