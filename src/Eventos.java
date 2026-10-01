public class Eventos extends AbstractState<Casualidades> {
    public Eventos(Casualidades agente) {
        super(agente);
    }

    public void execute() {
        getAgente().printStats("Eventos");
        if (getAgente().getSorteado() == false) {
            getAgente().setOpcao((int) (Math.random() * 3));
            getAgente().setSorteado(true);
        }

        switch (getAgente().getOpcao()) {
            case 0:
                definir_tempo(1);
                Pedestre_passando();
                break;
            case 1:
                definir_tempo((int) (Math.random() * 3) + 2);
                acidente();
                break;
            case 2:
                definir_tempo((int) (Math.random() * 3) + 1);
                sinal_fechado();
                break;
        }
        System.out.println("+--------------------------------------------");
    }
    
    public void definir_tempo(int tempo) {
        if (getAgente().getTempo_definido() == false) {
            getAgente().setTempoParado(tempo);
            getAgente().setTempo_definido(true);
        }
    }

    public void acidente() {
        if (getAgente().getTempoParado() > 0) {
            getAgente().DecreaseTempoParado(1);
            System.out.println("| Evento: Acidente de carro. Motorista parado.");
            System.out.println("| Tempo restante para voltar a dirigir: " + getAgente().getTempoParado() + " minutos.");
        } else {
            System.out.println("| O motorista já pode voltar a dirigir.");
            getAgente().setSorteado(false);
            getAgente().setTempo_definido(false);
            getAgente().getMotoristas().setParado(false);
            getAgente().setState(new Observando(getAgente()));
        }
    }

    public void sinal_fechado() {
        if (getAgente().getTempoParado() > 0) {
            getAgente().DecreaseTempoParado(1);
            System.out.println("| Evento: Sinal fechado. Motorista parado.");
            System.out.println("| Tempo restante para voltar a dirigir: " + getAgente().getTempoParado() + " minutos.");
        } else {
            System.out.println("| O motorista já pode voltar a dirigir.");
            getAgente().setSorteado(false);
            getAgente().setTempo_definido(false);
            getAgente().getMotoristas().setParado(false);
            getAgente().setState(new Observando(getAgente()));
        }
    }

    public void Pedestre_passando() {
        if (getAgente().getTempoParado() > 0) {
            getAgente().DecreaseTempoParado(1);
            System.out.println("| Evento: Pedestre atravessando a rua. Motorista parado.");
            System.out.println("| Tempo restante para voltar a dirigir: " + getAgente().getTempoParado() + " minutos.");
        } else {
            System.out.println("| O motorista já pode voltar a dirigir.");
            getAgente().setSorteado(false);
            getAgente().setTempo_definido(false);
            getAgente().getMotoristas().setParado(false);
            getAgente().setState(new Observando(getAgente()));
        }
    }
}
