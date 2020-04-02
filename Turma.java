public class Turma {
    private String nome;
    private String curso;
    private int qtdAlunos;
    private int semestre;

    public Turma(String n, String c, int q, int s){
        nome = n;
        curso = c;
        qtdAlunos = q;
        semestre = s;
    }

    //metodos de acesso
    public String getNome() {
        return nome;
    }
    public String getCurso() {
        return curso;
    }
    public int getQtdAlunos() {
        return qtdAlunos;
    }
    public int getSemestre() {
        return semestre;
    }

    //metodos modificadores
    public void setNome(String n) {
        nome = n;
    }
    public void setCurso(String c) {
        curso = c;
    }
    public void setQtdAlunos(int q) {
        qtdAlunos = q;
    }
    public void setSemestre(int s) {
        semestre = s;
    }
}