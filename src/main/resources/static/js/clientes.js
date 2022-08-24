/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */

/////////////////////////dataTables////////////////////
$(document).ready(function () {
    $('#tablaClientes').DataTable({
        lengthMenu: [3, 6, 9, 12, 24],
        language: {
            "search": "Buscar: ",
            "lengthMenu": "Mostrar _MENU_ registros",
            "info": "Mostrando _START_ a _END_ de _TOTAL_ registros",
            "zeroRecords": "No hay registros",
            "infoEmpty": "No hay registros",
            "infoFiltered": "(Encontrados _MAX_ de registros)",
            "paginate": {
                "first": "Primero",
                "last": "Ultimo",
                "previous": "Anterior",
                "next": "Siguiente"
            }
        }
    });
    //JQuery mask//
    $('#tel').mask('(000)-0000-000');
    $('#nroDoc').mask('00.000.000');

    //Sweet alert2//
});

//////////////////////////contadores/////////////////////////////////

//contador descripcion
var textoNot = document.getElementById("nota");
var resNot = document.getElementById("resNot");
var limitNot = 220;
resNot.textContent = 0 + "/" + limitNot;

textoNot.addEventListener("input", function () {
    var tamNot = textoNot.value.length;
    resNot.textContent = tamNot + "/" + limitNot;

    if (tamNot > limitNot) {
        textoNot.style.borderColor = "#ff2851";
        resNot.style.color = "#ff2851";
    } else {
        textoNot.style.borderColor = "#b2b2b2";
        resNot.style.color = "#737373";
    }

});
