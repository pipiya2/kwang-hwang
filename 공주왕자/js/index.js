$(document).ready(function(){
    let meetDate = new Date('June 26 2021');
    let today = new Date();
    
    let passedTime = today.getTime()-meetDate.getTime();
    let passedDate = Math.round(passedTime/(24*60*60*1000));

    $("#present").html(passedDate);

})