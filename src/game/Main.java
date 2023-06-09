package game;

import javax.swing.JFrame;

public class Main extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public Main() {
		this.setTitle("CLONE ZELDA");
		this.setResizable(false);
		
		
		
		this.setSize(GameComponent.screenROW*GameComponent.tileSize,GameComponent.screenCOL*GameComponent.tileSize);
		this.setLocation(300,100);
		
		this.add(new GameComponent());
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
