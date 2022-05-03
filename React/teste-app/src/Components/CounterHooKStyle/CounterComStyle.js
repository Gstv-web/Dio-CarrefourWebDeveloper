import React, {useState} from 'react'
import '../CounterHooKStyle/Style.css'


// AGUARDANDO ESTILOS - VERIFICAR DEPOIS

// Desse jeito fica mais semelhante com o Angular

// Para usar o css dentro do return, preciso importar o styled-components.
// Ao invés de usar o termo class, usa-se className.

export default function CounterComStyle() {

    const [value, setValue] = useState(0);

    function decrement() {
        if (value > 0) {
            setValue(value - 1);
        }

    }

    function increment() {
        setValue(value + 1);
    }

  return (


    <div>
        
        <div className='counter-area'>

        <button className='button-increment' onClick={decrement}>
            -
        </button>
        <p>{value}</p>
        <button className='button-decrement' onClick={increment}>
            +
        </button>

        </div>

    </div>
  )
}
