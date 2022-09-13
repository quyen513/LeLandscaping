const createBtn = document.getElementById("createClientBtn");

const cName = document.getElementById("clientnameInput");
const cAddress = document.getElementById("clientaddressInput");
const cPhone = document.getElementById("clientphoneInput");
const chargeInput = document.getElementById("chargeInput");
const cfreqInputhone = document.getElementById("freqInput");
const ctypeInput = document.getElementById("typeInput");
const cpaymentInput = document.getElementById("paymentInput");
const cscheduleInput = document.getElementById("scheduleInput");
const cdateInput = document.getElementById("dateInput");

createBtn.addEventListener("click",newClient);


async function newClient(event){

    const httpRoute = "http://localhost:8080/client/createNewClient";
    let response = await fetch(httpRoute, {
        headers:{"Content-Type": "application/json"},
        method: ["POST"],
        body: JSON.stringify({
            full_name: cName.value,
            address: cAddress.value,
            phone: cPhone.value,
            charge: chargeInput.value,
            frequent: cfreqInputhone.value,
            worktype: ctypeInput.value,
            payment: cpaymentInput.value,
            schedule: cscheduleInput.value,
            workdate: cdateInput.value
        }),
    });
    
    if (response.status === 201){
       
        alert("created client");

    } else {
        alert ("something's wrong");
    }

}