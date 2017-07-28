
public class Stopping extends Player{

	public Stopping(Field f, int side, String name, int number, String team, char symbol, double x, double y) {
		super(f, side, name, number, team, symbol, x, y);
		this.speedX = Math.random()*4-2;
	    this.speedY = Math.random()*4-2;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play(Field field) {
		// TODO Auto-generated method stub
		
		if (x<=field.minX || x>=field.maxX-sprite.getWidth() || y<=field.minY || y>=field.maxY-sprite.getHeight()){
			this.speedX=0;
			this.speedY=0;
		}
		
	}

	@Override
	public void update(Field field) {
		// TODO Auto-generated method stub
		
	}

}
