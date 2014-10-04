package classSix;

public class exerciseOne {

    private String email;

    public exerciseOne(String email) {
        this.email = email;
    }

    public String validarCorreo() {
        String mensaje = "El email no tiene arroba";
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                mensaje = "El correo si tiene arroba";
            }
        }
        return mensaje;
    }

}
