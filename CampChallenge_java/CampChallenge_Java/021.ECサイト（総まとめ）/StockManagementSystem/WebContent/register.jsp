<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー登録</title>
</head>
<body>
 <form action="registerconfirm" method="POST">
        ユーザーID:
        <input type="text" name="id" value="">
        <br><br>

        パスワード:
        <input type="text" name="pass" value="">
        <br><br>

        <input type="submit" name="btnSubmit" value="確認画面へ">
    </form>

</body>
</html>