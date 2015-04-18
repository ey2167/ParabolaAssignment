import java.awt.Dimension;

import javax.swing.JFrame;


public class Paraboladriver {
public static void main(String[]args){
	/**
	 * creating object parabola to test
	 */
	JFrame frame = new JFrame();
	frame.add(new Parabola());
	frame.setTitle("Parabola");
	/**
	 * setting visible to true and setting the size of the graph
	 */
	frame.setVisible(true);
	frame.setSize(new Dimension(300,300));
	
}
}
