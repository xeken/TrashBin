import React, {Component} from 'react';
import './counter.scss';
import Delta from './Delta'
import Alpha from "./Alpha";

class Counter extends Component {
    state = {
        value: 0,
        alpha: 0,
        delta: 0
    };

    render() {
        let {value, alpha, delta} = this.state;

        return (
            <div className='counter'>
                <Alpha alpha={alpha} alphaChange={this.alphaChange}/>
                <Delta delta={delta} deltaChange={this.deltaChange}/>
                <button onClick={this.handlePlus}>+</button>
                <button onClick={this.handleMinus}>-</button>
                <button onClick={this.handleMultiply}>×</button>
                <button onClick={this.handleDivide}>÷</button>
                <br/>
                <input value={value} readOnly />
                <button id='valueToAlpha' onClick={this.valueToAlpha}> ↑ </button>
            </div>
        );
    }
    valueToAlpha = () => {
        this.setState({
            alpha: this.state.value
        });
    };
    handlePlus = () => {
        this.setState({
            value: this.state.alpha + this.state.delta
        });
    };
    handleMinus = () => {
        this.setState({
            value: this.state.alpha - this.state.delta
        })
    };
    handleMultiply = () => {
        this.setState({
            value: this.state.alpha * this.state.delta
        });
    };
    handleDivide = () => {
        this.setState({
            value: this.state.alpha / this.state.delta
        });
    };

    alphaChange = event => this.setState({
        alpha: parseInt(event.target.value)
    });

    deltaChange = event => this.setState({
        delta: parseInt(event.target.value)
    });
}

export default Counter;