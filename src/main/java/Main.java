import java.util.Date;

public class Main {
    public static void main(String[] args) {
        FullStack devF = new FullStack();
        devF.developGUI();
        devF.developServer();

        Developer dev = new Frontender();
        ((FrontAction) dev).developGUI();
    }
}
