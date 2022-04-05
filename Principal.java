public class Principal {
    
    public static void main(String[] args) {
        
        Aluno a= new Aluno();
        Professor p=new Professor();
        System.out.println("Aluno: ");
       
        a.adicionar();
        a.excluir();
        a.pesquisar();
        System.out.println("===========================");

        System.out.println("Professor: ");
        p.adicionar();
        p.excluir();
        p.pesquisar();
        System.out.println("===========================");
    }
}
