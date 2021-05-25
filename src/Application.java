import entities.Carro;

public class Application {
    public static void main(String... args){
        Carro carro = new Carro(4, 5,1,"Gasolina", "Azul",2021, 1234564789);
        carro.imprimeValores();
    }
}
