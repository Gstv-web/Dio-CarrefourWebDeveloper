// Classe Pai

class ContaBancaria {
    constructor (agencia, numero, tipo, saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    get saldo() {
        return this._saldo;
    }

    set saldo(valor) {
        this._saldo = valor;
    }

    sacar(valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return this._saldo;
        } else {
            return console.log("Saldo insuficiente");
        }
    }

    depositar(valor) {
        this.saldo += valor;
        return this._saldo;
    }
}

// Classe Filha
class ContaCorrente extends ContaBancaria {
    constructor (agencia, numero, cartaoCredito) { // 
        super(agencia, numero); // chamei o construtor da classe pai para herdar os atributos agencia e numero que foram passados como parametro
        this.tipo = "Corrente"; // atribui o valor "Corrente" ao atributo "tipo", que faz parte da classe pai, tornando esta classe filha padronizada como conta corrente
        this.cartaoCredito = cartaoCredito;
    }

    get cartaoCredito() {
        return this._cartaoCredito;
    }

    set cartaoCredito(valor) {
        this._cartaoCredito = valor;
    }

}

// Classe Filha
class ContaPoupanca extends ContaBancaria {
    constructor(agencia, numero) {
        super(agencia, numero);
        this._tipo = "Poupança";
    }

}

class ContaUniversitaria extends ContaBancaria {
    constructor(agencia, numero) {
        super(agencia, numero);
        this._tipo = "Universitária";
    }

    sacar (valor) {
        if (valor <= 500 && this.saldo >= valor) {
            this._saldo -= valor;
        } else {
            console.log("Saque não permitido. Máximo de saque permitido é de R$ 500,00");
        }
    }
}


// Teste
const minhaConta = new ContaCorrente(1, 123, true);
minhaConta.saldo = 1000;
console.log(minhaConta)

minhaConta.sacar(500)
console.log(minhaConta)

minhaConta.depositar(500)
console.log(minhaConta)
console.log("FIM DE MINHA CONTA")

const contaUni = new ContaUniversitaria(2, 333, false);
contaUni.saldo = 1000;
contaUni.sacar(501);

console.log(contaUni)


