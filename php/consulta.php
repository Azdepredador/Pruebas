<?php
include('functions.php');
$reservaID=$_GET["reservaID"];
$flag=False;


if($resultset=getSQLResultSet("SELECT cajon FROM `reserva` WHERE reservaID='$reservaID'")){
	while ($row = $resultset->fetch_array(MYSQLI_NUM)){
		echo json_encode($row);
		$flag=True;
	}
	
	if(!$flag){
	    echo "Error!";
	}
}


?>