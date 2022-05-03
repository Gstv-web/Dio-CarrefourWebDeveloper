import React, { memo, useState, useCallback, useEffect } from 'react'
import Api from '../../api'
import Board from './components/Board'
import Panel from './components/Panel'
import { ContainerStyled } from './style'

function Main() {
  const [data, setData] = useState({})
  const [country, setCountry] = useState('brazil')
  const updateAt = new Date().toLocaleString()

  const getCovidData = useCallback((country) => { // função para buscar os dados do covid no api.
    Api.getCountry(country)
      .then(data => setData(data)) // seta os dados do covid na variavel data.
  }, [])

  useEffect(() => { // serve para executar uma função quando o componente é montado e irá mudar o estado do componente conforme mudar o valor de country.
    getCovidData(country)
  }, [getCovidData, country])

  const handleChange = ({ target }) => {
    const country = target.value
    setCountry(country)
  }

  return (
    <ContainerStyled>
      <div className="mb-2">
        <Panel
          data={data}
          updateAt={updateAt}
          onChange={handleChange}
          country={country}
          getCovidData={getCovidData}
        />
      </div>
      <Board data={data} />
      
    </ContainerStyled>
  )
}

export default memo(Main) // memo é usado para não renderizar o componente toda vez que mudar o state
