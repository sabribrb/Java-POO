package consultorio;

public class Medico {
	private String nombre;
	private String apellido;
	private String especialidad;
	
public Medico(String nombre,String apellido, String especialidad) {
	this.nombre=nombre;
	this.apellido=apellido;
	this.especialidad=especialidad;
}
public float calcularIMC(Paciente paciente) {
	return (paciente.getPeso() / (paciente.getEstatura()*paciente.getEstatura())) ;
}
public void mostrarMedico(){
	System.out.println(this.nombre + " " + this.apellido);
}
}