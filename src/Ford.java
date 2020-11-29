public class Ford extends Model{

    public Ford(Engine engine, Type t)
    {
        super(engine, t);

    }

    @Override
    public void display() {
        System.out.println("This is a Ford Car.");
        engine.getEngine();
        t.getType();
    }

}
