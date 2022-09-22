const createNewClientBtn = document.getElementById("createNewClientBtn");
const AHouses = document.getElementById("AHouses");
const BHouses = document.getElementById("BHouses");
const DetailA = document.getElementById("DetailA");
const DetailB = document.getElementById("DetailB");
const allInfo = document.getElementById("allInfo");

function createNewClientPage(){
    window.location.href = "D:/QbvProjects/LeLandscaping/le1/FrontEnd/createNewClient/createNewClient.html"
}createNewClientBtn.addEventListener("click",createNewClientPage);

function detailA(){
    localStorage.setItem("schedule","A");
    window.location.href ="D:/QbvProjects/LeLandscaping/le1/FrontEnd/details/details.html";
}DetailA.addEventListener("click",detailA);

function detailB(){
    localStorage.setItem("schedule","B");
    window.location.href ="D:/QbvProjects/LeLandscaping/le1/FrontEnd/details/details.html";
}DetailB.addEventListener("click",detailB);

async function getAll(){
    let countA=0, countB=0;
    let config = {
        method: "GET",
        Headers:{"Content-Type":"application/json"},
    }
    let httpRoute = await fetch("http://localhost:8080/clients/getAll",config);
    if(httpRoute.status === 200){
        const infoJson = await httpRoute.json();
        console.log(infoJson);
        for(i of infoJson){ 
            if(i.schedule=="A"){
                countA++;
            }else if ( i.schedule=="B"){
                countB++;
            }
        }
        console.log(countA,countB)
        AHouses.innerText = countA + " houses";
        BHouses.innerText = countB + " houses";
    }
}
getAll();