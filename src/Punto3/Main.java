package Punto3;

public class Main {
    
    public static void main(String[] args) {
        //Creación de las llantas
        
        Llanta[] Llantas = new Llanta[4];
        Llantas[0] = new Llanta();
        Llantas[1] = new Llanta();
        Llantas[2] = new Llanta();
        Llantas[3] = new Llanta();
        
        /*Cuatro llantas iguales, objetos diferentes pero con los mismos valores 
        en los atributos.*/
        
        for(int i=0;i<4;i++){
            Llantas[i].setMarca("BridgeStone");
            Llantas[i].setModelo("Rin16");
            Llantas[i].setTamañoPulgadas(22);
        }
        
        //Creación de las puertas
        
        Puerta[] Puertas = new Puerta[2];
        Puertas[0] = new Puerta();
        Puertas[1] = new Puerta();
        
        Puertas[0].setTipo("Murcielago");
        Puertas[1].setTipo("Murcielago");

        //Creación del motor
        
        Motor Motor = new Motor();
        Motor.setNumeroSerie("5d47er8ws1");
        Motor.setCilindros(4);
        
        //Creación del automovil
        
        Automovil Carro = new Automovil(Llantas, Puertas, Motor);
        Carro.setMarca("Chevrolet");
        Carro.setAño(2015);
        Carro.setModelo("Cruze");
    }
    
}
