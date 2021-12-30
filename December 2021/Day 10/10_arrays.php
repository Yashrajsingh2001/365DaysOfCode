<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Associative Arrays</title>
    <style>
        .code {
            background-color: rgba(0, 0, 0, 0.5);
            color: white;
            padding: 3px;
            margin: 3px;
        }
    </style>
</head>

<body>
    <h1>What are associative arrays in php?</h1>
    <div>Associative arrays are the array that uses named keys. We assign these named keys.<br> 
    The general syntax of associative arrays in PHP is given below.<br>
    There are two methods to create php arrays.<br><br>

        <textarea class="code" rows="1" cols="63" disabled="true">$arr = array("key1"=>"value", "key2"=>"value", "key3"=>"value");</textarea>

        <br>or<br>

        <textarea class="code" rows="3" cols="25" disabled="true">
$arr['key1'] = "value";
$arr['key2'] = "value";
$arr['key3'] = "value";</textarea>
        <div>
            <HR>
            <?php

            echo "Welcome to associative arrays in php ";
            // These are called indexed arrays:
            // $arr = array('this', 'that', 'what');
            // echo $arr[0];
            // echo $arr[1];
            // echo $arr[2]; 

            // Associative arrays
            $favCol = array('shubham' => 'red', 'rohan' => 'green', 'yashraj' => 'brown');

            foreach ($favCol as $key => $value) {
                echo "<br>Favorite color of $key is $value";
            }

            ?>

</body>

</html>