public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(6);
        Drum drum = new Drum("Огромный");
        Pipe pipe = new Pipe("Хорошая");
        Tools[] tools = {guitar, drum, pipe};
        for (int i = 0; i < tools.length; i++) {
            tools[i].play();
        }
    }
}
