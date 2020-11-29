public class Escourt extends Model{

    public Escourt(Engine engine, Type t)
    {
        super(engine, t);
    }

    @Override
    public void display() {
        System.out.println("This is a Escourt Car.");
        engine.getEngine();
    }
}
