public class Guitar implements Tools{
    int strings;

    public Guitar(int strings) {
        this.strings = strings;
    }

    @Override
    public void play() {
        System.out.println(strings + " струнная гитара играет");
    }
}
