package meupacote;

public class Main {
    public static void main(String[] args) {
        // Inicializando as variáveis.
        Aluno aluno = new Aluno();

        // Setando os dados.
        aluno.setNome("Julia");
        aluno.setMatricula("123456");
        aluno.setNotas(new double[]{7.2, 6.7, 9.3, 5.3});
        
        // aluno.removerNotas(2); <- remove a nota no índice número 2.

        // Imprimindo as informações para o usuário
        System.out.println("Nome = " + aluno.getNome());
        System.out.println("Matrícula = " + aluno.getMatricula());
        System.out.println("Notas = " + aluno.getNotas());
        System.out.printf("Média = %.1f\n", aluno.calcularMedia());
        aluno.verificarSituacao();
    }
}
