import java.time.LocalDate;
import java.util.Scanner;

public class paciente {
    private String Nombre;
    private String Tipo_sangre;
    private int Edad;
    private String Ultima_cita;
    private LocalDate Proxima_cita;

    

    public paciente(String nombre, String tipo_sangre, int edad, String ultima_cita, LocalDate proxima_cita) {
        Nombre = nombre;
        Tipo_sangre = tipo_sangre;
        Edad = edad;
        Ultima_cita = ultima_cita;
        Proxima_cita = proxima_cita;
    }




    public String getNombre() {
        return Nombre;
    }




    public void setNombre(String nombre) {
        Nombre = nombre;
    }




    public String getTipo_sangre() {
        return Tipo_sangre;
    }




    public void setTipo_sangre(String tipo_sangre) {
        Tipo_sangre = tipo_sangre;
    }




    public int getEdad() {
        return Edad;
    }




    public void setEdad(int edad) {
        Edad = edad;
    }




    public String getUltima_cita() {
        return Ultima_cita;
    }




    public void setUltima_cita(String ultima_cita) {
        Ultima_cita = ultima_cita;
    }




    public LocalDate getProxima_cita() {
        return Proxima_cita;
    }




    public void setProxima_cita(LocalDate proxima_cita) {
        Proxima_cita = proxima_cita;
    }




    public void Agenda_cita(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("¿Cuando fue su ulima cita?");
            setUltima_cita(sc.nextLine());
        }

        LocalDate fecha = LocalDate.parse(getUltima_cita());
        if(getEdad() >= 25 && getEdad() <= 35){
        fecha = fecha.plusDays(75);
        System.out.println("Su proxima cita sera " + fecha);
        }else if(getEdad() >= 35 && getEdad() <= 45){
            fecha = fecha.plusDays(45);
            System.out.println("Su proxima cita sera " + fecha);
        }else if(getEdad() > 45){
            fecha = fecha.plusDays(15);
            System.out.println("Su proxima cita sera " + fecha);
        }else{
            fecha = fecha.plusDays(90);
            System.out.println("Su proxima cita sera " + fecha);
        }setProxima_cita(fecha);
    

}
}
