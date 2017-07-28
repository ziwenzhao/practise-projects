
public class FlagGetter extends Player{

	public FlagGetter(Field f, int side, String name, int number, String team, char symbol, double x, double y) {
		super(f, side, name, number, team, symbol, x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play(Field field) {
		// TODO Auto-generated method stub
		if (field.getTeam.get(this).equals(new Integer(1))){
			if (pickUpFlag(field)){
				this.speedX=(field.getBase1Position()[0]-x)/Math.hypot(field.getBase1Position()[0]-x, field.getBase1Position()[1]-y)*2;
				this.speedY=(field.getBase1Position()[1]-y)/Math.hypot(field.getBase1Position()[0]-x, field.getBase1Position()[1]-y)*2;
			}
			else
				this.speedX=(field.getFlag2Position()[0]-x)/Math.hypot(field.getFlag2Position()[0]-x, field.getFlag2Position()[1]-y)*2;
				this.speedY=(field.getFlag2Position()[1]-y)/Math.hypot(field.getFlag2Position()[0]-x, field.getFlag2Position()[1]-y)*2;
		}
		else{
			if (pickUpFlag(field)){
				this.speedX=(field.getBase2Position()[0]-x)/Math.hypot(field.getBase2Position()[0]-x, field.getBase2Position()[1]-y)*2;
				this.speedY=(field.getBase2Position()[1]-y)/Math.hypot(field.getBase2Position()[0]-x, field.getBase2Position()[1]-y)*2;
			}
			else {
				this.speedX=(field.getFlag1Position()[0]-x)/Math.hypot(field.getFlag1Position()[0]-x, field.getFlag1Position()[1]-y)*2;
				this.speedY=(field.getFlag1Position()[1]-y)/Math.hypot(field.getFlag1Position()[0]-x, field.getFlag1Position()[1]-y)*2;
			}
		}
	}

	@Override
	public void update(Field field) {
		// TODO Auto-generated method stub
		
	}
	
}
