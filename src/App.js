import logo from './logo.svg';
import './App.css';
import MainApp from './components/MainApp';
import ReactApp from './components/ReactApp';
import MicroServicesApp from './components/MicroServicesApp';

function App() {
  return (
    <div className="App">
     
        Welcome to ReactJS
        <div>
        Monolithic demo:
        {/* <ReactApp/> */}
        </div>
        <div>
          Microservices Demo:
          <MicroServicesApp/>
        </div>
          
        
      
    </div>

  );
}

export default App;
