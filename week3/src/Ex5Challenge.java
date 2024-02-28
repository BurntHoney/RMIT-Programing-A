import javax.swing.JOptionPane;

public class Ex5Challenge {
    public static void main(String[] args) {
        String firstName = JOptionPane.showInputDialog("Enter your first name");
        String lastName = JOptionPane.showInputDialog("Enter your last name");
        JOptionPane.showMessageDialog(null, String.format("Hello my name is %s %s", firstName, lastName));
    }
}
