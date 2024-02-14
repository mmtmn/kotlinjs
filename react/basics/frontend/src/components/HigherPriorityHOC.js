import React from 'react';

function HigherPriorityHOC(WrappedComponent) {
    return function(props) {
        return (<div style={{color:'red'}}>
            <WrappedComponent{...props} />
        </div>
        );
    };
}

export default HigherPriorityHOC;