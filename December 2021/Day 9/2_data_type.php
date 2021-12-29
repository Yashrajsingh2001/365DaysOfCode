<!DOCTYPE html>
<html lang="en">

<head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Data Type</title>
</head>

<body>
        <?php
        $name1 = "Yashraj";
        $income = 200;

        /* php data types
        1. String
        2. Integer
        3. Float
        4. Boolean
        5. Object
        6. Array
        7. NULL
        */

        // String - sequence of characters
        $name1 = "Yashraj";
        $name2 = 'Rohan';
        echo "$name1 and $name2 are friends.";


        // Integer - Non decimal number
        $income = 455;
        $debts = -655;
        echo "<br>";
        echo $income;
        echo "<br>";
        echo $debts;
        echo "<br>";

        // Float - Decimal point number
        $income = 344.5;
        $debts = -45.5;
        echo $income;
        echo "<br>";
        echo $debts;
        echo "<br>";

        // Boolean - Can be either true or false
        $x = true;
        $is_friend = false;
        echo var_dump($x);
        echo "<br>";
        echo var_dump($is_friend);
        echo "<br>";

        // Object - Instances of classes
        // Employee is a class ---> Yashraj can be one object

        // Array - Used to store multiple values in a single variable
        $name2 = array("Virat", "Raju", "Ram", "Shyam");
        echo var_dump($name2);
        echo "<br>";
        echo $name2[0];
        echo "<br>";
        echo $name2[1];
        echo "<br>";
        echo $name2[2];
        echo "<br>";
        echo $name2[3];
        echo "<br>";
        //echo $name2[4]; // will throw an error as the size of array is 4

        // NULL
        $name1 = NULL;
        echo var_dump($name1);
        ?>
</body>

</html>