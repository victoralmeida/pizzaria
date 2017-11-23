<?php 
require "conn.php";

$name = $_POST["name"];
$password = $_POST["password"];
$telefone = $_POST["telefone"];
$endereco = $_POST["endereco"];
$numero = $_POST["numero"];
$complemento = $_POST["complemento"];


$mysql_qry = "insert into cliente (nome, Senha, telefone, endereco, numero,complemento) values ('$name','$password','$telefone','$endereco','$numero','$complemento')";

if( $conn-> query($mysql_qry) === TRUE) {
    echo "Insert Sucsses";
}
else {
    echo "Error" . $mysql_qry . "<br>" . $conn->error;
}
 $conn->close();
?>