let singleQuotes = 'single quotes ki string';
let doubleQuotes = 'double quotes ki string';
console.log(singleQuotes)
console.log(doubleQuotes)
let char = singleQuotes.charAt(1);
let substr = singleQuotes.substring(2,5);
let ASCII = singleQuotes.charCodeAt(4);
console.log(char)
console.log(substr) 
console.log(ASCII) 
let arrstr = singleQuotes.split(" ");
console.log(arrstr);
let str = arrstr.join("%");
console.log(str);
