import React, { Component } from 'react';


class DateOfBirth extends Component {
    constructor(props) {
        super(props);
        this.state={
            dob:'',
            totalAge:''
            
            
        }
        this.handleSubmit = this.handleSubmit.bind(this)
        this.handleChange = this.handleChange.bind(this)

    }
    handleChange(e){
        e.preventDefault()
        this.setState({
            dob:e.target.value
        })
    }
    handleSubmit() {
        //var dob = '19970530';
        /* var year = Number(this.state.dob.substr(0, 4));
        var month = Number(this.state.dob.substr(4, 2));
        var day = Number(this.state.dob.substr(6, 2)); */

        var enteredYear=new Date(this.state.dob)

        var today = new Date();
        console.log(today)
        var yearAge = today.getFullYear() - enteredYear.getFullYear();
        var monthAge = today.getMonth() - enteredYear.getMonth();
        var dayAge = today.getDate() - enteredYear.getDate();
        if(monthAge<0)
        {
            yearAge--;
            monthAge=12+monthAge;
        }
        if(dayAge<0)
        {
            monthAge--;
            dayAge=30+dayAge;
        }
        
        var message;
        message="your age is"+yearAge+" year"+monthAge+" month"+dayAge+" day old"
        this.setState({
            
            totalAge:message
        })
        
        //alert(+yearAge+" year "+monthAge+" month "+dayAge+" day old");
    }

    render() {
        return (
            <div>
                <input type="date" value={this.state.dob} onChange={this.handleChange}/>
                <button onClick={this.handleSubmit}>Submit</button>
                <h1>{this.state.totalAge}</h1>

            </div>
        );
    }
}

export default DateOfBirth;