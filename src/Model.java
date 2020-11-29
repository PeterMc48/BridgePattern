public abstract class Model {
    protected Engine engine;

    public Model(Engine engine){
        this.engine = engine;
    }
    abstract public void display();
}
