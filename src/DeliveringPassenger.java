public class DeliveringPassenger extends AbstractState {

    public DeliveringPassenger(Motorista motorista) {
        super(motorista);
    }

    @Override 
    public void execute() {
        deliverPassanger();
    }

    public void deliverPassanger() {
        if (GetMotorista().getKmRodados() < GetMotorista().getKmViagem()) {
            GetMotorista().addKmRodados((int) (Math.random() * 9) + 1);
            if (GetMotorista().getKmRodados() > GetMotorista().getKmViagem()) {
                GetMotorista().SetKmRodados(GetMotorista().getKmViagem());
            }
            System.out.println("Entregando passageiro: " + GetMotorista().getNome() + ", Km rodados: " + GetMotorista().getKmRodados() + "/" + GetMotorista().getKmViagem());
        } else {
            System.out.println("Viagem concluída. Passageiro: " + GetMotorista().getNome() + ", Km rodados: " + GetMotorista().getKmRodados());
            GetMotorista().SetKmRodados(0);
            GetMotorista().setState(new Parking(GetMotorista()));
        }

        

    }
    
}