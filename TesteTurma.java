import javax.swing.JOptionPane;
public class TesteTurma {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Nome:");
        String curso = JOptionPane.showInputDialog(null, "Curso:");
        int qtdAlunos = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Quantos alunos:")
        );
        int semestre = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Semestre atual:")
        );

        Turma turma = new Turma(nome, curso, qtdAlunos, semestre);
        
        String resp = "Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso();
        resp += "\nQuantidade de alunos: " + turma.getQtdAlunos() + "\nSemestre: " + turma.getSemestre() + "º";

        JOptionPane.showMessageDialog(null, resp, "Ficha do Aluno", JOptionPane.INFORMATION_MESSAGE);

        // altera informacoes; nao precisa criar todas as variaveis novamente
        qtdAlunos = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Quantos alunos:")
        );
        semestre = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Semestre atual:")
        );

        //muda os dados
        turma.setQtdAlunos(qtdAlunos);
        turma.setSemestre(semestre);

        resp = "Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso();
        resp += "\nQuantidade de alunos: " + turma.getQtdAlunos() + "\nSemestre: " + turma.getSemestre() + "º";

        JOptionPane.showMessageDialog(null, resp, "Ficha do Aluno", JOptionPane.INFORMATION_MESSAGE);
    }
}