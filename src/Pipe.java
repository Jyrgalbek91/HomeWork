public class Pipe implements Tools{
    String diameter;

    public Pipe(String diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println(diameter + " труба играет");
    }
}
