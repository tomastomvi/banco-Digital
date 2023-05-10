package programa;

import utils.utilitarios;

public class conta {
	
	 private static int ContadorDecontas = 1;
	
	private int numeroconta;
	private pessoa pessoa;
	private Double saldo = 0.0;
	
	public conta( programa.pessoa pessoa ) {
		this.numeroconta = ContadorDecontas;
		this.pessoa = pessoa;
		ContadorDecontas += 1 ;
	}

	public int getNumeroconta() {
		return numeroconta;
	}

	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}

	public pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String toString() {
		return "\nNúmero da Conta :" + this.getNumeroconta() +
			   "\nNome :" + this.pessoa.getNome() +
			   "\nCPF :" + this.pessoa.getCpf() +
			  "\nEmail :" + this.pessoa.getEmail() +
			  "\nSaldo :" + utilitarios.doubleToString(this.getSaldo()) +
			  "\n";
		
				
	}
	
	

public void depositar(Double valor) {
    if(valor > 0) {
        setSaldo(getSaldo() + valor);
        //this.saldo = this.getSaldo() + valor;
        System.out.println("Seu depósito foi realizado com sucesso!");
    }else {
        System.out.println("Não foi possível realizar o depósito!");
    }
}

public void sacar(Double valor) {
    if(valor > 0 && this.getSaldo() >= valor) {
        setSaldo(getSaldo() - valor);
        System.out.println("Saque realizado com sucesso!");
    }else {
        System.out.println("Não foi possível realizar o saque!");
    }
}

public void transferencia(conta contaParaDeposito, Double valor) {
    if(valor > 0 && this.getSaldo() >= valor) {
        setSaldo(getSaldo() - valor);
        //this.saldo = this.getSaldo() - valor;
        contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
        System.out.println("Transferência realizada com sucesso!");
    }else {
        System.out.println("Não foi possível realizar a tranferência");
    }

}
}
