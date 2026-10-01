import java.util.ArrayList;
import java.util.List;

public class Main {
    private final List<Agente> agentes = new ArrayList<>();

    public void run() {
        Motorista motorista = new Motorista();
        Motorista motorista2 = new Motorista();
        Casualidades casualidades = new Casualidades(motorista);
        Casualidades casualidades2 = new Casualidades(motorista2);  
        agentes.add(motorista);
        agentes.add(motorista2);
        agentes.add(casualidades);
        agentes.add(casualidades2);
        while (true) {
            for (Agente a : agentes) {
                a.update();
            }
            System.out.println();
            System.out.println("=============================================");
            System.out.println();

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
