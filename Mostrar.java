import java.util.LinkedList;

public class Mostrar {
    
    public void Lista (LinkedList <paciente> Listapaciente){
        String cadena = "";

        for (paciente C : Listapaciente) {
            cadena = cadena + C.getNombre() + "\n" + C.getTipo_sangre() + "\n" + C.getEdad() + "\n" +
            C.getUltima_cita() + "\n" + C.getProxima_cita();
        }
        System.out.println(cadena);

    }
}
