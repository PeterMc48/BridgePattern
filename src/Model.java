public abstract class Model {
    protected Engine engine;
    protected Type t;

    public Model(Engine engine,Type t){
        this.engine = engine;
        this.t = t;
    }
    abstract public void display();
}
