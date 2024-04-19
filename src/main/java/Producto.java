
/*
 * @(#) Producto.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class Producto {
    private String nombre;
    private double precio;
    private int cantDisponible;

    public Producto(String nombre, double precio, int cantDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantDisponible = cantDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantDisponible() {
        return cantDisponible;
    }

    public void setCantDisponible(int cantDisponible) {
        this.cantDisponible = cantDisponible;
    }


    public void mostrarInfoProduct() {
        System.out.println(
                "nombre='" + nombre + '\'' +
                        ", precio=" + precio +
                        ", cantDisponible=" + cantDisponible
        );
    }
}
