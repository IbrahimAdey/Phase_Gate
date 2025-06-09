import java.util.Map;

public class CardValidator {
    public static Map<String, Object> validate(char[] cardArray) {
        String cardNumber = new String(cardArray);

        if (!cardNumber.matches("\\d+")) {
            return Map.of("valid", false, "reason", "invalid characters");
        }

        int length = cardNumber.length();
        char firstDigit = cardNumber.charAt(0);

        if (length == 16 && firstDigit == '37') {
            return Map.of("valid", true, "issuer", "American Express");
        }

        if (length == 16) {
            switch (firstDigit) {
                case '4': return Map.of("valid", true, "issuer", "Visa Card");
                case '5': return Map.of("valid", true, "issuer", "MasterCard");
                case '6': return Map.of("valid", true, "issuer", "Discover Card");
            }
        }

        if (length != 15 && length != 16) {
            return Map.of("valid", false, "reason", "invalid length");
        }

        return Map.of("valid", false, "reason", "invalid start digit");
    }
}