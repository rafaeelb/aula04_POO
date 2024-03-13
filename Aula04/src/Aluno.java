public class Aluno {
    private String nome ;
    private String cpf;
    private int ra;
    private String data_nascimento;
    private String sexo;

    public Aluno(String nome, String cpf, int ra, String data_nascimento, String sexo){
        this.nome = nome;
        this.cpf = cpf;
        this.ra = ra;
        this.data_nascimento = data_nascimento;
        this.sexo = sexo;
    }
    public Aluno(){
        // construtor vazio
    }

    public void setNome(String entrada) {
        this.nome = entrada;
    }

    public void setRa(int entrada) {
        this.ra = entrada;
    }

    public String getNome(){
        return this.nome;
    }

    public int getRa(){
        return this.ra;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(String cpf){
        return this.cpf;
    }
    
    public void setData_nascimento(String data_nascimento){
        this.data_nascimento = data_nascimento;
    }
    public String getData_nascimento(String data_nascimento){
        return this.data_nascimento;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getSexo(String sexo){
        return this.sexo;
    }


}
