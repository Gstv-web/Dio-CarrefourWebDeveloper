const BASE_URL = 'https://thatcopy.pw/catapi/rest/'; // URL da API
const catBtn = document.getElementById("change-cat"); 
const catImg = document.getElementById("cat");


const getCats = async () => { // Função assincrona para buscar imagens de gatos
    try {
        const data = await fetch(BASE_URL); // Fetch é uma função assincrona que retorna uma promise se a requisição for bem sucedida
        const json = await data.json(); // Retorna um json com os dados da requisição

        return json.webpurl; // Retorna o url da imagem
    } catch (e) {
        console.log(e.message);
    }
};

const loadImg = async () => {
    const catImg = document.getElementsByTagName('img')[0];
    catImg.src = await getCats();
}


catBtn.addEventListener('click', loadImg);

loadImg();