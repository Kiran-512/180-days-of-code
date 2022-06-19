console.log("odes js is working..")

function doubleIt(x){
    // return 2*x;
    let res = 2*x;       
    return {x,res};

}
res  =doubleIt(4)
console.log(res,typeof res)