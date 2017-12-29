
var teclas = {
  UP: 38,
  DOWN: 40,
  LEFT: 37,
  RIGHT: 39
};

console.log(teclas);

document.addEventListener("keyup", dibujarTeclado);
var cuadrito = document.getElementById('area_de_dibujo');
var papel = cuadrito.getContext("2d");
var x = 150;
var y = 150;



dibujarLinea("red", x-1, y-1, x+1, x+1, papel);

function dibujarLinea(color, xinicial, yinicial, xfinal, yfinal, lienzo){
  lienzo.beginPath(); //Poner el lapiz sobre el papel(Arrancar un trazo)
  lienzo.strkeStyle= color; //Color del trazo
  lienzo.lineWidth = 3;
  lienzo.moveTo(xinicial,yinicial) //Metodo del canvas para mover el lapiz a donde va arrancar la linea
  lienzo.lineTo(xfinal,yfinal) //Dibujar la linea exactamente
  lienzo.stroke(); //Dibuja la linea
  lienzo.closePath();//Cierra el trazo
}

function dibujarTeclado(evento){
  var colorcito = "brown";
  var movimiento = 5;
  switch (evento.keyCode) {
    case teclas.UP:
      dibujarLinea(colorcito, x, y, x, y - movimiento, papel);
      y = y - movimiento;
    break;

    case teclas.DOWN:
      dibujarLinea(colorcito, x, y, x, y + movimiento, papel);
      y = y + movimiento;
    break;

    case teclas.RIGHT:
      dibujarLinea(colorcito, x, y, x + movimiento, y, papel);
      x = x + movimiento;
    break;

    case teclas.LEFT:
    dibujarLinea(colorcito, x, y, x - movimiento, y, papel);
    x = x - movimiento;
    break;

    default:
      console.log("Otra tecla");
    break;
  }

}
