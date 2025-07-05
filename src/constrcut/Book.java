package constrcut;

public class Book {
    String title;
    String author;
    int page;

    Book(){
        this("", "" , 0);
        // 파라미터 로 넘어온 값이 아니어서 this chaing 시 초기화 설정
    }
    Book(String title, String author){
        this(title, author, 0);
        // this 체이닝 사용시 title과 author만 파라미터로 받고 page 변수는 0으로 초기화
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo() {
        System.out.println("title: " + title + ", author: " + author + ", page: " + page);
    }
}
