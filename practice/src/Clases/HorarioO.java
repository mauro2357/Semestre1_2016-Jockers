package Clases;

public class HorarioO{
		public String horario_nombre;
		public String horario_inicio;
		public String horario_fin;
		
		public String getHorario_nombre() {
			return horario_nombre;
		}
		public void setHorario_nombre(String horario_nombre) {
			this.horario_nombre = horario_nombre;
		}
		public String getHorario_inicio() {
			return horario_inicio;
		}
		public void setHorario_inicio(String horario_inicio) {
			this.horario_inicio = horario_inicio;
		}
		public String getHorario_fin() {
			return horario_fin;
		}
		public void setHorario_fin(String horario_fin) {
			this.horario_fin = horario_fin;
		}
		public HorarioO(String horario_nombre, String horario_inicio, String horario_fin){
			this.horario_nombre=horario_nombre;
			this.horario_inicio=horario_inicio;
			this.horario_fin=horario_fin;
		}	
	}	



