import { render } from "@testing-library/react"

function AddUser(props){
    const addUser=(e)=>{
        e.preventDefault();
        const uname=e.target.elements.uname.value
        const password=e.target.elements.email.value
        const mail=e.target.elements.password.value
        props.addUserdata(uname)
    }
    return(
        <div>
            <form onSubmit={addUser}>
            Username<input type="text" name="uname"/>
            Email:<input type="email" name="email"/>
            Password:<input type="password" name="password"/>
                <button>Add User</button>
            </form>
        </div>
    )
}
export default AddUser