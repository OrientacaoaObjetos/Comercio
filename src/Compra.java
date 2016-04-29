
public class Compra {
	
	int valorTotal;
	int numeroParcelas;
	
	//a vista
	public Compra(int valor) {
		this.valorTotal = valor;
		this.numeroParcelas = 1;
	}
	
	//parcelado
	public Compra(int qtdParcela, int valorParcela) {
		this.valorTotal = valorParcela * qtdParcela;
		this.numeroParcelas = qtdParcela;	
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public int getNumeroParcelas() {
		return numeroParcelas;
	}
	
	public int getValorParcela() {
		return this.valorTotal / this.numeroParcelas;
	}

}
