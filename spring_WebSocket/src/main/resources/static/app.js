let stompClient = null;
let setConnected = (connected) => {
    $("#connect").prop("disabled", connected);
    $("#disconnect").prop("disabled", !connected);
    if (connected) {
        $("#conversation").show();
        $("#chat").show();
    } else {
        $("#conversation").hide();
        $("#chat").hide();
    }
    $("#greeting").html("");
}
let connect = () => {
    if (!$("#name").val()) {
        return;
    }
    let socket = new SockJS('/chat');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        setConnected(true);
        stompClient.subscribe('/topic/greeting', function (greeting) {
            showGreeting(JSON.parse(greeting.body));
        });
    });
}
let disconnect = () => {
    if (stompClient) {
        stompClient.disconnect();
    }
    setConnected(false);
}
let sendMessage = () => {
    stompClient.send("/app/hello", {},
        JSON.stringify({
            name: $("#name").val(),
            content: $("#content").val(),
        }));
}
let showGreeting = (message) => {
    $("#greeting").append(`<div>${message.name}: ${message.content}</div>`);
}

$("#connect").click(function () {
    connect();
});
$("#disconnect").click(function () {
    disconnect();
});
$("#send").click(function () {
    sendMessage();
});