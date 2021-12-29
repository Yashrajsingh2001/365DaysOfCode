<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Variables</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <style>
        .c1{
            background-color: pink;
            padding: 6px;
            margin: 5px;
            text-align: center;
        }
        
        h4{
            color: pink;
        }

        #id1{
            border: 3px solid pink;
            background-color: black;
            color: yellow;
            border-radius: 15px;
        }
        
    </style>
</head>
<body>
    <div class="c1"><?php
    // Variables are containers for storing information and it starts with a $
    
    // Variables are case sensitive
    $name = "Shubham";
    $income = 65000.5;

        echo "This guy is $name and his income is Rs. $income<br>";
    ?></div>

    <div class="container my-3" id="id1">
        <h4>Rules for creating variables in PHP</h4>
        <ul>
            <li>Starts with a $ sign</li>
            <li>Cannot start with a number</li>
            <li>Must start with a letter or an underscore character</li>
            <li>Can only contain alphanumeric characters and underscores</li>
            <li>Variables in php are Case sensitive. ($Yashraj, $yashraj and $yaShraj are different)</li>
        </ul> 
    </div>
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>