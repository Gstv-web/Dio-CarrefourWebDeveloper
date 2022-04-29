import { useState } from 'react'; // useState serve para criar um estado para o componente, guardando o valor e a função para alterá-lo.

function SmartCounter() {

    // retorna um vetor
    // 1. variável stateful
    // 2. função para alterar o valor do stateful

    const [quantity, setCount] = useState(0) // quantity vira um atributo (var) e increment é uma função para alterar o valor, mas em uma arrow function dentro do return.


    return (

        <>

            <h1>Contador com hook</h1>

            <h2>{quantity}</h2>
            <div>
                <button onClick={() => setCount(quantity => quantity + 1)}>Aumentar</button>
                <button onClick={() => setCount(quantity => quantity - 1)}>Diminuir</button>
            </div>

        </>
    )

}

export default SmartCounter;