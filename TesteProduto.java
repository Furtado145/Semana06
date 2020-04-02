import javax.swing.JOptionPane;

public class TesteProduto {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Nome:");
        double preco = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Valor:")
        );
        int quantidade = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Quantidade em estoque:")
        );

        Produto produto = new Produto(nome, preco, quantidade);

        String resp = "Produto: " + produto.getNome() + "\nValor unitario:";
        resp += produto.getPreco() + "\nQtd. em estoque: " + produto.getQuantidade() + " unidades.";
    
        JOptionPane.showMessageDialog(null, resp, "Cadastro de Produtos", JOptionPane.INFORMATION_MESSAGE);
    }
}