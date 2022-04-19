import React,{useState} from "react";
import OddEvenResult from "./OddEvenResult";

const Counter = ({initialValue})=>{ //비구조화 할당으로도 받아올수 있다.
    //요구 조건 0에서 출발, 1씩 증가, 1씩 감소, count 상태
    const [count, setCount] = useState(initialValue);

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
            <OddEvenResult count={count}/>
        </div>
    )    
}

Counter.defaultProps ={
    initialValue: 0,
}

export default Counter;
