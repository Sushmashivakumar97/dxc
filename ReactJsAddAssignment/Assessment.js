import React, { Component } from 'react';
import DisplayAssessment from './DisplayAssessment'

class Assessment extends Component {
    constructor(props) {
        super(props);
        this.state={
            a:'',
            b:'',
            msg1:[],
            msg2:[]

        }
        this.Change1=this.Change1.bind(this)
        this.Change2=this.Change2.bind(this)
        
        this.Click=this.Click.bind(this)
    }
    Change1(e)
    {
        this.setState({
            a:e.target.value
            
        })
    }
    Change2(e)
    {
        this.setState({
            b:e.target.value
            
        })
    }
    
    Click(e)
    {
        e.preventDefault();
        var nxtmsg1='';
        var nxtmsg2='';
        var nxtItem1=this.state.msg1.concat(this.state.a)
        var nxtItem2=this.state.msg2.concat(this.state.b)
        this.setState({
            msg1:nxtItem1,
            msg2:nxtItem2,
            
            a:nxtmsg1,
            b:nxtmsg2
        })
    }
    
    
    render() {
        return (
            <div>
               
              <input type="text" value={this.state.a} onChange={this.Change1}/>
              <input type="text" value={this.state.b} onChange={this.Change2}/>
              <button onClick={this.Click}>Add</button>
              <DisplayAssessment i1={this.state.msg1} i2={this.state.msg2}/>
            </div>
        );
    }
}

export default Assessment;