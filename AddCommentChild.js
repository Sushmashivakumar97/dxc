import React, { Component } from 'react';

class AddCommentChild extends Component {
    render() {
        
            return <ol>{this.props.i.map(function(itemText) {return <li>{itemText}</li>})}</ol>;
        
    }
}

export default AddCommentChild;