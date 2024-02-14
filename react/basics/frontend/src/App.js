import logo from './logo.svg';
import './App.css';
import HeyText from './components/HeyText';
import BtnCounter from './components/BtnCounter';
import GeoLocate from './components/GeoLocate';
import {createContext, useContext } from 'react';

const context = createContext();

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        
        <HeyText />
        
        <BtnCounter number={2}/>
        
        <GeoLocate />

        <context.Provider value="hello there from context!">
          <ContextComponent />
        </context.Provider>
      
      </header>
    </div>
  );
}

function ContextComponent() {
  const value = useContext(context);
  return <p>{value}</p>
}

export default App;
