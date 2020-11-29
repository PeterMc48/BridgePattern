public class Escourt extends Model{

    public Escourt(Engine engine)
    {
        super(engine);
    }

    @Override
    public void display() {
        System.out.println("This is a Escourt Car.");
        engine.getEngine();
    }
}
