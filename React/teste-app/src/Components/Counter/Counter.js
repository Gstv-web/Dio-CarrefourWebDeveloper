// Todo componente React é um função que retorna um componente.
// A diferença entre o Angular aqui é que o HTML é gerado dentro do componente, não em um aquivo HTML externo.

// *** ESTE É UM EXEMPLO SEM HOOK ***

function Counter() {
    
    // Aqui entra variáveis, funções e o que quer que seja renderizado.
    
    let quantity = 0; // Interpolei no Return um valor dentro do h1.
    // const counterBox = document.querySelector('.counter-box');

    function increment() {
        quantity++;
        document.getElementById("counter-box").innerHTML = quantity; //Dei um id ao elemento que quero alterar e usei o getElementById para pegar o elemento junto com o que eu quis fazer.
    }


    //dentro do return é onde é definido o componente em HTML
    return(
        <>
        <h1 id="counter-box">{quantity}</h1>
        <button onClick={increment}>Aumentar</button>
        </>
    );
}

export default Counter; // Serve para exportar o componente para outros arquivos. Necessário para que o componente seja usado em outros arquivos.