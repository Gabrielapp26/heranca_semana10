public class Principal{

    public static void main(String[] args){

        Funcionario f=new Funcionario();
        f.setNome("Gabi");
        f.setCpf("493.305.468.11");
        f.setSalario(8500);
        f.setDepartamento("Administrativo");

        System.out.println("O nome do funcionário é "+f.getNome());
        System.out.println("Cujo CPF corresponde ao número "+f.getCpf());
        System.out.println("Seu salário é de R$ "+f.getSalario());
        System.out.println("A mesma trabalha no setor "+f.getDepartamento()+" da empresa");
    }
}