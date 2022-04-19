import React,{useState} from "react";

const Counter = ()=>{

    //요구 조건 0에서 출발, 1씩 증가, 1씩 감소, count 상태
    const [count, setCount] = useState(0);

    const onIncrease = () =>{
        setCount(count + 1);
    }
    const onDecrease = ()=>{
        setCount(count -1 );
    }
    return (
        <div>
            <h2>{count}</h2>
            <button onClick={onIncrease}>+</button>
            <button onClick={onDecrease}>-</button>
        </div>
    )    
}

export default Counter;
