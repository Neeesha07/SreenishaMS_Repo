import { Component } from "react";
import HeaderComponent from "./Header";

import UserList from "./USerList";
import AddUser from "./AddUser";
import Footer2 from "./footer2";

export default class MainApp extends Component{
    
    state={
        users:[]
  
    }
    addUser=(input)=>{
        this.setState((prevState)=>{
            return{
                users:prevState.users.concat(input)
            }
        })
    }

    deleteAll=()=>{
        this.setState(()=>
        {
            return{ users:[]}
        }
    )
    }

    componentDidMount=()=>{
        const json=localStorage.getItem("usersData")
        const users=JSON.parse(json)
        if(users){
        this.setState(
         ()=>{
             return {
                 users
             }
        })
       
    }
}
    componentDidUpdate=()=>{
        const json=JSON.stringify(this.state.users)
        localStorage.setItem("usersData",json)
      
    }
    

    render(){

        const headerdata="This is header";
        const footerdata="This is footer";
    
            return(
            <>
            <header>
            <HeaderComponent hd={headerdata}/>
            </header>

            <div>
                <h2>
                    Welcome to MainApp
                </h2>
                <p>
                    <AddUser addUserdata={this.addUser}/>
                    <UserList list={this.state.users}/>
                </p>
             
            </div>
            <footer>
            <Footer2 delete={this.deleteAll}/>
            </footer>
            </>
        )
    }
}