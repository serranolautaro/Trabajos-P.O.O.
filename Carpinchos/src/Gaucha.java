public class Gaucha extends Canasta{
	
	private int yerba;

	public int cache()
	{
		
		return 100;
	}
	
	public boolean tomanMateTodoElDia()
	{
		if(getAgua() > 5 && getYerba() > 2)
		{
			return true;
		}
		return false;
	}
	
	public int getYerba() {
		return yerba;
	}

	public void setYerba(int yerba) {
		this.yerba = yerba;
	}
	
	

}
