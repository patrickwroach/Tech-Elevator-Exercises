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
    });

    $("input[name=ShippingType]:radio").change(function() {
        $("#shipping").find(".price").html("$" + $(this).attr('data-cost'));
        var shippingPrice = parseFloat($(this).attr('data-cost'));
        var grandTotal = parseFloat($("#subtotal").find(".price").html().replace("$", ""));
        $("#grandtotal").find(".price").html("$" + (shippingPrice + grandTotal).toFixed(2));
    });


    $(document).on("keydown", function (event) {
        switch(event.key){
            case "ArrowRight":
                $(".ship").next().addClass("ship");
                $(".ship").prev().removeClass("ship");
                break;

            case "ArrowLeft":
                $(".ship").prev().addClass("ship");
                $(".ship").next().removeClass("ship");
                break;

            case "ArrowDown":
                var newLocation = $(".ship").index();
                $(".ship").parent().next().children().eq(newLocation).addClass("ship");
                $(".ship").parent().prev().children().removeClass("ship");
                break;

            case "ArrowUp":
                var newLocation = $(".ship").index();
                $(".ship").parent().prev().children().eq(newLocation).addClass("ship");
                $(".ship").parent().next().children().removeClass("ship");
                break;


        }

    });

    $(btnRestart).click(function(){
        $(".ship").removeClass("ship");
        $("#row_0_column_0").addClass("ship");
    });

});

