package org.skypro.counter_service.exeption;

public class QuestionNotFoundException extends RuntimeException {

    public QuestionNotFoundException() {
        System.out.println("Сообщение для пользователя");
    }
}
