public class DeliveringPassenger extends AbstractState<Motorista> {

    public DeliveringPassenger(Motorista agente) {
        super(agente);
    }

    @Override 
    public void execute() {
        System.out.println("_______");
        getAgente().printStats("DeliveringPassenger");
        if (Math.random() < 0.75 && getAgente().getParado() == false) deliverPassanger();
        else {
            System.out.println("Parece que o motorista está preso no trânsito");
            getAgente().setParado(true);
        }
        System.out.println("_______");
    }

    public void deliverPassanger() {
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