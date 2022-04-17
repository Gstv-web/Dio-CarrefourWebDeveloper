// diferenças entre Set e Array
// Set é uma coleção de elementos, que não aceita elementos repetidos.
// Em vez da propriedade lenght, usamos a propriedade size.
// Não possui os métodos map, filter, push, pop, shift, unshift, reverse e sort.

// Array é uma coleção de elementos, que aceita elementos repetidos.


// Exemplo MAP

// Crie uma função que retorna os nomes dos membros de um Map que tem o papel ADMIN no sistema

function getAdmins(map) { // criei uma função que recebe um map como parâmetro
    let admins = []; // criei um array vazio para armazenar os nomes dos admins
    for([key, value] of map) { // criei um for of para percorrer o map usando a propriedade de chave e valor de um map, que é o parâmetro da função
        if(value === "Admin") { // criei uma condição para verificar se o valor do map é igual a "Admin"
            admins.push(key);  // se confirmado, adicione o nome do admin no array
        }
    }
    return admins; // retorne o array com os nomes dos admins
}

const usuarios = new Map(); // criei um map vazio e setei os nomes e funções como chave e valor

usuarios.set("Luiz", "User");
usuarios.set("Gustavo", "Admin");
usuarios.set("Jessica", "User");
usuarios.set("Karol", "User");
usuarios.set("Paulo", "User");
usuarios.set("Thais", "Admin");
usuarios.set("Priscila", "User");
usuarios.set("Guiherme", "User");


console.log(getAdmins(usuarios));


// Exemplo SET

// Dado o array [30, 30, 40, 5, 223, 4049, 3034, 5], retorne outro array apenas com valores únicos

const array = [30, 30, 40, 5, 223, 4049, 3034, 5];

function valoresUnicos(arr) { // criei uma função que recebe um array como parâmetro
    const set = new Set(arr); // criei um set vazio e setei o array como parâmetro

    return [...set]; // retorne um array com os valores únicos do set
}

console.log(valoresUnicos(array)); // imprima o array com os valores únicos