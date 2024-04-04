
public class Cheta extends Canasta{
	
	private int jamon;
	
	public int cache() {
		
		return 100-getAgua();
	}
	
	public boolean tomanMateTodoElDia()
	{
		return false;
	}


	public int getJamon() {
		return jamon;
	}

	public void setJamon(int jamon) {
		this.jamon = jamon;
	}
	
	

}
