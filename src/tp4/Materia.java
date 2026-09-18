package tp4;


public class Materia {

    int idMateria;
    String nombreDeMateria;
    int anio;

    public Materia(int idMateria, String nombreDeMateria, int anio) {
        this.idMateria = idMateria;
        this.nombreDeMateria = nombreDeMateria;
        this.anio = anio;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombreDeMateria() {
        return nombreDeMateria;
    }

    public void setNombreDeMateria(String nombreDeMateria) {
        this.nombreDeMateria = nombreDeMateria;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return idMateria + "-" + nombreDeMateria + "-" + anio;
    }
    
}
