public class Flag extends Entity{
  
  /* flag does not have any logic yet */
  @Override
  public void play(Field field){
	  if (field.getTeam.get(this).equals(new Integer(1))){
		  for (Entity e: field.getTeam2()){
			  Player er=(Player) e;
			  if (er.pickUpFlag(field)){
				  this.speedX=er.getSpeedX();
				  this.speedY=er.getSpeedY();
				  return;
			  }else{
				  this.speedX=0;
				  this.speedY=0;
			  }
		  }
	  }else{
		  for (Entity e: field.getTeam1()){
			  Player er=(Player) e;
			  if (er.pickUpFlag(field)){
				  this.speedX=er.getSpeedX();
				  this.speedY=er.getSpeedY();
				  return;
			  }else{
				  this.speedX=0;
				  this.speedY=0;
			  }
		  }
		  
	  }
  }
  
  /* flag does not move yet */
  @Override
  public void update(Field field){}
  



  @Override
  public boolean equals(Object o){
    if(this == o){return true;}

    if(o == null){ 
      System.err.println("null equals");
      return false;  
    }

    /* flags are the same if they have the same symbol */
    if(o instanceof Flag && this.getSymbol() == ((Flag)o).getSymbol()){
      return true;
    }
    
    return false;
  }


  public Flag(char symbol, int x, int y){
    super(symbol, x, y);
    speedX = speedY = 0;
  }

  public Flag(Field f, int side, char symbol, int x, int y, String ref){
    super(f, side, symbol, x, y, ref);
    speedX = speedY = 0;
  }
  
}