import { Component } from "react";

export default class HeaderComponent extends Component{

render(){
    return(
        <div>
            <p>
                {this.props.hd}
            </p>
         </div>
    )
}

}