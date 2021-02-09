public class Atendente extends Funcionario{

    public Atendente(Double salario){
        super(salario);
    }

    public double calculaImposto(){
        return this.getSalario() * 0.01;
    }

}
