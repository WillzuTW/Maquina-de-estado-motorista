public class Motorista {
    private String nome_passageio;
    private int KmRodados;
    private int KmViagem;
    private int KmPassageiro;

    private State state = new Parking(this);

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


    public void update() {
        state.execute();
    }

    

    public void setState(State state) {
        this.state.exit();
        this.state = state;
        this.state.enter();
    }

    public static void main(String[] args) {
        Motorista motorista = new Motorista();
        while(true) {
            motorista.update();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
