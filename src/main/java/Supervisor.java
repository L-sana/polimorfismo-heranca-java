public class Supervisor extends Funcionario{

    public Supervisor(Double salario){
        super(salario);
    }

    public double calculaImposto(){
        return this.getSalario() * 0.05;
    }

}
