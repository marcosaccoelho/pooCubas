package AulaCubasExercCalcFopag;

public class Main {

	public static void main(String[] args) {
		
		CalcFopag f1 = new CalcFopag();
		
		f1.setNumDependentes(3);
		f1.setSalarioHora(150);
		f1.setQtdeHorasTrab(40);
		
		f1.calcSalBruto();
		f1.descInss();
		f1.descIR();
		f1.salLiquido();
	}
}
