/* 1. Дан код:
var a = 1, b = 1, c, d;
c = ++a; alert(c);           // 2
d = b++; alert(d);           // 1
c = (2+ ++a); alert(c);      // 5
d = (2+ b++); alert(d);      // 4
alert(a);                    // 3
alert(b);                    // 3
Почему код даёт именно такие результаты?
*/
function task_2_1(){
var a = 1, b = 1, c, d;
c = ++a; alert(`c = ++a --> a+1 = ${c}`);          
d = b++; alert(`d = b++ --> d = b --> b+1, ${d}`);           
c = (2+ ++a); alert(`c = (2+ ++a) --> 2 + 2 + 1 --> ${c}`);      
d = (2+ b++); alert(`d = (2+ b++) --> 2 + 2, --> b+1 --> ${d}`);     
alert(`a = 1+1+1 --> ${a}`);                    
alert(`b = 1+1+1 --> ${b}`);
}                    