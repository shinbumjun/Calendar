$(document).ready(function() {
    $('#calendar').fullCalendar({
        header: {
            left: 'prev,next today',
            center: 'title',
            right: 'month,agendaWeek,agendaDay'
        },
        defaultDate: '2024-07-04',
        navLinks: true, // can click day/week names to navigate views
        editable: true,
        eventLimit: true, // allow "more" link when too many events
        events: [
            {
                title: '-55,000',
                start: '2024-07-02',
                color: '#ff4444' // Event color
            }
            // add more events here
        ]
    });

    // Event listeners for filter buttons
    $('#expense').click(function() {
        alert('지출 필터 클릭됨');
        // Add filter logic here
    });

    $('#income').click(function() {
        alert('수입 필터 클릭됨');
        // Add filter logic here
    });

    $('#except').click(function() {
        alert('제외 필터 클릭됨');
        // Add filter logic here
    });
});
