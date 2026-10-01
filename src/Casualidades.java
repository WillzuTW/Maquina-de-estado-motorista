public class Casualidades implements Agente {
    private int opcao;
    private int tempo_parado;
    private boolean sorteado = false;
    private boolean tempo_definido = false;
    
    private State<Casualidades> state = new Observando(this);
    private final Motorista motoristas;

    public Motorista getMotoristas() {
        return motoristas;
    }

    public boolean getTempo_definido() {
        return tempo_definido;
    }

    public boolean setTempo_definido(boolean tempo_definido) {
        return this.tempo_definido = tempo_definido;
    }

    public boolean getSorteado() {
        return this.sorteado;
    }
    
    public void setSorteado(boolean sorteado) {
        this.sorteado = sorteado;
    }

    public int getTempoParado() {
        return this.tempo_parado;
    }

    public int setTempoParado(int tempo_parado) {
        return this.tempo_parado = tempo_parado;
    }

    public int DecreaseTempoParado(int tempo_parado) {
        return this.tempo_parado -= tempo_parado;
    }

    public int setOpcao(int opcao) {
        return this.opcao = opcao;
    }

    public int getOpcao() {
        return this.opcao;
    }

    public Casualidades(Motorista motoristas) {
        this.motoristas = motoristas;
    }

    public void printStats(String state) {
        System.out.println("+-- " + this + " ----------------------");
        System.out.println("| Estado atual: " + state);
    }

    public void update() {
        state.execute();
    }

    public void setState(State state) {
        this.state.leave();
        this.state = state;
        this.state.enter();
    }
}
