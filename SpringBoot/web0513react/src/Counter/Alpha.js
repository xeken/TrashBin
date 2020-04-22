import React from 'react';
import PropTypes from 'prop-types';

const Alpha = props => (
    <div>
        <input value={props.alpha} onChange={props.alphaChange}/>
    </div>
);

Alpha.propTypes = {};

export default Alpha;