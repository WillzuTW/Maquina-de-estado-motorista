public class DeliveringPassenger extends AbstractState<Motorista> {

    public DeliveringPassenger(Motorista agente) {
        super(agente);
    }

    @Override 
    public void execute() {
        if (Math.random() < 0.75) deliverPassanger();
        else {
            System.out.println("Parece que o motorista está preso no trânsito");
            getAgente().setParado(true);
        }
        
    }

    public void deliverPassanger() {
        getAgente().setParado(false);
        if (getAgente().getKmRodados() < getAgente().getKmViagem()) {
            getAgente().addKmRodados((int) (Math.random() * 9) + 1);
            if (getAgente().getKmRodados() > getAgente().getKmViagem()) {
                getAgente().SetKmRodados(getAgente().getKmViagem());
            }
            System.out.println("Entregando passageiro: " + getAgente().getNome() + ", Km rodados: " + getAgente().getKmRodados() + "/" + getAgente().getKmViagem());
        } else {
            System.out.println("Viagem concluída. Passageiro: " + getAgente().getNome() + ", Km rodados: " + getAgente().getKmRodados());
            getAgente().SetKmRodados(0);
            getAgente().setState(new Parking(getAgente()));
        }

        

    }
    
}