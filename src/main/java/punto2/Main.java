package punto2;

public class Main {
    public static void main(String[] args) {

        unMetodo((String c) -> {
            if (c.length() % 2 == 0) {
                return true;
            }
            return false;
        });
    }
}
