public class Parking extends AbstractState<Motorista> {

    public Parking(Motorista agente) {
        super(agente);
    }

    @Override
    public void enter() {
        System.out.println("_______");
        getAgente().printStats("Parking");
        System.out.println("Procurando passageiros...");
        System.out.println("_______");
    }

    @Override 
    public void execute() {
        System.out.println("_______");
        getAgente().printStats("Parking");
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
        System.out.println("_______");
    }

}
