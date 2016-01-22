<?php ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="text/javascript" src="js/Validaciones.js"></script>
<title>Proyecto de Base de Datos</title>
</head>
<body>
<table border='1' width="1500px" height="690px" align="center">
	<tr>
        <td bgcolor="#0066FF">
           <table align="center">
           	<tr>
        		<td>
                
               	</td>
                <td>
               BASE DE DATOS
               	</td>
                <td>
                
               	</td>
        	</tr> 
           </table>
		</td>
	</tr>
    <tr>
    	<td>
        <table align="center">
        <!--  <form name="frmi" id="frmi" method="POST" action="index.php" > -->
        <form name="frmpl" id="frmpl" method="POST"  action="CrearDatos.php" >
            <tr>
          		<td>
        <label>Nombre de la base de datos</label>
         <input type='text' id="txtnombd" name="txtnombd" />
         <div id="msn1" style="display: none;">Campo Vacio </div>
        		</td>
        	</tr>
        <tr>
             <td>
                <br />
        <label>Nombre de la tabla</label>
            </td>
        </tr>
        <tr>
            <td>
             <!-- <fieldset id="field"> --!>
              <!-- </fieldset> -->
            <input type='text' id="txtnomtb" name="txtnomtb" />
            <div id="msn2" style="display: none;">Campo Vacio </div>
             </td>
        </tr>
        <!-- <tr>
             <td>
             <br />
            <input type="button" value="Agregar Fila" onclick="crear(this)"/>
              </td>
        </tr>-->
         <!--   </form>-->
  		<!-- <tr>
			<td>
       				<table>
                    		<tr>
                            	<td>
                                <div>
                                <label>Orden</label>
                                </div>
                                </td>
                                <td>
                                <div>
                               <label>Nombre Dato</label>
                                </div>
                                </td>
                                <td>
                                 <div>
                                <label>Tipo de Dato</label
                                ></div>
                                </td>
                                <td>
                                 <div>
                                <label>Eliminar</label
                                ></div>
                                </td>
                            </tr>
                            <tr>
                            	<td>
                                <label>
                                1
                                </label>
                                </td>
                                <td>
                                <input />
                                </td>
                                <td>
                                <select>
                                <option>Seleccione una Opción</option>
                                <option>Nombre</option>
                                <option>Apellido</option>
                                <option>Telefono</option>
                                <option>Edad</option>
                                <option>Email</option>
                                <option>Municipio</option>
                                <option>Pais</option>
                                </select>
                                </td>
                                <td>
       <input name="eliminar" type="radio" value="" />
                                </td>
                            </tr>
       				</table>
			</td>
	</tr>
    	<tr>
			<td>
            <br />
            	<input type="submit" value="Agregar Columas"/> <input name="agregarFilas" /><label>Filas</label>
			</td>
         </tr>-->
         <tr>
			<td>
            <br />
            	<label>Numero de Registros</label>
                <input type="text"  name="txtnum" id='txtnum' placeholder="Cantidad"/>
                <div id="msn3" style="display: none;">Campo Vacio</div>
                <input type="button" value="Generar" onclick="Validacion()"/> 
			</td>
         </tr>
        </form>  
      </table>
    	<tr>
			<td bgcolor="#0033FF" align="center">
      Veronica Barrios Nanco
      		</td>
        </tr>
</table>
</body>
</html>	

