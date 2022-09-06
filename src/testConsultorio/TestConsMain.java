package testConsultorio;

import consultorio.Paciente;
import consultorio.Medico;

public class TestConsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente paciente1 = new Paciente("José", "Pérez",1.80f,85);
		Paciente paciente2 = new Paciente("Jorge", "Fernández",1.60f,90);
		System.out.println("MEdico:");
		Medico medico1= new Medico ("Daniel", "Lopez", "MEdico de Cabecera");
		medico1.mostrarMedico();
		System.out.println("Pacientes:");
		System.out.printf(paciente1.traerNombreCompleto()+ " IMC: %.2f \n", medico1.calcularIMC(paciente1));
		System.out.printf(paciente2.traerNombreCompleto()+ " IMC: %.2f \n", medico1.calcularIMC(paciente2));
	}

}
