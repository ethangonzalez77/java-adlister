<%--
  Created by IntelliJ IDEA.
  User: luciddreamz
  Date: 12/16/22
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza in the house</title>
</head>
<body>

<h2>Build your own pizza!</h2>
<form action="" method="post">

    <label for="crust">Choose your Crust</label>
    <select name="crust" id="crust">
        <option value="regular">Regular Crust</option>
        <option value="thin">Thin Crust</option>
    </select>

    <label for="sauce">Choose your Sauce</label>

    <select name="sauce" id="sauce">
        <option value="garlic">garlic</option>
        <option value="tomato">tomato</option>
    </select>


    <label for="size">Choose your Size</label>
    <select name="size" id="size">
        <option value="large">large</option>
        <option value="medium">medium</option>
    </select>

    <br>
    <br>
    Choose your Toppings
    <br>
    <ul>
        <li><input type="checkbox" name="toppings" id="pineapple" value="pineapple"><label for="pineapple">Pineapple</label></li>
        <li><input type="checkbox" name="toppings" id="pepperoni" value="pepperoni"><label for="pepperoni">Pepperoni</label></li>
    </ul>
    <label for="address">Enter delivery address</label>
    <br>
    <textarea name="address" id="address" placeholder="Enter Address" rows="5" cols="50"></textarea>
    <br>
    <button>Submit</button>
</form>









</body>
</html>
