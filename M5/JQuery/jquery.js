// light weight JS library

//browser independednt unlike JS

// Incraeased coding sppoed with reduced syntax

// ======== basic Introduction

$(document).ready(function () {
  console.log("Its working now");
});

// equivalent to =>  $(()=>{ statements; })

$(function () {
  console.log("Its working now new");

  $("#nav").css("border", "1px solid red");

  $("#nav li").css("border", "1px dotted green");

  // basically $ is used with the css selector this.images.length. $(selector)

  $("*").css("background", "pink");

  // .gt(n)// will seelect all the tags greater than the n
  // .lt(n) // will se elect all the tags lower than the n
  // :first
  // :last

  $("ul li:gt(2)").css("background", "blue");

  $("#nav li:lt(2)").css("background", "green");

  $("#nav li:eq(0)").css("background", "tomato");

  $("li:first-child").css("background", "pink");

  $("li:last-child").css("background", "red");

  //click event with jquery
  $(".head h3").click(() => {
    $(".head").html("<h1>Some heading with the bigger font size</h1>");
  });
  $(".head h3").mouseout(() => {
    $(".head").html("<h3>Some heading with the bigger font size</h3>");
  });

  //randomly change the color of the background  upon some key press
  $("body").keypress(() => {
    console.log("clicked on body");
    let bCol = Math.random();
    console.log(bCol);
    bCol = bCol * 100;
    console.log(bCol + 100);
    $("body").css("background", "rgb(var(--bCol),200,200)");
  });

  // jquery form events
  // focus(), blur(), change(), select(), submit()

  //focus()
  $("#name, #lname").focus(() => {
    console.log("is it wpokring! YES");
    $(this).css("background-color", "blue");
  });

  //change()
  $("#SCountry").change(() => {
    console.log("is it wpokring! YES");
    $("#SCountry").css("background-color", "red");
    $("#SCountry").css("color", "white");
  }); // Working_fine

  //submit()
  $("#formid").submit(() => {
    console.log("Form Submitted");
    alert("Thank you for your feedback!");
  });

  //change()
  $("#lname").select(() => {
    $("#lname").css("border", "4px solid red");
  });

  //blur()
  $("#lname").blur(() => {
    $("#lname").css("border", "none");
  });

  //Window events

  //load() -- deprecated
  //unload() -- deprecated
  //resize()
  // scroll()

  //load() -- deprecated
  //unload() -- deprecated
  //resize() -- when user scrolls event occurs
  $(window).resize(() => {
    console.log("user is resizing the window");
  });
  // scroll()
  $(window).scroll(() => {
    console.log("user is scrolling");
  });

  //get methods in jquery
  // text()
  // html()
  // val()
  // attr()

  // text()
  $("#btn").click(() => {
    console.log("event is working fine..");
    $("#box>h3").text("Heading changed");
    $("#box>p").text("paragraph also changed on click");
  });

  // html()
  $("#btn").click(() => {
    console.log("Event is working fine..");
    $("#box>h3").text("Heading changed");
    $("#box>p").text("paragraph also changed on click");

    $("#box>h3").html(
      "<h4>Welcome to the Show</h4> <br> <div id='dyn' style ='width:50%'> The grad celebration has just began</div>"
    );
  });

  // val()
  $("#btn").click(() => {
    console.log("all is working fine");
    let vl = $("#name").val();
    alert("Hello " + vl);
  });

  // attr() // will reaplce the existing classes with the new class
  $("#btn").click(() => {
    console.log("all is working fine");
    $("#box").attr("class", "box50"); // after this only box50 class would get applied on the div
  });

  //addClass(), removeClass() and toggleClass()

  $("#addclass").click(() => {
    $("#box1").addClass("red");
    $("#box1, h3").addClass("red");
    $("#box1, h3").addClass("blue red");
  });

  //======= CSS()
  // to apply inline css dynamically
  $("#box1").click(() => {
    $("#box1 > p").css("color", "red");
    //multiple css properties in one go
    $("#box1 > p").css({ background: "red", border: "1px solid red" });
  });

  //on(), off() methods
  // When we target single element and give multiple event on it so to avoid writing same code we can put all code of variuous events inside the single method on()

  $("#onDemo").on("mouseover mouseout", () => {
    console.log("onDemo working fine");
    $("#onDemo").toggleClass("red");
    // $(this).css({"background":"black", "color":"white"})
  });

  $("#onDemo").on({
    click: () => {
      console.log("onclick  working fine");
    },
    mouseout: () => {
      console.log("onmouseout working fine");
    },
    mouseover: () => {
      console.log("onmouseOver is working fine");
    },
  });

  $("#btn1").click(()=>{
    $("#onDemo").off("mouseover mouseout")
  })

  // =============== 15th SESSION strats from here..
});
