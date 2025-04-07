package punto2;

public class Main {
    public static void main(String[] args) {

        AprendiendoLambdas a = new AprendiendoLambdas();

        a.unMetodo((palabra) -> 0 == palabra.length() % 2);

        a.unMetodo((String otraPalabra) -> {
            char variable = otraPalabra.charAt(0);
            return Character.isLowerCase(variable);
        });
    }
}
