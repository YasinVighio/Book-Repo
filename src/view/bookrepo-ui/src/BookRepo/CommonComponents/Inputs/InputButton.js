import '../Styles/InputComponents.css';

function InputButton(props){
    return(
        <input className="inputButton" type="button" value={props.buttonText} onClick={props.clickFunction}/>
    )
}

export default InputButton;