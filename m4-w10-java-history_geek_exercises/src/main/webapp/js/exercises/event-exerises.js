/// <reference path="../jquery-3.1.1.js" />

$(document).ready(function () {
    $("#SameShipping").click(function(){
        if (this.checked) {
            $("#ShippingAddress1").val($("#BillingAddress1").val());
            $("#ShippingAddress2").val($("#BillingAddress2").val());
            $("#ShippingCity").val($("#BillingCity").val());
            $("#ShippingState").val($("#BillingState").val());
            $("#ShippingPostalCode").val($("#BillingPostalCode").val());
        }
        else {
            $("#ShippingAddress1").val($("").val());
            $("#ShippingAddress2").val($("").val());
            $("#ShippingCity").val($("").val());
            $("#ShippingState").val($("").val());
            $("#ShippingPostalCode").val($("").val());
        }
    })


    // var fNameField = $("#BillingAddress1");
    // fNameField.on("blur", function (event) {
    //     var blurredField = $(this);
    //     blurredField.val(blurredField.val().toUpperCase());
    // });
});

