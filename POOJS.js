// ** OBJETOS EM JAVASCRIPT **
// classes em javascript 

class Meal { // criei um construtor para a classe "Meal"
    constructor (food) { // o construtor recebe um parametro "food"
        this.food = food; // atribui o parametro "food" ao atributo "food"
    }

    // getters e setters

    get food() { // criei um getter para o atributo "food"
        return this._food; // retorna o valor do atributo "food"
    }

    set food(food) { // criei um setter para o atributo "food"
        this._food = food; // atribui o valor do parametro "food" ao atributo "food"
    }




    eat() {
        if (meal._food == 'pizza') { // se o atributo "food" for igual a "pizza" (que é o que está no construtor)
            return '=9';
        }  else {
            return ';x'
        }
    }
}

let meal = new Meal('pizza'); // criei uma instancia da classe "Meal"
console.log(meal.eat()); // chamei o metodo "eat" que recebeu o parametro "pizza"


