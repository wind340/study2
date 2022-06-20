//간단한 변수 타입지정 가능
var name2 = "kim";
//array
var name3 = ["kim", ""];
//object
var name4 = { name: "kim" };
var name5 = { name: "kim" };
//Union
var name6 = "kim";
var name7 = 123;
//함수에 타입 지정 가능
function Naming(x) {
    return x * 2;
}
var john = [123, true];
var name8 = { name: "kim", age: "123" };
//class타입지정 가능
var User = /** @class */ (function () {
    function User() {
    }
    User.prototype.construntor = function (name) {
        this.name = name;
    };
    return User;
}());
