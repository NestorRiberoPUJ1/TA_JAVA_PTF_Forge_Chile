
//PRIMITIVOS
var nombre = "Nestor"; //declaración variable con inicialización
let edad = 26; //declaración variable con inicialización
const estatura = 1.86;
var graduado = true;

//NO PRIMITIVOS
var bandas = ["KISS", "GRUPO FIRME", "CAMILO SESTO"];//Arreglo o lista 
var numeros = [7, 48, 1024];//Arreglo o lista 
var varios = ["VICENTE", 42, false, [1, 2]];

console.log(nombre);
console.log(bandas[1]);
console.log(varios[3][1]);

//Objetos

let persona = {
    nombre: "Nestor",
    edad: 26,
    estatura: 1.86,
    profesion: "Ingeniero Electrónico",
    cursos: ["JAVA", "MERN", "PYTHON", "C"],
    contactos: {
        personal: "123456",
        empresarial: "321654",
    }
}

console.log(persona.profesion);
console.log(persona["nombre"]);
console.log(persona.cursos[2]);
console.log(persona.contactos.empresarial);

var perrito;    //Declaraciòn
perrito = "Pluto"; //Asigno un valor

const pato = "Donald";

const grupos = [];
console.log(grupos);
grupos.push("NICHE");
console.log(grupos);
grupos.push("FIRME");
console.log(grupos);
grupos.push("FRONTERA");
console.log(grupos);