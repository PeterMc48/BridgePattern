public class Fiat extends Model{

    public Fiat(Engine engine, Type t)
    {
        super(engine, t);
    }

    @Override
    public void display() {
        System.out.println("This is a Fiat Car.");
        engine.getEngine();
    }
}
