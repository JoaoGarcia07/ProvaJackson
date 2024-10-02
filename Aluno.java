public class Aluno {
    int IdAluno;
    String nomeAluno;
    String dtNascimento;
    String CPF;
    int idCursoAluno;

    public Aluno(
        int IdAluno,
        String nomeAluno,
        String dtNascimento,
        String CPF,
        int idCursoAluno
    
    ) {
        this.IdAluno = IdAluno;
        this.nomeAluno = nomeAluno;
        this.dtNascimento = dtNascimento;
        this.CPF = CPF;
        this.idCursoAluno = idCursoAluno;
    }
}
