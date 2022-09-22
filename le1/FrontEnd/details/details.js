let schedule = document.getElementById("schedule");
    schedule.textContent = `${localStorage.getItem("schedule")}`;


async function getAll(){
    let config = {
        method: "GET",
        Headers:{"Content-Type":"application/json"},
    }
    let httpRoute = await fetch("http://localhost:8080/clients/getAll",config);
    if(httpRoute.status === 200){
        const infoJson = await httpRoute.json();
        console.log(infoJson);
       
        for(i of infoJson){ 
                if(i.schedule==schedule.textContent){
                    console.log(i)
                    allInfo.innerText = `${i.full_name}
                    ${i.address}
                    ${i.phone}
                    ${i.charge}
                    ${i.schedule}
                    ${i.workdate}
                    ${i.worktype}
                    ${i.payment}`;
                }     
            }
        }
}
    getAll();