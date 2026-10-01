public class Parking extends AbstractState<Motorista> {

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
            getAgente().setKmPassageiro((int) (Math.random() * 10));
            getAgente().SetKmViagem((int) (Math.random() * 20));
            getAgente().setNome(passageiros[(int) (Math.random() * passageiros.length)]);
            System.out.println("Passageiro encontrado: " + getAgente().getNome() + ", Km da viagem: " + getAgente().getKmPassageiro());
            getAgente().setState(new DrivingToPassenger(getAgente()));
        } else {
            System.out.println("Nenhum passageiro encontrado.");
        }
    }
}
