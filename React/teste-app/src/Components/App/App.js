import './App.css';
import CounterComStyle from '../CounterHooKStyle/CounterComStyle';

// Todos os componentes podem ficar dentro de um componente chamado "App". É a base do React e da aplicação que está sendo renderizada.
// Posso chamar os componentes dentro de outros componentes, como função ou tag.
// Aqui eu boto os componentes que eu quero logo ao rodar o servidor, além de um gerenciador de rotas, como no Angular.


function App() { // função que retorna um componente
  return ( 
    <>
    <h1>Inhaí</h1>
    <CounterComStyle/>
    </>
  );
}

export default App;
