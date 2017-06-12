package py.pol.una.ii.pw.model;

/**
 * Created by juanry on 11/06/17.
 */
public class Clientes {
    private Long idCliente;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String emial;

    public Clientes(Long idCliente, String nombre, String apellido, String direccion, String telefono, String emial) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.emial = emial;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }
}
