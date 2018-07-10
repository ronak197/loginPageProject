<?php 
require "conn.php";
$user_name = $_POST["user_name"];
$password = $_POST["password"];
$first_name = $_POST["first_name"];
$last_name = $_POST["last_name"];
$age = $_POST["age"];
$mysql_qry = "insert into employee (firstname,lastname,age,username,password) values ('$first_name','$last_name','$age','$user_name','$password');";
if(($conn->query($mysql_qry)===TRUE)) {
    echo "Account sucessfully registered";
}
else {
echo "Error in Registration";
}
$conn->close();
?>
