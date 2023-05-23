/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WS;

/**
 *
 * @author chris
 */

public class Usuario {
    private String nombreUsuario;
    private String clave;
    private String repclave;
    private float saldoinicial;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, String clave, String repclave, float saldoinicial) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.repclave = repclave;
        this.saldoinicial = saldoinicial;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRepclave() {
        return repclave;
    }

    public void setRepclave(String repclave) {
        this.repclave = repclave;
    }

    public float getSaldoinicial() {
        return saldoinicial;
    }

    public void setSaldoinicial(float saldoinicial) {
        this.saldoinicial = saldoinicial;
    }
    
    
}
