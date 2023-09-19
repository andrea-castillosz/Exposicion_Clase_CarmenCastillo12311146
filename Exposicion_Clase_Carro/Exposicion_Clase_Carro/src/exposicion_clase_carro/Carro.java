/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exposicion_clase_carro;

/**
 *
 * @author casti
 */
public class Carro {
    
    private String modelo;
    private String marca;  
    private String transmision;
    private String motor;
    private String color;
    private String ruedas;
    private String rines;
    private String matricula;  
    private int año;

    public Carro() { //constructor vacio 

    }
    
    public Carro(String modeloN, String marcaN, String transmisionN, String motorN, String colorN, String ruedasN, String rinesN, String matriculaN, int añoN) {
        this.modelo = modeloN;
        this.marca = marcaN;
        this.transmision = transmisionN;
        this.motor = motorN;
        this.color = colorN;
        this.ruedas = ruedasN;
        this.rines = rinesN;
        this.matricula = matriculaN;
        this.año = añoN;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modeloN) {
        this.modelo = modeloN;
    } //modelo
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marcaN) {
        this.marca = marcaN;
    } //marca
    
    
    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmisionN) {
        this.transmision = transmisionN;
    } //transmision
    
    
    public String getMotor() {
        return motor;
    }

    public void setMotor(String motorN) {
        this.motor = motorN;
    } //motor
    
    
    public String getColor() {
        return color;
    }

    public void setColor(String colorN) {
        this.color = colorN;
    } //color
    
    
    public String getRuedas() {
        return ruedas;
    }

    public void setRuedas(String ruedasN) {
        this.ruedas = ruedasN;
    } //ruedas
    
    
    public String getRines() {
        return rines;
    }

    public void setRines(String rinesN) {
        this.rines = rinesN;
    } //rines
    
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matriculaN) {
        this.matricula = matriculaN;
    } //matriculas
    
    
    public int getAño() {
        return año;
    }

    public void setAño(int añoN) {
        this.año = añoN;
    } //año


    
}
