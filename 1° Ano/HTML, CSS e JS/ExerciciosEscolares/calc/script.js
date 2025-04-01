const display = document.getElementById("display");

function appendToDisplay(input){
    display.value += input;
}

function limparTela(){
    display.value = "";
}
function calcular(){
    try{
    display.value = eval(display.value);
    }
    catch(error){
        display.value = "Erro!";
    }
}