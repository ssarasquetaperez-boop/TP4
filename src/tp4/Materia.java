package tp4;

public class Materia {

    static boolean contains(Materia nueva) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void add(Materia nueva) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

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

}
