import javax.swing.JOptionPane; 
public class TesteDisciplina{
    public static void main(String[] args){
        String nome = JOptionPane.showInputDialog(null, "Nome da matéria:");
        String professor = JOptionPane.showInputDialog(null, "Nome do professor:");
        int semestre = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Semestre atual:")
        );
        boolean ofertada = Boolean.parseBoolean(
            JOptionPane.showInputDialog(null, "A matéria sera passada\neste semestre? (true/false)")    
        );

        Disciplina disciplina = new Disciplina(nome, professor, semestre, ofertada);

        String resp = "Matéria: " + disciplina.getNome() +"\nProfessor: " + disciplina.getProfessor() + 
            "\nSemestre atual: " + disciplina.getSemestre();
        
        if (disciplina.getOfertada()) {
            resp += "\nSerá dada este semestre: sim";
        } else {
            resp += "\nSerá dada este semestre: não";
        }

        JOptionPane.showMessageDialog(null, resp, "Disciplina", JOptionPane.INFORMATION_MESSAGE);

        

    }
}