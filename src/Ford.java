public class Ford extends Model{

    public Ford(Engine engine)
    {
        super(engine);
    }

    @Override
    public void display() {
        System.out.println("This is a Ford Car.");
        engine.getEngine();
    }

}
