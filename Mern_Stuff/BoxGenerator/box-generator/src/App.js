import react, {useState} from 'react';
import './App.css';
import Boxes from './components/Boxes';
import New from './components/New';

function App() {

  const [boxes, setBoxes] = useState([
    {color: "blue"},
    
  ])

  const createBox = (box) => {
    setBoxes([...boxes, box])
  };


  return (
    <div className="App">
      <h1>How many boxes will we have?!</h1>
      <New createBox={createBox}/>
      <Boxes boxes={boxes}/>
    </div>
  );
}

export default App;
