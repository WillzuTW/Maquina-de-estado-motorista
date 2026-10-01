public class DeliveringPassenger extends AbstractState {

    public DeliveringPassenger(Motorista motorista) {
        super(motorista);
    }

    @Override 
    public void execute() {
        if (Math.random() < 0.50) deliverPassanger();
        else {
            System.out.println("Parece que o motorista está preso no trânsito");
            GetMotorista().setParado(true);
        }
        
    }

    public void deliverPassanger() {
        GetMotorista().setParado(false);
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