/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */

/////////////////////////crear producto////////////////////
$("#btnOpenModal").on("click", () => {

     $(".form-control").val("");
     // limpiar errores;
     $("#modalRegPro").modal("show");

 });


$("#btnGuardar").on("click", () =>{

    // crea un objeto producto
    let producto = {};

    producto.id=0;

    producto.descripcion = $("#des").val();
    producto.codigoBarras = $("#codBar").val();
    producto.precio = $("#pre").val();    
    producto.linkImagen = $("#urlImg").val();
    if ($("#cant").val() === "" )
        $("$cant").val("0");
    producto.stock = $("#cant").val();
    $.ajax({
        method: "POST",
        url: "/productos/form",
        data: producto,
        success: function(){
            $("#ModalRegPro").modal("hide");
            Swal.fire({
                title: 'Éxito',
                text: 'Tarea creada con éxtio',
                icon: 'success',
                confirmButtonText: 'Aceptar'
            }).then((result) =>{
                if(result.isConfirmed) {
                    location.reload();
                }
            });
        },
        complete: function(){}
    });
});

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
    $('#precio').mask("#.##0,00", { reverse: true });
    $('#stock').mask('00');
    $('#codBarras').mask('0000000000000');


    $(document).on('click', '#borrar', function (event) {

    });

});

//////////////////////////contadores/////////////////////////////////