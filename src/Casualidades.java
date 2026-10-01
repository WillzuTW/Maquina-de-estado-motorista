import java.util.ArrayList;
import java.util.List;

public class Casualidades implements Agente {

    private State<Casualidades> state = new Observando(this);
    private final List<Motorista> motoristas;

    public List<Motorista> getMotoristas() {
        return motoristas;
    }
    
    public Casualidades(List<Motorista> motoristas) {
        this.motoristas = motoristas;
    }

    public void printStats(String state) {
        System.out.println("Estado atual: " + state);
    }

    public void update() {
        state.execute();
    }

    public void setState(State state) {
        this.state.exit();
        this.state = state;
        this.state.enter();
    }
}
