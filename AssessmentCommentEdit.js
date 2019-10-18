import React, { Component } from 'react';

class AssessmentCommentEdit extends Component {
    constructor(props) {
        super(props);
        this.state={a:'',
                    m:'',
                    valid:true,
                    buttontxt: "Add",
                    count:0,
                    
                    };
        this.Change=this.Change.bind(this)
        this.Display=this.Display.bind(this)
    }
    
            
            Change(e)
            {
                this.setState({a:e.target.value})
            }
            Display(e)
            {
                e.preventDefault()
                
                if(this.state.buttontxt=="Add")
                {
                    
                    this.setState(c=>({
                                m:this.state.a,
                                buttontxt:"EDIT",
                                count:c.count+1
                             }));
                }
                
                else
                {
                    var nextTxt='';
                    this.setState({
                                m:this.state.a,
                                buttontxt:"Add",
                                a:nextTxt
                            
                             })
                }
            }
     
    render() {
        return (
            <form onSubmit={this.Display}>
             <input value={this.state.a} onChange={this.Change}></input>
             <button>{this.state.buttontxt }</button><br/>
             <h1>{this.state.m}<br/>numer of added comments: {this.state.count}</h1>
             </form>
        );
    }
}

export default AssessmentCommentEdit;