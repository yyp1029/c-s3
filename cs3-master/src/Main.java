import data.Data;
import presentation.Presentation;

public class Main {
    public static void main(String[] args) {
        Presentation presentation = new Presentation();
        Data.init();

        presentation.start();
    }
}
