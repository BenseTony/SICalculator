$ ->
    $.get "/getValues", (persons) ->
        $.each persons, (index,person) ->
            $('#persons').append $("<li>").text person.interest_value