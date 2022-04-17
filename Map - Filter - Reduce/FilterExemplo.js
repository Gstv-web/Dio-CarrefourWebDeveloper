// Filter é um método que retorna um array com os elementos que passaram pelo filtro.
// Cria um novo array e não modifica o original

// Sintaxe:
// array.filter(callback, thisArg)
// callback: função que será executada para cada elemento do array. (item, index, array)
// thisArg: valor de 'this' que será usado na função callback.

const frutas = ["Maçã Fuji", "Laranja", "Maçã Verde", "Abacaxi"];


console.log(frutas.filter((fruta) => fruta.includes("Maçã"))); // Case sensitive



// Filtre e retorne todos os números pares de um array.

const numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

console.log(numeros.filter((numero) => numero % 2 === 0));