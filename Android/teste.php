<?php
    $db_name = "employee101";
    $mysql_username = "root";
    $mysql_password = "";
    $server_name = "localhost";
    $conn = mysqli_connect($server_name, $mysql_username, $mysql_password,$db_name);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

$sql = "SELECT name from employee_data";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
    while($row = $result->fetch_assoc()) {
        $r[]=$row;
        $check=$row['name'];

    }
} else {
    echo "0 results";
}
//$num_rows = mysql_num_rows($sql);

if($check==NULL){
  //  $r[$num_rows]="Record is not available";
    print(json_encode($r));
}else{
    //$r[$num_rows]="success";
    print(json_encode($r));
}

$conn->close();
?>
