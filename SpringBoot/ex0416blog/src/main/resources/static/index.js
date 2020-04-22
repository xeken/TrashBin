function initSetting() {

    $.ajax({

        url: '/postList',
        type: 'GET',
        success: function (res) {
            if(res.code === 200) {
                let posts = res.data;
                posts.forEach(post => {
                    $('#left-content').append(`<li id="post${post.id}">${post.title}</li>`);
                });
            }
        },
        error: function (err) {
            console.log(err);
        }
    });

    $.ajax({

        url: '/postGet/1',
        type: 'GET',
        success: function (res) {
            if(res.code === 201){
                let post = res.data;
                $('#main-title').html(`<h2>${post.title}</h2>`);
                $('#main-stamp').html(`<div style="text-align: right"><i>${post.updated}</i></div>`);
                $('#main-content').html(post.content);
            }
        },
        error: function (err) {
            console.log(err)
        }
    });

    $.ajax({

        //자바 소스의 SHA 암호화 문제때문에 기능 미작동
        url: '/userSignIn/test1account',
        type: 'POST',
        data: "{password : test1password}",
        success: function (res) {
            if(res.code === 105){
                let user = res.data;
                $('#right-userAccount').html(user.account);
                $('#right-userName').html(user.name);
                $('#right-userCreated').html(user.created);
            }
        },
        error: function (err) {
            console.log(err);
        }
    })

}

function postAdd() {
    
}

initSetting();