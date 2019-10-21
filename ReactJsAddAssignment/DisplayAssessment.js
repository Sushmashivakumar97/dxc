import React, { Component } from 'react';

class DisplayAssessment extends Component {
    render() {
         var createItem1 = function(itemText1) {return <div>{itemText1}</div>}
         var createItem2 = function(itemText2) {return <div>{itemText2}</div>}
         return <table cellpadding="10" cellspacing="10" align="center" >
                <th>
                    <td>Company</td>
                    <td>Description</td>
                </th>
                <tr>
                    <td> {this.props.i1.map(createItem1)}</td>
                    <td> {this.props.i2.map(createItem2)}</td>
                </tr>
                </table>
        
    }
}

export default DisplayAssessment;