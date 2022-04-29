import './App.css';
import SmartCounter from '../CounterComHook/SmartCounter';

// Todos os componentes podem ficar dentro de um componente chamado "App". É a base do React e da aplicação que está sendo renderizada.
// Posso chamar os componentes dentro de outros componentes, como função ou tag.

function App() { // função que retorna um componente
  return ( 
    <>
    <h1>Olá, Mundo!</h1>
    <SmartCounter/>
    </>
  );
}

export default App;
