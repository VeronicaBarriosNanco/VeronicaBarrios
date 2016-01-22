<?php
class Generador
{
static private $instancia = NULL;
private function __construct(){}    
static public function getInstancia() 
{
   if (self::$instancia == NULL) {
      self::$instancia = new Generador ();
   }
return self::$instancia;
}
 
function palabras($min = 4, $max = 8)
{		
	$vocales 	= array('a', 'e', 'i', 'o', 'u');
	$consonantes 	= array('b', 'c', 'd', 'f', 'g', 'j', 'l', 'm', 'n', 'p', 'r', 's', 't');
	$tamano 	= intval(rand($min, $max));
	$actual		= intval(rand(1,2));		
	$nombre 	= '';	
	for($x=0;$x<$tamano;$x++)
	{			
		if($actual == 0)
		{
			$actual	= 1;
			$pos 	= rand(0,count($vocales)-1);
			$nombre	.=  $vocales[$pos];				
		}
		else			
		{
			$actual	= 0;
			$pos 	= rand(0,count($consonantes)-1);
			$nombre	.=  $consonantes[$pos];				
		}				
	}
	return ucfirst($nombre);
}
}
$nombreBD = $_POST ["txtnombd"];
$nombreTL = $_POST ["txtnomtb"];
$filas = $_POST ["txtnum"];


$i = 1;

$file = fopen($nombreBD.".sql", "w");

fwrite($file, "create database    ".$nombreBD." ;" . PHP_EOL);
fwrite($file, " " . PHP_EOL);
fwrite($file, "use  ".$nombreBD." ;" . PHP_EOL);
fwrite($file, " " . PHP_EOL);
fwrite($file, "create table   '".$nombreTL."'(
		id int primary key auto_increment,
		nombre varchar(100));" . PHP_EOL);
fwrite($file, " " . PHP_EOL);
while($i<=$filas){
$generador = Generador::getInstancia();
$generador->palabras();
fwrite($file, "INSERT INTO '".$nombreTL."' VALUES(null,'".$generador->palabras()."'';)" . PHP_EOL);
$i++;
}
fclose($file);

//echo '<h1>Filas Agregadas</h1>';
echo '<script language = javascript>
		alert("Scrip de Base de Datos creadas por revise su carpeta");
	</script>';
header("location: index.php");
?>