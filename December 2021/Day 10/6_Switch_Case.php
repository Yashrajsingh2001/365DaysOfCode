<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Switch Case</title>
</head>
<body>
    <?php

    $age = 18;
    switch($age){
        case 12:
            echo "You are 12 years old <br>";
            break;

        case 18:
            echo "You are 18 years old <br>";
            break;

        case 56:
            echo "You are 56 years old <br>";
            break;
        
        default:
            echo "Your age is weird <br>";
            break;
        }
    ?>    
</body>
</html>