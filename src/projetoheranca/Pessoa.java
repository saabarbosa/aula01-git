package projetoheranca;

import java.util.Date;

public class Pessoa {
    private String nome;
    private char sexo;
    private String localNascimento;
    private Date dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public void dormir(){
        System.out.println("Dormir");
    }
    
    public void comer(){
        System.out.println("Comer");
    }
    
    public void andar(){
        System.out.println("Andar");
    }
    
    public void falar(){
        System.out.println("Falar");
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sexo=" + sexo + ", localNascimento=" + localNascimento + ", dataNascimento=" + dataNascimento + '}';
    }
    
    
}
