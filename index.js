
const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Ingrese el número de filas: ', (a) => {
  rl.question('Ingrese el número de columnas: ', (b) => {
    let AB = Array.from({length: parseInt(a)}, () => Array.from({length: parseInt(b)}, () => Math.floor(Math.random() * 8)));
    let M = Array.from({length: parseInt(a)}, () => Array.from({length: parseInt(b)}, () => 0));
    
    let start_time = new Date().getTime();

    for (let i = 0; i < parseInt(a); i++) {
        for (let j = 0; j < parseInt(b); j++) {
            if (i === 0 || i % 2 === 0) {
                M[i][j] += 1;
            }
            if (j === 0 || j % 2 === 0) {
                M[i][j] += 2;
            }
            if (i % 2 !== 0 && j % 2 !== 0) {
                M[i][j] -= 3;
            }
        }
    }

    // Se imprime la matriz AB
    console.log("Matriz AB:");
    for (let i = 0; i < parseInt(a); i++) {
        for (let j = 0; j < parseInt(b); j++) {
            process.stdout.write(AB[i][j] + ' ');
        }
        console.log();
    }

    // Se imprime la matriz M
    console.log("------------------------");
    console.log("Matriz M:");
    for (let i = 0; i < parseInt(a); i++) {
        for (let j = 0; j < parseInt(b); j++) {
            process.stdout.write(M[i][j] + ' ');
        }
        console.log();
    }

    // Se calcula el tiempo de ejecución
    let end_time = new Date().getTime();
    let duration = (end_time - start_time) / 1000;
    console.log(`El tiempo de ejecucion fue de ${duration.toFixed(5)} segundos`);

    rl.close();
  });
});