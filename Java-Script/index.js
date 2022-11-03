let courseCode = prompt("Enter Course Code");
let instructor = prompt("Enter Instructor Name");


// function that will merge and return these two values into 1 sentence
function merge(){
    return courseCode + " " + instructor;
}

// function that will display the sentence you created in 2
function display(){
    let val = merge();
    document.getElementById('val').innerHTML = val;
}

// Calling only one of the function, so that both functions are triggered
display();

