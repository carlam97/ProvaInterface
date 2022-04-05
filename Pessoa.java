public class Pessoa implements IPessoa {

    @Override
    public void adicionar() {
        System.out.println("Adicionando ");
    }

    @Override
    public void excluir() {
        System.out.println("Excluindo ");
    }

    @Override
    public void pesquisar() {
        System.out.println("Pesquisando");
    }

    
}