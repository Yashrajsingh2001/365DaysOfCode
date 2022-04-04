<?php
// Connecting to the Database
$servername = "localhost";
$username = "root";
$password = "";
$database = "yashrajphp";

// Create a connection
$conn = mysqli_connect($servername, $username, $password, $database);
// Die if connection was not successful
if (!$conn){
    die("Sorry we failed to connect: ". mysqli_connect_error());
}
else{
    echo "Connection was successful<br>";
}

$sql = "SELECT * FROM `phptrip`";
$result = mysqli_query($conn, $sql);

// Find the number of records returned
$num = mysqli_num_rows($result);
echo $num . " records found in the DataBase<br>";
// Display the rows returned by the sql query
if($num> 0){
    // $row = mysqli_fetch_assoc($result); // One at atime
    // echo var_dump($row);
    // echo "<br>";

    // We can fetch in a better way using the while loop
    $i = 1;
    while($row = mysqli_fetch_assoc($result)){
        // echo var_dump($row);
        // echo $row['sno'] .  ". Hello ". $row['name'] ." Welcome to ". $row['dest'];
        echo $i .  ". Hello ". $row['name'] ." Welcome to ". $row['dest'];
        echo "<br>";
        $i += 1;
    }
}
?>
