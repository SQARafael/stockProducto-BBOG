
/*
 * @(#) StockProductos.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class StockProductos {
    private Producto[] productos;
    private int cantProductos;
    private  final int capacidaMax;

    public StockProductos(int capacidaMax) {
        this.capacidaMax = capacidaMax;
        productos= new Producto[capacidaMax];
        cantProductos=0;

    }

    public void agregarProducto(Producto producto){
        if(cantProductos<capacidaMax){
            productos[cantProductos]=producto;
            cantProductos++;
            System.out.println("El producto se agregó satisfactoriamente!");
        }else{
            System.out.println("No se puede agregar mas productos");
        }
    }

    public void mostrarStock(){
        System.out.println("Stock de productos: ");
        for (int i=0; i<cantProductos;i++){
            System.out.println("producto # "+ (i+1));;
            productos[i].mostrarInfoProduct();
            System.out.println();
        }
    }
}
