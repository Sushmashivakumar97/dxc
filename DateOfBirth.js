import React, { Component } from 'react';


class DateOfBirth extends Component {
    constructor(props) {
        super(props);
        this.state={
            dob:'',
            
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
        var year = Number(this.state.dob.substr(0, 4));
        var month = Number(this.state.dob.substr(4, 2));
        var day = Number(this.state.dob.substr(6, 2));
        var today = new Date();
        console.log(today)
        var age = today.getFullYear() - year;
        if (today.getMonth() < month || (today.getMonth() == month && today.getDate() < day)) {
            age--;
        }
        
        alert(age);
    }

    render() {
        return (
            <div>
                <input type="date" value={this.state.dob} onChange={this.handleChange}/>
                <button onClick={this.handleSubmit}>Submit</button>
                

            </div>
        );
    }
}

export default DateOfBirth;