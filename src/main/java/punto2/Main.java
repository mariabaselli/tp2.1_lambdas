package punto2;

public class Main {
    public static void main(String[] args) {

        AprendiendoLambdas a = new AprendiendoLambdas();
        a.unMetodo((palabra) -> {
            if (0 == palabra.length() % 2) {
                return true;
            }
            return false;
        });


    }
}
