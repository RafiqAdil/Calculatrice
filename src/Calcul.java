
public class Calcul {

	private double x,y;
	
	public double addition(){
		return x+y;
	}
	
	public double soustraction(){
		return x-y;
	}
	public double division() throws Exception{
		
			return x/y;
	}
	public double multiplication(){
		return x*y;
	}
	
	public double puissance(){
		return Math.pow(x,y);
	}
	
	public double sinus(){
		return Math.sin(x);
	}
	
	public double cos(){
		return Math.cos(x);
	}
	
	public double tangeante(){
		return Math.tan(x);
	}
	
	public double racineCarree(){
		return Math.sqrt(x);
	}
	
	public double exponentielle(){
		return Math.exp(x);
	}
	
}
