import java.util.ArrayList;

public class Freeer extends Player{

	public Freeer(Field f, int side, String name, int number, String team, char symbol, double x, double y) {
		super(f, side, name, number, team, symbol, x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play(Field field) {
		// TODO Auto-generated method stub
		if (field.getTeam.get(this).equals(new Integer(1))){
			ArrayList<Entity> teammates=new ArrayList<Entity>();
			for (Entity e:field.getTeam2()){
				teammates.add(e);
			}
			teammates.remove(this);
			for (Entity e:teammates){
				Player er=(Player) e;
				if (er.isInJail(field)){
					this.speedX=(er.getX()-x)/Math.hypot(er.getX()-x, er.getY()-y);
					this.speedY=(er.getY()-y)/Math.hypot(er.getX()-x, er.getY()-y);
					return;
				}
			}
			this.speedX = Math.random()*4-2;
		    this.speedY = Math.random()*4-2;
		}else{
			ArrayList<Entity> teammates=new ArrayList<Entity>();
			for (Entity e:field.getTeam2()){
				teammates.add(e);
			}
			teammates.remove(this);
			for (Entity e: teammates){
				Player er=(Player) e;
				if (er.isInJail(field)){
					this.speedX=(er.getX()-x)/Math.hypot(er.getX()-x, er.getY()-y);
					this.speedY=(er.getY()-y)/Math.hypot(er.getX()-x, er.getY()-y);
					return;
				}
			}
			this.speedX = Math.random()*4-2;
		    this.speedY = Math.random()*4-2;
		}
	}

	@Override
	public void update(Field field) {
		// TODO Auto-generated method stub
		
	}

}
