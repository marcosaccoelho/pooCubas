
public class UsoAlcOuGas {
	
	public static void main(String[] args) {
		double gas = 3.799;
		double alc = 2.499;
		double rel = alc / gas;
		if(rel < 0.70) 
		{
			System.out.println("Resultado: " + rel);
			System.out.println("Melhor usar alcool!");
		} 
		else
		{
			System.out.println("Melhor usar gasolina");
		}
	}
}
