import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './Components/App/App.js';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  // React.StrictMode especifica que o React não deve ser usado como um componente de contexto.
  <React.StrictMode>
    <App />
  </React.StrictMode>
);