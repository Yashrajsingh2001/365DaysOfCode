<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Loops</title>
	<style>
		.grid-container {
			display: grid;
			grid-template-columns: auto auto;
			background-color: pink;
			padding: 15px;
		}

		.grid-item {
			background-color: rgba(255, 255, 200, 0.8);
			border: 2px solid pink;
			padding: 15px;
			font-size: 22px;
			text-align: center;
		}

		.grid-item:hover {
			background-color: #e3b3f9;
		}

		.heading {
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
	<div class="heading"><b>Loops</b></div>
	<div class="grid-container">
		<div class="grid-item">
			<h1>While loop:</h1> <?php
									$i = 0;
									while ($i < 5) {
										echo "The value of i is ";
										echo $i + 1;
										echo "<br>";
										$i += 1;
									}
									?>
		</div>
		<div class="grid-item">
			<h1>For loop:</h1><?php
								for ($i = 1; $i < 6; $i++) {
									echo "The value of i is $i <br>";
								}
								?>
		</div>
		<div class="grid-item">
			<h1>While loop:</h1><?php
								$i = 1;
								do {
									echo "The value of i is $i <br>";
									$i++;
								} while ($i <= 5);

								?>
		</div>
		<div class="grid-item">
			<h1>Foreach loop:</h1><?php
									$arr = array("Bananas", "Apples", "Harpic", "Bread", "Butter");

									foreach ($arr as $i) {
										echo "$i <br>";
									}
									?>
		</div>
	</div>
</body>

</html>