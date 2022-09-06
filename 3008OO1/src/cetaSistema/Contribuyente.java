package cetaSistema;

public class Contribuyente {
	private int idContribuyente;
	private String apellido;
	private String nombre;
	private long dni;
	private char sexo;
	private String cuil;

	public Contribuyente(int idContribuyente, String apellido, String nombre, long dni, char sexo, String cuil)
			throws Exception {

		this.idContribuyente = idContribuyente;
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.setSexo(sexo);
		this.setCuil(cuil);
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) throws Exception {
		if (!validarSexo(sexo))
			throw new Exception("Error: Sexo invalido");
		this.sexo = sexo;

	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) throws Exception {
		if (!validarCuil(cuil))
			throw new Exception("Error: CUIL invalido");
		this.cuil = cuil;
	}

	public int getIdContribuyente() {
		return idContribuyente;
	}

	public boolean validarCuil(String cuil) {
		// logica con excepcion
		return true;
	}

	public boolean validarSexo(char sexo) {
		return sexo == 'F' || sexo == 'M' || sexo == 'f' || sexo == 'm';
	}
}
