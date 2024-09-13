
import React, { useEffect, useState } from 'react'
import axios from 'axios'
const URL='http://win10-2-200:8888/cart/allProducts'

export default function MicroServicesApp() {
    const[products,setProducts]=useState([]);
    const count=1
    useEffect(()=>{
        axios.get(URL).then((res)=>res.data).
        then((data)=>setProducts(data))
           
            
    },[])
  return (
    <div>
        
       { products.map((dt)=>(
          <div> Product Name:{dt.productName}-----Quantity:{dt.quantity}-----Amount:{dt.amount}</div>
          
          
))}
    </div>
  );
  
}

