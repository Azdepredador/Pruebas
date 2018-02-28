<?php
include('functions.php');
$reservaID=$_GET["reservaID"];

if($resultset=getSQLResultSet("SELECT * FROM `reserva` WHERE reservaID='$reservaID'")){
    
	if($resultset->num_rows >0){
             
             ejecutarSQLCommand("DELETE FROM `reserva` WHERE reservaID='$reservaID'");
             echo "de";
              
	}
	
       
}


?>