<?php include ('functions.php');


$reservaID=$_GET['reservaID'];
$marcaModelo=$_GET['marcaModelo'];
$cajon=$_GET['cajon'];
$discapacidad=$_GET['discapacidad'];
$fechaHora=$_GET['fechaHora'];
$estado=$_GET['estado'];
$telefono= $_GET['telefono'];

$flag=True;
$flag2=True;

if($resultset=getSQLResultSet("SELECT * FROM `reserva` WHERE cajon='$cajon'")){
       
	if($resultset->num_rows >0){
                echo "lo";
               //$send='10';
               //echo json_encode($send);
                $flag=False;
	}

      if($flag){


        if($result=getSQLResultSet("SELECT * FROM `reserva` WHERE reservaID='$reservaID'")){
            
            if($result->num_rows >0){
                  echo "lp";
                // echo "pl";
                 // echo json_encode("placa");
                  
                  $flag2=False;
                }

                if($flag2){

                  echo "lu";
                  ejecutarSQLCommand("INSERT INTO  `reserva` 
                 (reservaID,marcaModelo,cajon,discapacidad,fechaHora,estado,telefono)
                  VALUES (
                  '$reservaID' ,
                  '$marcaModelo',
                  '$cajon',
                  '$discapacidad',
                    NOW(),
                  '$estado',
                  '$telefono')
                  ;");

                }




        }



       
       

      }

    

}



 ?>