$ ->
    $.get "/getValues", (interests) ->
        $.each interests, (index,interest) ->
            $('#interests').append $("<li>").text interest.interest_value