package sistGestion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Empleado> lstEmpleados;
	private List<Tarea> lstTareas;

	public Sistema() {
		lstEmpleados = new ArrayList<Empleado>();
		lstTareas = new ArrayList<Tarea>();
	}
	
	public List<Empleado> getLstEmpleados() {
		return lstEmpleados;
	}

	public List<Tarea> getLstTareas() {
		return lstTareas;
	}

	@Override
	public String toString() {
		return "Sistema [lstEmpleados=" + lstEmpleados + ",\n lstTareas=" + lstTareas + "]";
	}

	public Tarea traerTarea(int id) {
		int i = 0;
		Tarea t = null;
		while (i < this.lstTareas.size() && t == null) {
			if (lstTareas.get(i).getIdTarea() == id) {
				t = lstTareas.get(i);
			}
			i++;
		}
		return t;
	}

	public Empleado traerEmpleado(String nroLegajo) {
		int i = 0;
		Empleado e = null;
		while (i < this.lstEmpleados.size() && e == null) {
			if (lstEmpleados.get(i).getNroLegajo().equalsIgnoreCase(nroLegajo)) {
				e = lstEmpleados.get(i);
			}
			i++;
		}
		return e;
	}

	public boolean agregarEmpleado(String apellido, String nombre, String nroLegajo, double valorHora) throws Exception {
		if(this.traerEmpleado(nroLegajo)!=null) throw new Exception("Error: El empleado a agregar ya existe");
		Empleado e= new Empleado(nombre, apellido, nroLegajo, valorHora);
		return this.lstEmpleados.add(e);
	}
	
	public boolean agregarTarea(String tarea, LocalDate fechaInicio, LocalDate fechaFin, Empleado
			responsable, int cantHorasDiarias, boolean habil) {
		//falta reutilizar traerTarea pero sobrecargado para buscar por nombre de tarea
		int id=1;
		if(!this.lstTareas.isEmpty()) {
			id= lstTareas.get(lstTareas.size()-1).getIdTarea() +1;
		}
		Tarea t= new Tarea(id, tarea, fechaInicio, fechaFin, responsable, cantHorasDiarias, habil);
		return this.lstTareas.add(t);
	}
}
