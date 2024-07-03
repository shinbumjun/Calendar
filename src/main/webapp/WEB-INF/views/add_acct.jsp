<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<head>
    <meta charset="UTF-8">
    <title>계좌 생성</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/add_accts.css">
</head>

<body>
<jsp:include page="../views/incl/header_on.jsp" flush="true" />
<main>
    <section id="create_account">
        <hgroup>
            <h2>계좌 등록</h2>
            <h3>계좌를 등록해주세요</h3>
        </hgroup>



        <form action="${pageContext.request.contextPath}/add_acct.do" method="post">
            <div>
                <input type="radio" id="C-overdraft-acct" name="accType" value="C" />
                <label for="C-overdraft-acct">카드</label>
            </div>
            <div>
                <input type="radio" id="S-saving-acct" name="accType" value="S" />
                <label for="S-saving-acct">계좌</label>
            </div>

            <input type="submit" id="create-account-submitButton" value="확인" />
        </form>



    </section>


</main>
<jsp:include page="../views/incl/footer.jsp" flush="true" />

<script>
    let c_acct = document.getElementById("C-overdraft-acct");
    let s_acct = document.getElementById("S-saving-acct");

    let initial_deposit_amount = document.getElementById("initial-deposit-amount-wrap");
    let limit = document.getElementById("limit-wrap");

    c_acct.addEventListener("click", function() {
        initial_deposit_amount.hidden = true;
        limit.hidden = false;
        // 확인 버튼 position 변경
        document.querySelector("#create-account-submitButton").style.bottom='100px';
    });

    s_acct.addEventListener("click", function() {
        limit.hidden = true;
        initial_deposit_amount.hidden = false;
        // 확인 버튼 position 변경
        document.querySelector("#create-account-submitButton").style.bottom='100px';
    });
</script>
</body>
</html>
