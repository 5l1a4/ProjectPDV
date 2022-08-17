/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */


/////////////////////////dataTables////////////////////
$(document).ready(function () {
    $('#tablaProductos').DataTable( {
        lengthMenu: [3, 6, 9, 12, 24, 50],
        language: {
            "search": "Buscar: ",
            "lengthMenu": "Mostrar _MENU_ registros",
            "info": "Mostrando _START_ a _END_ de _TOTAL_ registros",
            "zeroRecords": "No hay registros",
            "infoEmpty": "No hay registros",
            "infoFiltered": "(Encontrados _MAX_ de registros)",
            "paginate":{
                "first": "Primero",
                "last": "Ultimo",
                "previous": "Anterior",
                "next": "Siguiente"
            }
        }
    });
});


//////////////////////////Sweet Alert2/////////////////////////////    

$("#deletePro").click(function(){
    swal.fire({
        title: '¡Advertencia!',
        text: "¿Quieres eliminar este Producto?, No podras revertir la acción",
        icon: 'warning',
        showCancelButton: true,
        confirmButtonColor: '#218838',
        confirmButtonText: 'Eliminar',
        cancelButtonColor: '#dc3545',
        cancelButtonText: 'Cancelar',
        reverseButtons: true,
        padding: '1rem',
        width: '31%',
        backdrop: true,
        allowOutsideClick: false,
        allowEscapeKey: false,
        allowEnterKey: false,
        stopKeydownPropagation: false,
        showConfirmButton: true
    });
});