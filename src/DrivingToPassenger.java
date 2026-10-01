public class DrivingToPassenger extends AbstractState {

    public DrivingToPassenger(Motorista motorista) {
        super(motorista);
    }

    @Override 
    public void execute() {
        if (Math.random() < 0.50) DrivingPassenger();
        else {
            System.out.println("Parece que o motorista está preso no trânsito");
            GetMotorista().setParado(true);
        }
    }
    
    @Override 
    public void exit() {
        System.out.println("Dirigindo até o destino: " + GetMotorista().getKmViagem() + " km.");
    }

    public void DrivingPassenger() {
        GetMotorista().setParado(false);
        if (GetMotorista().getKmRodados() < GetMotorista().getKmPassageiro()) {
            GetMotorista().addKmRodados((int) (Math.random() * 9) + 1);
            if (GetMotorista().getKmRodados() > GetMotorista().getKmPassageiro()) {
                GetMotorista().SetKmRodados(GetMotorista().getKmPassageiro());
            }
            System.out.println("Dirigindo até o passageiro: " + GetMotorista().getNome() + ", Km rodados: " + GetMotorista().getKmRodados() + "/" + GetMotorista().getKmPassageiro());
        } else {
            System.out.println("Passageiro: " + GetMotorista().getNome() + " entrou no carro.");
            GetMotorista().SetKmRodados(0);
            GetMotorista().setState(new DeliveringPassenger(GetMotorista()));
        }
    } 
}
