const OddEvenResult =({ count })=>{
    console.log(count)
    return <>{count % 2 === 0? "홀수" : "짝수"}</>;
};

export default OddEvenResult;