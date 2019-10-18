import React, { Component } from 'react';
import AddCommentChild from './AddCommentChild'

class AddComment extends Component {
    constructor(props) {
        super(props);
        this.state={
            item:[],
            
            txt:''
        }
        this.Change=this.Change.bind(this)
        this.AddComment=this.AddComment.bind(this)
    }
    Change(e)
    {
        this.setState({txt:e.target.value})
    }
    AddComment(e)
    {
        e.preventDefault()
        var nextTxt=''
        var nextItem=this.state.item.concat([this.state.txt]);
        this.setState({
            txt:nextTxt,
            item:nextItem
            
        })
        
    }
    
    render() {
        
        return (
            <div>
            
            <form onSubmit={this.AddComment}>
                <input value={this.state.txt} onChange={this.Change}/>
                <button>Add Comment</button><br/>
                <AddCommentChild i={this.state.item}/>   
               
            </form>
            </div>
        );
        
    }
}

export default AddComment;