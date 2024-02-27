import java.util.Scanner;

public class Base10EncoderDecoder {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el mensaje en base 10: ");
        String message = scanner.nextLine();

        //Codificacion
        String encodedMessage = encodeBase10(message);
        System.out.println("Mensaje codificado en base 10: "+encodedMessage);

        //Decodificacion
        String decodedMessage = decodeBase10(encodedMessage);
        System.out.println("Mensaje decodificado en base 10: "+decodedMessage);

    }

    public static String encodeBase10(String message) {
        StringBuilder encoded = new StringBuilder();
        for(char c : message.toCharArray()){
            //con el (int) fuerzo al char a convertirse en un entero
            int ascii = (int) c;
            encoded.append(ascii).append(" ");           
        }
        //Con el .trim elimino los espacios en blanco inciales y finales
        return encoded.toString().trim();
    }

    public static String decodeBase10(String encodedMessage){
        StringBuilder decoded = new StringBuilder();
        String[] parts = encodedMessage.split(" ");
        for(String part : parts){
            int ascii = Integer.parseInt(part);
            decoded.append((char) ascii);
        }
        return decoded.toString();
    }
}