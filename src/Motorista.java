public class Motorista implements Agente {
    private String nome_passageio;
    private int KmRodados;
    private int KmViagem;
    private int KmPassageiro;
    public boolean parado = false;

    private State<Motorista> state = new Parking(this);

    public String getNome() {
        return this.nome_passageio;
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
        this.state.exit();
        this.state = state;
        this.state.enter();
    }

    public void printStats(String state) {
        System.out.println("Objeto: " + this);
        System.out.println("Estado atual: " + state);

    }
}
