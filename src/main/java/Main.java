public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.patronymic = "Иванович";
        post.surname = "Иванов";
        post.passport = "1111 № 111111";
        post.phone = "+7 (777) 777-77-77";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 10;
        post.birthday.month = 10;
        post.birthday.year = 2010;
    }
}
