public class Carro{
    private String marca;
    private String modelo;
    private String cor;
    private int anoDeFabricacao;
    private double preco;
    private boolean zero;

    public Carro(String mc, String md, String c, int a, double p, boolean z) {
        marca = mc;
        modelo = md;
        cor = c;
        anoDeFabricacao = a;
        preco = p;
        zero = z;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getCor() {
        return cor;
    }
    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }
    public double getPreco() {
        return preco;
    }
    public boolean getZero() {
        return zero;
    }

    public void setMarca(String mc) {
        marca = mc;
    }
    public void setModelo(String md) {
        modelo = md;
    }
    public void setCor(String c) {
        cor = c;
    }
    public void setAnoDeFabricacao(int a) {
        anoDeFabricacao = a;
    }
    public void setPreco(double p) {
        preco = p;
    }
    public void setZero(boolean z) {
        zero = z;
    }
}