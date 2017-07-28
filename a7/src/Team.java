
public class Team {
	public Team(Field theField, int numFlagGetters, int numCatchers,int numFreeers, int numYourPlayer) {
		// TODO Auto-generated constructor stub
		int side;
		String name;
		int number;
		String team;
		char symbol;
		double x;
		double y;
		if (theField.getTeam1().size()==0){
			side=1;
			name="Cat van Kittenish";
			number=12;
			team="blues";
			symbol='b';
			x=Math.random()*400+10;
			y=Math.random()*500+10;
		}else {
			side=2;
			name="Bunny El-Amin";
			number=7;
			team="red";
			symbol='r';
			x=Math.random()*400+410;
			y=Math.random()*500+10;
			}
		
		Player p;
		int i;
		for (i=0;i<numFlagGetters;i+=1){
			p=new FlagGetter(theField, side, name, number, team, symbol, x, y);
		}
		for (i=0;i<numCatchers;i+=1){
			p=new Catcher(theField, side, name, number, team, symbol, x, y);
		}
		for (i=0;i<numFreeers;i+=1){
			p=new Freeer(theField, side, name, number, team, symbol, x, y);
		}
		for (i=0;i<numYourPlayer;i+=1){
			p=new Stopping(theField, side, name, number, team, symbol, x, y);
		}
	}
}
