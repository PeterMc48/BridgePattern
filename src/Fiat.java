public class Fiat extends Model{

    public Fiat(Engine engine)
    {
        super(engine);
    }

    @Override
    public void display() {
        System.out.println("This is a Fiat Car.");
        engine.getEngine();
    }
}
