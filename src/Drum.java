public class Drum implements Tools{
    String size;

    public Drum(String size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println(size + " барабан играет");
    }
}
