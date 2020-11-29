public class Driver {
    public static void main(String[] args) {
        Model m1 = new Ford(new NoEngine());
        m1.display();
        Model m2 = new Fiat(new NoEngine());
        m2.display();
        Model m3 = new Escourt(new NoEngine());
        m3.display();
    }
}
