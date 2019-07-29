//======================================================================================================================
function GoldPlating() {
    alert ("Gold Plating :)");
}
//======================================================================================================================
function Zork(){
    v = document.getElementById("command").value;
    document.getElementById("message").innerHTML = "<b>You said: " + v + "</b>"

    if(document.getElementById("command").value == "attack")
    {
        document.getElementById("message").innerHTML = "<b>You didn't die :)...yet</b>"
    }
    if(document.getElementById("command").value == "kill")
    {
        document.getElementById("message").innerHTML = "<b>That was a close one!</b>"
    }
    if(document.getElementById("command").value == "dodge")
    {
        document.getElementById("message").innerHTML = "<b>Phew, it barely missed</b>"
    }
    if(document.getElementById("command").value == "boo")
    {
        document.getElementById("message").innerHTML = "<b>I wonder why that worked?</b>"
    }
    if(document.getElementById("command").value == "fire extinguisher")
    {
        document.getElementById("message").innerHTML = "<b>Cough Cough, the smoke is unbearable</b>"
    }
    if(document.getElementById("command").value == "hot tea")
    {
        document.getElementById("message").innerHTML = "<b>You know, maybe she was a good witch " +
            "and you just killed her :(</b>"
    }
    if(document.getElementById("command").value == "spell")
    {
        document.getElementById("message").innerHTML = "<b>You are a muggle, you can't cast spells...</b>"
    }
    if(document.getElementById("command").value == "no")
    {
        document.getElementById("message").innerHTML = "<b>Okay, you're dead</b>"
        alert("You just died, you will be redirected to main page in 5 sec.");
        setTimeout('Redirect()', 5000);
    }
}
//======================================================================================================================
function Redirect() {
    window.location = "http://localhost:8080/";
}
//======================================================================================================================
