import java.util.Scanner;

public class Base2EncoderDecoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cadena en binario:");
        String cadenaBinaria = scanner.nextLine();

        // Codificación
        String encodedMessage = encodeBinary(cadenaBinaria);
        System.out.println("Mensaje codificado: " + encodedMessage);

        // Decodificación
        String decodedMessage = decodeBinary(encodedMessage);
        System.out.println("Mensaje decodificado: " + decodedMessage);
    }

    public static String encodeBinary(String cadenaBinaria) {
        String alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        StringBuilder encoded = new StringBuilder();
        String[] valores = cadenaBinaria.split(",");
        for (String valor : valores) {
            int indice = Integer.parseInt(valor.trim(), 2);
            encoded.append(alfabeto.charAt(indice));
        }
        return encoded.toString();
    }

    public static String decodeBinary(String encodedMessage) {
        String alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        StringBuilder decoded = new StringBuilder();
        for (int i = 0; i < encodedMessage.length(); i++) {
            char caracter = encodedMessage.charAt(i);
            int indice = alfabeto.indexOf(caracter);
            decoded.append(Integer.toBinaryString(indice)).append(", ");
        }
        // Elimina la coma adicional al final
        decoded.setLength(decoded.length() - 2);
        return decoded.toString();
    }   
}
