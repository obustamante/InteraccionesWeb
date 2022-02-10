$(function () {

    $(".flexdatalist").flexdatalist({
        minLength: 1
    });

    var $input = $('.flexdatalist');

    // Update vista de valor
    var updateValueView = function ($target) {
        $target.each(function () {

//                    console.log($(this).val());
//            $('#agregar-medicamento').data('id', $(this).val());
            $('#prueba').val($(this).val());

            //muestra debajo de input text el valor del id del medicamento
            $(this).parent().find('.input-value span').html('<code>' + $(this).val() + '</code>');
        });
    };

    updateValueView($input);

    $input
        .on('select:flexdatalist', function () {
            console.log('Medicamento seleccionado!');
            $('#button-agregar').prop('disabled', false);
        })
        .on('change:flexdatalist', function (e, set) {
            //console.log('--- #' + $(this).attr('name') + ' ---');
            //console.log('Set valor: ' + set.value);
//                    console.log('Set texto: ' + set.text);
            updateValueView($(this));
        })

    $('#button-agregar').prop('disabled', true);

    console.log('Página lista.');
});


var codigos = [];
var cont = 0;

//Agrega medicamento al listado
function agregarMedicamento() {

    var invima = $('#prueba').val();

    console.log('Medicamento a adicionar: ' + invima.toUpperCase());
    console.log(' ');

    codigos.push(invima.toUpperCase());

    /*
    console.log('Listado de códigos INVIMA:');
    codigos.forEach(function (elemento, indice, array) {
        console.log(elemento, indice);
    });
    console.log(' ');
    */

    //URL
    var location = "localhost";
    //var location = "172.18.126.32";
    //var location = "31.220.56.52";

    var url = "http://" + location + ":8080/InteraccionesWeb/rest/api/Medicamento/getComparaMedicamento"

    var data_ = {
        'codigoinvima': codigos
    };

    var parametros = 'data=' + $.toJSON(data_);

    console.log('sending... ');
    console.log(parametros);

    $.get(url, parametros, function (data, status) {
        //hideWaitScreen();
        //waitStop();

        $("#tbodyMedicamentos").empty();
        cont_ = 0;

        console.log(' ');
        console.log('status service: ' + status);

        if (status == "success") {

            console.log('---+---+---+---+---+---+---+---+---+---');

            var medList = data["medicamentosList"];
            /*
            console.log(' ');
            console.log('medicamentosList:');
            console.log(medList);

            console.log(' ');
            console.log('inteaccionesList:');
            console.log(data["inteaccionesList"]);
             */

            //console.log(medList.get(0));
            medList.forEach(function (element) {
                console.log(element);

                //clearTable();

                cont_ += 1;
                var nombre = element.nombre;
                var codigoInvima = element.codInvima;
                var codigoAtc = element.codigoAtc;


                $('#tablaMedicamentos >tbody:last-child').append("<tr><td> " + cont_ + $('#prueba').val() + "</td><td>" + nombre + "</td><td>" + codigoInvima + "</td><td>" + codigoAtc + "</td> </tr>");

            });


            console.log('---+---+---+---+---+---+---+---+---+---');

        } else {
            console.log("Medicamento no encontrado");
        }
    }).always(function () {
        console.log('fin service');
    });


//    console.log(codigos);

    //cont += 1;

    //console.log('Agrega elemento a la tabla');
    //$('#tablaMedicamentos >tbody:last-child').append("<tr><td> " + cont + " - " + $('#prueba').val() + "</td><td>NombreDelMedicamento</td><td>CodigoATC</td> </tr>");

//    console.log('Deshabilitar - boton-agregar');
    $('#button-agregar').prop('disabled', true);

    clearInput();

}

//Limpiar campo de busqueda
function clearInput() {
    //console.log('Limpiar campo de busqueda...');
    $('#medicamentos').val("");

}

//Limpia los datos en la tabla
function clearTable() {
    console.log('Limpiar tabla...');
    $("#tbodyMedicamentos").empty();
    $('#tablaMedicamentos >tbody:last-child').append("<tr><td></td><td></td><td></td><td></td></tr>");

    cont = 0;
    codigos = [];
    console.log('Tabla limpia');
}

