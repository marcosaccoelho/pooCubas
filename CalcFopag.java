package AulaCubasExercCalcFopag;

public class CalcFopag {

	int qtdeHorasTrab;
	double salarioHora;
	int numDependentes;
	double salBruto;
	double inss;
	double IR;
	double salLiq;
	
	public CalcFopag() {
		
	}

	public int getQtdeHorasTrab() {
		return qtdeHorasTrab;
	}

	public void setQtdeHorasTrab(int qtdeHorasTrab) {
		this.qtdeHorasTrab = qtdeHorasTrab;
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}

	public int getNumDependentes() {
		return numDependentes;
	}

	public void setNumDependentes(int numDependentes) {
		this.numDependentes = numDependentes;
	}
	
	
	
	
	public double getSalLiq() {
		return salLiq;
	}

	public void setSalLiq(double salLiq) {
		this.salLiq = salLiq;
	}

	public double getInss() {
		return inss;
	}

	public void setInss(double inss) {
		this.inss = inss;
	}

	public double getIR() {
		return IR;
	}

	public void setIR(double iR) {
		this.IR = iR;
	}

	public double getSalBruto() {
		return salBruto;
	}

	public void setSalBruto(double salBruto) {
		this.salBruto = salBruto;
	}

	public void calcSalBruto() {
		this.setSalBruto(this.getQtdeHorasTrab() * this.getSalarioHora() + (50 * this.getNumDependentes()));
		System.out.println("Salário Bruto: $" + this.getSalBruto());
	}
	
	public void descInss() {
		if(this.getSalBruto() <= 1000) {
			this.setInss(this.salBruto * 0.085);
		} else {
			this.setInss(this.salBruto * 0.09);
		}
		System.out.println("INSS: $" + this.getInss());
	}
	
	public void descIR() {
		if(this.getSalBruto() <= 500) {
			this.setIR(0);
		} else if(this.getSalBruto() > 500 && this.getSalBruto() <= 1000) {
			this.setIR(this.getSalBruto() * 0.05);
		} else {
			this.setIR(this.getSalBruto() * 0.07);
		}
		System.out.println("Desconto IR: $" + this.getIR());
	}
	
	public void salLiquido() {
		this.setSalLiq(this.getSalBruto() - this.getInss() - this.getIR());
		System.out.println("Salario Liquido: $" + this.getSalLiq());
	}
	
	
	
}
