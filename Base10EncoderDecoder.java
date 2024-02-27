import java.util.Scanner;

public class Base10EncoderDecoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cadena en base 10:");
        String cadena = scanner.nextLine();

        // Codificación
        String encodedMessage = encodeBase10(cadena);
        System.out.println("Mensaje codificado: " + encodedMessage);

        // Decodificación
        String decodedMessage = decodeBase10(encodedMessage);
        System.out.println("Mensaje decodificado: " + decodedMessage);
    }

    public static String encodeBase10(String cadena) {
        String alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        StringBuilder encoded = new StringBuilder();
        String[] valores = cadena.split(",");
        for (String valor : valores) {
            int indice = Integer.parseInt(valor.trim());
            encoded.append(alfabeto.charAt(indice));
        }
        return encoded.toString();
    }

    public static String decodeBase10(String encodedMessage) {
        String alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        StringBuilder decoded = new StringBuilder();
        for (int i = 0; i < encodedMessage.length(); i++) {
            char caracter = encodedMessage.charAt(i);
            int indice = alfabeto.indexOf(caracter);
            decoded.append(indice).append(", ");
        }
        // Elimina la coma adicional al final
        decoded.setLength(decoded.length() - 2);
        return decoded.toString();
    }
}
