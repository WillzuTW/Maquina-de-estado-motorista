import java.util.ArrayList;
import java.util.List;

public class Main {
    private final List<Agente> agentes = new ArrayList<>();

    public void run() {
        Motorista motorista = new Motorista();
        agentes.add(motorista);

        while (true) {
            for (Agente a : agentes) {
                a.update();
            }
            System.out.println("-----");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
