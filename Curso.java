public class Curso {
    int IdCurso;
    String nomeCurso;
    int CargaHora;
    int IdProfessorCurso;

    public Curso(
        int IdCurso,
        String nomeCurso,
        int CargaHora,
        int IdProfessorCurso
    
    ) {
        this.IdCurso = IdCurso;
        this.nomeCurso = nomeCurso;
        this.CargaHora = CargaHora;
        this.IdProfessorCurso = IdProfessorCurso;
    }
}
