import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * 
 *Elohe Yonas
 *CSC201
 */

public class Parabola extends JPanel{
	Polygon p = new Polygon();
	public void paint(Graphics g){
		double scalefactor = 0.1;
		 
		/**
		 * setting the equation for the parabola
		 */
		for(int x= -100; x<=100; x++){
			p.addPoint(x+200, 200-(int)(scalefactor*x*x));
		}
		
		/**
		 * drawing the parabola given the equation above
		 */
		g.drawPolyline(p.xpoints,p.ypoints, p.npoints);
		/**
		 * setting lines for the graph
		 */
		g.drawLine(150, -500, 150, 500);
		g.drawLine(-500, 150, 500, 150);
		/**
		 * drawing out the line
		 */
		
	}	

	
	
}

