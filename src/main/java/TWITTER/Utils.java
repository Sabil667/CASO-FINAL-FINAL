package TWITTER;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Utils {

    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isValidAlias(String alias) {
        // Aquí puedes agregar tus propias reglas de validación para el alias
        // En este ejemplo, simplemente comprobamos que el alias no esté vacío
        return alias != null && !alias.trim().isEmpty();
    }
}