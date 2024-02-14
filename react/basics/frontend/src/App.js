import logo from './logo.svg';
import './App.css';
import HeyText from './components/HeyText';
import BtnCounter from './components/BtnCounter';
import GeoLocate from './components/GeoLocate';
import {createContext, useContext } from 'react';
import LowerPriorityHOX from './components/LowerPriorityHOC';
import HigherPriorityHOC from './components/HigherPriorityHOC';

import { BrowserRouter as Router, Route, Routes, Link } from 'react-router-dom';

// Import your components
import Home from './pages/Home';
import About from './pages/About';
import Contact from './pages/Contact';

const HOCS = HigherPriorityHOC(LowerPriorityHOX)
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

        <HOCS name="Hello there from hocs!"></HOCS>

        <Router>
          <nav>
            <Link to="/">Home</Link> <br></br>
            <Link to="/about">About</Link> <br></br>
            <Link to="/contact">Contact</Link>
          </nav>

          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/about" element={<About />} />
            <Route path="/contact" element={<Contact />} />
          </Routes>
        </Router>
              
      </header>
    </div>
  );
}

function ContextComponent() {
  const value = useContext(context);
  return <p>{value}</p>
}

export default App;
