//Reduce é um método que permite que você aplique uma função a cada elemento de um array e obtenha um resultado final.
// O resultado final é o valor do último elemento do array.
// -> Executa uma função em todos os elementos do array, retornando um valor único (pode ou não ser um array)

// Sintaxe:
// array.reduce(callback, initialValue)
// callback: função que será executada a partir do acumulador.
// initialValue: valor inicial do acumulador.


// Some todos os numeros de um array

function somaNums (arr) {
    return arr.reduce(function(prev, current) {
        return prev + current;
    })
}

const arr = [1, 2];

console.log(somaNums(arr));

// Crie uma função que recebe uma lista de preços e um número representando o saldo disponível. Calcule qual será o saldo final após subtrair todos os preços da lista enviada.

function verSaldo (lista) {
    return lista.reduce(function(prev, current) {
        return prev - current;
    }, 300) // 300 é o saldo inicial, poderia criar uma variável para isso e chamar por aqui.
};

const lista = [100, 50, 50] // poderia ter criado uma lista com objetos com nome e preço, por exemplo

console.log(verSaldo(lista));