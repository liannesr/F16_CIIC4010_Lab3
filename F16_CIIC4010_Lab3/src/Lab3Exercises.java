import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		
		
		JFrame myFrame = new JFrame("Lianne Sanchez");
		MyPanelClass myPanel = new MyPanelClass();
		myFrame.getContentPane().add(myPanel);
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		myFrame.setLocation(850, 400);
		
		myFrame.setSize(200, 200);
		
		myFrame.setVisible(true);
		
        
	}
}