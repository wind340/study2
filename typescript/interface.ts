//타입을 지정
/*
type Player = {
  nickname:string,
  healthBar:number
}

const chul :Player = {
  nickname: "chul",
  healthBar: 10
}
type Food = string;
const godkimchi:Food = "delicious"
*/

// type은 특정값을 넣어줄수 있음.
/*
type Team = "red" | "blue" | "yellow"
type Health = 1 | 5 | 10

type Player = {
  nickname:string,
  team:Team
  health: Health
}

const chul :Player ={
  nickname:"jake",
  team:"red",
  health: 10
}
*/

//interface는 type과 같이 쓸수 있지만 type이 조금더 확장성이 좋다.
//interface는 오로지 오브젝트 모양을 타입스크립트에게 설명해 주기 위해서만 사용되는 키워드
//반면 type 오브젝트는 오브젝트 모양을 정해줄수도있고, 특정값으로 설정할수 있다
type Team = "red" | "blue" | "yellow";
type Health = 1 | 5 | 10;

interface Person {
  nickname: string;
  team: Team;
  health: Health;
}

type Player = {
  nickname: string;
  team: Team;
  health: Health;
};

const chul: Player = {
  nickname: "jake",
  team: "red",
  health: 10,
};

/*
interface Users{
  name:string
}

interface Players extends Users {
}

const chul2 : Players = {
  name: "jake"
}
이 코드를 type으로 바꿔준다면? */
type Users = {
  name: string;
};

type Players = Users & {};

const chul2: Players = {
  name: "jake",
};
// 하지만 이렇게 type으로 지정하는것은 객체지향적이지 않을수있다.
//아래의 인터페이스로 구현해보자

interface User2 {
  name: string;
}
interface User2 {
  lastName: string;
}
interface User2 {
  health: number;
}

const jungchul: User2 = {
  name: "jake",
  lastName: "c",
  health: 99,
};
