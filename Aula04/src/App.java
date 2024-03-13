import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // utilizando o constutor
        Aluno aluno = new Aluno("Rafael","507.195.718-39", 292048232, "19/08/2004", "Masculino");
        // Aluno aluno2 = new Aluno("Benício","507.195.718-39", 292048231, "19/08/2004", "Masculino");

        // utlizando o set
        aluno.setNome("Rafael");
        // pegar os valores
        JOptionPane.showMessageDialog(null,"Primeiro nome: " +aluno.getNome() + "\n" +"Ra: " + aluno.getRa() + "\n"
        +"Data de nascimento: "+aluno.getData_nascimento(null)  + "\n" + "Sexo: " + aluno.getSexo(null) );
        //JOptionPane.showMessageDialog(null,"Segundo nome: " +aluno2.getNome());
        // JOptionPane.showMessageDialog(null,"Ra: " + aluno2.getRa());
    }
}
