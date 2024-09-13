import { Component } from "react";

export default class FooterComponent extends Component{
    render(){
        return(
            <div>
                <p>
                    {this.props.fd}
                </p>
            </div>
        )
    }
}