public class Parking extends AbstractState{

    public Parking(Motorista motorista) {
        super(motorista);
    }

    @Override
    public void enter() {
        System.out.println("Procurando passageiros...");
    }

    @Override 
    public void execute() {
        if (Math.random() < 0.75) {
            String[] passageiros = {"João", "Maria", "Pedro", "Ana", "Lucas"};
            GetMotorista().setKmPassageiro((int) (Math.random() * 10));
            GetMotorista().SetKmViagem((int) (Math.random() * 20));
            GetMotorista().setNome(passageiros[(int) (Math.random() * passageiros.length)]);
            System.out.println("Passageiro encontrado: " + GetMotorista().getNome() + ", Km da viagem: " + GetMotorista().getKmPassageiro());
            GetMotorista().setState(new DrivingToPassenger(GetMotorista()));
        } else {
            System.out.println("Nenhum passageiro encontrado.");
        }
    }
}
