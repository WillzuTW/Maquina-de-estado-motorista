public interface Agente {
    void printStats(String state);
    void update();
    void setState(State<Agente> state);
}
