public class Motorista implements Agente {
    private String nome_passageio;
    private int KmRodados;
    private int KmViagem;
    private int KmPassageiro;
    private int tempo;
    public boolean parado = false;

    private State<Motorista> state = new Parking(this);

    public String getNome() {
        return this.nome_passageio;
    }

    public int getTempo() {
        return this.tempo;
    }

    public int setTempo(int tempo) {
        return this.tempo = tempo;
    }

    public int addTempo(int tempo) {
        return this.tempo += tempo;
    }

    public void setNome(String nome) {
        this.nome_passageio = nome;
    }

    public void addKmRodados(int km) {
        this.KmRodados += km;
    }

    public void SetKmRodados(int km) {
        this.KmRodados = km;
    }

    public void setKmPassageiro(int km) {
        this.KmPassageiro = km;
    }

    public void SetKmViagem(int km) {
        this.KmViagem = km;
    }

    public int getKmPassageiro() {
        return this.KmPassageiro;
    }

    public int getKmViagem() {
        return this.KmViagem;
    }

    public int getKmRodados() {
        return this.KmRodados;
    }

    public boolean getParado() {
        return this.parado;
    }

    public void setParado(boolean parado) {
        this.parado = parado;
    }

    @Override
    public void update() {
        state.execute();
    }

    public void setState(State state) {
        System.out.println("|  >> Transição: " + this.state.getClass().getSimpleName() + " -> " + state.getClass().getSimpleName());
        this.state.exit();
        this.state = state;
        this.state.enter();
    }

    public void printStats(String state) {
        System.out.println("+-- " + this + " -------------------------");
        System.out.println("| Estado atual: " + state);
    }

    @Override
    public String toString() {
        return "Motorista #" + String.format("%04X", System.identityHashCode(this) & 0xFFFF);
    }
}
