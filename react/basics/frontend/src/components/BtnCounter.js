import React, {useState} from 'react'

function BtnCounter(props) {

    const [count, setCount] = useState(0);

    return <> 
        <button
         onClick={ () => setCount(count+props.number)}
         >Press me</button>
        <p>Counter: {count}</p> 
    </>
}

export default BtnCounter;