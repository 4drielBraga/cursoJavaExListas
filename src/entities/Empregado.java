package entities;

public class Empregado {
	
	private int empId;
	private String empNome;
	private float empSalario;
	
	
	public Empregado(int empId, String empNome, float empSalario) {
		this.empId = empId;
		this.empNome = empNome;
		this.empSalario = empSalario;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpNome() {
		return empNome;
	}


	public void setEmpNome(String empNome) {
		this.empNome = empNome;
	}


	public float getEmpSalario() {
		return empSalario;
	}


	public void setAumentoEmpSalario( float percent) {
		this.empSalario+= empSalario*percent/100;
	}


	@Override
	public String toString() {
		return "Empregado : " + empId + ", - NOme: " + empNome + ", - Salario: " + empSalario + "]";
	}
	
	
	
	
}
