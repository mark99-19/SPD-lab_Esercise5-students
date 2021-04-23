A simple Java program that communicates between a client (Student.java) and a server (University.java),<br>
using
<ul>
<li>Java.net.Socket,</li>
<li>JSON as data interchange format.</li>
<li>Gson library (made by Google). Check for more informations <a href="https://code.google.com/p/google-gson/">here</a>)</li>
</ul>


The text of the homework:<br>
<ul>
<li>Build a server application <i>University</i> that receives data from a client application <i>Student</i>.<li>
<li>The Student send through sockts to University data related to a specific student:</li>
  <ul>
  <li>Personal details: Name, Surname, Year of Birth, Place of Residence (multi-attributes field)</li>
  <li>List of passed exams: for each exam, store Exam Name, Mark and Date of Verbalization</li>
  </ul>
<li>The <i>University</i> receives the message from the socket and prints the student's stats.</li>
<li>The solution must be built by using JSON as data interchange format (you can use the GSON library!)</li>
</ul>
