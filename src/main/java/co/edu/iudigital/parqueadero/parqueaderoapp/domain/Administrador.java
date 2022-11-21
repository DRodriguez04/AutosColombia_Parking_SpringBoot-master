package co.edu.iudigital.parqueadero.parqueaderoapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "administrador")
public class Administrador {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(unique = true)
    @NotNull
    private int di_administrador;
    
    @NotNull
    private String nombre;
    
    @NotNull
    private String apellido;

    @NotNull
    private String gestionar;

    @JoinColumn(name = "FK", referencedColumnName = "PK estatus")
    private int id_estatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDi_administrador() {
        return di_administrador;
    }

    public void setDi_administrador(int di_administrador) {
        this.di_administrador = di_administrador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGestionar() {
        return gestionar;
    }

    public void setGestionar(String gestionar) {
        this.gestionar = gestionar;
    }

    public int getId_estatus() {
        return id_estatus;
    }

    public void setId_estatus(int id_estatus) {
        this.id_estatus = id_estatus;
    }

}
