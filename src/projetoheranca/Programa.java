package projetoheranca;

public class Programa {

    public static void main(String[] args) {
     
        // Instanciando a classe Pessoa
        Pessoa p1 = new Pessoa();
        
        // Atribuindo características
        p1.setNome("Manuel");
        p1.setLocalNascimento("Tobias Barreto");
        p1.setSexo('M');
        
        // Imprimindo com o método toString()
        System.out.println(p1.toString());

        // Chamando um método da classe Pessoa
        p1.andar();
       
        // Instanciando a classe Aluno
        Aluno a1 = new Aluno();
        
        // Atribuindo características
        a1.setNome("Maria");
        a1.setSexo('F');
        a1.setNota1(3.0f);
        a1.setNota2(7.0f);
        a1.setNota3(5.0f);
        
        // Imprimindo com método toString()
        System.out.println(a1.toString());
     
        // Calculando a media do aluno
        a1.calcularMedia();
        
    }
    
}
