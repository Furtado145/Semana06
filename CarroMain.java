import javax.swing.JOptionPane;
public class CarroMain {
    public static void main(String[] args) {
        String marca = JOptionPane.showInputDialog(null, "Marca:");
        String modelo = JOptionPane.showInputDialog(null, "Modelo:");
        String cor = JOptionPane.showInputDialog(null, "Cor:");
        int anoDeFabricacao = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Ano de fabricação:")
        );
        double preco = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Preço:")
        );
        boolean zero = Boolean.parseBoolean(
            JOptionPane.showInputDialog(null, "Zero? (true/false)")
        );

        Carro carro = new Carro(marca, modelo, cor, anoDeFabricacao, preco, zero);

        String resp = "Marca: " + carro.getMarca() + "\nModelo: " + carro.getModelo()
            + "\nCor: " + carro.getCor() + "\nAno de Fabricação: "
            + carro.getAnoDeFabricacao() + "\nPreço: " + carro.getPreco();
        
        if (carro.getZero()) {
            resp += "\nZero Km: sim";
        } else {
            resp += "\nZero Km: não";
        }

        JOptionPane.showMessageDialog(null, resp);


    }
}