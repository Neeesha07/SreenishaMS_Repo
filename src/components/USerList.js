import User from "./User"

function UserList(props){
    return(
        <div>
             <p>UserList</p>
            {props.list.map((data)=><User udata={data}/>)}

        </div>
    )
}
export default UserList