public class Funcionario {
    private Double salario;

    public Funcionario(double salario){
        this.salario = salario;
    }

    public double calculaImposto(){
        return this.getSalario() * 0.00;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

}
