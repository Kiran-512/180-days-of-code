window.addEventListener("DOMContentLoaded", () => {


  document.querySelector("#btn").addEventListener("click", () => {
    // console.log("click on fetch is working fine..")

    let xhr = new XMLHttpRequest();

    xhr.open("GET", "content/readme.txt", true);

    xhr.onprogress = () => {
      console.log("Its under progress...");
    };

    xhr.onload = () => {
        console.log("onload status is " + xhr.status);
      if (xhr.status == 200) {
        console.log(xhr.responseText);
      } else {
        console.log("Some error occured! ");
      }
    };

    xhr.onreadystatechange = () => {
        console.log("Ready state is  ", xhr.readyState)
      if (xhr.readyState == 4) {
        console.log("OUTPUT is " +xhr.responseText);
      }
    };

    xhr.send();

  });











});
