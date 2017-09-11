<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Person</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<body>

    <form>
        <table>
            <tr>
                <td>Username</td>
                <td><input type="text" name="username" id="username" placeholder="Your username"/></td>
                <td id="error-username"></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="password" id="password" placeholder="Your password"/></td>
                <td id="error-password"></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td><input type="submit" value="Login"/></td>
            </tr>
        </table>
    </form>

</body>

    <script>
        $(document).ready(function(){
            $('form').submit(function(){


                var username = $('form #username').val();
                var password = $('form #password').val();


                if(username==='' ||password==='' ){

                   if(username===''){
                      $('#error-username').text('Username anda masih kosong');
                   }else{
                      $('#error-username').text('');
                   }

                   if(password===''){
                      $('#error-password').text('Password anda masih kosong');
                   }else{
                      $('#error-password').text('');
                   }

                   return false;

                }else{
                  $('form').attr('method','POST');
                  $('form').attr('action','/belajar-filter-session/auth-user');
                }

            });
        });
    </script>

</html>
