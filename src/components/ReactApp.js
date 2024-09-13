
import React, { useEffect, useState } from 'react'
import axios from 'axios'
const URL='http://localhost:8080/mainapp/loadEmployee'

export default function ReactApp(props) {
    const[users,setUsers]=useState([]);
    const count=1
    useEffect(()=>{
        axios.get(URL).then((res)=>res.data).
        then((data)=>setUsers(data))
           
            
    },[])
  return (
    <div>
        
       { users.map((dt)=>(
          <div> Name:{dt.empName}-----City:{dt.empCity}</div>
          
          
))}
    </div>
  );
}

