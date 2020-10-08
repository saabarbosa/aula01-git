package projetoheranca;

public class Professor extends Pessoa {

    private String formacao;

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    
    public void minstrarAula(){
        System.out.println("Ministrar aula");
    }
    
    public void aplicarProva(){
        System.out.println("Aplicar prova");
    }
}
