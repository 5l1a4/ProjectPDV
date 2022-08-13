/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */


/* global bootstrap: false */
//Ejecutar función en el evento click
document.getElementById("btnOpen").addEventListener("click", openCloseMenu);

//Declaramos variables
var side_menu = document.getElementById("menu_side");
var btn_open = document.getElementById("btnOpen");
var body = document.getElementById("body");

//Evento para mostrar y ocultar menú
    function openCloseMenu(){
        body.classList.toggle("body_move");
        side_menu.classList.toggle("menu__side_move");
    }

//Si el ancho de la página es menor a 760px, ocultará el menú al recargar la página

if (window.innerWidth < 760){

    body.classList.add("body_move");
    side_menu.classList.add("menu__side_move");
}


//Haciendo el menú responsive(adaptable)

window.addEventListener("resize", function(){

    if (window.innerWidth > 760){

        body.classList.remove("body_move");
        side_menu.classList.remove("menu__side_move");
    }

    if (window.innerWidth < 760){

        body.classList.add("body_move");
        side_menu.classList.add("menu__side_move");
    }

});



///////////////////// funcionamiento de los Botones /////////////////////////////////////////////////

setInterval("cerrar()", 3000);

const cerrar = () => {
    $(".alert").delay(500).slideUp(500, () => {
        $(this).hide();
    });
}
        
