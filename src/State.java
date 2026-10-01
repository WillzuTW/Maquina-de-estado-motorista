public interface State<A> {
    A getAgente();

    void enter();
    void execute();
    void leave();
}
