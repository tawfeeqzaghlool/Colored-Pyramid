// This program draws three colored pyramid figures

import java.awt.*;

public class Pyramids {

	public static final int SIZE = 100;
	
	public static void main(String[] args) {
		
		DrawingPanel panel = new DrawingPanel (350, 250);
		Graphics g = panel.getGraphics();
		
		drawPyramid(g, Color.WHITE, 0, 0, 10);
		drawPyramid(g, Color.RED, 125, 75, 5);
		drawPyramid(g, Color.BLUE, 249, 149, 20);

	}
	/* draws one pyramid figure with the given number of stairs
	 * at the given (x,y) position, with the given color 
	 */
	
	public static void drawPyramid(Graphics g, Color c, int x, 
					int y, int stairs){
	
		// draws the border rectangle 
		g.drawRect(x, y, SIZE, SIZE);
		
		// draws the stairs of the pyramid
		
		for (int i = 0; i < stairs; i++){
		
			int stairHeight = SIZE / stairs;
			int stairWidth = stairHeight * (i + 1);
			int stairx = x + (SIZE - stairWidth)/2;
			int stairy = y + stairHeight * i;
			
			// fills the rectangle with the fill colors
			
			g.setColor(c);
			g.fillRect(stairx, stairy, stairWidth, stairHeight);
			
			// draws the black rectangle outlines
			
			g.setColor(Color.BLACK);
			g.drawRect(stairx, stairy, stairWidth, stairHeight);
		}
	}

}
