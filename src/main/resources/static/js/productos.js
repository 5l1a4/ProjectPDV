/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */


/////////////////////////dataTables////////////////////
$(document).ready(function () {
    $('#tablaProductos').DataTable({
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
    $('#precio').mask("#.##0,00", {reverse: true});
    $('#stock').mask('00');
    $('#codBarras').mask('0000000000000');

});
//////////////////////////contadores/////////////////////////////////

//contador descripcion
var textoDes = document.getElementById("des");
var resDes = document.getElementById("resDes");
var limitDes = 65;
resDes.textContent = 0 + "/" + limitDes;

textoDes.addEventListener("input", function () {
    var tamDes = textoDes.value.length;
    resDes.textContent = tamDes + "/" + limitDes;

    if (tamDes >= limitDes) {
        textoDes.style.borderColor = "#ff2851";
        resDes.style.color = "#ff2851";
    } else {
        textoDes.style.borderColor = "#b2b2b2";
        resDes.style.color = "#737373";
    }

});

//contador codigo Barras
var textCod = document.getElementById("codBarras");
var resCod = document.getElementById("resultCodBarras");
var limitCod = 13;
resCod.textContent = 0 + "/" + limitCod;

textCod.addEventListener("input", function () {
    var tamCod = textCod.value.length;
    resCod.textContent = tamCod + "/" + limitCod;

    if (tamCod !== limitCod) {
        textCod.style.borderColor = "#ff2851";
        resCod.style.color = "#ff2851";
    } else {
        textCod.style.borderColor = "#b2b2b2";
        resCod.style.color = "#737373";
    }
});

//Sweet Alert2//

function btnSuccess() {
    Swal.fire({
        position: 'top-end',
        icon: 'success',
        title: 'Producto agregado con Exito!',
        showConfirmButton: false,
        timer: 1500
    })

}
;