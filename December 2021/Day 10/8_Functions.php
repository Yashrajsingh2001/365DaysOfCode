<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Functions</title>
</head>

<body>
	<?php
	echo "<h1> Functions: </h1><br>";

	function totalMarks($marksArr){
		$sum = 0;
		foreach ($marksArr as $value) {
			$sum += $value;
		}
		return $sum;
	}

	function avgMarks($marksArr){
		$sum = 0;
		$i = 0;
		foreach ($marksArr as $value) {
			$sum += $value;
			$i++;
		}
		return $sum / $i;
	}

	$Rajveer = [34, 98, 45, 64, 98, 93];
	$Yashraj = [99, 98, 93, 94, 17, 100];

	echo "Total marks scored by Yashraj out of 600 is " . totalMarks($Yashraj) . "<br>";
	echo "Average marks scored by Yashraj out of 100 is " . avgMarks($Yashraj) . "<br><br>";
	echo "Total marks scored by Rajveer out of 600 is " . totalMarks($Rajveer) . "<br>";
	echo "Average marks scored by Rajveer out of 100 is " . avgMarks($Rajveer) . "<br>";
	?>

</body>
</html>