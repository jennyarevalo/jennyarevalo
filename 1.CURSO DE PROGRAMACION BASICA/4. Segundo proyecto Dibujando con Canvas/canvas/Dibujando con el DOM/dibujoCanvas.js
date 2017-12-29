var texto = document.getElementById("texto_lineas");
var boton = document.getElementById("botoncito");
boton.addEventListener("click", dibujoPorClick); //Esucha el evento


var d = document.getElementById("dibujito"); //obteneer el elemento de canvas
var ancho = d.width; //Ancho del canvas
//alert(ancho);
var lienzo = d.getContext("2d");

function dibujarLinea(color, xinicial, yinicial, xfinal, yfinal){
  lienzo.beginPath(); //Poner el lapiz sobre el papel(Arrancar un trazo)
  lienzo.strkeStyle= color; //Color del trazo
  lienzo.moveTo(xinicial,yinicial) //Metodo del canvas para mover el lapiz a donde va arrancar la linea
  lienzo.lineTo(xfinal,yfinal) //Dibujar la linea exactamente
  lienzo.stroke(); //Dibuja la linea
  lienzo.closePath();//Cierra el trazo
}

function dibujoPorClick(){
  var xxx = parseInt(texto.value);
  var lineas = xxx;
  var l = 0; //Contar lineas
  var yi, xf;
  var colorcito = "skyblue";
  var espacio = ancho / lineas;

  for(l = 0; l < lineas; l++){
    yi = espacio * l;
    xf = espacio * (l + 1);
    dibujarLinea(colorcito, 0, yi, xf, 300);
    console.log("Linea " + l);
  }
  dibujarLinea(colorcito, 1, 1, 1, 300);
  dibujarLinea(colorcito, 1, 300, 299, 299);

}
