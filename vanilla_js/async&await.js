function hello() {
    return "hello";
  }
  
  async function helloAsync() {
    return "hello Async";
  }
  
// console.log(hello());
// console.log(helloAsync());

  helloAsync().then((res) => {
    console.log(res);
  });
// then을 사용해주면 promise resolve 에 리턴값을 넘겨받아온다.


//이번엔 delay 3초 지나서 출력되는 비동기 방식을 만들어보자
function delay(ms) {
    return new Promise((resolve) => {
      setTimeout(resolve, ms);
    });
  }
  
//   async function helloAsync() {
//     return delay(3000).then(()=>{
//       return "hello Async";
//     });
//   } 3초 딜레이되고 return해주는 코드이다.
// await을 대신 사용해보자  
async function helloAsync() {
    await delay(3000);  //async안에서만 사용 가능한 동기수행
      return "hello Async";
  }

  helloAsync().then((res) => {
    console.log(res);
  });
