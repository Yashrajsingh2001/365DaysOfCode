<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>If Else</title>
    <style>
        h1{
            background-color: red;
            color: white;
            display: inline-block;
            padding: 5px;
        }
        h1:hover{
            background-color: pink;
            color: black;
            display: inline-block;
            padding: 5px;
        }
        
    </style>
</head>
<body>
    <h1>
    <?php 
        $age = 20;

        if($age>=18){
            echo "You can drive";
        }
        elseif($age>=0){
            echo "You can't drive";
        }
        else{
            echo "You are not even born yet";
        }
    ?>
    </h1>
</body>
</html>