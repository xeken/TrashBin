import React from 'react';
import PropTypes from 'prop-types';

const Delta = props => (
    <div>
        <input value={props.delta} onChange={props.deltaChange}/>
    </div>
);

Delta.propTypes = {};

export default Delta;

