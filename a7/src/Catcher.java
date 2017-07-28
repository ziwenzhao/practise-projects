import java.util.ArrayList;
import java.util.Random;

public class Catcher extends Player{
	protected Player target;

	public Catcher(Field f, int side, String name, int number, String team, char symbol, double x, double y) {
		super(f, side, name, number, team, symbol, x, y);
		this.speedX = Math.random()*4-2;
	    this.speedY = Math.random()*4-2;
		// TODO Auto-generated constructor stub
	}
	
	public Player findTarget(Field f) {
		if (target==null){
			if(f.getTeam.get(this).equals(new Integer(1))){
				Random random=new Random();
				target=(Player)f.getTeam2().get(random.nextInt(f.getTeam2().size()));
				return target;
			}
			else{
				Random random=new Random();
				target=(Player)f.getTeam1().get(random.nextInt(f.getTeam2().size()));
				return target;
			}
		}else {
			if (f.getTeam.get(this).equals(new Integer(1))){
				if(this.catchOpponent(target, f)){
					ArrayList<Player> notInJail = new ArrayList<Player>();
					for(Entity e:f.getTeam2()){
						Player er=(Player) e;
						if(!er.isInJail(f)){
							notInJail.add(er);
						}
					}
					Random random=new Random();
					target=notInJail.get(random.nextInt(notInJail.size()));
					return target;
					}else return target;
			}else{
				if(this.catchOpponent(target, f)){
					ArrayList<Player> notInJail=new ArrayList<Player>();
					for(Entity e:f.getTeam1()){
						Player er=(Player) e;
						if(!er.isInJail(f)){
							notInJail.add(er);
						}
					}
					Random random=new Random();
					target=notInJail.get(random.nextInt(notInJail.size()));
					return target;
					}else return target;
			}
			
			
		}
			
	}

	@Override
	public void play(Field field) {
		// TODO Auto-generated method stub
		Player b=findTarget(field);
		this.speedX=(b.getX()-x)/Math.hypot(b.getX()-x, b.getY()-y)*2*Math.hypot(b.getSpeedX(), b.getSpeedY());
		this.speedY=(b.getY()-y)/Math.hypot(b.getX()-x, b.getY()-y)*2*Math.hypot(b.getSpeedX(), b.getSpeedY());
		
	}

	@Override
	public void update(Field field) {
		// TODO Auto-generated method stub
		
	}

}
