import javax.swing.JOptionPane;
public class NumbersDialog {
    public static void main(String[] args){
        int creditDays = 30;
        JOptionPane.showMessageDialog(null,"" + creditDays);
        JOptionPane.showMessageDialog(null,"Every bill is due in " + creditDays + " days");
        JOptionPane.showMessageDialog(null, "Hello");
        
        String zimng = JOptionPane.showInputDialog("Are you gay?");
        if ("Yes".equals(zimng) || "yes".equals(zimng)) {
            JOptionPane.showMessageDialog(null, "You are Gay"); 
        }
        else if ("No".equals(zimng) || "no".equals(zimng)) {
            JOptionPane.showMessageDialog(null, "You are not Gay");
        }
        else {
            JOptionPane.showMessageDialog(null,"Are You human?");
        }

        // JOptionPane.showConfirmDialog(null, "Are you Gay?", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION);
    }
}
