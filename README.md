# WWW tuần 6

## Các tính năng
  - Đăng nhập, đăng ký
  - Hiển thị danh sách các bài post ở trang home.
  - Hiển thị chi tiết bài post
  - Hiển thị các bài post liên quan
  - Hiển thị thông tin của user
  - Thực hiện chức năng thêm bài post (yêu cầu login)
  - Cập nhật thông tin user
  - Thực hiện chức năng repost. (yêu cầu login)
  - Thực hiện chức năng comment (yêu cầu login)

## Database Diagram: 
![image](/assets/DatabaseDiagram.png)

## Demo:
### Đăng nhập:
  - Ấn nút "login" trên thanh navbar ở trang home để thực hiện đăng nhập
![image](/assets/Home.png)
  - Người dùng điền đầy đủ thông tin để thực hiện đăng nhập
![image](/assets/Login.png)
    + Trường hợp thông tin đăng nhập sai, hệ thống sẽ báo lỗi: "Bad credentials"
![image](/assets/LoginFail.png)
    + Trường hợp đăng nhập thành công thì hệ thống sẽ lưu thông tin đăng nhập và chuyển về trang home
![image](/assets/LoginSuccess.png)

### Đăng ký:
  - Ấn nút "register" trên thanh navbar ở trang home để thực hiện đăng ký
![image](/assets/Home.png)
  - Người dùng điền đầy đủ thông tin để thực hiện đăng ký
![image](/assets/Register.png)
    + Trường hợp email đã được sử dụng thì hệ thống sẽ báo lỗi: "This email has been already token"
![image](https://github.com/clemence128/JAVA_WWW_Week06/assets/86718789/ec7a49ca-bca0-4394-9926-56163c73d012)
    + Trường hợp đăng ký thành công thì hệ thống sẽ lưu thông tin của user và chuyển về trang home. User không cần đăng nhập lại.
![image](/assets/LoginSuccess.png)

### Danh sách bài post:
  - Ở trang home hệ thống sẽ hiển thị danh sách các bài post được publish
![image](/assets/HomeWithPost.png)

### Tạo bài post:
  - Ấn nút "Create post" trên thanh navbar ở trang home để thực hiện tạo bài post
![image](/assets/Home.png)
    + Trường hợp người dùng chưa đăng nhập thì hệ thống sẽ chuyển hướng đến trang login
    + Trường hợp người dùng đã đăng nhập thì hệ thống sẽ chuyển hướng đến trang tạo post
![image](/assets/CreatePost.png)
    + Điền đầy đủ thông tin và ấn nút submit
    + Nếu tạo post thành công hệ thống sẽ chuyển hướng đến trang home

### Chi tiết bài post:
- Ấn vào bài post ở trang home hệ thống sẽ chuyển hướng đến trang post detail.
+ Trường hợp người dùng chưa thực hiện đăng nhập thì hệ thống sẽ yêu cầu đăng nhập để sử dụng các chức năng như thêm comment, repost.
![image](/assets/PostDetail.png)
  + Trường hợp người dùng đã đăng nhập thì người dùng có thể sử dụng các chức năng thêm comment, repost
![image](/assets/HomeWithPostLogin.png)
- Người dùng có thể thực hiện comment bằng cách điền đầy đủ thông tin và ấn nút "Submit Comment"
  + Sau khi thêm comment thành công, người dùng có thể thấy được comment của mình ở mục comment:
![image](/assets/PostDetailWithComment.png)
- Người dùng có thể thực hiện repost bằng cách ấn vào link "Repost this post"
![image](/assets/Repost.png)
- Khi ấn vào tác giả (Author) thì hệ thống sẽ chuyển hướng đến trang User profile:
![image](/assets/UserProfile.png)
