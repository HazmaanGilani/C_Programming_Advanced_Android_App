
<!-- Download the graphics file below, unzip, and place in directory with quiz  -->

http://www.javascriptsource.com/miscellaneous/multi-quiz.zip

<!-- Paste this code into an external JavaScript file named: quiz_functions.js  -->

/* This script and many more are available free online at
The JavaScript Source :: http://www.javascriptsource.com
Created by: James Crooke :: http://www.cj-design.com */

var useranswers = new Array();
var answered = 0;

function renderQuiz() {
  for(i=0;i<questions.length;i++) {
    document.writeln('<p class="question">' + questions[i] + ' <span id="result_' + i + '"><img src="blank.gif" style="border:0" alt="" /></span></p>');
    for(j=0;j<choices[i].length;j++) {
      document.writeln('<input type="radio" name="answer_' + i + '" value="' + choices[i][j] + '" id="answer_' + i + '_' + j + '" class="question_' + i + '" onclick="submitAnswer(' + i + ', this, \'question_' + i + '\', \'label_' + i + '_' + j + '\')" /><label id="label_' + i + '_' + j + '" for="answer_' + i + '_' + j + '"> ' + choices[i][j] + '</label><br />');
    }
  }
  document.writeln('<p><input type="submit" value="Show Score" onclick="showScore()" /> <input type="submit" value="Reset Quiz" onclick="resetQuiz(true)" /></p><p style="display:none"><img src="correct.gif" style="border:0" alt="Correct!" /><img src="incorrect.gif" style="border:0" alt="Incorrect!" /></p>');
}
function resetQuiz(showConfirm) {
  if(showConfirm)
    if(!confirm("Are you sure you want to reset your answers and start from the beginning?"))
      return false;
  document.location = document.location;
}
function submitAnswer(questionId, obj, classId, labelId) {
  useranswers[questionId] = obj.value;
  document.getElementById(labelId).style.fontWeight = "bold";
  disableQuestion(classId);
  showResult(questionId);
  answered++;
}
function showResult(questionId) {
  if(answers[questionId] == useranswers[questionId]) {
    document.getElementById('result_' + questionId).innerHTML = '<img src="correct.gif" style="border:0" alt="Correct!" />';
  } else {
    document.getElementById('result_' + questionId).innerHTML = '<img src="incorrect.gif" style="border:0" alt="Incorrect!" />';
  }
}
function showScore() {
  if(answered != answers.length) {
    alert("You have not answered all of the questions yet!");
    return false;
  }
  questionCount = answers.length;
  correct = 0;
  incorrect = 0;
  for(i=0;i<questionCount;i++) {
    if(useranswers[i] == answers[i])
      correct++;
    else
      incorrect++;
  }
  pc = Math.round((correct / questionCount) * 100);
  alertMsg = "You scored " + correct + " out of " + questionCount + "\n\n";
  alertMsg += "You correctly answered " + pc + "% of the questions! \n\n";
  if(pc == 100)
    alertMsg += response[0];
  else if(pc >= 90)
    alertMsg += response[1];
  else if(pc >= 70)
    alertMsg += response[2];
  else if(pc > 50)
    alertMsg += response[3];
  else if(pc >= 40)
    alertMsg += response[4];
  else if(pc >= 20)
    alertMsg += response[5];
  else if(pc >= 10)
    alertMsg += response[6];
  else
    alertMsg += response[7];
  if(pc < 100) {
    if(confirm(alertMsg))
      resetQuiz(false);
    else
      return false;
  } else {
    alert(alertMsg);
  }
}
function disableQuestion(classId) {
  var alltags=document.all? document.all : document.getElementsByTagName("*")
  for (i=0; i<alltags.length; i++) {
    if (alltags[i].className == classId) {
      alltags[i].disabled = true;
    }
  }
}




<!-- Paste this code into the HEAD section of your HTML document.
     You may need to change the path of the file.  -->

<script type="text/javascript" src="quiz_functions.js"></script>



<!-- Paste this code into an external JavaScript file named: quiz_config.js  -->

/* This script and many more are available free online at
The JavaScript Source :: http://www.javascriptsource.com
Created by: James Crooke :: http://www.cj-design.com */

var questions = new Array();
var choices = new Array();
var answers = new Array();
var response = new Array();

// To add more questions, just follow the format below.

questions[0] = "1) JavaScript is ...";
choices[0] = new Array();
choices[0][0] = "the same as Java";
choices[0][1] = "kind of like Java";
choices[0][2] = "different than Java";
choices[0][3] = "ther written part of Java";
answers[0] = choices[0][2];

questions[1] = "2) JavaScript is ...";
choices[1] = new Array();
choices[1][0] = "subjective";
choices[1][1] = "objective";
choices[1][2] = "evil";
choices[1][3] = "object based";
answers[1] = choices[1][3];

questions[2] = "3) To comment out a line in JavaScript ...";
choices[2] = new Array();
choices[2][0] = "Precede it with two forward slashes, i.e. '//'";
choices[2][1] = "Precede it with an asterisk and a forward slash, i.e. '*/'";
choices[2][2] = "Precede it with an asterisk, i.e. '*'";
choices[2][3] = "Precede it with a forward slash and an asterisk, i.e. '/*'";
answers[2] = choices[2][0];

questions[3] = "4) JavaScript can only run on Windows";
choices[3] = new Array();
choices[3][0] = "True";
choices[3][1] = "False";
answers[3] = choices[3][1];

questions[4] = "5) Semicolons are optional at the end of a JavaScript statement.";
choices[4] = new Array();
choices[4][0] = "True";
choices[4][1] = "False";
answers[4] = choices[4][0];

questions[5] = "6) The four basic data types are:";
choices[5] = new Array();
choices[5][0] = "strings, numbers, BooBoos, and nulls";
choices[5][1] = "strings, text, Booleans, and nulls";
choices[5][2] = "strings, numbers, Booleans, and nulls";
choices[5][3] = "strings, numbers, Booleans, and zeros";
answers[5] = choices[5][2];

// response for getting 100%
response[0] = "Excellent, top marks!";
// response for getting 90% or more
response[1] = "Excellent, try again to get 100%!"
// response for getting 70% or more
response[2] = "Well done, that is a good score, can you do better?";
// response for getting over 50%
response[3] = "Nice one, you got more than half of the questions right, can you do better?";
// response for getting 40% or more
response[4] = "You got some questions right, you can do better!";
// response for getting 20% or more
response[5] = "You didn't do too well, why not try again!?";
// response for getting 10% or more
response[6] = "That was pretty poor!  Try again to improve!";
// response for getting 9% or less
response[7] = "Oh dear, I think you need to go back to school (or try again)!";




<!-- Paste this code into the HEAD section of your HTML document.
     You may need to change the path of the file.  -->

<script type="text/javascript" src="quiz_config.js"></script>



<!-- Paste this code into the BODY section of your HTML document  -->

<script type="text/javascript">
<!--
  renderQuiz();
//-->
</script>
<p><div align="center">
<font face="arial, helvetica" size"-2">Free JavaScripts provided<br>
by <a href="http://javascriptsource.com">The JavaScript Source</a></font>
</div><p>


