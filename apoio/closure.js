function inc(i){
  function add(j){
    return j + i;
  }
  return add;
}

incOne = inc(1);
incTwo = inc(2);

console.log(incOne(4));
console.log(incTwo(4));


for(var i = 0; i<5; i++){
  setTimeout(function timer() {
    console.log(i);
  }, i*1000);
}

for(var i = 0; i<5; i++){
  (function() {
    var j = i;
    setTimeout(function timer() {
      console.log(j);
      
    }, i*1000);
  })();
}

for(var i = 0; i<5; i++){
  (function(j) {
    setTimeout(function timer() {
      console.log(j);
      
    }, i*1000);
  })(i);
}

for(var i = 0; i<5; i++){
    let j = i;
    setTimeout(function timer() {
      console.log(j);
    }, j*1000);
}

for(let i = 0; i<5; i++){
    setTimeout(function timer() {
      console.log(i);
    }, i*1000);
}


var x = 10;
var y = 20;

(function minhaFuncao(a,b){
  console.log(a+b);
})(x, y);

console.log(a);
console.log(b);
