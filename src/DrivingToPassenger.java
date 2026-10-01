public class DrivingToPassenger extends AbstractState<Motorista> {

    public DrivingToPassenger(Motorista agente) {
        super(agente);
    }

    @Override 
    public void execute() {
        getAgente().printStats("DrivingToPassenger");
        if (Math.random() < 0.85 && getAgente().getParado() == false) DrivingPassenger();
        else {
            System.out.println("| Parece que o motorista está preso no trânsito");
            getAgente().setParado(true);
        }
        System.out.println("+--------------------------------------------");
        getAgente().addTempo(1);
    }
    
    @Override 
    public void exit() {
        System.out.println("|  [saída] Dirigindo até o destino: " + getAgente().getKmViagem() + " km.");
    }


    public void DrivingPassenger() {
        if (getAgente().getKmRodados() < getAgente().getKmPassageiro()) {
            getAgente().addKmRodados(1);
            if (getAgente().getKmRodados() > getAgente().getKmPassageiro()) {
                getAgente().SetKmRodados(getAgente().getKmPassageiro());
            }
            System.out.println("| Dirigindo até o passageiro: " + getAgente().getNome() + ", Km rodados: " + getAgente().getKmRodados() + "/" + getAgente().getKmPassageiro());
        } else {
            System.out.println("| Passageiro: " + getAgente().getNome() + " entrou no carro." + ", tempo total da viagem: " + getAgente().getTempo() + " minutos.");
            getAgente().SetKmRodados(0);
            getAgente().setTempo(0);
            getAgente().setState(new DeliveringPassenger(getAgente()));
        }
    } 
}
