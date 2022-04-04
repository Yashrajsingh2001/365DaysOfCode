<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Date</title>
    <style>
        .a{
            display: grid;
            font-size: xx-large;
			text-align: center;
			color: pink;
			background-color: black;
			padding: 5px;
			margin: 5px;
        }
    </style>
</head>
<body>
    <a class="a" href="https://www.php.net/manual/en/function.date.php" target = "_blank">Date reference (link)</a>
    <?php
echo "Welcome to the world of dates<br>";
// $d = date("dS F Y");
$d = date("dS F Y, g:i A");
echo "Todays date is $d <br>";

echo date('l jS \of F Y h:i:s A');
 
$year = date("Y");
echo "<br>";
echo "Copyright $year | All rights reserved <br>";
?>



</body>
</html>