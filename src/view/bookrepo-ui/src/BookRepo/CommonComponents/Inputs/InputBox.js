import '../Styles/InputComponents.css';
function InputBox(props){
    return(
        <span>
            <label className="inputLabel">{props.inputLabel}</label>
            <input className="inputBox" type={props.inputType} id={props.inputId}
                   onChange={e=>props.onChange(e.target.value)}/>
        </span>
    );
}

export default InputBox;