$(function () {

    $(".flexdatalist").flexdatalist({
        // URL a la fuente de datos remota.
        url: null,
        // Fuente de datos.
        // Matriz de objetos o una URL a cadena / archivo JSON.
        datos: null,

        // Parámetros adicionales en las solicitudes AJAX.
        params: {},

        // Ingresar parientes. Acepta selector (es) de campo (s) o una instancia jQuery de los campos.
        // Los valores relativos se enviarán con cada solicitud de eliminación de servidor.
        relatives: null,

        // Si se establece en verdadero, el campo flexdatalist se desactivará hasta que se llenen todos los parientes.
        chainedRelatives: false,

        // Habilitar caché
        cache: true,

        // tiempo de vida de caché
        cacheLifetime: 60,

        // Busca si hay n o más caracteres.
        minLength: 1,

        // Agrupe los resultados por valor de propiedad.
        groupBy: false,

        // Se requiere selección de los resultados de búsqueda.
        selectionRequired: false,

        // Enfoca el primer resultado.
        focusFirstResult: false,

        // El texto que será visible para el usuario.
        // Puede usar {property_name} para reemplazarlo con el valor de la propiedad.
        textProperty: null,

        // El nombre de la propiedad que cuando se selecciona su valor se enviará con el formulario.
        // Si desea enviar propiedades desde el elemento seleccionado, establezca esta opción en *
        valueProperty: null,

        // Nombre de los valores de las propiedades que aparecerán con el resultado de la búsqueda.
        visibleProperties: [],

        // Nombre de la propiedad (o propiedades) donde buscará.
        searchIn: ['label'],

        // Nombre de la propiedad que contiene ruta a la imagen que se agregará como icono.
        iconProperty: 'thumb',

        // Por defecto, la búsqueda de Flexdatalist coincide con comenzar al comienzo de una palabra.
        // Establecer esta opción en verdadero permite que las coincidencias comiencen desde cualquier lugar dentro de una palabra.
        // Esto es especialmente útil para las opciones que incluyen muchos caracteres especiales o frases en () sy [] s.
        searchContain: false,
        searchEqual: false,
        searchDisabled: false,
        searchDelay: 200,

        // buscar por palabra
        searchByWord: false,

        // Esto le permite normalizar las cadenas que se comparan antes de la comparación.
        normalizeString: null,

        // Acepta múltiples valores
        multiple: $this.attr('multiple'),

        // resultados máximos
        maxShownResults: 100,

        // Texto que se mostrará cuando no se encuentren resultados. Si la cadena está vacía, no mostrará el mensaje.
        noResultsText: 'No se encontraron resultados para "{keyword}"',

        // Alternar valores al tocar / clic
        toggleSelected: false,

        // permite valores duplicados
        allowDuplicateValues: false,

        // publica u obtén
        requestType: 'post',

        // Flexdatalist espera que los datos del servidor estén en el objeto de respuesta principal o en responseObject.results, pero puede cambiar el nombre de la propiedad que contiene los resultados.
        resultsProperty: 'results',

        // Por defecto, flexdatalist envía la palabra clave en el parámetro de solicitud con la palabra clave name.
        keywordParamName: 'keyword',

        // Limita el número de valores en una entrada múltiple.
        limitOfValues: 0,

        // Delimitador utilizado en valores múltiples.
        valuesSeparator: ',',

        // modo de depuración
        debug: true

    });

    $('#medicamentos').on("change", function () {
        console.log(this.value);
    });


    console.log('Página lista.');
})