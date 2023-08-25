package com.sparta.springprepare;

import lombok.*;

//<<< Lombok을 쓰는 이유 >>>
//개발자 코드는 간결해지고
//실제 build/classes/.../springprepare/Memo에서 컴파일된 아래 메소드들을 자동으로 생성해준다.

//@Getter, @Setter : private 접근 제어자 변수를 접근 할 수 있는 메소드를 생성해준다.
//@NoArgsConstructor : 기본생성자를 class에서만 보이도록 할 수 있다. 위와 동일하다.
//@AllArgsConstructor : 모든 필드를 받는 생성자를 만들 수 있다.
//@RequiredArgsConstructor : final로 선언된 필드를 갖는 생성자를 만들어준다.

@Getter//getter생성
@Setter//setter생성
@AllArgsConstructor//모든 필드를 가진 생성자 생성
@NoArgsConstructor//기본생성자 생성
@RequiredArgsConstructor
public class Memo {
    //private final String username;
    private String username;
    private String contents;
}

class Main{
    public static void main(String[] args) {
        Memo memo = new Memo();
        memo.setUsername("Fred");
        System.out.println(memo.getUsername());
    }
}