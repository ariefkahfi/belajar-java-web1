<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
</head>

    <style>


        div , ul {
            clear: both;
        }

        #header{
            background-color: crimson;
            color: white;
            text-align: center;
            font-weight:bold;

            padding-top: 5px;
            padding-bottom: 5px;

        }

    </style>

<body>

    <form action="/belajar-filter-session/log-out">
        <input type="submit" value="Log Out" style="float: right; margin: 0.5%; padding : 1%";/>
    </form>

    <div id="header">
        <h2>Home Page</h2>
    </div>

    <ul>
        <li>List one</li>
        <li>List two</li>
        <li><a href="/belajar-filter-session/menu/list-data">List Data</a></li>
    </ul>

</body>
</html>
