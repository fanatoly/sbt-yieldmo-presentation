var shouldIPoll = true

function getElementById(id) {
    return document.getElementById(id);
}

function getElementByIdValue(id) {
    detectedTransport = null;
    return document.getElementById(id).value;
}

function displayResult(result){
    console.log("displaying result" + result)
    var list = $("#result");
    list.innerHtml("")
    for (i in result){
	list.append("<li>" + result[i] + "</li>");
    }
}

function stopPolling(){
    shouldIPoll = false
    $('#unsub').click(startPolling)
}

function startPolling(){
    shouldIPoll = true
    poll()
    $('#unsub').click(stopPolling)
}

function poll() {
    $.ajax("lab/log", {
	dataType: "json",
	success: function(result){
	    displayResult(result)
	    if(shouldIPoll) setTimeout(poll, 3000)
	}
    })
}

startPolling()



