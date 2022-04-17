// função Map
// A Função Map é uma função que recebe um array e um callback, e retorna um array com os resultados da função callback.
// Ela cria um novo array, não modifica o array original e realiza as operações em ordem.

// sintaxe:
// array.map(callback, thisArg)
// callback: função que será executada para cada elemento do array. (item, index, array)
// thisArg: valor de 'this' que será usado na função callback.


// Ex: Pratique a sintaxe de multiplicação de números, uma vez utilizando o parâmetro this de um objeto criado por você, e depois sem ele.

// Sem This

const array = [1, 2, 3, 4, 5];

console.log(array.map((item) => item * 2));




// Com This

const orange = { // criei um objeto
    price: 3,
};

const apple = { // criei um objeto
    price: 1.5,
};

function mapArray () { // criei uma função
    const array = [1, 2, 3, 4, 5]; // criei um array

    return array.map(function (item) { // criei uma função anônima que recebe um item do array e retorna o item multiplicado pelo valor de this.price, que no caso é orange ou apple
        return item * this.price;
    }, apple);
        
}

console.log(mapArray());