public class DeliveringPassenger extends AbstractState {

    public DeliveringPassenger(Motorista motorista) {
        super(motorista);
    }

    @Override 
    public void execute() {
        if (GetMotorista().getKmRodados() < GetMotorista().getKmViagem()) {
            GetMotorista().addKmRodados((int) (10));
        } else {
            System.out.println("Viagem concluída. Passageiro: " + GetMotorista().getNome() + ", Km rodados: " + GetMotorista().getKmRodados());
            GetMotorista().SetKmRodados(0);
            GetMotorista().setState(new Parking(GetMotorista()));
        }
    }
    
}