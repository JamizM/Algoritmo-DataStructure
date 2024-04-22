package Fila;

public class Carro {
    private String placa;
    private int anoFabricacao;

    public Carro(String placa, int anoFabricacao) {
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
    }


    public String getPlaca() {
        return placa;
    }


    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public int getAnoFabricacao() {
        return anoFabricacao;
    }


    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }


    @Override
    public String toString() {
        return "[placa=" + placa + ", anoFabricacao=" + anoFabricacao + "]";
    }

    
}
