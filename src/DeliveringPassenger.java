public class DeliveringPassenger extends AbstractState<Motorista> {

    public DeliveringPassenger(Motorista agente) {
        super(agente);
    }

    @Override 
    public void execute() {
        getAgente().printStats("DeliveringPassenger");
        if (Math.random() < 0.85 && getAgente().getParado() == false) deliverPassanger();
        else {
            System.out.println("| Parece que o motorista está preso no trânsito");
            getAgente().setParado(true);
        }
        System.out.println("+--------------------------------------------");
        getAgente().addTempo(1);
    }

    public void deliverPassanger() {
        if (getAgente().getKmRodados() < getAgente().getKmViagem()) {
            getAgente().addKmRodados(1);
            if (getAgente().getKmRodados() > getAgente().getKmViagem()) {
                getAgente().SetKmRodados(getAgente().getKmViagem());
            }
            System.out.println("| Entregando passageiro: " + getAgente().getNome() + ", Km rodados: " + getAgente().getKmRodados() + "/" + getAgente().getKmViagem());
        } else {
            System.out.println("| Viagem concluída. Passageiro: " + getAgente().getNome() + ", Km rodados: " + getAgente().getKmRodados() + ", tempo total da viagem: " + getAgente().getTempo() + " minutos.");
            getAgente().SetKmRodados(0);
            getAgente().setTempo(0);
            getAgente().setState(new Parking(getAgente()));
        }

        

    }
    
}
