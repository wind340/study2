function taskA(a, b) {
    return new Promise((resolve, reject) => {
      setTimeout(() => {
        const res = a + b;
        resolve(res);
      }, 3000);
    });
  }
  
  function taskB(a) {
    return new Promise((resolve, reject) => {
      setTimeout(() => {
        const res = a * 2;
        resolve(res);
      }, 1000);
    });
  }
  function taskC(a) {
    return new Promise((resolve, reject) => {
      setTimeout(() => {
        const res = a * -1;
        resolve(res);
      }, 2000);
    });
  }
  
//   taskA(5, 1).then((a_res) => {
//     console.log("A RESULT : ", a_res);
//     return taskB(a_res);
//   }).then((b_res)=>{
//     console.log("B RESULT : ", b_res);
//     return taskC(b_res);
//   }).then((c_res)=>{
//     console.log("C RESULT : ", c_res);
//   });

  const bPromiseResult = taskA(5, 1)
  .then((a_res) => {
    console.log("A RESULT : ", a_res);
    return taskB(a_res);
  });

  console.log("중간에 끊어 져도 변수에 담아서");
  console.log("비동기 처리는 이어진다");

  bPromiseResult.then((b_res) => {
    console.log("B RESULT : ", b_res);
    return taskC(b_res);
  })
  .then((c_res) => {
    console.log("C RESULT : ", c_res);
  });