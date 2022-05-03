// Arquivo para usar APIs de terceiros (devo importar na página que eu for usar)

const path = 'https://coronavirus-19-api.herokuapp.com/countries' // criei uma variável para não repetir o caminho e que vai ser usada em todos os arquivos

const headers = { // cria uma variável para os headers com método get
  method: 'get',
  mode: 'cors',
  cache: 'default'
}

function getCountry(country) { // função para pegar o país
  return fetch(`${path}/${country}`, headers) // retorna um fetch para o país
    .then((response) => response.json()) // retorna o json do país
}

export default {
  getCountry
}