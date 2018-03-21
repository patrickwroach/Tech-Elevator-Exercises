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

    $("input[name=ShippingType]:radio").change(function() {
        $("#shipping .price").html("$" + $(this).attr('data-cost'));
        var shippingPrice = parseFloat($(this).attr('data-cost'));
        var grandTotal = parseFloat($("#subtotal .price").html().replace("$", ""));
        $("#grandtotal .price").html("$" + (shippingPrice + grandTotal).toFixed(2));
    });


   $(document).on("keydown", function (event) {

        if (event.key =="ArrowRight") {
            $("#row_0_column_0").next().addClass("ship");

            // $("#row_0").html().addClass("ship")
            // alert($('gamerow.ship').index())
        }

    });

});

