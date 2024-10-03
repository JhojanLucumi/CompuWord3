package Clases;

import java.util.Date;

public class EmpleadoPermanente extends Empleado {
    private String beneficios;
    private float salarioBase;

    // Constructor
    public EmpleadoPermanente(int id, String nombre, int edad, String sexo, Date fechaContratacion, String beneficios, float salarioBase) {
        super(id, nombre, edad, sexo, fechaContratacion);  // Simplificación del constructor si no tienes departamento
        this.beneficios = beneficios;
        this.salarioBase = salarioBase;
    }

    // Getters y Setters
    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setDetalles(String detalles) {
        // Si no necesitas este metodo, podrías eliminarlo o definirlo correctamente
    }

    // Implementación de metodo abstracto para calcular salario
    @Override
    public double calcularSalario() {
        return salarioBase;  // Retorna el salario base como el cálculo de salario
    }

    // Métodos adicionales
    @Override
    public void crear() {
        System.out.println("Creando empleado permanente: " + getNombre());
    }

    @Override
    public void actualizar(String nombre, int edad, String sexo) {
        setNombre(nombre);
        setEdad(edad);
        setSexo(sexo);
        System.out.println("Empleado Permanente actualizado: " + getNombre());
    }

    @Override
    public void eliminar() {
        System.out.println("Empleado Permanente eliminado: " + getNombre());
    }

    @Override
    public String getDetalles() {
        return "Empleado Permanente - Nombre: " + getNombre() + ", Edad: " + getEdad() + ", Sexo: " + getSexo() +
                ", Beneficios: " + beneficios + ", Salario Base: " + salarioBase;
    }
}
