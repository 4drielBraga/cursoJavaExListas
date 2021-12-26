package aplication;

import entities.Empregado;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Programa {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int quantEmpregados;
		int idEmpregado;
		String nomEmpregado;
		float salEmpregado,percAumento;
		Integer verId;
		
		
		List<Empregado> listaEmpregado = new ArrayList<>();
		
		
		System.out.print("Digite a quantidade de empregados: ");
		quantEmpregados = leia.nextInt();	
		
		for(int i=0;i<quantEmpregados;i++) {
			
			
			System.out.printf("Empregado %d \n",i+1);
			
			System.out.printf("Digite o id do empregado: ");
			idEmpregado = leia.nextInt();
			
			System.out.printf("Digite o nome do empregado: ");
			leia.nextLine();
			nomEmpregado = leia.nextLine();
			
			System.out.printf("Digite o salario do empregado: ");
			salEmpregado = leia.nextFloat();
			
			System.out.printf("\n----------------------------\n");
			
			Empregado objEmpregado = new Empregado(idEmpregado,nomEmpregado,salEmpregado);
			
			listaEmpregado.add(objEmpregado);
			
			}
		
		System.out.print("Digite o ID do empregado que tera aumento: ");
		idEmpregado = leia.nextInt();	
		
		verId = verificaFunId(listaEmpregado,idEmpregado );
		
		if(verId == null ) {
			
			System.out.printf("\nID INVALIDO!!\\n");
		}
		else {
			
			System.out.print("Digite o percentual do  aumento: ");
			percAumento = leia.nextFloat();
			
			listaEmpregado.get(verId).setAumentoEmpSalario(percAumento);
			
		}
		
		System.out.printf("\n--------------------------------------------------\n");
		
		
		
		System.out.printf("\nLista de empregados: \n");
		
		for(Empregado objEmpregado : listaEmpregado ) {
			System.out.println(objEmpregado);
		}
		//System.out.printf();
		
		
		
		
		
		leia.close();
	}
	
	public static Integer verificaFunId(List<Empregado> listaEmpregado, int id) {
		
		for(int i = 0; i < listaEmpregado.size(); i ++) {
			if(listaEmpregado.get(i).getEmpId() == id) {
				return i;
			}
		}
		
		return null;
	}
	
					
}
