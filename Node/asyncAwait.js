
//la palabra async no es necesaria  ya que son asincronas 
async function hola (nombre){
    return new Promise (function (resolve,reject) {
        setTimeout( function () {
            console.log('hola'+nombre);
            resolve(nombre);
        }, 1000);
    });
}

async function hablar(nombre){  
    return new Promise( (resolve,reject) => { 
        setTimeout( function () {
            console.log('bla bla bla bla');
            resolve(nombre);
        }, 1000);
    });
}

async function adios(nombre) {
    return new Promise( ( resolve, reject) => {
        setTimeout(function() {
            console.log('adios' +nombre);
            resolve();
        }, 1000);
    });
}

async function main (){
    await hola('Ariel');
    let nombre = await hola('Ariel');
    await hablar();
    await hablar();
    await hablar();
    await adios(nombre);
    console.log('Termina el proceso....');
}

console.log('Empezamos el proceso....');
main();
console.log('esta va a ser la segunda instruccion');

