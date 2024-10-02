import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Professor> professores = new ArrayList<>();
        ArrayList<Curso> cursos = new ArrayList<>();
        ArrayList<Aluno> alunos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n Menu de Opções:");
            System.out.println("1. Cadastrar Professor");
            System.out.println("2. Cadastrar Curso");
            System.out.println("3. Cadastrar Aluno");
            System.out.println("4. Listar Professores");
            System.out.println("5. Listar Cursos");
            System.out.println("6. Listar Alunos");
            System.out.println("7. Encerrar o programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  
            switch (opcao) {
                case 1:
                    // Cadastrar Professores
                    System.out.print("Digite o ID do Professor: ");
                    int IdProfessor = scanner.nextInt();

                    System.out.print("Digite o nome d* Professor: ");
                    String nome = scanner.next();

                    System.out.println("Digite o Departamento do Professor:");
                    String Departamento = scanner.next();

                    Professor professor=new Professor(IdProfessor, nome, Departamento);
                    professores.add(professor);
                    break;

                    case 2:
                    // Cadastrar Curso
                    System.out.print("Digite o ID do Curso: ");
                    int IdCurso = scanner.nextInt();

                    System.out.print("Digite o nome do Curso: ");
                    String nomeCurso = scanner.next();

                    System.out.println("Digite a Carga Horária do Curso:");
                    int CargaHora = scanner.nextInt();

                    System.out.print("Digite o Id do Professor deste Curso: ");
                    int IdProfessorCurso = scanner.nextInt();

                    Curso curso=new Curso(IdCurso, nomeCurso, CargaHora, IdProfessorCurso);
                    cursos.add(curso);
                    break;

                    case 3:
                    // Cadastrar Aluno
                    System.out.print("Digite o ID do Aluno: ");
                    int IdAluno = scanner.nextInt();

                    System.out.print("Digite o nome do Aluno: ");
                    String nomeAluno = scanner.next();
                    
                    System.out.print("Digite a Data de Nascimento do Aluno: ");
                    String dtNascimento = scanner.next();

                    System.out.print("Digite o CPF do Aluno: ");
                    String CPF = scanner.next();

                    System.out.println("Digite o Id do Curso que este Aluno cursa:");
                    int idCursoAluno = scanner.nextInt();

                    Aluno aluno=new Aluno(IdAluno, nomeAluno, dtNascimento, CPF, idCursoAluno);
                    alunos.add(aluno);
                    break;

                    case 4:
                    System.out.println("Listar Professores");
                    for (Professor professorPrint : professores) {
                        System.out.println("Id: " + professorPrint.IdProfessor + " nome: " + professorPrint.nome + " Departamento: " + professorPrint.Departamento);
                    }
                    break;

                    case 5:
                    System.out.println("Listar Cursos");
                    for (Curso cursoPrint : cursos) {
                        System.out.println("Id: " + cursoPrint.IdCurso + " nome: " + cursoPrint.nomeCurso + " Carga Horária: " + cursoPrint.CargaHora + " Id do Professor deste Curso:" + cursoPrint.IdProfessorCurso);
                    }
                    break;

                    case 6:
                    System.out.println("Listar Alunos");
                    for (Aluno alunoPrint : alunos) {
                        System.out.println("Id: " + alunoPrint.IdAluno + " nome: " + alunoPrint.nomeAluno + " Data de Nascimento: " + alunoPrint.dtNascimento + " CPF: " + alunoPrint.CPF + " Digite o Id do Aluno neste Curso: " + alunoPrint.idCursoAluno);
                    }
                    break;
                
            }

        } while (opcao != 7);

        scanner.close();
    }
}

  