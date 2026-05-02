package pe.edu.ulima.is2.lab2.Ejer1.corrected;

import java.util.regex.Pattern;

public class UserValidator {

    public boolean validateUser(User usuario){
        String name = usuario.getName();
        String userType = usuario.getUserType();

        if (name == null || name.trim().isEmpty()) {
            return false;
        }
        if (usuario.getEmail() == null || !isValidEmail(usuario.getEmail())) {
            return false;
        }
        return userType != null && (userType.equals("PREMIUM")
                || userType.equals("REGULAR") || userType.equals("VIP"));
    }

    private boolean isValidEmail(String email) {
        return Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$").matcher(email).matches();
    }


}
