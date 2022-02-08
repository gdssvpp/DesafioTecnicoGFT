public class Veiculo {
    String marca;
    String modelo;
    String placa;
    String cor;
    String km;
    boolean isLigado;
    int litrosCombustivel;
    int velocidade;
    double preco;

    void status(){
        System.out.print("Carro modelo " + this.modelo);
        System.out.print("\nCarro cor " + this.cor);
        System.out.print("\nCarro marca " + this.marca);
        System.out.print("\nCarro placa " + this.placa);
        System.out.print("\nStatus do carro " + this.isLigado);
        System.out.print("\nValor do Carro " + this.preco);
        System.out.print("\nQuantos km " + this.km);
    }


    void acelerar() {
    }

    void abastecer() {

    }

    void frear() {

    }

    void pintar() {

    }

    void ligar() {

    }

    void desligar() {

    }

}
