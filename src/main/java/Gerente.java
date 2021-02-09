public class Gerente extends Funcionario{

    public Gerente(double salario){
        super(salario);
    }


    public double calculaImposto(){
        return this.getSalario() * 0.1;
    }

}
