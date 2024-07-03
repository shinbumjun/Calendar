<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calendar</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/calendar.css">
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .calendar-container {
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
            margin-top: 50px;
        }
        .calendar {
            display: table;
            border-collapse: collapse;
            width: 100%;
            max-width: 600px;
            margin: 20px auto;
        }
        .calendar th, .calendar td {
            border: 1px solid #ddd;
            padding: 10px;
            text-align: center;
        }
        .calendar th {
            background-color: #f2f2f2;
        }
        .calendar-header {
            display: flex;
            justify-content: space-between;
            align-items: center;
            margin-bottom: 10px;
        }
        .calendar-header button {
            padding: 10px;
            cursor: pointer;
        }
    </style>
</head>
<body>
<jsp:include page="../views/incl/header_on.jsp" flush="true" />
<main>
    <section id="calendar">
        <div class="calendar-container">
            <div class="calendar-header">
                <button id="prev">Prev</button>
                <h2 id="month-year"></h2>
                <button id="next">Next</button>
            </div>
            <table class="calendar">
                <thead>
                <tr>
                    <th>Sun</th>
                    <th>Mon</th>
                    <th>Tue</th>
                    <th>Wed</th>
                    <th>Thu</th>
                    <th>Fri</th>
                    <th>Sat</th>
                </tr>
                </thead>
                <tbody id="calendar-body">
                </tbody>
            </table>
        </div>
    </section>
</main>
<jsp:include page="../views/incl/footer.jsp" flush="true" />
<script>
    document.addEventListener('DOMContentLoaded', function () {
        const calendarBody = document.getElementById('calendar-body');
        const monthYear = document.getElementById('month-year');
        const prevButton = document.getElementById('prev');
        const nextButton = document.getElementById('next');
        let currentDate = new Date();

        function renderCalendar(date) {
            calendarBody.innerHTML = '';
            const currentYear = date.getFullYear();
            const currentMonth = date.getMonth();

            monthYear.textContent = date.toLocaleDateString('en-US', { month: 'long', year: 'numeric' });

            const firstDay = new Date(currentYear, currentMonth, 1).getDay();
            const daysInMonth = new Date(currentYear, currentMonth + 1, 0).getDate();

            let row = document.createElement('tr');
            for (let i = 0; i < firstDay; i++) {
                let cell = document.createElement('td');
                row.appendChild(cell);
            }

            for (let day = 1; day <= daysInMonth; day++) {
                if (row.children.length === 7) {
                    calendarBody.appendChild(row);
                    row = document.createElement('tr');
                }
                let cell = document.createElement('td');
                cell.textContent = day;
                row.appendChild(cell);
            }

            if (row.children.length > 0) {
                calendarBody.appendChild(row);
            }
        }

        prevButton.addEventListener('click', function () {
            currentDate.setMonth(currentDate.getMonth() - 1);
            renderCalendar(currentDate);
        });

        nextButton.addEventListener('click', function () {
            currentDate.setMonth(currentDate.getMonth() + 1);
            renderCalendar(currentDate);
        });

        renderCalendar(currentDate);
    });
</script>
</body>
</html>
