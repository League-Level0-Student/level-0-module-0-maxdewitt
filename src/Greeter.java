import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	
String name = JOptionPane.showInputDialog("Type in your name");
JOptionPane.showMessageDialog(null, "Hello " + name + "!");
String age = JOptionPane.showInputDialog("Type in your age");
JOptionPane.showMessageDialog(null, "So you are " + age + " years old!"  );
String hobby = JOptionPane.showInputDialog("Type in your hobby");
JOptionPane.showMessageDialog(null, "So you like to (do) " + hobby + "!");
JOptionPane.showMessageDialog(null, "name + " is " age + " and likes to " + hobby);
}
}
