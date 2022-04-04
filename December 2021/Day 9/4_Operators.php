<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Operators</title>
</head>

<body>
    <?php
    /* Operators in PHP
    1. Arithmetic Operators
    2. Assignment Operators
    3. Comparison Operators 
    4. Logical Operators
    */

    $a = 45;
    $b = 8;

    echo "<br>1. Arithmetic Operators<br>";
    echo "For a + b, the result is " . ($a + $b) . "<br>";
    echo "For a - b, the result is " . ($a - $b) . "<br>";
    echo "For a * b, the result is " . ($a * $b) . "<br>";
    echo "For a / b, the result is " . ($a / $b) . "<br>";
    echo "For a % b, the result is " . ($a % $b) . "<br>";
    echo "For a ** b, the result is " . ($a ** $b) . "<br>";

    echo "<br>2. Assignment Operators<br>";
    $x = $a;
    echo "For x, the value is ". $x . "<br>";

    $a += 6;
    echo "For a, the value is ". $a . "<br>";

    $a -= 6;
    echo "For a, the value is ". $a . "<br>";

    $a *= 6;
    echo "For a, the value is ". $a . "<br>";

    $a /= 5;
    echo "For a, the value is ". $a . "<br>";

    $a %= 5; // $a = $a % 5
    echo "For a, the value is ". $a . "<br>";


    echo "<br>3. Comparison Operators<br>"; 
    $x = 78;
    $y = 78;

    echo "For x > y, the result is ";
    echo var_dump($x > $y);

    echo "<br>For x > y, the result is ";
    echo var_dump($x >= $y);

    echo "<br>For x < y, the result is ";
    echo var_dump($x < $y);

    echo "<br>For x < y, the result is ";
    echo var_dump($x <= $y);

    echo "<br>For x <> y, the result is ";
    echo var_dump($x <> $y);
    echo "<br>";


    echo "<br>4. Logical Operators<br>";

    $m = true;
    $n = true;

    echo "For m and n, the result is ";
    echo var_dump($m and $n);
    echo "<br>";

    echo "For m && n, the result is ";
    echo var_dump($m && $n);
    echo "<br>";

    echo "For m or n, the result is ";
    echo var_dump($m or $n);
    echo "<br>";

    echo "For m || n, the result is ";
    echo var_dump($m || $n);
    echo "<br>";

    echo "For !m , the result is ";
    echo var_dump(!$m);
    echo "<br>";
    ?>
</body>
</html>