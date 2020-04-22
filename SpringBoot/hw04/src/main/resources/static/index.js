let currentUser;

function showLoginDialog() {

    $('#container').show(400);
}

function closeLoginDialog() {

    $('#container').hide(1000);
    $('#id').val("");
    $('#password').val("");
}

function showWriteDialog() {

    if (currentUser == null) {

        showLoginDialog();
        return;
    }
    $('#containerWrite').show(400);
}

function closeWriteDialog() {

    $('#containerWrite').hide(1000);
    $('#content').val("");
}

async  function writeSuccess(){

    try {
        let content = $('#content').val();

        await $.ajax({

            url: "/commentWrite",
            type: 'POST',
            data: JSON.stringify({
                userName: currentUser.userName,
                content: content
            }),
            contentType: "application/json;",
            responseType: "application/json;",
            success: function (response) {
                addCommentOne(response);
                closeWriteDialog();
            }
        })

    } catch (e) {
        alert(e);
    }
}

async function loginSuccess() {

    try {
        //const userData = await $.get(`/userview/${id},${password}`);
        //console.log("loginSuccess");
        let id = $('#id').val();
        let password = $('#password').val();

        const userData = await $.get('/userView/' + id + ',' + password);
        currentUser = userData;
        addUserOne(userData);

    } catch (err) { alert(err); }
}

function addUserOne(userData) {

    $("#userInfo")
        .html(`    
                 <div>
                    
                 </div>
                 <div id="user${userData.id}" style=" border-bottom: 1px solid silver">
                      <div style="width: 200px; text-align: center ">${userData.userName}</div>
                      <div style="width: 200px; text-align: center">${userData.email}</div>
                      <div style="width: 200px; text-align: center">${userData.joined}</div>
                 </div>
               
                `);

    $('#container').hide(1000);
}

async function getCommentList() {

    $('#commentView').html("");

    try {

        const data = await $.get("/commentView");
        data.forEach(function (d) {
            addCommentOne(d);
        })
    } catch (err) {
        $("#commentView").html("");
    }
}

function addCommentOne(d) {

    $("#commentView")
        .append(`<div id="comment${d.id}" style="display:flex; border-bottom: 1px solid silver">
                                    <div style="width: 150px">${d.userName}</div>
                                    <div style="width: 150px">${d.content}</div>
                                    <button style="width: 50px" onclick="editComment(this, ${d.id})">수정</button>
                                    <button style="width: 50px" onclick="deleteComment(this, ${d.id})">삭제</button>
                                 </div>`);
}

async function editComment(button, id) {
    if (currentUser == null) {

        showLoginDialog();
        return;
    }
    if ($(button).text() === '수정') {

        let line = $('#comment' + id);
        content = line.find('div:nth-child(2)').text();
        let input = `<input value="${content}">`;
        line.find('div:nth-child(2)').html(input);
        $(button).text('확인');
        $(button).next().text("취소");
    } else {

        let line = $('#comment' + id);

        $.ajax({

            url: "/commentModify/" + id,
            type: "PUT",
            data: JSON.stringify({
                content: line.find('input').val()
            }),
            contentType: "application/json;",
            responseType: "application/json;",
            success: function (response) {

                let div;
                if (response) {
                    div = `<div style="width: 150px">${response.content}</div>`;
                } else {
                    div = `<div style="width: 150px">${content}</div>`;
                    alert("수정 실패");

                }
                line.find('div:nth-child(2)').html(div);
                $(button).text('수정');
                $(button).next().text("삭제");
            }
        })
    }
}

let content = null;

function deleteComment(button, idx) {

    if (currentUser == null) {

        showLoginDialog();
        return;
    }
    if ($(button).text() === "취소") {

        let line = $('#comment' + idx);
        let div = `<div style="width: 150px">${content}</div>`;
        line.find('div:nth-child(2)').html(div);
        $(button).text("삭제");
        $(button).prev().text("수정");
    } else
        $.ajax({
            url: "/commentDelete/" + idx,
            type: "DELETE",
            success: function (response) {
                if (response)
                    $("#comment" + idx).remove();
                else
                    alert("삭제 실패.");
            }
        })
}

getCommentList();