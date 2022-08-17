/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */
//////////////////////////contadores/////////////////////////////////

//contador descripcion
var texto = document.getElementById("des");
var result = document.getElementById("resultDes");
var limite = 65;
result.textContent = 0 + "/" + limite;

texto.addEventListener("input",function(){
    var tamTexto = texto.value.length;
    result.textContent = tamTexto + "/" + limite;
    
    if(tamTexto > limite){
        texto.style.borderColor = "#ff2851";
        result.style.color = "#ff2851";
    }else{
        texto.style.borderColor = "#b2b2b2";
        result.style.color = "#737373";
    }
});

//contador codigo Barras
var texto = document.getElementById("codBarras");
var result = document.getElementById("resultCodBarras");
var limite = 13;
result.textContent = 0 + "/" + limite;

texto.addEventListener("input",function(){
    var tamTexto = texto.value.length;
    result.textContent = tamTexto + "/" + limite;
    
    if(tamTexto !== limite){
        texto.style.borderColor = "#ff2851";
        result.style.color = "#ff2851";
    }else{
        texto.style.borderColor = "#b2b2b2";
        result.style.color = "#737373";
    }
});

//////////////////////////caractere Permitidos/////////////////////////////////


