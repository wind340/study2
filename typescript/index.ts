//간단한 변수 타입지정 가능
let name2: string = "kim";

//array
let name3: string[] = ["kim", ""];

//object
let name4: { name: string } = { name: "kim" };
let name5: { name?: string } = { name: "kim" };

//Union
let name6: string | number = "kim";

//Type alias
type Name = string | number;

let name7: Name = 123;

//함수에 타입 지정 가능

function Naming(x: number): number {
  return x * 2;
}

//array에 쓸 수 있는 tuple 타입

type Member = [number, boolean]; // 타입변수생성
let john: Member = [123, true];

//object 속성
type Member2 = { [key: string]: string }; //키값은 모두 문자, 벨류도 문자
let name8: Member2 = { name: "kim", age: "123" };

//class타입지정 가능
class User {
  name: string;
  construntor(name: string) {
    this.name = name;
  }
}
