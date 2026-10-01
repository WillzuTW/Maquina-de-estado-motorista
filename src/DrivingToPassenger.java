public class DrivingToPassenger extends AbstractState<Motorista> {

    public DrivingToPassenger(Motorista motorista) {
        super(motorista);
    }

    @Override 
    public void execute() {
        if (Math.random() < 0.75) DrivingPassenger();
        else {
            System.out.println("Parece que o motorista está preso no trânsito");
            getAgente().setParado(true);
        }
    }
    
    @Override 
    public void exit() {
        System.out.println("Dirigindo até o destino: " + getAgente().getKmViagem() + " km.");
    }

    public void DrivingPassenger() {
        getAgente().setParado(false);
        if (getAgente().getKmRodados() < getAgente().getKmPassageiro()) {
            getAgente().addKmRodados((int) (Math.random() * 9) + 1);
            if (getAgente().getKmRodados() > getAgente().getKmPassageiro()) {
                getAgente().SetKmRodados(getAgente().getKmPassageiro());
            }
            System.out.println("Dirigindo até o passageiro: " + getAgente().getNome() + ", Km rodados: " + getAgente().getKmRodados() + "/" + getAgente().getKmPassageiro());
        } else {
            System.out.println("Passageiro: " + getAgente().getNome() + " entrou no carro.");
            getAgente().SetKmRodados(0);
            getAgente().setState(new DeliveringPassenger(getAgente()));
        }
    } 
}
