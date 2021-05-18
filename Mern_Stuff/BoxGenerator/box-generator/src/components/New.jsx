import React, {useState} from 'react';
const New = ({createBox}) => {
    const [newColor, setNewColor] = useState("");
    const [error, setError] = useState("");
    const submitColor = (event) => {
        event.preventDefault(); //stops page refresh when submitting form
        // validations
        let errs = false;
        if(newColor.length < 3) {
            setError("Use a color bigger than 3 please!");
            errs = true;
        }
        // success
        if(!errs) {
            setError(null);
            console.log(newColor);
            createBox({color: newColor});
        }
    }
    return (
        <>
        What the user is typing: {newColor}
        <br/>
        {error}
        <br/>
        <form onSubmit={submitColor}>
            <input type="text" value={newColor} onChange={e => setNewColor(e.target.value)}/>
            <br/>
            <input type="submit" value="Choose your color!" />
        </form>
        </>
    )
}
export default New;

