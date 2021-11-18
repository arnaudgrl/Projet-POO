import gui.*;
import java.awt.Color;
import java.awt.Point;
import java.util.*;


public class TestSchelling {

	public static void main(String[] args) {
		Schelling g = new Schelling(10,10,3);
		GUISimulator gui = new GUISimulator (500, 500, Color.BLACK) ;
		gui.setSimulable(new SchellingSimulator (gui,g)) ;
		gui.reset();
		int i,j;
		for (i=0;i<g.grille.length; i++) {
			for (j=0;j<g.grille[i].length ; j++ ) {
				if(g.grille[i][j] == 1){
					gui.addGraphicalElement(new Rectangle(i*10+5,j*10+5, Color.BLUE, Color.BLUE,10));
				}
				else if(g.grille[i][j] == 0){
					gui.addGraphicalElement(new Rectangle(i*10+5,j*10+5, Color.BLACK, Color.BLACK,10));
				}
        else if(g.grille[i][j] == 2){
					gui.addGraphicalElement(new Rectangle(i*10+5,j*10+5, Color.RED, Color.RED,10));
				}
        else if(g.grille[i][j] == 3){
					gui.addGraphicalElement(new Rectangle(i*10+5,j*10+5, Color.GREEN, Color.GREEN,10));
				}
			}
		}
	}
}