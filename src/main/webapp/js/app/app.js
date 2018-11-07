$(function () {

    $(".flexdatalist").flexdatalist({
        minLength: 1
    });

    $('#txtLanguages').on("change", function () {
        console.log(this.value);
    });


    console.log('Página lista.');
})