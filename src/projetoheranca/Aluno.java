package projetoheranca;

public class Aluno extends Pessoa{
    private float nota1;
    private float nota2;
    private float nota3;


    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }
    
    public void estudar(){
        System.out.println("Estudar");
    }
    
    public void fazerProva(){
        System.out.println("Fazer prova");
    }
    
    // novo método criado como exemplo para calcular a media do aluno
    public void calcularMedia(){
        float media = (this.nota1+this.nota2+this.nota3)/3;
        System.out.println(media);
    }

    @Override
    public String toString() {
        return "Aluno{" + "nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + '}';
    }
       
}
