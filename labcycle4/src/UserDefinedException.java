class AuthenticationDeclaration extends Exception {
    public AuthenticationDeclaration(String message) {
        super(message);
    }
}

class UserAuthentication {
    private static final String validUsername = "shaheed";
    private static final String validPassword = "1123";

    public void authenticate(String username, String password) throws AuthenticationDeclaration {
        if (!username.equals(validUsername) || !password.equals(validPassword)) {
            throw new AuthenticationDeclaration("Invalid username or password");
        }
        System.out.println("Authentication successful!");
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        UserAuthentication userAuthentication = new UserAuthentication();
        try {
            userAuthentication.authenticate("shaheed", "1123");
        } catch (AuthenticationDeclaration e) {
            System.out.println("Authentication failed: " + e.getMessage());
        }
    }
}
