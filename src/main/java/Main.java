
/*
 * @(#) Main.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class Main {

    public static void main(String[] args) {
        StockProductos stock=new StockProductos(5);

        Producto camisas= new Producto("Camisa",20.99,10);
        Producto pantalones= new Producto("Pantalon",30.99,20);

        stock.agregarProducto(camisas);
        stock.agregarProducto(pantalones);

        stock.mostrarStock();
    }
}
