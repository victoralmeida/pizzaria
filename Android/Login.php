<?php 
require "conn.php";
//$user_name = "Gustavo";
//$user_pass = "123";
$user_name = $_POST["user_name"];
$user_pass = $_POST["password"];
$mysql_qry = "select * from cliente where nome like '$user_name' and senha like '$user_pass';";
$result = mysqli_query($conn ,$mysql_qry);
if(mysqli_num_rows($result) > 0) {
echo "login success";
}
else {
echo "login not success";
}
 
?>