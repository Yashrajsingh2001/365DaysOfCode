<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Scope of a variable</title>
</head>

<body>
	<?php
	echo "Welcome to scope and local/global vars in php<br>";
	$a = 98; // Global Variable
	$b = 9;

	function printValue()
	{
		// $a = 97; // Local Variable
		global $a, $b; // Give us the access to this global variable
		$a = 55;
		$b = 76;
		echo "<br>The value of your variable a is $a and b is $b";
	}

	echo $a;
	printValue();
	// If we change a global variable after using 'global' keyword in a function,
	// Then it's value get changed and remains the same globally.
	echo "<br>The value of your variable a is $a and b is $b";
	echo "<br>";
	echo var_dump($GLOBALS); echo "<br><br>";
	echo var_dump($GLOBALS["a"]); echo "<br>";
	echo var_dump($GLOBALS["b"]);

	?>

</body>

</html>