// Diferença entre throw e return
// return: retorna o valor de uma função
// throw: lança uma exceção, ou seja, interrompe a execução do código

// try catch
// try: tenta executar algo
// catch: trata um erro da maneira que você quiser

// finally: executa sempre mesmo que o try ou o catch falharem

// Ojeto error
// O objeto Error é uma classe que representa um erro ocorrido durante a execução de um programa.
// EX: const err = new Error("Ocorreu um erro");


// Atividade: validação de erros por tipo

//O objetivo é que a função receba um array e retorne ele caso o seu tamanho corresponda ao número enviado como parâmetro na função. Caso contrário, um erro será lançado.

function validaArrays(arr, num) { // criei uma função que recebe um array e um número como parâmetros
	try { 
		if (!arr && !num) throw new ReferenceError('Envie os parâmetros!'); // criei uma condição para verificar se o array e o número estão vazios (!num = não existe/vazio)

		if (typeof arr !== 'object') // criei uma condição para verificar se o array é um objeto
			throw new TypeError('Envie um elemento do tipo Array!'); // se não for, lançar um erro

		if (typeof num !== 'number') // criei uma condição para verificar se o número é um número
			throw new TypeError('Envie um elemento do tipo Number!'); // se não for, lançar um erro

		if (arr.length !== num) throw new RangeError('Tamanho do array inválido!'); // criei uma condição para verificar se o tamanho do array é igual ao número enviado como parâmetro

		return arr;
	} catch (e) { // criei um catch para tratar os erros
		if (e instanceof RangeError) { // criei uma condição para verificar se o erro é do tipo RangeError
			console.log('RangeError!');
			console.log(e.stack);
		} else if (e instanceof ReferenceError) { // criei uma condição para verificar se o erro é do tipo ReferenceError
			console.log('ReferenceError!');
			console.log(e.stack);
		} else { // se não for nenhum dos erros acima, lançar um erro
			console.log('Outro tipo de erro!');
			console.log(e.stack);
		}
	}
}

console.log(validaArrays([1, 2, 3], 2));