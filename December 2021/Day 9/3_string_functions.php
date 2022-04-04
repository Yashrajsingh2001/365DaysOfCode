<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>String Functions</title>
</head>
<body>
    <?php 

    $name = "Harry is a good boy";
    echo $name;
    echo "<br>";

    echo "The length of " . "my string is " . strlen($name);
    echo "<br>";
    echo str_word_count($name);
    echo "<br>";
    echo strrev($name);
    echo "<br>";
    echo strpos($name, "Harry");
    echo "<br>";
    echo str_replace("Harry", "Rohan", $name);
    echo "<br>";
    echo str_repeat($name, 4);
    echo "<br>";
    echo "<pre>";
    echo rtrim("    this is a good boy     ");
    echo "<br>";
    echo ltrim("    this is a good boy     ");
    echo "</pre>";

    ?>
</body>
</html>