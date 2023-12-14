package DesignPattern;
import CPIT252Project.login1;
import javax.swing.JOptionPane;

public class loginProxy implements Access {

    private String email;
    private String password;
    private login1 login = new login1();

    @Override
    public void access(String email, String password) {

        login.access(email, password);
        JOptionPane.showMessageDialog(null, "here proxy");

    }

    @Override
    public void checkAccess() {

    }

}
