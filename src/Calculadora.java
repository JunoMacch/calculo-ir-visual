
public class Calculadora {
    public double calculoMensal(double salario) {
        double imposto = 0;
        double salarioOriginal = salario;

        if (salario > 0) {
            if (salario > 1903.98) {
                // Faixa de 27.5%
                if (salario > 4664.68) {
                    imposto += (salario - 4664.68) * 0.275;
                    salario = 4664.68;
                }
                
                // Faixa de 22.5%
                if (salario > 3751.06) {
                    imposto += (salario - 3751.06) * 0.225;
                    salario = 3751.06;
                }
                
                // Faixa de 15%
                if (salario > 2826.66) {
                    imposto += (salario - 2826.66) * 0.15;
                    salario = 2826.66;
                }
                
                // Faixa de 7.5%
                if (salario > 1903.98) {
                    imposto += (salario - 1903.98) * 0.075;
                    salario = 1903.98;
                }
                
            } else {
                // Faixa isento
                System.out.println("Isento de Imposto de Renda.");
            }

            double aliquotaEfetiva = (imposto / salarioOriginal) * 100;

        } else {
            // Exibe mensagem caso o salário seja menor ou igual a zero
            System.out.println("INSIRA UM VALOR MAIOR QUE R$0.00\n");
        }

        return imposto;
    }

    // Método para calcular o imposto anual
    public static double calculoAnual(double salario) {
        double imposto = 0;
        double salarioOriginal = salario;

        if (salario > 0) {
            // Faixa isenta
            if (salario > 22847.76) {
                // Faixa de 27.5%
                if (salario > 55976.16) {
                    imposto += (salario - 55976.16) * 0.275;
                    salario = 55976.16;    
                }
                
                // Faixa de 22.5%
                if (salario > 45012.60) {
                    imposto += (salario - 45012.60) * 0.225;
                    salario = 45012.60;
                }
                
                // Faixa de 15%
                if (salario > 33919.80) {
                    imposto += (salario - 33919.80) * 0.15;
                    salario = 33919.80;
                }
                
                // Faixa de 7.5%
                if (salario > 22847.76) {
                    imposto += (salario - 22847.76) * 0.075;
                    salario = 22847.76;        
                }
                
            } else {
                // Faixa isento
                System.out.println("Isento de Imposto de Renda.");
            }
            
            double aliquotaEfetiva = (imposto / salarioOriginal) * 100;
            
        } else {
            // Exibe mensagem caso o salário seja menor ou igual a zero
            System.out.println("INSIRA UM VALOR MAIOR QUE R$0.00\n");
        }

        return imposto;
    }
}
